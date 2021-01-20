package com.japaricraft.japaricraftmod.gui;

import com.japaricraft.japaricraftmod.mob.ai.EntityFriend;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class InventoryFriend extends InventoryBasic
{

    private EntityFriend entityfriends;

    public InventoryFriend(EntityFriend entityfriends, int slotCount)
    {
        super(entityfriends.getName(), true, slotCount);

        this.entityfriends = entityfriends;
    }

    @Override
    public boolean isUsableByPlayer(EntityPlayer player) {
        return this.entityfriends.isEntityAlive() && (player.getDistanceSq(this.entityfriends) < 64.0D);

    }

    // TODO /* ======================================== MOD START =====================================*/

    public EntityFriend getContainerEntityChasts()
    {
        return this.entityfriends;
    }

    public void readInventoryFromNBT(NBTTagList nbtList)
    {
        this.clear();

        for (int i = 0; i < nbtList.tagCount(); ++i)
        {
            NBTTagCompound nbt = nbtList.getCompoundTagAt(i);
            int slot = nbt.getByte("Slot") & 255;

            if ((0 <= slot) && (slot < this.getSizeInventory()))
            {
                this.setInventorySlotContents(slot, new ItemStack(nbt));
            }
        }
    }

    public NBTTagList writeInventoryToNBT()
    {
        NBTTagList nbtList = new NBTTagList();

        for (int slot = 0; slot < this.getSizeInventory(); ++slot)
        {
            ItemStack stackSlot = this.getStackInSlot(slot);

            if (FriendMobHelper.isNotEmptyItemStack(stackSlot))
            {
                NBTTagCompound nbt = new NBTTagCompound();
                nbt.setByte("Slot", (byte) slot);
                stackSlot.writeToNBT(nbt);
                nbtList.appendTag(nbt);
            }
        }

        return nbtList;
    }

}
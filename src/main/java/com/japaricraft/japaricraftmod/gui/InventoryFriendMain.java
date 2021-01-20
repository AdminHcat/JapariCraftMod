package com.japaricraft.japaricraftmod.gui;

import com.japaricraft.japaricraftmod.mob.ai.EntityFriend;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;

public class InventoryFriendMain extends InventoryFriend
{

    public InventoryFriendMain(EntityFriend entityChast)
    {
        super(entityChast, (9 * 3));
    }

    @Override
    public void openInventory(EntityPlayer player)
    {
        super.markDirty();

        this.getContainerEntityChasts().playSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.5F, this.getContainerEntityChasts().getRNG().nextFloat() * 0.1F + 0.9F);
    }

    @Override
    public void closeInventory(EntityPlayer player)
    {
        super.markDirty();

        this.getContainerEntityChasts().playSound(SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.5F, this.getContainerEntityChasts().getRNG().nextFloat() * 0.1F + 0.9F);
    }

}
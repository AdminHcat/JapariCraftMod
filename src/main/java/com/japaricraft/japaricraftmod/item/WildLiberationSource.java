package com.japaricraft.japaricraftmod.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;


public class WildLiberationSource extends ItemFood {
    public WildLiberationSource() {
        super(2,1,false);
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("WildLiberationSource");
        this.setAlwaysEdible();

    }

    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {

            {
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 320, 1));
                player.addPotionEffect(new PotionEffect(MobEffects.HUNGER,160,0));
                player.addPotionEffect(new PotionEffect(MobEffects.BLINDNESS,160,0));
            }
        }
    }
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(this.getItemInfoLocal());
    }

    @SideOnly(Side.CLIENT)
    public String getItemInfoLocal()
    {
        return "It has not been processed yet";
    }
}
package com.japaricraft.japaricraftmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;


public class GoldenJapariman extends ItemFood {

    public GoldenJapariman() {
        super(4, 3, false);
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("GoldenJapariman");
        this.setAlwaysEdible();
    }
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.isRemote)
        {

            {
                player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 100, 0));
                player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 1200, 0));
            }
        }
    }
}
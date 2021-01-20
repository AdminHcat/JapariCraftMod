package com.japaricraft.japaricraftmod.item;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;

public class SugarStar extends Item {
    public SugarStar()
    {
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("SugarStar");

    }
    public boolean hasEffect(ItemStack stack) {
        return true;
    }
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.RARE;
    }
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add(this.getItemInfoLocal());
    }

    @SideOnly(Side.CLIENT)
    public String getItemInfoLocal()
    {
        return "Infinite seasoning";
    }
}

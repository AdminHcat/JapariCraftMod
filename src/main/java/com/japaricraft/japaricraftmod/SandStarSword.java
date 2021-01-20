package com.japaricraft.japaricraftmod;

import net.minecraft.item.ItemSword;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;


public class SandStarSword extends ItemSword {

    public SandStarSword(ToolMaterial SandStar){
        super(SandStar);
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("SandStarSword");
    }
}
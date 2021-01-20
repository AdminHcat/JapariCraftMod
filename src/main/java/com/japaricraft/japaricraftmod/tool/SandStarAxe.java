package com.japaricraft.japaricraftmod.tool;

import net.minecraft.item.ItemAxe;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;

public class SandStarAxe extends ItemAxe {

    public SandStarAxe(ToolMaterial SandStar, float damage, float speed) {
        super(SandStar, damage, speed);
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("SandStarAxe");
    }
}

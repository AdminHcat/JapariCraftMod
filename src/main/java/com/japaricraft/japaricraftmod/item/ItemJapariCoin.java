package com.japaricraft.japaricraftmod.item;

import net.minecraft.item.Item;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;

public class ItemJapariCoin extends Item {
    public ItemJapariCoin() {
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("japaricoin");
    }
}

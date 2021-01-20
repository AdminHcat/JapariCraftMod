package com.japaricraft.japaricraftmod.item;


import net.minecraft.item.ItemFood;

import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;

public class JaparimanFruit extends ItemFood {
    public JaparimanFruit() {
        super(7, 4, false);
        this.setCreativeTab(tabJapariCraft);
        this.setUnlocalizedName("JaparimanFruit");
    }

}
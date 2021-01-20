package com.japaricraft.japaricraftmod.item;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;
import static com.japaricraft.japaricraftmod.JapariCraftMod.tabJapariCraft;
import static com.japaricraft.japaricraftmod.hander.JapariItems.KabanHatMaterial;


public class ItemKabanHat extends ItemArmor {
    public ItemKabanHat(ArmorMaterial kabanHatMaterial, int i, EntityEquipmentSlot head) {
        super(KabanHatMaterial, 0, EntityEquipmentSlot.HEAD);
        setCreativeTab(tabJapariCraft);
        setUnlocalizedName("Kabanhat");
    }
    public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
    {
        return MODID + ":" + "textures/armor/kaban_layer_1.png";
    }
}

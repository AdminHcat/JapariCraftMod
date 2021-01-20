package com.japaricraft.japaricraftmod.hander;

import net.minecraft.client.renderer.color.IItemColor;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface IColoredItem {
    @SideOnly(Side.CLIENT)
    IItemColor getItemColor();
}

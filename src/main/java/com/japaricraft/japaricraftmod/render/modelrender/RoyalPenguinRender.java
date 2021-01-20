package com.japaricraft.japaricraftmod.render.modelrender;

import com.japaricraft.japaricraftmod.mob.RoyalPenguin;
import com.japaricraft.japaricraftmod.render.ModelRoyalPenguin;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

@SideOnly(Side.CLIENT)
public class RoyalPenguinRender extends RenderLiving<RoyalPenguin> {
    private static final ResourceLocation Pengin_TEXTURES = new ResourceLocation(MODID, "textures/entity/ppp2.png");

    public RoyalPenguinRender(RenderManager renderManager) {
        super(renderManager, new ModelRoyalPenguin(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(RoyalPenguin entity) {
        return Pengin_TEXTURES;
    }
}
package com.japaricraft.japaricraftmod.render.modelrender;

import com.japaricraft.japaricraftmod.mob.Araisan;
import com.japaricraft.japaricraftmod.render.ModelAraisan;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

@SideOnly(Side.CLIENT)
public class AraisanRender extends RenderLiving<Araisan>
{
    private static final ResourceLocation Arai_TEXTURES = new ResourceLocation(MODID, "textures/entity/araisan.png");
    public AraisanRender(RenderManager renderManager)
    {
        super(renderManager, new ModelAraisan(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(Araisan entity)
    {
        return Arai_TEXTURES;
    }
}
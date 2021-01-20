package com.japaricraft.japaricraftmod.render.modelrender;

import com.japaricraft.japaricraftmod.mob.Cerulean;
import com.japaricraft.japaricraftmod.render.ModelCerulean;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

@SideOnly(Side.CLIENT)
public class CeruleanRender extends RenderLiving<Cerulean>
{
    private static final ResourceLocation Cerulean_TEXTURES = new ResourceLocation(MODID, "textures/entity/cerulean/cerulean.png");
    public CeruleanRender(RenderManager renderManager)
    {
        super(renderManager, new ModelCerulean(), 0.9F);
    }


    @Override
    protected ResourceLocation getEntityTexture(Cerulean entity)
    {
        return Cerulean_TEXTURES;
    }
}
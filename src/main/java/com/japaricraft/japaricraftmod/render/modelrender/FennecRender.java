package com.japaricraft.japaricraftmod.render.modelrender;


import com.japaricraft.japaricraftmod.mob.Fennec;
import com.japaricraft.japaricraftmod.render.ModelFennec;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

public class FennecRender extends RenderLiving<Fennec>
{
    private static final ResourceLocation Fennec_TEXTURES = new ResourceLocation(MODID, "textures/entity/fennec.png");
    public FennecRender(RenderManager renderManager)
    {
        super(renderManager, new ModelFennec(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(Fennec entity)
    {
        return Fennec_TEXTURES;
    }
}
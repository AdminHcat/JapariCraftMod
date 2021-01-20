package com.japaricraft.japaricraftmod.render.modelrender;

import com.japaricraft.japaricraftmod.mob.Squirre;
import com.japaricraft.japaricraftmod.render.ModelSquirre;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

public class SquirreRender extends RenderLiving<Squirre> {
    private static final ResourceLocation TEXTURES = new ResourceLocation(MODID, "textures/entity/squirre.png");

    public SquirreRender(RenderManager renderManager) {
        super(renderManager, new ModelSquirre(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(Squirre entity) {
        return TEXTURES;
    }
}
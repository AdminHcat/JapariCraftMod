package com.japaricraft.japaricraftmod.render.modelrender;

import com.japaricraft.japaricraftmod.mob.BrownOwl;
import com.japaricraft.japaricraftmod.render.ModelBrownOwl;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

@SideOnly(Side.CLIENT)
public class BrownOwlEntityRender extends RenderLiving<BrownOwl>
{
    private static final ResourceLocation OWL_TEXTURES = new ResourceLocation(MODID, "textures/entity/owl1.png");
    public BrownOwlEntityRender(RenderManager renderManager)
    {
        super(renderManager, new ModelBrownOwl(), 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(BrownOwl entity)
    {
        return OWL_TEXTURES;
    }
    protected float handleRotationFloat(BrownOwl livingBase, float partialTicks)
    {
        float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
}
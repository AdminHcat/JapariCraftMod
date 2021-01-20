package com.japaricraft.japaricraftmod.render.modelrender;

import com.japaricraft.japaricraftmod.mob.WhiteOwl;
import com.japaricraft.japaricraftmod.render.ModelWhiteOwl;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

@SideOnly(Side.CLIENT)
public class WhiteOwlEntityRender extends RenderLiving<WhiteOwl>
{
    private static final ResourceLocation OWL_TEXTURES = new ResourceLocation(MODID, "textures/entity/owl2.png");
    public WhiteOwlEntityRender(RenderManager renderManager)
    {
        super(renderManager, new ModelWhiteOwl(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(WhiteOwl entity)
    {
        return OWL_TEXTURES;
    }
    protected float handleRotationFloat(WhiteOwl livingBase, float partialTicks)
    {
        float f = livingBase.oFlap + (livingBase.wingRotation - livingBase.oFlap) * partialTicks;
        float f1 = livingBase.oFlapSpeed + (livingBase.destPos - livingBase.oFlapSpeed) * partialTicks;
        return (MathHelper.sin(f) + 1.0F) * f1;
    }
}
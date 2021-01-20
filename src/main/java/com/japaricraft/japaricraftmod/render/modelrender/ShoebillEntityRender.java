package com.japaricraft.japaricraftmod.render.modelrender;

import com.japaricraft.japaricraftmod.mob.Shoebill;
import com.japaricraft.japaricraftmod.render.ModelShoebill;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

@SideOnly(Side.CLIENT)
public class ShoebillEntityRender extends RenderLiving<Shoebill>
{
    private static final ResourceLocation Shobill_TEXTURES = new ResourceLocation(MODID, "textures/entity/shoebill.png");
    public ShoebillEntityRender(RenderManager renderManager)
    {
        super(renderManager, new ModelShoebill(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(Shoebill entity)
    {
        return Shobill_TEXTURES;
    }
}
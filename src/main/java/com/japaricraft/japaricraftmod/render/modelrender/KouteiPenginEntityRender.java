package com.japaricraft.japaricraftmod.render.modelrender;

import com.japaricraft.japaricraftmod.mob.KouteiPenguin;
import com.japaricraft.japaricraftmod.render.ModelKouteiPengin;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import static com.japaricraft.japaricraftmod.JapariCraftMod.MODID;

@SideOnly(Side.CLIENT)
public class KouteiPenginEntityRender extends RenderLiving<KouteiPenguin>
{
    private static final ResourceLocation Pengin_TEXTURES = new ResourceLocation(MODID, "textures/entity/ppp1.png");
    public KouteiPenginEntityRender(RenderManager renderManager)
    {
        super(renderManager, new ModelKouteiPengin(), 0.5F);
    }


    @Override
    protected ResourceLocation getEntityTexture(KouteiPenguin entity)
    {
        return Pengin_TEXTURES;
    }
}
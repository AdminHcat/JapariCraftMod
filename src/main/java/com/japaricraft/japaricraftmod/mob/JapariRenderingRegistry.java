package com.japaricraft.japaricraftmod.mob;

import com.japaricraft.japaricraftmod.render.modelrender.*;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class JapariRenderingRegistry {
    public static void registerRenderers() {
        RenderingRegistry.registerEntityRenderingHandler(Serval.class, ServalEntityRender::new);
        RenderingRegistry.registerEntityRenderingHandler(WhiteOwl.class, WhiteOwlEntityRender::new);
        RenderingRegistry.registerEntityRenderingHandler(BrownOwl.class, BrownOwlEntityRender::new);
        RenderingRegistry.registerEntityRenderingHandler(Araisan.class, AraisanRender::new);
        RenderingRegistry.registerEntityRenderingHandler(Cerulean.class, CeruleanRender::new);
        RenderingRegistry.registerEntityRenderingHandler(PoisonCerulean.class, PoisonCeruleanRender::new);
        RenderingRegistry.registerEntityRenderingHandler(Shoebill.class, ShoebillEntityRender::new);
        RenderingRegistry.registerEntityRenderingHandler(Guide.class, GuideRender::new);
        RenderingRegistry.registerEntityRenderingHandler(KouteiPenguin.class, KouteiPenginEntityRender::new);
        RenderingRegistry.registerEntityRenderingHandler(Fennec.class, FennecRender::new);
        RenderingRegistry.registerEntityRenderingHandler(SandStarHandler.class, SandStarHandlerRender::new);
        RenderingRegistry.registerEntityRenderingHandler(RoyalPenguin.class, RoyalPenguinRender::new);
        RenderingRegistry.registerEntityRenderingHandler(Alpaca.class, AlpacaRender::new);
        RenderingRegistry.registerEntityRenderingHandler(Squirre.class, SquirreRender::new);
    }
}

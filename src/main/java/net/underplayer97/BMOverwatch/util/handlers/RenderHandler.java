package net.underplayer97.BMOverwatch.util.handlers;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.underplayer97.BMOverwatch.client.renderer.entity.Experiment333Renderer;
import net.underplayer97.BMOverwatch.entity.Experiment333Entity;

public class RenderHandler {

    public static void registerEntityRenders(){
        RenderingRegistry.registerEntityRenderingHandler(Experiment333Entity.class, new IRenderFactory<Experiment333Entity>() {
            @Override
            public Render<? super Experiment333Entity> createRenderFor(RenderManager manager) {
                return new Experiment333Renderer(manager);
            }
        });
    }


}

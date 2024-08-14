package net.underplayer97.BMOverwatch.client.renderer;

import net.minecraft.client.renderer.entity.RenderManager;
import net.underplayer97.BMOverwatch.client.model.entity.Experiment333Model;
import net.underplayer97.BMOverwatch.entity.Experiment333Entity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class Experiment333Renderer extends GeoEntityRenderer<Experiment333Entity> {

    @SuppressWarnings("unchecked")
    public Experiment333Renderer(RenderManager renderManager) {
        super(renderManager, new Experiment333Model());
    }
}

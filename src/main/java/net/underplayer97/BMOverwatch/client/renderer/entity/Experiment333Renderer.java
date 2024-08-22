package net.underplayer97.BMOverwatch.client.renderer.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.underplayer97.BMOverwatch.client.model.entity.Experiment333Model;
import net.underplayer97.BMOverwatch.entity.Experiment333Entity;
import net.underplayer97.bmo.Tags;

import javax.annotation.Nullable;

public class Experiment333Renderer extends RenderLiving<Experiment333Entity> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(Tags.MOD_ID +
            ":textures/model/entity/shambler.png");

    public Experiment333Renderer(RenderManager manager) {
        super(manager, new Experiment333Model(), 0.2f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(Experiment333Entity entity) {
        return TEXTURE;
    }
}

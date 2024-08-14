package net.underplayer97.BMOverwatch.client.model.entity;

import net.minecraft.util.ResourceLocation;
import net.underplayer97.BMOverwatch.entity.Experiment333Entity;
import net.underplayer97.bmo.Tags;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

@SuppressWarnings("rawtypes")
public class Experiment333Model extends AnimatedGeoModel {

    @Override
    public ResourceLocation getModelLocation(Object object) {
        return new ResourceLocation(Tags.MOD_ID, "geo/shambler.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(Object object) {
        return new ResourceLocation(Tags.MOD_ID, "textures/model/entity/shambler.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(Object animatable) {
        return new ResourceLocation(Tags.MOD_ID, "animations/placeholder.animation.json");
    }

    @SuppressWarnings({"unchecked","rawtypes"})
    //@Override
    public void setLivingAnimations(Experiment333Entity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity,uniqueID,customPredicate);
        IBone head = this.getAnimationProcessor().getBone("h_head");
    }
}

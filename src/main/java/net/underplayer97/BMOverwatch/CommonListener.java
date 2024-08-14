package net.underplayer97.BMOverwatch;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.underplayer97.BMOverwatch.entity.Experiment333Entity;
import net.underplayer97.bmo.Tags;

public class CommonListener {

    @SubscribeEvent
    public void onRegisterEntities(RegistryEvent.Register<EntityEntry> event) {
        int id = 0;

        event.getRegistry().register(EntityEntryBuilder.create().entity(Experiment333Entity.class).name("Experiment 333")
                .id(new ResourceLocation(Tags.MOD_ID, "experiment333"), id++).tracker(160, 2,
                        false).build());
    }


}

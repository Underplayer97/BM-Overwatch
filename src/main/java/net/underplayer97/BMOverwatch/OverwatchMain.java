package net.underplayer97.BMOverwatch;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.underplayer97.BMOverwatch.client.renderer.Experiment333Renderer;
import net.underplayer97.BMOverwatch.entity.Experiment333Entity;
import net.underplayer97.bmo.Tags;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

@Mod(modid = Tags.MOD_ID, name = Tags.MOD_NAME, version = Tags.VERSION)
public class OverwatchMain {

    public static final Logger LOGGER = LogManager.getLogger(Tags.MOD_NAME);

    @Mod.Instance
    public static OverwatchMain instance;

    public OverwatchMain() {
        MinecraftForge.EVENT_BUS.register(new CommonListener());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(Experiment333Entity.class, Experiment333Renderer::new);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        GeckoLib.initialize();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }



}

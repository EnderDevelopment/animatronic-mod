package com.jjplatt250.animatronicmodemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("animatronicmodemod")
public
class AnimatronicMod {
    private static final Logger LOGGER = LogManager.getLogger();

    public AnimatronicMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register items, blocks, and entities
        AnimatronicItems.register(modEventBus);
        AnimatronicBlocks.register(modEventBus);
        AnimatronicEntities.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    public static Logger getLogger() {
        return LOGGER;
    }
}

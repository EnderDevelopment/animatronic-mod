package com.jjplatt250.animatronicmodemod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class AnimatronicBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "animatronicmodemod");

    public static final RegistryObject<Block> FNAF_DOOR_BLOCK = BLOCKS.register("fnf_door_block", () -> new Block(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0f)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

package com.jjplatt250.animatronicmodemod;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class AnimatronicEntities {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, "animatronicmodemod");

    public static final RegistryObject<EntityType<AnimatronicEntity>> ANIMATRONIC_ENTITY = ENTITIES.register("animatronic_entity", () -> EntityType.Builder.of(AnimatronicEntity::new, MobCategory.CREATURE).sized(0.6f, 1.8f).build("animatronic_entity"));

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
}

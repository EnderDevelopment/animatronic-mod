package com.jjplatt250.animatronicmodemod;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public
class AnimatronicItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "animatronicmodemod");

    public static final RegistryObject<Item> ANIMATRONIC_MODE_ITEM = ITEMS.register("animatronic_mode_item", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BATTERY_ITEM = ITEMS.register("battery_item", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PUPPET_BOX_ITEM = ITEMS.register("puppet_box_item", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

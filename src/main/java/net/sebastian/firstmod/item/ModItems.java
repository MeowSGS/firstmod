package net.sebastian.firstmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sebastian.firstmod.FirstMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MODID);

    public static final RegistryObject<Item> RUBY  = ITEMS.register("ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CAMELLIA = ITEMS.register("camellia", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SKULL = ITEMS.register("skull", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POLISHING_CLOTH = ITEMS.register("polishing_cloth", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POLISHED_RUBY = ITEMS.register("polished_ruby", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OPAL = ITEMS.register("opal", () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> RAW_OPAL = ITEMS.register("raw_opal", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POLISHED_OPAL = ITEMS.register("polished_opal", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> POLISHED_EMERALD = ITEMS.register("polished_emerald", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}

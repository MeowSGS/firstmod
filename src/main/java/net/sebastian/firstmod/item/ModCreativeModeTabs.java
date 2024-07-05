package net.sebastian.firstmod.item;

import net.sebastian.firstmod.FirstMod;
import net.sebastian.firstmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FirstMod.MODID);

    public static final RegistryObject<CreativeModeTab> CUSTOM_TAB = CREATIVE_MODE_TABS.register("custom_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
            .title(Component.translatable("creative.first_tab"))
            .displayItems((pParameters, pOutput) -> {
                pOutput.accept(ModItems.SKULL.get());
                pOutput.accept(ModItems.CAMELLIA.get());
                pOutput.accept(ModItems.RUBY.get());
                pOutput.accept(ModBlocks.RUBY_BLOCK.get());
                pOutput.accept(ModItems.RAW_RUBY.get());
                pOutput.accept(ModBlocks.RAW_RUBY_BLOCK.get());
                pOutput.accept(ModItems.POLISHED_RUBY.get());
                pOutput.accept(ModItems.OPAL.get());
                pOutput.accept(ModBlocks.OPAL_BLOCK.get());
                pOutput.accept(ModItems.RAW_OPAL.get());
                pOutput.accept(ModBlocks.RAW_OPAL_BLOCK.get());
                pOutput.accept(ModItems.POLISHED_OPAL.get());
                pOutput.accept(ModItems.POLISHED_EMERALD.get());
                pOutput.accept(ModItems.POLISHING_CLOTH.get());
            })
            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
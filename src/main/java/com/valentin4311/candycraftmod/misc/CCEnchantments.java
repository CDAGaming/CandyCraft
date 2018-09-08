package com.valentin4311.candycraftmod.misc;

import com.valentin4311.candycraftmod.CandyCraft;
import net.minecraft.enchantment.Enchantment;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = CandyCraft.MODID, name = CandyCraft.NAME, version = CandyCraft.VERSION)
public class CCEnchantments {
    public static final Enchantment devourer = new EnchantmentDevourer();
    public static final Enchantment honey_glue = new EnchantmentHoneyGlue();

    public static void registerEnchantment(IForgeRegistry<Enchantment> registry, Enchantment enchantment, boolean enabledInConfig) {
        if (enabledInConfig) {
            registry.register(enchantment);
        }
    }

    @Mod.EventBusSubscriber(modid = CandyCraft.MODID)
    public static class RegistryHandler {
        @SubscribeEvent
        public static void onEvent(final RegistryEvent.Register<Enchantment> event) {
            // DEBUG
            System.out.println("Registering CandyCraft enchantments");

            final IForgeRegistry<Enchantment> registry = event.getRegistry();

            registerEnchantment(registry, devourer, true);
            registerEnchantment(registry, honey_glue, true);
        }
    }
}

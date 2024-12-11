package net.poolboytreat.pbmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.poolboytreat.pbmod.PBMod;
import net.poolboytreat.pbmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup FUTURE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(PBMod.MOD_ID, "future_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.IPHONE))
                    .displayName(Text.translatable("itemgroup.pbmod.future_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RAW_LITHIUM);
                        entries.add(ModItems.LITHIUM_INGOT);
                        entries.add(ModItems.IPHONE);
                        entries.add(ModItems.VISOR);
                        entries.add(ModBlocks.CIRCUIT_BLOCK);
                        entries.add(ModBlocks.DRIP_BLOCK);
                        entries.add(ModBlocks.LITHIUM_ORE);
                    })
                    .build());

    public static void registerItemGroups() {
        PBMod.LOGGER.info("Registering Item Groups for " + PBMod.MOD_ID);
    }
}

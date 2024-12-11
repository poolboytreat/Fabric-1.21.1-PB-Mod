package net.poolboytreat.pbmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.poolboytreat.pbmod.PBMod;

public class ModItems {

    public static final Item IPHONE = registerItem("iphone", new Item(new Item.Settings()));
    public static final Item VISOR = registerItem("visor", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PBMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PBMod.LOGGER.info("Registering Mod Items for " + PBMod.MOD_ID);
    }
}
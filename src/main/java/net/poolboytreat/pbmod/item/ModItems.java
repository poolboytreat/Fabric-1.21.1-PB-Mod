package net.poolboytreat.pbmod.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.poolboytreat.pbmod.PBMod;

public class ModItems {

    public static final Item IPHONE = registerItem("iphone", new Item(new Item.Settings()));
    public static final Item VISOR = registerItem("visor", new Item(new Item.Settings()));
    public static final Item RAW_LITHIUM = registerItem("raw_lithium", new Item(new Item.Settings()));
    public static final Item LITHIUM_INGOT = registerItem("lithium_ingot", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PBMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PBMod.LOGGER.info("Registering Mod Items for " + PBMod.MOD_ID);
    }
}

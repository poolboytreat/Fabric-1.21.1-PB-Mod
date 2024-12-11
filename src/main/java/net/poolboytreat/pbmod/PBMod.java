package net.poolboytreat.pbmod;

import net.fabricmc.api.ModInitializer;

import net.poolboytreat.pbmod.block.ModBlocks;
import net.poolboytreat.pbmod.item.ModItemGroups;
import net.poolboytreat.pbmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PBMod implements ModInitializer {
	public static final String MOD_ID = "pbmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
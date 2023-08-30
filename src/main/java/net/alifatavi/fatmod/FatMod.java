package net.alifatavi.fatmod;

import net.alifatavi.fatmod.block.ModBlocks;
import net.alifatavi.fatmod.item.ModItemGroups;
import net.alifatavi.fatmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FatMod implements ModInitializer {
    public static final String MOD_ID = "fatmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
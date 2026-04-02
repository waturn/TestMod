package waturn.testmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import waturn.testmod.block.ModBlocks;
import waturn.testmod.item.ModItemGroups;
import waturn.testmod.item.ModItems;

public class TestMod implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerGroupItems();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
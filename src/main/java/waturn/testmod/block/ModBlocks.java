package waturn.testmod.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import waturn.testmod.TestMod;

public class ModBlocks {

    public static final Block TANZANITE_BLOCK = registerBlock("tanzanite_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK).slipperiness(1f)));
    public static final Block RAW_TANZANITE_BLOCK = registerBlock("raw_tanzanite_block",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool()));
    public static final Block WA_BLOCK = registerBlock("wa_block",
            new Block(AbstractBlock.Settings.create().strength(8f)
                    .requiresTool().sounds(BlockSoundGroup.ANVIL)));
    public static final Block RAW_WA_BLOCK = registerBlock("raw_wa_block",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool()));

    public static final Block TANZANITE_ORE = registerBlock("tanzanite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool()));
    public static final Block TANZANITE_DEEPSLATE_ORE = registerBlock("deepslate_tanzanite_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block WA_ORE = registerBlock("wa_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(5f).requiresTool()));
    public static final Block WA_DEEPSLATE_ORE = registerBlock("deepslate_wa_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 6),
                    AbstractBlock.Settings.create().strength(6f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TestMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.info("Registering Mod Blocks for " + TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.TANZANITE_BLOCK);
            entries.add(ModBlocks.RAW_TANZANITE_BLOCK);
            entries.add(ModBlocks.WA_BLOCK);
            entries.add(ModBlocks.RAW_WA_BLOCK);

            entries.add(ModBlocks.TANZANITE_ORE);
            entries.add(ModBlocks.TANZANITE_DEEPSLATE_ORE);
            entries.add(ModBlocks.WA_ORE);
            entries.add(ModBlocks.WA_DEEPSLATE_ORE);
        });
    }
}

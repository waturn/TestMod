package waturn.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import waturn.testmod.TestMod;
import waturn.testmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup MOD_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TANZANITE))
                    .displayName(Text.translatable("itemgroup.testmod.mod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TANZANITE);
                        entries.add(ModItems.RAW_TANZANITE);
                        entries.add(ModItems.WA);
                        entries.add(ModItems.RAW_WA);

                        entries.add(ModItems.CHISEL);
                    }).build());

    public static final ItemGroup MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TestMod.MOD_ID, "mod_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.TANZANITE_ORE))
                    .displayName(Text.translatable("itemgroup.testmod.mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.TANZANITE_ORE);
                        entries.add(ModBlocks.WA_ORE);
                        entries.add(ModBlocks.TANZANITE_DEEPSLATE_ORE);
                        entries.add(ModBlocks.WA_DEEPSLATE_ORE);

                        entries.add(ModBlocks.TANZANITE_BLOCK);
                        entries.add(ModBlocks.WA_BLOCK);

                        entries.add(ModBlocks.RAW_TANZANITE_BLOCK);
                        entries.add(ModBlocks.RAW_WA_BLOCK);
                    }).build());



    public static void registerGroupItems() {
        TestMod.LOGGER.info("Registering Item Groups for " + TestMod.MOD_ID);
    }
}

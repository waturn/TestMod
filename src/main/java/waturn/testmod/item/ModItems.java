package waturn.testmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import waturn.testmod.TestMod;
import waturn.testmod.item.custom.ChiselItem;

public class ModItems {

    public static final Item TANZANITE = registerItem("tanzanite", new Item(new Item.Settings()));
    public static final Item RAW_TANZANITE = registerItem("raw_tanzanite", new Item(new Item.Settings()));
    public static final Item WA = registerItem("wa", new Item(new Item.Settings()));
    public static final Item RAW_WA = registerItem("raw_wa", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering Mod Items for " + TestMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(TANZANITE);
           entries.add(RAW_TANZANITE);
           entries.add(WA);
           entries.add(RAW_WA);
        });
    }
}

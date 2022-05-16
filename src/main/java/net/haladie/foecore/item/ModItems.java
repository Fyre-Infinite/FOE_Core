package net.haladie.foecore.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.haladie.foecore.FOECore;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

// Pure Metals that I'm adding to the game
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item RAW_MYTHRIL = registerItem("raw_mythril",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item SILVER_INGOT = registerItem("silver_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item SILVER_NUGGET = registerItem("silver_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item RAW_SILVER = registerItem("raw_silver",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item ELECTRUM_INGOT = registerItem("electrum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item ELECTRUM_NUGGET = registerItem("electrum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item RAW_ELECTRUM = registerItem("raw_electrum",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item LEAD_INGOT = registerItem("lead_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item LEAD_NUGGET = registerItem("lead_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item RAW_LEAD = registerItem("raw_lead",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item TIN_INGOT = registerItem("tin_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item TIN_NUGGET = registerItem("tin_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item RAW_TIN = registerItem("raw_tin",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item PLATINUM_INGOT = registerItem("platinum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item PLATINUM_NUGGET = registerItem("platinum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item RAW_PLATINUM = registerItem("raw_platinum",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));

// Metal Variants I'm adding to the game
    public static final Item COLD_IRON_INGOT = registerItem("cold_iron_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item COLD_IRON_NUGGET = registerItem("cold_iron_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));

// Alloys I'm adding to the game
    public static final Item ADAMANTINE_INGOT = registerItem("adamantine_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item ADAMANTINE_NUGGET = registerItem("adamantine_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item BRASS_INGOT = registerItem("brass_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item BRASS_NUGGET = registerItem("brass_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item BRONZE_INGOT = registerItem("bronze_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item BRONZE_NUGGET = registerItem("bronze_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item STEEL_INGOT = registerItem("steel_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));
    public static final Item STEEL_NUGGET = registerItem("steel_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.METALS)));


    private static Item registerItem(String name, Item item)
    {
        return Registry.register(Registry.ITEM, new Identifier(FOECore.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FOECore.LOGGER.info("Registering Mod Items for " + FOECore.MOD_ID);
    }
}
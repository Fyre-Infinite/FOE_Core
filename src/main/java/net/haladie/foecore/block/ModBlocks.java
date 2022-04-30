package net.haladie.foecore.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.haladie.foecore.FOECore;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
// Metal Blocks
    public static final Block MYTHRIL_BLOCK = registerBlock("mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block SILVER_BLOCK = registerBlock("silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ELECTRUM_BLOCK = registerBlock("electrum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block TIN_BLOCK = registerBlock("tin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ADAMANTINE_BLOCK = registerBlock("adamantine_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block BRASS_BLOCK = registerBlock("brass_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block COLD_IRON_BLOCK = registerBlock("cold_iron_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

// Metal Ores
    public static final Block MYTHRIL_ORE = registerBlock("mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block SILVER_ORE = registerBlock("silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block ELECTRUM_ORE = registerBlock("electrum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

// Metal Netherrack Ores
    public static final Block NETHERRACK_MYTHRIL_ORE = registerBlock("netherrack_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block NETHERRACK_SILVER_ORE = registerBlock("netherrack_silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block NETHERRACK_ELECTRUM_ORE = registerBlock("netherrack_electrum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block NETHERRACK_PLATINUM_ORE = registerBlock("netherrack_platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block NETHERRACK_LEAD_ORE = registerBlock("netherrack_lead_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block NETHERRACK_TIN_ORE = registerBlock("netherrack_tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

// Metal Deepslate Ore
    public static final Block DEEPSLATE_MYTHRIL_ORE = registerBlock("deepslate_mythril_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_ELECTRUM_ORE = registerBlock("deepslate_electrum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);

// Raw Metal Blocks
    public static final Block RAW_MYTHRIL_BLOCK = registerBlock("raw_mythril_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block RAW_ELECTRUM_BLOCK = registerBlock("raw_electrum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block RAW_PLATINUM_BLOCK = registerBlock("raw_platinum_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);
    public static final Block RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ItemGroup.BUILDING_BLOCKS);



    private static Block registerBlock(String name, Block block, ItemGroup group)
    {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FOECore.MOD_ID,name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group)
    {
        return Registry.register(Registry.ITEM, new Identifier(FOECore.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks()
    {
        FOECore.LOGGER.info("Registering Mod Blocks for " + FOECore.MOD_ID);
    }
}

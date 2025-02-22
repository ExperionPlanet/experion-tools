package io.github.experion.tools.initializer;

import io.github.experion.tools.item.CustomLambdas;
import io.github.experion.tools.item.ModToolMaterials;
import io.github.experion.tools.item.custom_lambdas.AquamondLambdas;
import io.github.experion.tools.item.tool_lambdas.RecipeLambda;
import io.github.experion.tools.item.tool_lambdas.ToolLambdas;
import io.github.experion.tools.lib.BaseVals;

import io.github.experion.tools.lib.ToolLib;
import net.minecraft.item.*;
import net.minecraft.registry.tag.ItemTags;


public class ModTools {
    // FLINT
    public static final Item FLINT_SWORD = ToolLib.register("flint_sword", ToolLib.ToolType.SWORD, ModToolMaterials.FLINT, BaseVals.WOODEN_SWORD.getAttackDMG() + 1F, BaseVals.WOODEN_SWORD.getAttackSPEED(), null, new ToolLambdas().setLambda(CustomLambdas.FLINT_LAMBDAS).EnableEditDamage().EnableOnUseblock().EnableOnPostHit().DurableAbility().setTag(ModTags.Tools.FLINT_TOOLS).setRecipe(RecipeLambda.create().addLine(" B ").addLine(" B ").addLine(" # ").addChar('B', Items.FLINT).addChar('#', Items.STICK).setItemCriterion(Items.FLINT)));
    public static final Item FLINT_AXE = ToolLib.register("flint_axe", ToolLib.ToolType.AXE, ModToolMaterials.FLINT, BaseVals.WOODEN_AXE.getAttackDMG() + 0.5F, BaseVals.WOODEN_AXE.getAttackSPEED(), null, new ToolLambdas().setLambda(CustomLambdas.FLINT_LAMBDAS).EnableOnUseblock().EnableOnPostMine().EnableOnPostHit().EnableEditEffeciency().EnableEditDamage().DurableAbility().setTag(ModTags.Tools.FLINT_TOOLS).setRecipe(RecipeLambda.create().addLine("BB ").addLine("BP ").addLine(" # ").addChar('B', Items.FLINT).addChar('P', ItemTags.PLANKS).addChar('#', Items.STICK).setItemCriterion(Items.FLINT)));
    public static final Item FLINT_PICKAXE = ToolLib.register("flint_pickaxe", ToolLib.ToolType.PICKAXE, ModToolMaterials.FLINT, BaseVals.WOODEN_PICKAXE.getAttackDMG(), BaseVals.WOODEN_PICKAXE.getAttackSPEED(), null, new ToolLambdas().setLambda(CustomLambdas.FLINT_LAMBDAS).EnableOnUseblock().EnableOnPostMine().EnableEditEffeciency().DurableAbility().setTag(ModTags.Tools.FLINT_TOOLS).setRecipe(RecipeLambda.create().addLine("BPB").addLine(" # ").addLine(" # ").addChar('B', Items.FLINT).addChar('P', ItemTags.PLANKS).addChar('#', Items.STICK).setItemCriterion(Items.FLINT)));
    public static final Item FLINT_SHOVEL = ToolLib.register("flint_shovel", ToolLib.ToolType.SHOVEL, ModToolMaterials.FLINT, BaseVals.WOODEN_SHOVEL.getAttackDMG(), BaseVals.WOODEN_SHOVEL.getAttackSPEED(), null, new ToolLambdas().setLambda(CustomLambdas.FLINT_LAMBDAS).EnableOnUseblock().EnableOnPostMine().EnableEditEffeciency().DurableAbility().setTag(ModTags.Tools.FLINT_TOOLS).setRecipe(RecipeLambda.create().addLine(" B ").addLine(" # ").addLine(" # ").addChar('B', Items.FLINT).addChar('#', Items.STICK).setItemCriterion(Items.FLINT)));
    public static final Item FLINT_HOE = ToolLib.register("flint_hoe", ToolLib.ToolType.HOE, ModToolMaterials.FLINT, BaseVals.WOODEN_HOE.getAttackDMG(), BaseVals.WOODEN_HOE.getAttackSPEED(), null, new ToolLambdas().setLambda(CustomLambdas.FLINT_LAMBDAS).setTag(ModTags.Tools.FLINT_TOOLS).setRecipe(RecipeLambda.create().addLine("BP ").addLine(" # ").addLine(" # ").addChar('B', Items.FLINT).addChar('P', ItemTags.PLANKS).addChar('#', Items.STICK).setItemCriterion(Items.FLINT)));

    // AZALEA
    public static final Item AZALEA_SWORD = ToolLib.register("azalea_sword", ToolLib.ToolType.SWORD, ModToolMaterials.AZALEA, BaseVals.WOODEN_SWORD.getAttackDMG(),BaseVals.WOODEN_SWORD.getAttackSPEED(),null, new ToolLambdas().setLambda(CustomLambdas.AZALEA_LAMBDAS).setTag(ModTags.Tools.AZALEA_TOOLS).EnableOnPostMine().EnableOnPostHit().setRecipe(RecipeLambda.create().addLine(" A ").addLine(" A ").addLine(" T ").addChar('A',ModItems.AZALEA_CLIPPINGS).addChar('T',Items.WOODEN_SWORD).setItemCriterion(ModItems.AZALEA_CLIPPINGS)));
    public static final Item AZALEA_AXE = ToolLib.register("azalea_axe", ToolLib.ToolType.AXE, ModToolMaterials.AZALEA, BaseVals.WOODEN_AXE.getAttackDMG(),BaseVals.WOODEN_AXE.getAttackSPEED(),null, new ToolLambdas().setLambda(CustomLambdas.AZALEA_LAMBDAS).setTag(ModTags.Tools.AZALEA_TOOLS).EnableOnPostMine().EnableOnPostHit().setRecipe(RecipeLambda.create().addLine("AA ").addLine("AT ").addChar('A',ModItems.AZALEA_CLIPPINGS).addChar('T',Items.WOODEN_AXE).setItemCriterion(ModItems.AZALEA_CLIPPINGS)));
    public static final Item AZALEA_PICKAXE = ToolLib.register("azalea_pickaxe", ToolLib.ToolType.PICKAXE, ModToolMaterials.AZALEA, BaseVals.WOODEN_PICKAXE.getAttackDMG(),BaseVals.WOODEN_PICKAXE.getAttackSPEED(),null, new ToolLambdas().setLambda(CustomLambdas.AZALEA_LAMBDAS).setTag(ModTags.Tools.AZALEA_TOOLS).EnableOnPostMine().EnableOnPostHit().setRecipe(RecipeLambda.create().addLine("AAA").addLine(" T ").addChar('A',ModItems.AZALEA_CLIPPINGS).addChar('T',Items.WOODEN_PICKAXE).setItemCriterion(ModItems.AZALEA_CLIPPINGS)));
    public static final Item AZALEA_SHOVEL = ToolLib.register("azalea_shovel", ToolLib.ToolType.SHOVEL, ModToolMaterials.AZALEA, BaseVals.WOODEN_SHOVEL.getAttackDMG(),BaseVals.WOODEN_SHOVEL.getAttackSPEED(),null, new ToolLambdas().setLambda(CustomLambdas.AZALEA_LAMBDAS).setTag(ModTags.Tools.AZALEA_TOOLS).EnableOnPostMine().EnableOnPostHit().setRecipe(RecipeLambda.create().addLine(" A ").addLine(" T ").addChar('A',ModItems.AZALEA_CLIPPINGS).addChar('T',Items.WOODEN_SHOVEL).setItemCriterion(ModItems.AZALEA_CLIPPINGS)));
    public static final Item AZALEA_HOE = ToolLib.register("azalea_hoe", ToolLib.ToolType.HOE, ModToolMaterials.AZALEA, BaseVals.WOODEN_HOE.getAttackDMG(),BaseVals.WOODEN_HOE.getAttackSPEED(),null, new ToolLambdas().setLambda(CustomLambdas.AZALEA_LAMBDAS).setTag(ModTags.Tools.AZALEA_TOOLS).EnableOnPostMine().EnableOnPostHit().setRecipe(RecipeLambda.create().addLine("AA ").addLine(" T ").addChar('A',ModItems.AZALEA_CLIPPINGS).addChar('T',Items.WOODEN_HOE).setItemCriterion(ModItems.AZALEA_CLIPPINGS)));

    //COPPER
    public static final Item COPPER_SWORD = ToolLib.register("copper_sword", ToolLib.ToolType.SWORD, ModToolMaterials.COPPER, BaseVals.IRON_SWORD.getAttackDMG(), BaseVals.IRON_SWORD.getAttackSPEED(), null, ToolLambdas.of().EnableEditDamage().EnableOnPostHit().EnableInventoryTick().GetThundered().DisableDefaultModel().EnableOnUse().setLambda(CustomLambdas.COPPER_LAMBDAS).setTag(ModTags.Tools.COPPER_TOOLS).setRecipe(RecipeLambda.create().addLine(" B ").addLine(" B ").addLine(" # ").addChar('B',Items.COPPER_INGOT).addChar('#',Items.STICK).setItemCriterion(Items.COPPER_INGOT)));
    public static final Item COPPER_AXE = ToolLib.register("copper_axe", ToolLib.ToolType.AXE, ModToolMaterials.COPPER, BaseVals.IRON_AXE.getAttackDMG(), BaseVals.IRON_AXE.getAttackSPEED(), null, new ToolLambdas().EnableEditDamage().EnableOnPostHit().EnableEditEffeciency().EnableOnPostMine().GetThundered().DisableDefaultModel().EnableInventoryTick().EnableOnUse().setLambda(CustomLambdas.COPPER_LAMBDAS).setTag(ModTags.Tools.COPPER_TOOLS).setRecipe(RecipeLambda.create().addLine("BB ").addLine("B# ").addLine(" # ").addChar('B',Items.COPPER_INGOT).addChar('#',Items.STICK).setItemCriterion(Items.COPPER_INGOT)));
    public static final Item COPPER_PICKAXE = ToolLib.register("copper_pickaxe", ToolLib.ToolType.PICKAXE, ModToolMaterials.COPPER, BaseVals.IRON_PICKAXE.getAttackDMG(), BaseVals.IRON_PICKAXE.getAttackSPEED(), null, new ToolLambdas().EnableEditEffeciency().EnableOnPostMine().GetThundered().DisableDefaultModel().EnableInventoryTick().EnableOnUse().setLambda(CustomLambdas.COPPER_LAMBDAS).setTag(ModTags.Tools.COPPER_TOOLS).setRecipe(RecipeLambda.create().addLine("BBB").addLine(" # ").addLine(" # ").addChar('B',Items.COPPER_INGOT).addChar('#',Items.STICK).setItemCriterion(Items.COPPER_INGOT)));
    public static final Item COPPER_SHOVEL = ToolLib.register("copper_shovel", ToolLib.ToolType.SHOVEL, ModToolMaterials.COPPER, BaseVals.IRON_SHOVEL.getAttackDMG(), BaseVals.IRON_SHOVEL.getAttackSPEED(), null, new ToolLambdas().EnableEditEffeciency().EnableOnPostMine().GetThundered().DisableDefaultModel().EnableInventoryTick().EnableOnUse().setLambda(CustomLambdas.COPPER_LAMBDAS).setTag(ModTags.Tools.COPPER_TOOLS).setRecipe(RecipeLambda.create().addLine(" B ").addLine(" # ").addLine(" # ").addChar('B',Items.COPPER_INGOT).addChar('#',Items.STICK).setItemCriterion(Items.COPPER_INGOT)));
    public static final Item COPPER_HOE = ToolLib.register("copper_hoe", ToolLib.ToolType.HOE, ModToolMaterials.COPPER, BaseVals.IRON_HOE.getAttackDMG(), BaseVals.IRON_HOE.getAttackSPEED(), null, new ToolLambdas().GetThundered().DisableDefaultModel().EnableInventoryTick().EnableOnUse().EnableOnUseblock().setLambda(CustomLambdas.COPPER_LAMBDAS).setTag(ModTags.Tools.COPPER_TOOLS).setRecipe(RecipeLambda.create().addLine("BB ").addLine(" # ").addLine(" # ").addChar('B',Items.COPPER_INGOT).addChar('#',Items.STICK).setItemCriterion(Items.COPPER_INGOT)));

    // STEEL
    public static final Item STEEL_SWORD = ToolLib.register("steel_sword", ToolLib.ToolType.SWORD, ModToolMaterials.STEEL, 3, -3.2f, null, ToolLambdas.of().setTag(ModTags.Tools.STEEL_TOOLS).setRecipe(RecipeLambda.sword().addChar('A',ModItems.STEEL_INGOT).addChar('#',Items.STICK).setItemCriterion(ModItems.STEEL_INGOT)));
    public static final Item STEEL_AXE = ToolLib.register("steel_axe", ToolLib.ToolType.AXE, ModToolMaterials.STEEL, 7.0f, -3.5f, null, ToolLambdas.of().setTag(ModTags.Tools.STEEL_TOOLS).setRecipe(RecipeLambda.axe().addChar('A',ModItems.STEEL_INGOT).addChar('#',Items.STICK).setItemCriterion(ModItems.STEEL_INGOT)));
    public static final Item STEEL_PICKAXE = ToolLib.register("steel_pickaxe", ToolLib.ToolType.PICKAXE, ModToolMaterials.STEEL, 2.0F, -3F, null, ToolLambdas.of().setTag(ModTags.Tools.STEEL_TOOLS).setRecipe(RecipeLambda.pickaxe().addChar('A',ModItems.STEEL_INGOT).addChar('#',Items.STICK).setItemCriterion(ModItems.STEEL_INGOT)));
    public static final Item STEEL_SHOVEL = ToolLib.register("steel_shovel", ToolLib.ToolType.SHOVEL, ModToolMaterials.STEEL, 2F, -3.3F, null, ToolLambdas.of().setTag(ModTags.Tools.STEEL_TOOLS).setRecipe(RecipeLambda.shovel().addChar('A',ModItems.STEEL_INGOT).addChar('#',Items.STICK).setItemCriterion(ModItems.STEEL_INGOT)));
    public static final Item STEEL_HOE = ToolLib.register("steel_hoe", ToolLib.ToolType.HOE, ModToolMaterials.STEEL, -2.0F, -2.5F, null, ToolLambdas.of().setTag(ModTags.Tools.STEEL_TOOLS).setRecipe(RecipeLambda.hoe().addChar('A',ModItems.STEEL_INGOT).addChar('#',Items.STICK).setItemCriterion(ModItems.STEEL_INGOT)));

    // VAMPIRE STEEL
    public static final Item VAMPIRE_STEEL_SWORD = ToolLib.register("vampire_steel_sword", ToolLib.ToolType.SWORD, ModToolMaterials.VAMPIRE_STEEL,BaseVals.DIAMOND_SWORD.getAttackDMG(), -2.5F, null, ToolLambdas.of().setTag(ModTags.Tools.VAMPIRE_STEEL_TOOLS).setLambda(CustomLambdas.VAMPIRE_STEEL_LAMBDAS).EnableEditDamage().EnableOnPostHit().setRecipe(RecipeLambda.sword().addChar('A',ModItems.VAMPIRE_STEEL_INGOT).addChar('#',Items.REDSTONE).setItemCriterion(ModItems.VAMPIRE_STEEL_INGOT)));
    public static final Item VAMPIRE_STEEL_AXE = ToolLib.register("vampire_steel_axe", ToolLib.ToolType.AXE, ModToolMaterials.VAMPIRE_STEEL,5.0f,-3.2f,null,ToolLambdas.of().setTag(ModTags.Tools.VAMPIRE_STEEL_TOOLS).setLambda(CustomLambdas.VAMPIRE_STEEL_LAMBDAS).EnableEditDamage().EnableEditEffeciency().EnableOnPostHit().EnableOnPostMine().setRecipe(RecipeLambda.axe().addChar('A',ModItems.VAMPIRE_STEEL_INGOT).addChar('#',Items.REDSTONE).setItemCriterion(ModItems.VAMPIRE_STEEL_INGOT)));
    public static final Item VAMPIRE_STEEL_PICKAXE = ToolLib.register("vampire_steel_pickaxe", ToolLib.ToolType.PICKAXE, ModToolMaterials.VAMPIRE_STEEL, 1.5F, -3F, null, ToolLambdas.of().setTag(ModTags.Tools.VAMPIRE_STEEL_TOOLS).setLambda(CustomLambdas.VAMPIRE_STEEL_LAMBDAS).EnableEditEffeciency().EnableOnPostMine().setRecipe(RecipeLambda.pickaxe().addChar('A',ModItems.VAMPIRE_STEEL_INGOT).addChar('#',Items.REDSTONE).setItemCriterion(ModItems.VAMPIRE_STEEL_INGOT)));
    public static final Item VAMPIRE_STEEL_SHOVEL = ToolLib.register("vampire_steel_shovel", ToolLib.ToolType.SHOVEL, ModToolMaterials.VAMPIRE_STEEL, 2f, -3.2f, null, ToolLambdas.of().setTag(ModTags.Tools.VAMPIRE_STEEL_TOOLS).setLambda(CustomLambdas.VAMPIRE_STEEL_LAMBDAS).EnableEditEffeciency().EnableOnPostMine().setRecipe(RecipeLambda.shovel().addChar('A',ModItems.VAMPIRE_STEEL_INGOT).addChar('#',Items.REDSTONE).setItemCriterion(ModItems.VAMPIRE_STEEL_INGOT)));
    public static final Item VAMPIRE_STEEL_HOE = ToolLib.register("vampire_steel_hoe", ToolLib.ToolType.HOE, ModToolMaterials.VAMPIRE_STEEL, 2.0f, -2f, null, ToolLambdas.of().setTag(ModTags.Tools.VAMPIRE_STEEL_TOOLS).setLambda(CustomLambdas.VAMPIRE_STEEL_LAMBDAS).EnableOnPostHit().EnableEditDamage().setRecipe(RecipeLambda.hoe().addChar('A',ModItems.VAMPIRE_STEEL_INGOT).addChar('#',Items.REDSTONE).setItemCriterion(ModItems.VAMPIRE_STEEL_INGOT)));

    // GILDED IRON
    public static final Item GILDED_IRON_SWORD = ToolLib.register("gilded_iron_sword", ToolLib.ToolType.SWORD,ModToolMaterials.GILDED_IRON,4,BaseVals.GOLDEN_SWORD.getAttackSPEED(),null,ToolLambdas.of().setTag(ModTags.Tools.GILDED_IRON_TOOLS).setLambda(CustomLambdas.GILDED_IRON_LAMBDAS).EnableEditDamage().EnableOnPostHit().setRecipe(RecipeLambda.create().addLine("B#B").addChar('B',Items.GOLD_INGOT).addChar('#',Items.IRON_SWORD).setItemCriterion(Items.IRON_SWORD)));
    public static final Item GILDED_IRON_AXE = ToolLib.register("gilded_iron_axe", ToolLib.ToolType.AXE,ModToolMaterials.GILDED_IRON,BaseVals.IRON_AXE.getAttackDMG(),BaseVals.GOLDEN_AXE.getAttackSPEED(),null,ToolLambdas.of().setTag(ModTags.Tools.GILDED_IRON_TOOLS).setLambda(CustomLambdas.GILDED_IRON_LAMBDAS).EnableOnPostMine().EnableOnPostHit().EnableEditDamage().setRecipe(RecipeLambda.create().addLine("B#B").addChar('B',Items.GOLD_INGOT).addChar('#',Items.IRON_AXE).setItemCriterion(Items.IRON_AXE)));
    public static final Item GILDED_IRON_PICKAXE = ToolLib.register("gilded_iron_pickaxe", ToolLib.ToolType.PICKAXE,ModToolMaterials.GILDED_IRON,BaseVals.IRON_PICKAXE.getAttackDMG(), BaseVals.GOLDEN_PICKAXE.getAttackSPEED(),null,ToolLambdas.of().setTag(ModTags.Tools.GILDED_IRON_TOOLS).setLambda(CustomLambdas.GILDED_IRON_LAMBDAS).EnableOnPostMine().setRecipe(RecipeLambda.create().addLine("B#B").addChar('B',Items.GOLD_INGOT).addChar('#',Items.IRON_PICKAXE).setItemCriterion(Items.IRON_PICKAXE)));
    public static final Item GILDED_IRON_SHOVEL = ToolLib.register("gilded_iron_shovel", ToolLib.ToolType.SHOVEL,ModToolMaterials.GILDED_IRON,BaseVals.IRON_SHOVEL.getAttackDMG(),BaseVals.GOLDEN_SHOVEL.getAttackSPEED(),null,ToolLambdas.of().setTag(ModTags.Tools.GILDED_IRON_TOOLS).setLambda(CustomLambdas.GILDED_IRON_LAMBDAS).EnableOnPostMine().setRecipe(RecipeLambda.create().addLine("B#B").addChar('B',Items.GOLD_INGOT).addChar('#',Items.IRON_SHOVEL).setItemCriterion(Items.IRON_SHOVEL)));
    public static final Item GILDED_IRON_HOE = ToolLib.register("gilded_iron_hoe", ToolLib.ToolType.HOE,ModToolMaterials.GILDED_IRON,BaseVals.IRON_HOE.getAttackSPEED(), BaseVals.GOLDEN_HOE.getAttackSPEED(), null,ToolLambdas.of().setTag(ModTags.Tools.GILDED_IRON_TOOLS).setLambda(CustomLambdas.GILDED_IRON_LAMBDAS).setRecipe(RecipeLambda.create().addLine("B#B").addChar('B',Items.GOLD_INGOT).addChar('#',Items.IRON_HOE).setItemCriterion(Items.IRON_HOE)));

    // FROSTED STEEL
    public static final Item FROSTED_STEEL_SWORD = ToolLib.register("frosted_steel_sword",ToolLib.ToolType.SWORD,ModToolMaterials.FROSTED_STEEL,BaseVals.DIAMOND_SWORD.getAttackDMG(), -2.2f, null,ToolLambdas.of().setTag(ModTags.Tools.FROSTED_STEEL_TOOLS).setLambda(CustomLambdas.FROSTED_STEEL_LAMBDAS).EnableEditDamage().EnableOnPostHit().EnableInventoryTick().setRecipe(RecipeLambda.sword().addChar('A',ModItems.FROSTED_STEEL_INGOT).addChar('#', Items.IRON_INGOT)));
    public static final Item FROSTED_STEEL_AXE = ToolLib.register("frosted_steel_axe", ToolLib.ToolType.AXE,ModToolMaterials.FROSTED_STEEL,6f, -3f, null, ToolLambdas.of().setTag(ModTags.Tools.FROSTED_STEEL_TOOLS).setLambda(CustomLambdas.FROSTED_STEEL_LAMBDAS).EnableEditDamage().EnableOnPostHit().EnableOnPostMine().EnableEditEffeciency().EnableInventoryTick().setRecipe(RecipeLambda.axe().addChar('A',ModItems.FROSTED_STEEL_INGOT).addChar('#', Items.IRON_INGOT)));
    public static final Item FROSTED_STEEL_PICKAXE = ToolLib.register("frosted_steel_pickaxe", ToolLib.ToolType.PICKAXE,ModToolMaterials.FROSTED_STEEL,1.7f, -3f, null, ToolLambdas.of().setTag(ModTags.Tools.FROSTED_STEEL_TOOLS).setLambda(CustomLambdas.FROSTED_STEEL_LAMBDAS).EnableOnPostMine().EnableEditEffeciency().EnableInventoryTick().setRecipe(RecipeLambda.pickaxe().addChar('A',ModItems.FROSTED_STEEL_INGOT).addChar('#', Items.IRON_INGOT)));
    public static final Item FROSTED_STEEL_SHOVEL = ToolLib.register("frosted_steel_shovel", ToolLib.ToolType.SHOVEL,ModToolMaterials.FROSTED_STEEL,2.3f, -3.1f, null, ToolLambdas.of().setTag(ModTags.Tools.FROSTED_STEEL_TOOLS).setLambda(CustomLambdas.FROSTED_STEEL_LAMBDAS).EnableOnPostMine().EnableEditEffeciency().EnableInventoryTick().setRecipe(RecipeLambda.shovel().addChar('A',ModItems.FROSTED_STEEL_INGOT).addChar('#', Items.IRON_INGOT)));
    public static final Item FROSTED_STEEL_HOE = ToolLib.register("frosted_steel_hoe", ToolLib.ToolType.HOE,ModToolMaterials.FROSTED_STEEL,2f, -2f, null, ToolLambdas.of().setTag(ModTags.Tools.FROSTED_STEEL_TOOLS).setLambda(CustomLambdas.FROSTED_STEEL_LAMBDAS).EnableOnUseblock().EnableOnPostHit().EnableEditDamage().EnableInventoryTick().setRecipe(RecipeLambda.hoe().addChar('A',ModItems.FROSTED_STEEL_INGOT).addChar('#', Items.IRON_INGOT)));

    // AQUAMOND
    public static final Item AQUAMOND_SWORD = ToolLib.register("aquamond_sword", ToolLib.ToolType.SWORD,ToolMaterial.DIAMOND,BaseVals.DIAMOND_SWORD.getAttackDMG(),BaseVals.DIAMOND_SWORD.getAttackSPEED(), null, ToolLambdas.of().setTag(ModTags.Tools.AQUAMOND_TOOLS).setLambda(CustomLambdas.AQUAMOND_LAMBDAS).EnableEditDamage().EnableOnPostHit().EnableInventoryTick().EnableOnUse().setRecipe(RecipeLambda.create().addLine(" A ").addLine(" A ").addLine(" # ").addChar('A', ModTags.Misc.CORAL_MATERIAL).addChar('#', Items.DIAMOND_SWORD)));
    public static final Item AQUAMOND_AXE = ToolLib.register("aquamond_axe", ToolLib.ToolType.AXE,ToolMaterial.DIAMOND,BaseVals.DIAMOND_AXE.getAttackDMG(),BaseVals.DIAMOND_AXE.getAttackSPEED(), null, ToolLambdas.of().setTag(ModTags.Tools.AQUAMOND_TOOLS).setLambda(CustomLambdas.AQUAMOND_LAMBDAS).EnableEditEffeciency().EnableOnPostMine().EnableInventoryTick().EnableOnUse().setRecipe(RecipeLambda.create().addLine("AA ").addLine("A# ").addChar('A', ModTags.Misc.CORAL_MATERIAL).addChar('#', Items.DIAMOND_AXE)));
    public static final Item AQUAMOND_PICKAXE = ToolLib.register("aquamond_pickaxe", ToolLib.ToolType.PICKAXE,ToolMaterial.DIAMOND,BaseVals.DIAMOND_PICKAXE.getAttackDMG(),BaseVals.DIAMOND_PICKAXE.getAttackSPEED(), null, ToolLambdas.of().setTag(ModTags.Tools.AQUAMOND_TOOLS).setLambda(CustomLambdas.AQUAMOND_LAMBDAS).EnableEditEffeciency().EnableOnPostMine().EnableOnUse().EnableInventoryTick().setRecipe(RecipeLambda.create().addLine("AAA").addLine(" # ").addChar('A', ModTags.Misc.CORAL_MATERIAL).addChar('#', Items.DIAMOND_PICKAXE)));
    public static final Item AQUAMOND_SHOVEL = ToolLib.register("aquamond_shovel", ToolLib.ToolType.SHOVEL,ToolMaterial.DIAMOND,BaseVals.DIAMOND_SHOVEL.getAttackDMG(),BaseVals.DIAMOND_SHOVEL.getAttackSPEED(),null,ToolLambdas.of().setTag(ModTags.Tools.AQUAMOND_TOOLS).setLambda(CustomLambdas.AQUAMOND_LAMBDAS).EnableEditEffeciency().EnableOnPostMine().EnableInventoryTick().EnableOnUse().setRecipe(RecipeLambda.create().addLine(" A ").addLine(" # ").addChar('A', ModTags.Misc.CORAL_MATERIAL).addChar('#', Items.DIAMOND_SWORD)));

    // OBSIDIAN
    public static final Item OBSIDIAN_SWORD = ToolLib.register("obsidian_sword", ToolLib.ToolType.SWORD,ModToolMaterials.OBSIDIAN,BaseVals.DIAMOND_SWORD.getAttackDMG(),-3F, new Item.Settings().fireproof(),ToolLambdas.of().setTag(ModTags.Tools.OBSIDIAN_TOOLS).setLambda(CustomLambdas.OBSIDIAN_LAMBDAS).EnableInventoryTick().EnableEditDamage().EnableOnPostHit().DisableDefaultModel().setRecipe(RecipeLambda.sword().addChar('A',Items.OBSIDIAN).addChar('#',Items.IRON_INGOT)));
    public static final Item OBSIDIAN_AXE = ToolLib.register("obsidian_axe", ToolLib.ToolType.AXE,ModToolMaterials.OBSIDIAN,BaseVals.DIAMOND_AXE.getAttackDMG(),-3.5F, new Item.Settings().fireproof(),ToolLambdas.of().setTag(ModTags.Tools.OBSIDIAN_TOOLS).setLambda(CustomLambdas.OBSIDIAN_LAMBDAS).EnableInventoryTick().EnableEditDamage().EnableOnPostHit().EnableEditEffeciency().DisableDefaultModel().setRecipe(RecipeLambda.axe().addChar('A',Items.OBSIDIAN).addChar('#',Items.IRON_INGOT)));
    public static final Item OBSIDIAN_PICKAXE = ToolLib.register("obsidian_pickaxe", ToolLib.ToolType.PICKAXE,ModToolMaterials.OBSIDIAN,BaseVals.DIAMOND_PICKAXE.getAttackDMG(),-3F, new Item.Settings().fireproof(),ToolLambdas.of().setTag(ModTags.Tools.OBSIDIAN_TOOLS).setLambda(CustomLambdas.OBSIDIAN_LAMBDAS).EnableInventoryTick().EnableEditEffeciency().EnableOnUse().DisableDefaultModel().setRecipe(RecipeLambda.pickaxe().addChar('A',Items.OBSIDIAN).addChar('#',Items.IRON_INGOT)));
    public static final Item OBSIDIAN_SHOVEL = ToolLib.register("obsidian_shovel", ToolLib.ToolType.SHOVEL,ModToolMaterials.OBSIDIAN,BaseVals.DIAMOND_SHOVEL.getAttackDMG(),-2.9F, new Item.Settings().fireproof(),ToolLambdas.of().setTag(ModTags.Tools.OBSIDIAN_TOOLS).setLambda(CustomLambdas.OBSIDIAN_LAMBDAS).EnableInventoryTick().EnableEditEffeciency().DisableDefaultModel().setRecipe(RecipeLambda.shovel().addChar('A',Items.OBSIDIAN).addChar('#',Items.IRON_INGOT)));


    public static void init() {}
}

/*
* SCRAPPED TOOLS
* // REDSTONE
    public static final Item REDSTONE_SWORD = ToolLib.register("redstone_sword", ToolLib.ToolType.SWORD, ModToolMaterials.REDSTONE, 3,-2.4f, null, new ToolLambdas().setLambda(CustomLambdas.REDSTONE_LAMBDAS).setTag(ModTags.Tools.REDSTONE_TOOLS).enableOnPostHit().setRecipe(
            RecipeLambda.create()
                    .addLine(" B ")
                    .addLine(" B ")
                    .addLine(" # ")
                    .addChar('B', Items.REDSTONE_BLOCK)
                    .addChar('#',Items.STICK)
    ));

    public static final Item REDSTONE_AXE = ToolLib.register("redstone_axe", ToolLib.ToolType.AXE, ModToolMaterials.REDSTONE, 6.0F, -3F, null, new ToolLambdas().setLambda(CustomLambdas.REDSTONE_LAMBDAS).setTag(ModTags.Tools.REDSTONE_TOOLS).enableOnPostMine().enableOnPostHit().setRecipe(
            RecipeLambda.create()
                    .addLine("BB ")
                    .addLine("B# ")
                    .addLine(" # ")
                    .addChar('B', Items.REDSTONE_BLOCK)
                    .addChar('#',Items.STICK)
    ));

    public static final Item REDSTONE_PICKAXE = ToolLib.register("redstone_pickaxe", ToolLib.ToolType.PICKAXE, ModToolMaterials.REDSTONE, 1.0F, -2.8F, null, new ToolLambdas().setLambda(CustomLambdas.REDSTONE_LAMBDAS).setTag(ModTags.Tools.REDSTONE_TOOLS).enableOnPostMine().enableOnPostHit().setRecipe(
            RecipeLambda.create()
                    .addLine("BBB")
                    .addLine(" # ")
                    .addLine(" # ")
                    .addChar('B', Items.REDSTONE_BLOCK)
                    .addChar('#',Items.STICK)
    ));

    public static final Item REDSTONE_SHOVEL = ToolLib.register("redstone_shovel", ToolLib.ToolType.SHOVEL, ModToolMaterials.REDSTONE, 1.6F, -2.9F, null, new ToolLambdas().setLambda(CustomLambdas.REDSTONE_LAMBDAS).setTag(ModTags.Tools.REDSTONE_TOOLS).enableOnPostMine().enableOnPostHit().setRecipe(
            RecipeLambda.create()
                    .addLine(" B ")
                    .addLine(" # ")
                    .addLine(" # ")
                    .addChar('B', Items.REDSTONE_BLOCK)
                    .addChar('#',Items.STICK)
    ));

    public static final Item REDSTONE_HOE = ToolLib.register("redstone_hoe", ToolLib.ToolType.HOE, ModToolMaterials.REDSTONE, -2,-1.0F, null, new ToolLambdas().setLambda(CustomLambdas.REDSTONE_LAMBDAS).setTag(ModTags.Tools.REDSTONE_TOOLS).enableOnUseblock().enableOnPostHit().setRecipe(
            RecipeLambda.create()
                    .addLine("BB ")
                    .addLine(" # ")
                    .addLine(" # ")
                    .addChar('B', Items.REDSTONE_BLOCK)
                    .addChar('#',Items.STICK)
    ));
* */
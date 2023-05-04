package generations.gg.generations.core.generationscore.world.level.levelgen;

import dev.architectury.registry.registries.RegistrySupplier;
import generations.gg.generations.core.generationscore.GenerationsCore;
import generations.gg.generations.core.generationscore.world.level.block.GenerationsBlocks;
import generations.gg.generations.core.generationscore.world.level.block.PokeModMushroomBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class PokeModFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLACK_APRICORN_TREE = register("black_apricorn_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> WHITE_APRICORN_TREE = register("white_apricorn_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> PINK_APRICORN_TREE = register("pink_apricorn_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GREEN_APRICORN_TREE = register("green_apricorn_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BLUE_APRICORN_TREE = register("blue_apricorn_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> YELLOW_APRICORN_TREE = register("yellow_apricorn_tree");
    public static final ResourceKey<ConfiguredFeature<?, ?>> RED_APRICORN_TREE = register("red_apricorn_tree");

    public static final ResourceKey<ConfiguredFeature<?, ?>> BALLONLEA_BLUE_MUSHROOM = register("ballonlea_blue_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BALLONLEA_GREEN_MUSHROOM = register("ballonlea_green_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BALLONLEA_PINK_MUSHROOM = register("ballonlea_pink_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> BALLONLEA_YELLOW_MUSHROOM = register("ballonlea_yellow_mushroom");

    public static final ResourceKey<ConfiguredFeature<?, ?>> GROUP_BALLONLEA_BLUE_MUSHROOM = register("group_ballonlea_blue_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GROUP_BALLONLEA_GREEN_MUSHROOM = register("group_ballonlea_green_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GROUP_BALLONLEA_PINK_MUSHROOM = register("group_ballonlea_pink_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> GROUP_BALLONLEA_YELLOW_MUSHROOM = register("group_ballonlea_yellow_mushroom");

    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BALLONLEA_BLUE_MUSHROOM = register("tall_ballonlea_blue_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BALLONLEA_GREEN_MUSHROOM = register("tall_ballonlea_green_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BALLONLEA_PINK_MUSHROOM = register("tall_ballonlea_pink_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> TALL_BALLONLEA_YELLOW_MUSHROOM = register("tall_ballonlea_yellow_mushroom");

    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUBLE_BALLONLEA_BLUE_MUSHROOM = register("double_ballonlea_blue_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUBLE_BALLONLEA_GREEN_MUSHROOM = register("double_ballonlea_green_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUBLE_BALLONLEA_PINK_MUSHROOM = register("double_ballonlea_pink_mushroom");
    public static final ResourceKey<ConfiguredFeature<?, ?>> DOUBLE_BALLONLEA_YELLOW_MUSHROOM = register("double_ballonlea_yellow_mushroom");

    public static void onInitialize(BootstapContext<ConfiguredFeature<?, ?>> context) {
        registerTree(context, BLACK_APRICORN_TREE, "black_apricorn", GenerationsBlocks.BLACK_APRICORN_LEAVES);
        registerTree(context, WHITE_APRICORN_TREE, "white_apricorn", GenerationsBlocks.WHITE_APRICORN_LEAVES);
        registerTree(context, PINK_APRICORN_TREE, "pink_apricorn", GenerationsBlocks.PINK_APRICORN_LEAVES);
        registerTree(context, GREEN_APRICORN_TREE, "green_apricorn", GenerationsBlocks.GREEN_APRICORN_LEAVES);
        registerTree(context, BLUE_APRICORN_TREE, "blue_apricorn", GenerationsBlocks.BLUE_APRICORN_LEAVES);
        registerTree(context, YELLOW_APRICORN_TREE, "yellow_apricorn", GenerationsBlocks.YELLOW_APRICORN_LEAVES);
        registerTree(context, RED_APRICORN_TREE, "red_apricorn", GenerationsBlocks.RED_APRICORN_LEAVES);
        registerMushroom(context, BALLONLEA_BLUE_MUSHROOM, GenerationsBlocks.BALLONLEA_BLUE_MUSHROOM);
        registerMushroom(context, BALLONLEA_GREEN_MUSHROOM, GenerationsBlocks.BALLONLEA_GREEN_MUSHROOM);
        registerMushroom(context, BALLONLEA_PINK_MUSHROOM, GenerationsBlocks.BALLONLEA_PINK_MUSHROOM);
        registerMushroom(context, BALLONLEA_YELLOW_MUSHROOM, GenerationsBlocks.BALLONLEA_YELLOW_MUSHROOM);
        registerMushroom(context, GROUP_BALLONLEA_BLUE_MUSHROOM, GenerationsBlocks.GROUP_BALLONLEA_BLUE_MUSHROOM);
        registerMushroom(context, GROUP_BALLONLEA_GREEN_MUSHROOM, GenerationsBlocks.GROUP_BALLONLEA_GREEN_MUSHROOM);
        registerMushroom(context, GROUP_BALLONLEA_PINK_MUSHROOM, GenerationsBlocks.GROUP_BALLONLEA_PINK_MUSHROOM);
        registerMushroom(context, GROUP_BALLONLEA_YELLOW_MUSHROOM, GenerationsBlocks.GROUP_BALLONLEA_YELLOW_MUSHROOM);
        registerMushroom(context, TALL_BALLONLEA_BLUE_MUSHROOM, GenerationsBlocks.TALL_BALLONLEA_BLUE_MUSHROOM);
        registerMushroom(context, TALL_BALLONLEA_GREEN_MUSHROOM, GenerationsBlocks.TALL_BALLONLEA_GREEN_MUSHROOM);
        registerMushroom(context, TALL_BALLONLEA_PINK_MUSHROOM, GenerationsBlocks.TALL_BALLONLEA_PINK_MUSHROOM);
        registerMushroom(context, TALL_BALLONLEA_YELLOW_MUSHROOM, GenerationsBlocks.TALL_BALLONLEA_YELLOW_MUSHROOM);
        registerMushroom(context, DOUBLE_BALLONLEA_BLUE_MUSHROOM, GenerationsBlocks.DOUBLE_BALLONLEA_BLUE_MUSHROOM);
        registerMushroom(context, DOUBLE_BALLONLEA_GREEN_MUSHROOM, GenerationsBlocks.DOUBLE_BALLONLEA_GREEN_MUSHROOM);
        registerMushroom(context, DOUBLE_BALLONLEA_PINK_MUSHROOM, GenerationsBlocks.DOUBLE_BALLONLEA_PINK_MUSHROOM);
        registerMushroom(context, DOUBLE_BALLONLEA_YELLOW_MUSHROOM, GenerationsBlocks.DOUBLE_BALLONLEA_YELLOW_MUSHROOM);
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> register(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, GenerationsCore.id(name));
    }

    private static void registerMushroom(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, RegistrySupplier<PokeModMushroomBlock> mushroom) {
        FeatureUtils.register(context, key, Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(mushroom.get()))));
    }

    private static void registerTree(BootstapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, String name, RegistrySupplier<Block> leaves) {
        TreeConfiguration configuration = TreeFeatures.createStraightBlobTree(Blocks.OAK_LOG, leaves.get(), 4, 2, 0, 2).ignoreVines().build();
        FeatureUtils.register(context, key, Feature.TREE, configuration);
    }
}

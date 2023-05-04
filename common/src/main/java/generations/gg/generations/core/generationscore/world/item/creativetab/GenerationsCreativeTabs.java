package generations.gg.generations.core.generationscore.world.item.creativetab;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.RegistrySupplier;
import generations.gg.generations.core.generationscore.GenerationsCore;
import generations.gg.generations.core.generationscore.world.item.GenerationsItems;
import generations.gg.generations.core.generationscore.world.level.block.*;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

public class GenerationsCreativeTabs {
    public static CreativeTabRegistry.TabSupplier POKEBALLS = create("pokeballs", GenerationsItems.POKE_BALL);
    public static CreativeTabRegistry.TabSupplier RESTORATION = create("restoration", GenerationsItems.POTION);
    public static CreativeTabRegistry.TabSupplier TMS_TRS = create("tms_trs", GenerationsItems.TM_1);
    public static CreativeTabRegistry.TabSupplier BADGES_RIBBONS = create("badges_ribbons", GenerationsItems.MARSH_BADGE);
    public static CreativeTabRegistry.TabSupplier HELD_ITEMS = create("held_items", GenerationsItems.EXP_SHARE);
    public static CreativeTabRegistry.TabSupplier PLAYER_ITEMS = create("player_items", GenerationsItems.POKEDEX);
    public static CreativeTabRegistry.TabSupplier LEGENDARY_ITEMS = create("legendary_items", GenerationsItems.DNA_SPLICERS);
    public static CreativeTabRegistry.TabSupplier BUILDING_BLOCKS = create("building_blocks", GenerationsBlocks.WHITE_POKE_BRICK);
    public static CreativeTabRegistry.TabSupplier DECORATIONS = create("decorations", PokeModDecorationBlocks.SWITCH);
    public static CreativeTabRegistry.TabSupplier NATURAL = create("natural", GenerationsBlocks.RED_APRICORN);
    public static CreativeTabRegistry.TabSupplier UTILITY = create("utility", PokeModUtilityBlocks.RED_PC);
    public static CreativeTabRegistry.TabSupplier FORM_ITEMS = create("form_items", GenerationsItems.METEORITE);
    public static CreativeTabRegistry.TabSupplier POKEMAIL = create("pokemail", GenerationsItems.POKEMAIL_AIR);
    public static CreativeTabRegistry.TabSupplier VALUABLES = create("valuables", GenerationsItems.STRANGE_SOUVENIR);
    public static CreativeTabRegistry.TabSupplier POKEDOLLS = create("pokedolls", PokeModPokeDolls.PIKACHU_POKEDOLL);
    public static CreativeTabRegistry.TabSupplier CUISINE = create("cuisine", GenerationsItems.GIGANTAMIX);
    public static CreativeTabRegistry.TabSupplier UNIMPLEMENTED = create("unimplemented", GenerationsItems.ABILITY_URGE);
    public static CreativeTabRegistry.TabSupplier SHRINES = create("shrines", PokeModShrines.FROZEN_SHRINE);

    public static <T extends ItemLike> CreativeTabRegistry.TabSupplier create(String name, RegistrySupplier<T> supplier) {
        return CreativeTabRegistry.create(GenerationsCore.id(name), builder -> {
            builder.icon(() -> new ItemStack(supplier.get()))
                    .title(Component.translatable("item_group." + name));
            //TODO: Search bar
        });
    }

    public static void init() {

    }
}

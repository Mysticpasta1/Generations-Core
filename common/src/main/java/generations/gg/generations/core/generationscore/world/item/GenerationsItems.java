package generations.gg.generations.core.generationscore.world.item;

import com.cobblemon.mod.common.api.types.ElementalTypes;
import com.cobblemon.mod.common.pokemon.helditem.CobblemonHeldItemManager;
import dev.architectury.core.item.ArchitecturyRecordItem;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import generations.gg.generations.core.generationscore.GenerationsCore;
import generations.gg.generations.core.generationscore.config.LegendKeys;
import generations.gg.generations.core.generationscore.world.entity.GenerationsBoatEntity;
import generations.gg.generations.core.generationscore.world.entity.GenerationsChestBoatEntity;
import generations.gg.generations.core.generationscore.world.entity.TieredFishingHookEntity;
import generations.gg.generations.core.generationscore.world.item.curry.CurryIngredient;
import generations.gg.generations.core.generationscore.world.item.curry.CurryType;
import generations.gg.generations.core.generationscore.world.item.curry.ItemCurry;
import generations.gg.generations.core.generationscore.world.item.legends.*;
import generations.gg.generations.core.generationscore.world.level.block.GenerationsWood;
import generations.gg.generations.core.generationscore.world.sound.GenerationsSounds;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import org.jetbrains.annotations.NotNull;

import java.util.function.Function;

/**
 * Generations Items
 * @see net.minecraft.world.item.Item
 * @author Joseph T. McQuigg
 * @author WaterPicker
 */
@SuppressWarnings("unused")
public class GenerationsItems {

    /** Generations Items Deferred Register */
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Ribbons Deferred Register */
    public static final DeferredRegister<Item> RIBBONS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Badges Deferred Register */
    public static final DeferredRegister<Item> BADGES = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Unimplemented Deferred Register */
    public static final DeferredRegister<Item> UNIMPLEMENTED = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Cusine Deferred Register */
    public static final DeferredRegister<Item> CUISINE = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Natural Deferred Register */
    public static final DeferredRegister<Item> NATURAL = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Restoration Deferred Register */
    public static final DeferredRegister<Item> RESTORATION = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Player Items Deferred Register */
    public static final DeferredRegister<Item> PLAYER_ITEMS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations HeldItems Deferred Register */
    public static final DeferredRegister<Item> HELD_ITEMS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Pokemail Deferred Register */
    public static final DeferredRegister<Item> POKEMAIL = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Legendary Items Deferred Register */
    public static final DeferredRegister<Item> LEGENDARY_ITEMS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Utility Deferred Register */
    public static final DeferredRegister<Item> UTILITY = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Valuables Deferred Register */
    public static final DeferredRegister<Item> VALUABLES = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Form Items Deferred Register */
    public static final DeferredRegister<Item> FORM_ITEMS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);

    /** Generations Building Blocks Deferred Register */
    public static final DeferredRegister<Item> BUILDING_BLOCKS = DeferredRegister.create(GenerationsCore.MOD_ID, Registries.ITEM);


    /**
     * Restoration Items
     */
    public static final RegistrySupplier<Item> HEALTH_FEATHER = register("health_feather", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> MUSCLE_FEATHER = register("muscle_feather", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> RESIST_FEATHER = register("resist_feather", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> GENIUS_FEATHER = register("genius_feather", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> CLEVER_FEATHER = register("clever_feather", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> SWIFT_FEATHER = register("swift_feather", Item::new, RESTORATION);

    public static final RegistrySupplier<Item> PURPLE_JUICE = register("purple_juice", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> RED_JUICE = register("red_juice", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> YELLOW_JUICE = register("yellow_juice", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> BLUE_JUICE = register("blue_juice", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> GREEN_JUICE = register("green_juice", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> PINK_JUICE = register("pink_juice", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> COLORFUL_SHAKE = register("colorful_shake", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> PERILOUS_SOUP = register("perilous_soup", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> RARE_SODA = register("rare_soda", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> ULTRA_RARE_SODA = register("ultra_rare_soda", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> FRESH_WATER = register("fresh_water", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> SODA_POP = register("soda_pop", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> LEMONADE = register("lemonade", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> MOOMOO_MILK = register("moomoo_milk", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> LUMIOSE_GALETTE = register("lumiose_galette", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> SHALOUR_SABLE = register("shalour_sable", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> CASTELIACONE = register("casteliacone", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> OLD_GATEAU = register("old_gateau", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> BIG_MALASADA = register("big_malasada", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> LAVA_COOKIE = register("lava_cookie", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> RAGE_CANDY_BAR = register("rage_candy_bar", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> BLUE_FLUTE = register("blue_flute", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> RED_FLUTE = register("red_flute", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> YELLOW_FLUTE = register("yellow_flute", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> ENERGY_POWDER = register("energy_powder", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> SWEET_HEART = register("sweet_heart", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> BASIC_SWEET_POKE_PUFF = register("basic_sweet_poke_puff", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> BASIC_CITRUS_POKE_PUFF = register("basic_citrus_poke_puff", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> BASIC_MINT_POKE_PUFF = register("basic_mint_poke_puff", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> BASIC_MOCHA_POKE_PUFF = register("basic_mocha_poke_puff", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> BASIC_SPICE_POKE_PUFF = register("basic_spice_poke_puff", Item::new, RESTORATION);

    /**
     * Consumable Items
     */
    public static final RegistrySupplier<Item> DYNAMAX_CANDY = register("dynamax_candy", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> MAX_HONEY = register("max_honey", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> MAX_MUSHROOMS = register("max_mushrooms", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> MAX_POWDER = register("max_powder", Item::new, RESTORATION);
    public static final RegistrySupplier<Item> MAX_SOUP = register("max_soup", Item::new, RESTORATION);

    /**
     * TM ITEMS
     */
    public static final RegistrySupplier<Item> CUSTOM_TM = register("tm", CustomTechnicalMachineItem::new);


    public static final RegistrySupplier<Item> TM_1 = register("tm_1", properties -> new TechnicalMachineItem("takedown", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_2 = register("tm_2", properties -> new TechnicalMachineItem("charm", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_3 = register("tm_3", properties -> new TechnicalMachineItem("faketears", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_4 = register("tm_4", properties -> new TechnicalMachineItem("agility", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_5 = register("tm_5", properties -> new TechnicalMachineItem("mudslap", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_6 = register("tm_6", properties -> new TechnicalMachineItem("scaryface", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_7 = register("tm_7", properties -> new TechnicalMachineItem("protect", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_8 = register("tm_8", properties -> new TechnicalMachineItem("firefang", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_9 = register("tm_9", properties -> new TechnicalMachineItem("thunderfang", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_10 = register("tm_10", properties -> new TechnicalMachineItem("icefang", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_11 = register("tm_11", properties -> new TechnicalMachineItem("waterpulse", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_12 = register("tm_12", properties -> new TechnicalMachineItem("lowkick", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_13 = register("tm_13", properties -> new TechnicalMachineItem("acidspray", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_14 = register("tm_14", properties -> new TechnicalMachineItem("acrobatics", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_15 = register("tm_15", properties -> new TechnicalMachineItem("strugglebug", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_16 = register("tm_16", properties -> new TechnicalMachineItem("psybeam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_17 = register("tm_17", properties -> new TechnicalMachineItem("confuseray", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_18 = register("tm_18", properties -> new TechnicalMachineItem("thief", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_19 = register("tm_19", properties -> new TechnicalMachineItem("disarmingvoice", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_20 = register("tm_20", properties -> new TechnicalMachineItem("trailblaze", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_21 = register("tm_21", properties -> new TechnicalMachineItem("pounce", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_22 = register("tm_22", properties -> new TechnicalMachineItem("chillingwater", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_23 = register("tm_23", properties -> new TechnicalMachineItem("chargebeam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_24 = register("tm_24", properties -> new TechnicalMachineItem("firespin", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_25 = register("tm_25", properties -> new TechnicalMachineItem("facade", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_26 = register("tm_26", properties -> new TechnicalMachineItem("poisontail", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_27 = register("tm_27", properties -> new TechnicalMachineItem("aerialace", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_28 = register("tm_28", properties -> new TechnicalMachineItem("bulldoze", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_29 = register("tm_29", properties -> new TechnicalMachineItem("hex", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_30 = register("tm_30", properties -> new TechnicalMachineItem("snarl", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_31 = register("tm_31", properties -> new TechnicalMachineItem("metalclaw", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_32 = register("tm_32", properties -> new TechnicalMachineItem("switft", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_33 = register("tm_33", properties -> new TechnicalMachineItem("magicalleaf", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_34 = register("tm_34", properties -> new TechnicalMachineItem("icywind", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_35 = register("tm_35", properties -> new TechnicalMachineItem("mudshot", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_36 = register("tm_36", properties -> new TechnicalMachineItem("rocktomb", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_37 = register("tm_37", properties -> new TechnicalMachineItem("drainingkiss", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_38 = register("tm_38", properties -> new TechnicalMachineItem("flamecharge", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_39 = register("tm_39", properties -> new TechnicalMachineItem("lowsweep", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_40 = register("tm_40", properties -> new TechnicalMachineItem("aircutter", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_41 = register("tm_41", properties -> new TechnicalMachineItem("storedpower", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_42 = register("tm_42", properties -> new TechnicalMachineItem("nightshade", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_43 = register("tm_43", properties -> new TechnicalMachineItem("fling", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_44 = register("tm_44", properties -> new TechnicalMachineItem("dragontail", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_45 = register("tm_45", properties -> new TechnicalMachineItem("venoshock", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_46 = register("tm_46", properties -> new TechnicalMachineItem("avalanche", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_47 = register("tm_47", properties -> new TechnicalMachineItem("endure", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_48 = register("tm_48", properties -> new TechnicalMachineItem("voltswitch", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_49 = register("tm_49", properties -> new TechnicalMachineItem("sunnyday", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_50 = register("tm_50", properties -> new TechnicalMachineItem("raindance", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_51 = register("tm_51", properties -> new TechnicalMachineItem("sandstorm", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_52 = register("tm_52", properties -> new TechnicalMachineItem("snowscape", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_53 = register("tm_53", properties -> new TechnicalMachineItem("smartstrike", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_54 = register("tm_54", properties -> new TechnicalMachineItem("psyshock", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_55 = register("tm_55", properties -> new TechnicalMachineItem("dig", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_56 = register("tm_56", properties -> new TechnicalMachineItem("bulletseed", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_57 = register("tm_57", properties -> new TechnicalMachineItem("falseswipe", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_58 = register("tm_58", properties -> new TechnicalMachineItem("brickbreak", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_59 = register("tm_59", properties -> new TechnicalMachineItem("zenheadbutt", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_60 = register("tm_60", properties -> new TechnicalMachineItem("uturn", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_61 = register("tm_61", properties -> new TechnicalMachineItem("shadowclaw", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_62 = register("tm_62", properties -> new TechnicalMachineItem("foulplay", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_63 = register("tm_63", properties -> new TechnicalMachineItem("psychicfangs", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_64 = register("tm_64", properties -> new TechnicalMachineItem("bulkup", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_65 = register("tm_65", properties -> new TechnicalMachineItem("airslash", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_66 = register("tm_66", properties -> new TechnicalMachineItem("bodyslam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_67 = register("tm_67", properties -> new TechnicalMachineItem("firepunch", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_68 = register("tm_68", properties -> new TechnicalMachineItem("thunderpunch", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_69 = register("tm_69", properties -> new TechnicalMachineItem("icepunch", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_70 = register("tm_70", properties -> new TechnicalMachineItem("sleeptalk", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_71 = register("tm_71", properties -> new TechnicalMachineItem("seedbomb", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_72 = register("tm_72", properties -> new TechnicalMachineItem("electroball", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_73 = register("tm_73", properties -> new TechnicalMachineItem("drainpunch", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_74 = register("tm_74", properties -> new TechnicalMachineItem("reflect", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_75 = register("tm_75", properties -> new TechnicalMachineItem("lightscreen", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_76 = register("tm_76", properties -> new TechnicalMachineItem("rockblast", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_77 = register("tm_77", properties -> new TechnicalMachineItem("waterfall", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_78 = register("tm_78", properties -> new TechnicalMachineItem("dragonclaw", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_79 = register("tm_79", properties -> new TechnicalMachineItem("dazzlinggleam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_80 = register("tm_80", properties -> new TechnicalMachineItem("metronome", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_81 = register("tm_81", properties -> new TechnicalMachineItem("grassknot", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_82 = register("tm_82", properties -> new TechnicalMachineItem("thunderwave", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_83 = register("tm_83", properties -> new TechnicalMachineItem("poisonjab", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_84 = register("tm_84", properties -> new TechnicalMachineItem("stompingtantrum", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_85 = register("tm_85", properties -> new TechnicalMachineItem("rest", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_86 = register("tm_86", properties -> new TechnicalMachineItem("rockslide", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_87 = register("tm_87", properties -> new TechnicalMachineItem("taunt", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_88 = register("tm_88", properties -> new TechnicalMachineItem("swordsdance", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_89 = register("tm_89", properties -> new TechnicalMachineItem("bodypress", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_90 = register("tm_90", properties -> new TechnicalMachineItem("spikes", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_91 = register("tm_91", properties -> new TechnicalMachineItem("toxicspikes", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_92 = register("tm_92", properties -> new TechnicalMachineItem("imprison", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_93 = register("tm_93", properties -> new TechnicalMachineItem("flashcannon", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_94 = register("tm_94", properties -> new TechnicalMachineItem("darkpulse", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_95 = register("tm_95", properties -> new TechnicalMachineItem("leechlife", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_96 = register("tm_96", properties -> new TechnicalMachineItem("eerieimpulse", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_97 = register("tm_97", properties -> new TechnicalMachineItem("fly", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_98 = register("tm_98", properties -> new TechnicalMachineItem("skillswap", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_99 = register("tm_99", properties -> new TechnicalMachineItem("ironhead", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_100 = register("tm_100", properties -> new TechnicalMachineItem("dragondance", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_101 = register("tm_101", properties -> new TechnicalMachineItem("powergem", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_102 = register("tm_102", properties -> new TechnicalMachineItem("gunkshot", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_103 = register("tm_103", properties -> new TechnicalMachineItem("substitue", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_104 = register("tm_104", properties -> new TechnicalMachineItem("irondefense", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_105 = register("tm_105", properties -> new TechnicalMachineItem("xscissor", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_106 = register("tm_106", properties -> new TechnicalMachineItem("drillrun", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_107 = register("tm_107", properties -> new TechnicalMachineItem("willowisp", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_108 = register("tm_108", properties -> new TechnicalMachineItem("crunch", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_109 = register("tm_109", properties -> new TechnicalMachineItem("trick", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_110 = register("tm_110", properties -> new TechnicalMachineItem("liquidation", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_111 = register("tm_111", properties -> new TechnicalMachineItem("gigadrain", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_112 = register("tm_112", properties -> new TechnicalMachineItem("aurasphere", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_113 = register("tm_113", properties -> new TechnicalMachineItem("tailwind", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_114 = register("tm_114", properties -> new TechnicalMachineItem("shadowball", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_115 = register("tm_115", properties -> new TechnicalMachineItem("dragonpulse", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_116 = register("tm_116", properties -> new TechnicalMachineItem("stealthrock", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_117 = register("tm_117", properties -> new TechnicalMachineItem("hypervoice", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_118 = register("tm_118", properties -> new TechnicalMachineItem("heatwave", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_119 = register("tm_119", properties -> new TechnicalMachineItem("energyball", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_120 = register("tm_120", properties -> new TechnicalMachineItem("psychic", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_121 = register("tm_121", properties -> new TechnicalMachineItem("heavyslam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_122 = register("tm_122", properties -> new TechnicalMachineItem("encore", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_123 = register("tm_123", properties -> new TechnicalMachineItem("surf", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_124 = register("tm_124", properties -> new TechnicalMachineItem("icespinner", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_125 = register("tm_125", properties -> new TechnicalMachineItem("flamethrower", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_126 = register("tm_126", properties -> new TechnicalMachineItem("thunderbolt", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_127 = register("tm_127", properties -> new TechnicalMachineItem("playrough", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_128 = register("tm_128", properties -> new TechnicalMachineItem("amnesia", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_129 = register("tm_129", properties -> new TechnicalMachineItem("calmmind", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_130 = register("tm_130", properties -> new TechnicalMachineItem("helpinghand", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_131 = register("tm_131", properties -> new TechnicalMachineItem("pollenpuff", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_132 = register("tm_132", properties -> new TechnicalMachineItem("batonpass", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_133 = register("tm_133", properties -> new TechnicalMachineItem("earthpower", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_134 = register("tm_134", properties -> new TechnicalMachineItem("reversal", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_135 = register("tm_135", properties -> new TechnicalMachineItem("icebeam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_136 = register("tm_136", properties -> new TechnicalMachineItem("electricterrain", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_137 = register("tm_137", properties -> new TechnicalMachineItem("grassterrain", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_138 = register("tm_138", properties -> new TechnicalMachineItem("psychicterrain", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_139 = register("tm_139", properties -> new TechnicalMachineItem("mistyterrain", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_140 = register("tm_140", properties -> new TechnicalMachineItem("nastyplot", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_141 = register("tm_141", properties -> new TechnicalMachineItem("fireblast", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_142 = register("tm_142", properties -> new TechnicalMachineItem("hydropump", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_143 = register("tm_143", properties -> new TechnicalMachineItem("blizzard", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_144 = register("tm_144", properties -> new TechnicalMachineItem("firepledge", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_145 = register("tm_145", properties -> new TechnicalMachineItem("waterpledge", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_146 = register("tm_146", properties -> new TechnicalMachineItem("grasspledge", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_147 = register("tm_147", properties -> new TechnicalMachineItem("wildcharge", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_148 = register("tm_148", properties -> new TechnicalMachineItem("sludgebomb", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_149 = register("tm_149", properties -> new TechnicalMachineItem("earthquake", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_150 = register("tm_150", properties -> new TechnicalMachineItem("stoneedge", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_151 = register("tm_151", properties -> new TechnicalMachineItem("phantomforce", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_152 = register("tm_152", properties -> new TechnicalMachineItem("gigaimpact", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_153 = register("tm_153", properties -> new TechnicalMachineItem("blastburn", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_154 = register("tm_154", properties -> new TechnicalMachineItem("hydrocannon", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_155 = register("tm_155", properties -> new TechnicalMachineItem("frenzyplant", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_156 = register("tm_156", properties -> new TechnicalMachineItem("outrage", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_157 = register("tm_157", properties -> new TechnicalMachineItem("overheat", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_158 = register("tm_158", properties -> new TechnicalMachineItem("focusblast", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_159 = register("tm_159", properties -> new TechnicalMachineItem("leafstorm", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_160 = register("tm_160", properties -> new TechnicalMachineItem("hurricane", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_161 = register("tm_161", properties -> new TechnicalMachineItem("trickroom", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_162 = register("tm_162", properties -> new TechnicalMachineItem("bugbuzz", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_163 = register("tm_163", properties -> new TechnicalMachineItem("hyperbeam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_164 = register("tm_164", properties -> new TechnicalMachineItem("bravebird", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_165 = register("tm_165", properties -> new TechnicalMachineItem("flareblitz", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_166 = register("tm_166", properties -> new TechnicalMachineItem("thunder", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_167 = register("tm_167", properties -> new TechnicalMachineItem("closecombat", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_168 = register("tm_168", properties -> new TechnicalMachineItem("solarbeam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_169 = register("tm_169", properties -> new TechnicalMachineItem("dracometeor", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_170 = register("tm_170", properties -> new TechnicalMachineItem("steelbeam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_171 = register("tm_171", properties -> new TechnicalMachineItem("terablast", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_172 = register("tm_172", properties -> new TechnicalMachineItem("roar", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_173 = register("tm_173", properties -> new TechnicalMachineItem("charge", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_174 = register("tm_174", properties -> new TechnicalMachineItem("haze", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_175 = register("tm_175", properties -> new TechnicalMachineItem("toxic", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_176 = register("tm_176", properties -> new TechnicalMachineItem("sandtomb", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_177 = register("tm_177", properties -> new TechnicalMachineItem("spite", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_178 = register("tm_178", properties -> new TechnicalMachineItem("gravity", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_179 = register("tm_179", properties -> new TechnicalMachineItem("smackdown", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_180 = register("tm_180", properties -> new TechnicalMachineItem("gyroball", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_181 = register("tm_181", properties -> new TechnicalMachineItem("knockoff", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_182 = register("tm_182", properties -> new TechnicalMachineItem("bugbite", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_183 = register("tm_183", properties -> new TechnicalMachineItem("superfang", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_184 = register("tm_184", properties -> new TechnicalMachineItem("vacuumwave", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_185 = register("tm_185", properties -> new TechnicalMachineItem("lunge", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_186 = register("tm_186", properties -> new TechnicalMachineItem("highhorsepower", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_187 = register("tm_187", properties -> new TechnicalMachineItem("iciclespear", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_188 = register("tm_188", properties -> new TechnicalMachineItem("scald", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_189 = register("tm_189", properties -> new TechnicalMachineItem("heatcrash", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_190 = register("tm_190", properties -> new TechnicalMachineItem("solarblade", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_191 = register("tm_191", properties -> new TechnicalMachineItem("uproar", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_192 = register("tm_192", properties -> new TechnicalMachineItem("focuspunch", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_193 = register("tm_193", properties -> new TechnicalMachineItem("weatherball", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_194 = register("tm_194", properties -> new TechnicalMachineItem("grassyglide", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_195 = register("tm_195", properties -> new TechnicalMachineItem("burningjealousy", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_196 = register("tm_196", properties -> new TechnicalMachineItem("flipturn", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_197 = register("tm_197", properties -> new TechnicalMachineItem("dualwingbeat", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_198 = register("tm_198", properties -> new TechnicalMachineItem("poltergeist", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_199 = register("tm_199", properties -> new TechnicalMachineItem("lashout", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_200 = register("tm_200", properties -> new TechnicalMachineItem("scaleshot", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_201 = register("tm_201", properties -> new TechnicalMachineItem("mistyexplosion", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_202 = register("tm_202", properties -> new TechnicalMachineItem("painsplit", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_203 = register("tm_203", properties -> new TechnicalMachineItem("psychup", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_204 = register("tm_204", properties -> new TechnicalMachineItem("doubleedge", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_205 = register("tm_205", properties -> new TechnicalMachineItem("endeavor", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_206 = register("tm_206", properties -> new TechnicalMachineItem("petalblizzard", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_207 = register("tm_207", properties -> new TechnicalMachineItem("temperflare", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_208 = register("tm_208", properties -> new TechnicalMachineItem("whirlpool", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_209 = register("tm_209", properties -> new TechnicalMachineItem("muddywater", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_210 = register("tm_210", properties -> new TechnicalMachineItem("supercell", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_211 = register("tm_211", properties -> new TechnicalMachineItem("electroweb", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_212 = register("tm_212", properties -> new TechnicalMachineItem("tripleaxel", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_213 = register("tm_213", properties -> new TechnicalMachineItem("coaching", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_214 = register("tm_214", properties -> new TechnicalMachineItem("sludgewave", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_215 = register("tm_215", properties -> new TechnicalMachineItem("scorchingsands", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_216 = register("tm_216", properties -> new TechnicalMachineItem("featherdance", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_217 = register("tm_217", properties -> new TechnicalMachineItem("futuresight", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_218 = register("tm_218", properties -> new TechnicalMachineItem("expandingforce", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_219 = register("tm_219", properties -> new TechnicalMachineItem("skittersmack", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_220 = register("tm_220", properties -> new TechnicalMachineItem("meteorbeam", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_221 = register("tm_221", properties -> new TechnicalMachineItem("throatchop", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_222 = register("tm_222", properties -> new TechnicalMachineItem("breakingswipe", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_223 = register("tm_223", properties -> new TechnicalMachineItem("metalsound", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_224 = register("tm_224", properties -> new TechnicalMachineItem("curse", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_225 = register("tm_225", properties -> new TechnicalMachineItem("hardpress", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_226 = register("tm_226", properties -> new TechnicalMachineItem("dragonpower", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_227 = register("tm_227", properties -> new TechnicalMachineItem("alluringvoice", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_228 = register("tm_228", properties -> new TechnicalMachineItem("psychicnoise", properties), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TM_229 = register("tm_229", properties -> new TechnicalMachineItem("upperhand", properties), PLAYER_ITEMS);



    /**
     * Badges
     */
    public static final RegistrySupplier<Item> BALANCE_BADGE = createBadge("balance");
    public static final RegistrySupplier<Item> BEACON_BADGE = createBadge("beacon");
    public static final RegistrySupplier<Item> BOULDER_BADGE = createBadge("boulder");
    public static final RegistrySupplier<Item> CASCADE_BADGE = createBadge("cascade");
    public static final RegistrySupplier<Item> COAL_BADGE = createBadge("coal");
    public static final RegistrySupplier<Item> COBBLE_BADGE = createBadge("cobble");
    public static final RegistrySupplier<Item> DYNAMO_BADGE = createBadge("dynamo");
    public static final RegistrySupplier<Item> EARTH_BADGE = createBadge("earth");
    public static final RegistrySupplier<Item> FEATHER_BADGE = createBadge("feather");
    public static final RegistrySupplier<Item> FEN_BADGE = createBadge("fen");
    public static final RegistrySupplier<Item> FOG_BADGE = createBadge("fog");
    public static final RegistrySupplier<Item> FOREST_BADGE = createBadge("forest");
    public static final RegistrySupplier<Item> GLACIER_BADGE = createBadge("glacier");
    public static final RegistrySupplier<Item> HEAT_BADGE = createBadge("heat");
    public static final RegistrySupplier<Item> HIVE_BADGE = createBadge("hive");
    public static final RegistrySupplier<Item> ICICLE_BADGE = createBadge("icicle");
    public static final RegistrySupplier<Item> KNUCKLE_BADGE = createBadge("knuckle");
    public static final RegistrySupplier<Item> MARSH_BADGE = createBadge("marsh");
    public static final RegistrySupplier<Item> MIND_BADGE = createBadge("mind");
    public static final RegistrySupplier<Item> MINE_BADGE = createBadge("mine");
    public static final RegistrySupplier<Item> MINERAL_BADGE = createBadge("mineral");
    public static final RegistrySupplier<Item> PLAIN_BADGE = createBadge("plain");
    public static final RegistrySupplier<Item> RAINBOW_BADGE = createBadge("rainbow");
    public static final RegistrySupplier<Item> RAIN_BADGE = createBadge("rain");
    public static final RegistrySupplier<Item> RELIC_BADGE = createBadge("relic");
    public static final RegistrySupplier<Item> RISING_BADGE = createBadge("rising");
    public static final RegistrySupplier<Item> SOUL_BADGE = createBadge("soul");
    public static final RegistrySupplier<Item> STONE_BADGE = createBadge("stone");
    public static final RegistrySupplier<Item> STORM_BADGE = createBadge("storm");
    public static final RegistrySupplier<Item> THUNDER_BADGE = createBadge("thunder");
    public static final RegistrySupplier<Item> VOLCANO_BADGE = createBadge("volcano");
    public static final RegistrySupplier<Item> ZEPHYR_BADGE = createBadge("zephyr");
    public static final RegistrySupplier<Item> BASIC_BADGE = createBadge("basic");
    public static final RegistrySupplier<Item> BOLT_BADGE = createBadge("bolt");
    public static final RegistrySupplier<Item> FREEZE_BADGE = createBadge("freeze");
    public static final RegistrySupplier<Item> INSECT_BADGE = createBadge("insect");
    public static final RegistrySupplier<Item> JET_BADGE = createBadge("jet");
    public static final RegistrySupplier<Item> LEGEND_BADGE = createBadge("legend");
    public static final RegistrySupplier<Item> QUAKE_BADGE = createBadge("quake");
    public static final RegistrySupplier<Item> TOXIC_BADGE = createBadge("toxic");
    public static final RegistrySupplier<Item> TRIO_BADGE = createBadge("trio");
    public static final RegistrySupplier<Item> WAVE_BADGE = createBadge("wave");
    public static final RegistrySupplier<Item> BUG_BADGE = createBadge("bug");
    public static final RegistrySupplier<Item> CLIFF_BADGE = createBadge("cliff");
    public static final RegistrySupplier<Item> RUMBLE_BADGE = createBadge("rumble");
    public static final RegistrySupplier<Item> PLANT_BADGE = createBadge("plant");
    public static final RegistrySupplier<Item> VOLTAGE_BADGE = createBadge("voltage");
    public static final RegistrySupplier<Item> FAIRY_BADGE = createBadge("fairy");
    public static final RegistrySupplier<Item> PSYCHIC_BADGE = createBadge("psychic");
    public static final RegistrySupplier<Item> ICEBERG_BADGE = createBadge("iceberg");
    public static final RegistrySupplier<Item> SPIKESHELL_BADGE = createBadge("spikeshell");
    public static final RegistrySupplier<Item> SEARUBY_BADGE = createBadge("searuby");
    public static final RegistrySupplier<Item> JADESTAR_BADGE = createBadge("jadestar");
    public static final RegistrySupplier<Item> CORALEYE_BADGE = createBadge("coraleye");
    public static final RegistrySupplier<Item> FREEDOM_BADGE = createBadge("freedom");
    public static final RegistrySupplier<Item> HARMONY_BADGE = createBadge("harmony");
    public static final RegistrySupplier<Item> PATIENCE_BADGE = createBadge("patience");
    public static final RegistrySupplier<Item> PRIDE_BADGE = createBadge("pride");
    public static final RegistrySupplier<Item> TRANQUILITY_BADGE = createBadge("tranquility");
    public static final RegistrySupplier<Item> DARK_BADGE = createBadge("dark");
    public static final RegistrySupplier<Item> DRAGON_BADGE = createBadge("dragon");
    public static final RegistrySupplier<Item> FAIRY_2_BADGE = createBadge("fairy_2");
    public static final RegistrySupplier<Item> FIRE_BADGE = createBadge("fire");
    public static final RegistrySupplier<Item> GRASS_BADGE = createBadge("grass");
    public static final RegistrySupplier<Item> ICE_BADGE = createBadge("ice");
    public static final RegistrySupplier<Item> ROCK_BADGE = createBadge("rock");
    public static final RegistrySupplier<Item> WATER_BADGE = createBadge("water");
    public static final RegistrySupplier<Item> FIGHTING_BADGE = createBadge("fighting");
    public static final RegistrySupplier<Item> GHOST_BADGE = createBadge("ghost");
    public static final RegistrySupplier<Item> SURGE_BADGE = createBadge("surge");
    public static final RegistrySupplier<Item> COMPLETE_SHIELD_BADGE = createBadge("complete_shield");
    public static final RegistrySupplier<Item> COMPLETE_SWORD_BADGE = createBadge("complete_sword");

    /**
     * Ribbons
     */
    public static final RegistrySupplier<Item> PALDEA_CHAMPION_RIBBON = createRibbon("paldea_champion_ribbon");
    public static final RegistrySupplier<Item> ABILITY_RIBBON = createRibbon("ability_ribbon");
    public static final RegistrySupplier<Item> ALERT_RIBBON = createRibbon("alert_ribbon");
    public static final RegistrySupplier<Item> ALOLA_CHAMPION_RIBBON = createRibbon("alola_champion_ribbon");
    public static final RegistrySupplier<Item> ARTIST_RIBBON = createRibbon("artist_ribbon");
    public static final RegistrySupplier<Item> BEAUTY_MASTER_RIBBON = createRibbon("beauty_master_ribbon");
    public static final RegistrySupplier<Item> BEAUTY_RIBBON_GREAT = createRibbon("beauty_ribbon_great");
    public static final RegistrySupplier<Item> BEAUTY_RIBBON_HOENN = createRibbon("beauty_ribbon_hoenn");
    public static final RegistrySupplier<Item> BEAUTY_RIBBON_HYPER = createRibbon("beauty_ribbon_hyper");
    public static final RegistrySupplier<Item> BEAUTY_RIBBON_MASTER_HOENN = createRibbon("beauty_ribbon_master_hoenn");
    public static final RegistrySupplier<Item> BEAUTY_RIBBON_MASTER_SINNOH = createRibbon("beauty_ribbon_master_sinnoh");
    public static final RegistrySupplier<Item> BEAUTY_RIBBON_SINNOH = createRibbon("beauty_ribbon_sinnoh");
    public static final RegistrySupplier<Item> BEAUTY_RIBBON_SUPER = createRibbon("beauty_ribbon_super");
    public static final RegistrySupplier<Item> BEAUTY_RIBBON_ULTRA = createRibbon("beauty_ribbon_ultra");
    public static final RegistrySupplier<Item> CARELESS_RIBBON = createRibbon("careless_ribbon");
    public static final RegistrySupplier<Item> CHAMPION_RIBBON = createRibbon("champion_ribbon");
    public static final RegistrySupplier<Item> CLEVERNESS_MASTER_RIBBON = createRibbon("cleverness_master_ribbon");
    public static final RegistrySupplier<Item> CONTEST_STAR_RIBBON = createRibbon("contest_star_ribbon");
    public static final RegistrySupplier<Item> COOL_RIBBON_GREAT = createRibbon("cool_ribbon_great");
    public static final RegistrySupplier<Item> COOL_RIBBON_HOENN = createRibbon("cool_ribbon_hoenn");
    public static final RegistrySupplier<Item> COOL_RIBBON_HYPER = createRibbon("cool_ribbon_hyper");
    public static final RegistrySupplier<Item> COOL_RIBBON_MASTER_HOENN = createRibbon("cool_ribbon_master_hoenn");
    public static final RegistrySupplier<Item> COOL_RIBBON_MASTER_SINNOH = createRibbon("cool_ribbon_master_sinnoh");
    public static final RegistrySupplier<Item> COOL_RIBBON_SINNOH = createRibbon("cool_ribbon_sinnoh");
    public static final RegistrySupplier<Item> COOL_RIBBON_SUPER = createRibbon("cool_ribbon_super");
    public static final RegistrySupplier<Item> COOL_RIBBON_ULTRA = createRibbon("cool_ribbon_ultra");
    public static final RegistrySupplier<Item> COOLNESS_MASTER_RIBBON = createRibbon("coolness_master_ribbon");
    public static final RegistrySupplier<Item> CUTE_RIBBON_GREAT = createRibbon("cute_ribbon_great");
    public static final RegistrySupplier<Item> CUTE_RIBBON_HOENN = createRibbon("cute_ribbon_hoenn");
    public static final RegistrySupplier<Item> CUTE_RIBBON_HYPER = createRibbon("cute_ribbon_hyper");
    public static final RegistrySupplier<Item> CUTE_RIBBON_MASTER_HOENN = createRibbon("cute_ribbon_master_hoenn");
    public static final RegistrySupplier<Item> CUTE_RIBBON_MASTER_SINNOH = createRibbon("cute_ribbon_master_sinnoh");
    public static final RegistrySupplier<Item> CUTE_RIBBON_SINNOH = createRibbon("cute_ribbon_sinnoh");
    public static final RegistrySupplier<Item> CUTE_RIBBON_SUPER = createRibbon("cute_ribbon_super");
    public static final RegistrySupplier<Item> CUTE_RIBBON_ULTRA = createRibbon("cute_ribbon_ultra");
    public static final RegistrySupplier<Item> CUTENESS_MASTER_RIBBON = createRibbon("cuteness_master_ribbon");
    public static final RegistrySupplier<Item> DOUBLE_ABILITY_RIBBON = createRibbon("double_ability_ribbon");
    public static final RegistrySupplier<Item> DOWNCAST_RIBBON = createRibbon("downcast_ribbon");
    public static final RegistrySupplier<Item> EARTH_RIBBON = createRibbon("earth_ribbon");
    public static final RegistrySupplier<Item> EFFORT_RIBBON = createRibbon("effort_ribbon");
    public static final RegistrySupplier<Item> EXPERT_BATTLER_RIBBON = createRibbon("expert_battler_ribbon");
    public static final RegistrySupplier<Item> BATTLE_TREE_GREAT_RIBBON = createRibbon("battle_tree_great_ribbon");
    public static final RegistrySupplier<Item> BATTLE_TREE_MASTER_RIBBON = createRibbon("battle_tree_master_ribbon");
    public static final RegistrySupplier<Item> TOWER_MASTER_RIBBON = createRibbon("tower_master_ribbon");
    public static final RegistrySupplier<Item> FOOTPRINT_RIBBON = createRibbon("footprint_ribbon");
    public static final RegistrySupplier<Item> RECORD_RIBBON = createRibbon("record_ribbon");
    public static final RegistrySupplier<Item> BEST_FRIENDS_RIBBON = createRibbon("best_friends_ribbon");
    public static final RegistrySupplier<Item> TRAINING_RIBBON = createRibbon("training_ribbon");
    public static final RegistrySupplier<Item> BATTLE_ROYALE_MASTER_RIBBON = createRibbon("battle_royale_master_ribbon");
    public static final RegistrySupplier<Item> MASTER_RANK_RIBBON = createRibbon("master_rank_ribbon");
    public static final RegistrySupplier<Item> PIONEER_RIBBON = createRibbon("pioneer_ribbon");
    public static final RegistrySupplier<Item> COUNTRY_RIBBON = createRibbon("country_ribbon");
    public static final RegistrySupplier<Item> WORLD_RIBBON = createRibbon("world_ribbon");
    public static final RegistrySupplier<Item> CLASSIC_RIBBON = createRibbon("classic_ribbon");
    public static final RegistrySupplier<Item> PREMIER_RIBBON = createRibbon("premier_ribbon");
    public static final RegistrySupplier<Item> EVENT_RIBBON = createRibbon("event_ribbon");
    public static final RegistrySupplier<Item> BIRTHDAY_RIBBON = createRibbon("birthday_ribbon");
    public static final RegistrySupplier<Item> SPECIAL_RIBBON = createRibbon("special_ribbon");
    public static final RegistrySupplier<Item> SOUVENIR_RIBBON = createRibbon("souvenir_ribbon");
    public static final RegistrySupplier<Item> WISHING_RIBBON = createRibbon("wishing_ribbon");
    public static final RegistrySupplier<Item> BATTLE_CHAMPION_RIBBON = createRibbon("battle_champion_ribbon");
    public static final RegistrySupplier<Item> REGIONAL_CHAMPION_RIBBON = createRibbon("regional_champion_ribbon");
    public static final RegistrySupplier<Item> NATIONAL_CHAMPION_RIBBON = createRibbon("national_champion_ribbon");
    public static final RegistrySupplier<Item> WORLD_CHAMPION_RIBBON = createRibbon("world_champion_ribbon");
    public static final RegistrySupplier<Item> GORGEOUS_RIBBON = createRibbon("gorgeous_ribbon");
    public static final RegistrySupplier<Item> GORGEOUS_ROYAL_RIBBON = createRibbon("gorgeous_royal_ribbon");
    public static final RegistrySupplier<Item> GREAT_ABILITY_RIBBON = createRibbon("great_ability_ribbon");
    public static final RegistrySupplier<Item> HOENN_CHAMPION_RIBBON = createRibbon("hoenn_champion_ribbon");
    public static final RegistrySupplier<Item> KALOS_CHAMPION_RIBBON = createRibbon("kalos_champion_ribbon");
    public static final RegistrySupplier<Item> LEGEND_RIBBON = createRibbon("legend_ribbon");
    public static final RegistrySupplier<Item> MULTI_ABILITY_RIBBON = createRibbon("multi_ability_ribbon");
    public static final RegistrySupplier<Item> NATIONAL_RIBBON = createRibbon("national_ribbon");
    public static final RegistrySupplier<Item> PAIR_ABILITY_RIBBON = createRibbon("pair_ability_ribbon");
    public static final RegistrySupplier<Item> RELAX_RIBBON = createRibbon("relax_ribbon");
    public static final RegistrySupplier<Item> ROYAL_RIBBON = createRibbon("royal_ribbon");
    public static final RegistrySupplier<Item> SHOCK_RIBBON = createRibbon("shock_ribbon");
    public static final RegistrySupplier<Item> SINNOH_CHAMPION_RIBBON = createRibbon("sinnoh_champion_ribbon");
    public static final RegistrySupplier<Item> SKILLFUL_BATTLER_RIBBON = createRibbon("skillful_battler_ribbon");
    public static final RegistrySupplier<Item> SMART_RIBBON_GREAT = createRibbon("smart_ribbon_great");
    public static final RegistrySupplier<Item> SMART_RIBBON_HOENN = createRibbon("smart_ribbon_hoenn");
    public static final RegistrySupplier<Item> SMART_RIBBON_HYPER = createRibbon("smart_ribbon_hyper");
    public static final RegistrySupplier<Item> SMART_RIBBON_MASTER_HOENN = createRibbon("smart_ribbon_master_hoenn");
    public static final RegistrySupplier<Item> SMART_RIBBON_MASTER_SINNOH = createRibbon("smart_ribbon_master_sinnoh");
    public static final RegistrySupplier<Item> SMART_RIBBON_SINNOH = createRibbon("smart_ribbon_sinnoh");
    public static final RegistrySupplier<Item> SMART_RIBBON_SUPER = createRibbon("smart_ribbon_super");
    public static final RegistrySupplier<Item> SMART_RIBBON_ULTRA = createRibbon("smart_ribbon_ultra");
    public static final RegistrySupplier<Item> SMILE_RIBBON = createRibbon("smile_ribbon");
    public static final RegistrySupplier<Item> SNOOZE_RIBBON = createRibbon("snooze_ribbon");
    public static final RegistrySupplier<Item> TOUGH_RIBBON_GREAT = createRibbon("tough_ribbon_great");
    public static final RegistrySupplier<Item> TOUGH_RIBBON_HOENN = createRibbon("tough_ribbon_hoenn");
    public static final RegistrySupplier<Item> TOUGH_RIBBON_HYPER = createRibbon("tough_ribbon_hyper");
    public static final RegistrySupplier<Item> TOUGH_RIBBON_MASTER_HOENN = createRibbon("tough_ribbon_master_hoenn");
    public static final RegistrySupplier<Item> TOUGH_RIBBON_MASTER_SINNOH = createRibbon("tough_ribbon_master_sinnoh");
    public static final RegistrySupplier<Item> TOUGH_RIBBON_SINNOH = createRibbon("tough_ribbon_sinnoh");
    public static final RegistrySupplier<Item> TOUGH_RIBBON_SUPER = createRibbon("tough_ribbon_super");
    public static final RegistrySupplier<Item> TOUGH_RIBBON_ULTRA = createRibbon("tough_ribbon_ultra");
    public static final RegistrySupplier<Item> TOUGHNESS_MASTER_RIBBON = createRibbon("toughness_master_ribbon");
    public static final RegistrySupplier<Item> VICTORY_RIBBON = createRibbon("victory_ribbon");
    public static final RegistrySupplier<Item> WINNING_RIBBON = createRibbon("winning_ribbon");
    public static final RegistrySupplier<Item> WORLD_ABILITY_RIBBON = createRibbon("world_ability_ribbon");
    public static final RegistrySupplier<Item> ONCE_IN_A_LIFETIME_RIBBON = createRibbon("once_in_a_lifetime_ribbon");
    public static final RegistrySupplier<Item> GALAR_CHAMP_RIBBON = createRibbon("galar_champ_ribbon");
    public static final RegistrySupplier<Item> ABILITY_SYMBOL = createRibbon("ability_symbol");
    public static final RegistrySupplier<Item> ABILITY_SYMBOL_SILVER = createRibbon("ability_symbol_silver");
    public static final RegistrySupplier<Item> BRAVE_SYMBOL = createRibbon("brave_symbol");
    public static final RegistrySupplier<Item> BRAVE_SYMBOL_SILVER = createRibbon("brave_symbol_silver");
    public static final RegistrySupplier<Item> GUTS_SYMBOL = createRibbon("guts_symbol");
    public static final RegistrySupplier<Item> GUTS_SYMBOL_SILVER = createRibbon("guts_symbol_silver");
    public static final RegistrySupplier<Item> KNOWLEDGE_SYMBOL = createRibbon("knowledge_symbol");
    public static final RegistrySupplier<Item> KNOWLEDGE_SYMBOL_SILVER = createRibbon("knowledge_symbol_silver");
    public static final RegistrySupplier<Item> LUCK_SYMBOL = createRibbon("luck_symbol");
    public static final RegistrySupplier<Item> LUCK_SYMBOL_SILVER = createRibbon("luck_symbol_silver");
    public static final RegistrySupplier<Item> SPIRITS_SYMBOL = createRibbon("spirits_symbol");
    public static final RegistrySupplier<Item> SPIRITS_SYMBOL_SILVER = createRibbon("spirits_symbol_silver");
    public static final RegistrySupplier<Item> TACTICS_SYMBOL = createRibbon("tactics_symbol");
    public static final RegistrySupplier<Item> TACTICS_SYMBOL_SILVER = createRibbon("tactics_symbol_silver");

    /**
     * Held Items
     */
    public static final RegistrySupplier<Item> ABSORB_BULB = registerHeldItem("absorb_bulb");
    public static final RegistrySupplier<Item> ABILITY_SHIELD = registerHeldItem("ability_shield");
    public static final RegistrySupplier<Item> ADRENALINE_ORB = registerHeldItem("adrenaline_orb");
    public static final RegistrySupplier<Item> AIR_BALLOON = registerHeldItem("air_balloon");
    public static final RegistrySupplier<Item> AMULET_COIN = registerHeldItem("amulet_coin");
    public static final RegistrySupplier<Item> BINDING_BAND = registerHeldItem("binding_band");
    public static final RegistrySupplier<Item> BLACK_FLUTE = registerHeldItem("black_flute");
    public static final RegistrySupplier<Item> BLUNDER_POLICY = registerHeldItem("blunder_policy");
    public static final RegistrySupplier<Item> CELL_BATTERY = registerHeldItem("cell_battery");
    public static final RegistrySupplier<Item> DAMP_ROCK = registerHeldItem("damp_rock");
    public static final RegistrySupplier<Item> EJECT_BUTTON = registerHeldItem("eject_button");
    public static final RegistrySupplier<Item> EJECT_PACK = registerHeldItem("eject_pack");
    public static final RegistrySupplier<Item> EVIOLITE = registerHeldItem("eviolite");
    public static final RegistrySupplier<Item> EXP_ALL = registerHeldItem("exp_all");
    public static final RegistrySupplier<Item> EXPERT_BELT = registerHeldItem("expert_belt");
    public static final RegistrySupplier<Item> FLOAT_STONE = registerHeldItem("float_stone");
    public static final RegistrySupplier<Item> FLUFFY_TAIL = registerHeldItem("fluffy_tail");
    public static final RegistrySupplier<Item> FOCUS_SASH = registerHeldItem("focus_sash");
    public static final RegistrySupplier<Item> GRIP_CLAW = registerHeldItem("grip_claw");
    public static final RegistrySupplier<Item> HEAT_ROCK = registerHeldItem("heat_rock");
    public static final RegistrySupplier<Item> ICY_ROCK = registerHeldItem("icy_rock");
    public static final RegistrySupplier<Item> IRON_BALL = registerHeldItem("iron_ball");
    public static final RegistrySupplier<Item> LAGGING_TAIL = registerHeldItem("lagging_tail");
    public static final RegistrySupplier<Item> LEEK = registerHeldItem("leek");
    public static final RegistrySupplier<Item> LIGHT_BALL = registerHeldItem("light_ball");
    public static final RegistrySupplier<Item> LUCKY_PUNCH = registerHeldItem("lucky_punch");
    public static final RegistrySupplier<Item> LUMINOUS_MOSS = registerHeldItem("luminous_moss");
    public static final RegistrySupplier<Item> MACHO_BRACE = registerHeldItem("macho_brace");
    public static final RegistrySupplier<Item> METRONOME = registerHeldItem("metronome");
    public static final RegistrySupplier<Item> POKE_DOLL = registerHeldItem("poke_doll");
    public static final RegistrySupplier<Item> POKE_TOY = registerHeldItem("poke_toy");
    public static final RegistrySupplier<Item> PRISM_SCALE = registerHeldItem("prism_scale");
    public static final RegistrySupplier<Item> PROTECTIVE_PADS = registerHeldItem("protective_pads");
    public static final RegistrySupplier<Item> RED_CARD = registerHeldItem("red_card");
    public static final RegistrySupplier<Item> RING_TARGET = registerHeldItem("ring_target");
    public static final RegistrySupplier<Item> ROOM_SERVICE = registerHeldItem("room_service");
    public static final RegistrySupplier<Item> SCOPE_LENS = registerHeldItem("scope_lens");
    public static final RegistrySupplier<Item> SHED_SHELL = registerHeldItem("shed_shell");
    public static final RegistrySupplier<Item> SHELL_BELL = registerHeldItem("shell_bell");
    public static final RegistrySupplier<Item> SMOOTH_ROCK = registerHeldItem("smooth_rock");
    public static final RegistrySupplier<Item> SNOWBALL = registerHeldItem("snowball");
    public static final RegistrySupplier<Item> SOOTHE_BELL = registerHeldItem("soothe_bell");
    public static final RegistrySupplier<Item> SOUL_DEW = registerHeldItem("soul_dew");
    public static final RegistrySupplier<Item> STICKY_BARB = registerHeldItem("sticky_barb");
    public static final RegistrySupplier<Item> TERRAIN_EXTENDER = registerHeldItem("terrain_extender");
    public static final RegistrySupplier<Item> THICK_CLUB = registerHeldItem("thick_club");
    public static final RegistrySupplier<Item> THROAT_SPRAY = registerHeldItem("throat_spray");
    public static final RegistrySupplier<Item> UP_GRADE = registerHeldItem("up_grade");
    public static final RegistrySupplier<Item> UTILITY_UMBRELLA = registerHeldItem("utility_umbrella");
    public static final RegistrySupplier<Item> WEAKNESS_POLICY = registerHeldItem("weakness_policy");
    public static final RegistrySupplier<Item> WHITE_FLUTE = registerHeldItem("white_flute");
    public static final RegistrySupplier<Item> WIDE_LENS = registerHeldItem("wide_lens");
    public static final RegistrySupplier<Item> ZOOM_LENS = registerHeldItem("zoom_lens");
    public static final RegistrySupplier<Item> BURN_DRIVE = registerHeldItem("burn_drive");
    public static final RegistrySupplier<Item> CHILL_DRIVE = registerHeldItem("chill_drive");
    public static final RegistrySupplier<Item> DOUSE_DRIVE = registerHeldItem("douse_drive");
    public static final RegistrySupplier<Item> SHOCK_DRIVE = registerHeldItem("shock_drive");

    public static final RegistrySupplier<Item> BUG_GEM = registerHeldItem("bug_gem");
    public static final RegistrySupplier<Item> DARK_GEM = registerHeldItem("dark_gem");
    public static final RegistrySupplier<Item> DRAGON_GEM = registerHeldItem("dragon_gem");
    public static final RegistrySupplier<Item> ELECTRIC_GEM = registerHeldItem("electric_gem");
    public static final RegistrySupplier<Item> FAIRY_GEM = registerHeldItem("fairy_gem");
    public static final RegistrySupplier<Item> FIGHTING_GEM = registerHeldItem("fighting_gem");
    public static final RegistrySupplier<Item> FIRE_GEM = registerHeldItem("fire_gem");
    public static final RegistrySupplier<Item> FLYING_GEM = registerHeldItem("flying_gem");
    public static final RegistrySupplier<Item> GHOST_GEM = registerHeldItem("ghost_gem");
    public static final RegistrySupplier<Item> GRASS_GEM = registerHeldItem("grass_gem");
    public static final RegistrySupplier<Item> GROUND_GEM = registerHeldItem("ground_gem");
    public static final RegistrySupplier<Item> ICE_GEM = registerHeldItem("ice_gem");
    public static final RegistrySupplier<Item> NORMAL_GEM = registerHeldItem("normal_gem");
    public static final RegistrySupplier<Item> POISON_GEM = registerHeldItem("poison_gem");
    public static final RegistrySupplier<Item> PSYCHIC_GEM = registerHeldItem("psychic_gem");
    public static final RegistrySupplier<Item> ROCK_GEM = registerHeldItem("rock_gem");
    public static final RegistrySupplier<Item> STEEL_GEM = registerHeldItem("steel_gem");
    public static final RegistrySupplier<Item> WATER_GEM = registerHeldItem("water_gem");

    public static final RegistrySupplier<Item> FULL_INCENSE = registerHeldItem("full_incense");
    public static final RegistrySupplier<Item> LAX_INCENSE = registerHeldItem("lax_incense");
    public static final RegistrySupplier<Item> LUCK_INCENSE = registerHeldItem("luck_incense");
    public static final RegistrySupplier<Item> ODD_INCENSE = registerHeldItem("odd_incense");
    public static final RegistrySupplier<Item> PURE_INCENSE = registerHeldItem("pure_incense");
    public static final RegistrySupplier<Item> ROCK_INCENSE = registerHeldItem("rock_incense");
    public static final RegistrySupplier<Item> ROSE_INCENSE = registerHeldItem("rose_incense");
    public static final RegistrySupplier<Item> SEA_INCENSE = registerHeldItem("sea_incense");
    public static final RegistrySupplier<Item> WAVE_INCENSE = registerHeldItem("wave_incense");

    public static final RegistrySupplier<Item> ABOMASITE = registerHeldItem("abomasite");
    public static final RegistrySupplier<Item> ABSOLITE = registerHeldItem("absolite");
    public static final RegistrySupplier<Item> AERODACTYLITE = registerHeldItem("aerodactylite");
    public static final RegistrySupplier<Item> AGGRONITE = registerHeldItem("aggronite");
    public static final RegistrySupplier<Item> ALAKAZITE = registerHeldItem("alakazite");
    public static final RegistrySupplier<Item> ALTARIANITE = registerHeldItem("altarianite");
    public static final RegistrySupplier<Item> AMPHAROSITE = registerHeldItem("ampharosite");
    public static final RegistrySupplier<Item> AUDINITE = registerHeldItem("audinite");
    public static final RegistrySupplier<Item> BANETTITE = registerHeldItem("banettite");
    public static final RegistrySupplier<Item> BEEDRILLITE = registerHeldItem("beedrillite");
    public static final RegistrySupplier<Item> BLASTOISINITE = registerHeldItem("blastoisinite");
    public static final RegistrySupplier<Item> BLAZIKENITE = registerHeldItem("blazikenite");
    public static final RegistrySupplier<Item> CAMERUPTITE = registerHeldItem("cameruptite");
    public static final RegistrySupplier<Item> CHARIZARDITE_X = registerHeldItem("charizardite_x");
    public static final RegistrySupplier<Item> CHARIZARDITE_Y = registerHeldItem("charizardite_y");
    public static final RegistrySupplier<Item> DIANCITE = registerHeldItem("diancite");
    public static final RegistrySupplier<Item> GALLADITE = registerHeldItem("galladite");
    public static final RegistrySupplier<Item> GARCHOMPITE = registerHeldItem("garchompite");
    public static final RegistrySupplier<Item> GARDEVOIRITE = registerHeldItem("gardevoirite");
    public static final RegistrySupplier<Item> GENGARITE = registerHeldItem("gengarite");
    public static final RegistrySupplier<Item> GLALITITE = registerHeldItem("glalitite");
    public static final RegistrySupplier<Item> GYARADOSITE = registerHeldItem("gyaradosite");
    public static final RegistrySupplier<Item> HERACRONITE = registerHeldItem("heracronite");
    public static final RegistrySupplier<Item> HOUNDOOMINITE = registerHeldItem("houndoominite");
    public static final RegistrySupplier<Item> KANGASKHANITE = registerHeldItem("kangaskhanite");
    public static final RegistrySupplier<Item> LATIASITE = registerHeldItem("latiasite");
    public static final RegistrySupplier<Item> LATIOSITE = registerHeldItem("latiosite");
    public static final RegistrySupplier<Item> LOPUNNNITE = registerHeldItem("lopunnite");
    public static final RegistrySupplier<Item> LUCARIONITE = registerHeldItem("lucarionite");
    public static final RegistrySupplier<Item> MANECTITE = registerHeldItem("manectite");
    public static final RegistrySupplier<Item> MAWILITE = registerHeldItem("mawilite");
    public static final RegistrySupplier<Item> MEDICHAMITE = registerHeldItem("medichamite");
    public static final RegistrySupplier<Item> METAGROSSITE = registerHeldItem("metagrossite");
    public static final RegistrySupplier<Item> MEWTWONITE_X = registerHeldItem("mewtwonite_x");
    public static final RegistrySupplier<Item> MEWTWONITE_Y = registerHeldItem("mewtwonite_y");
    public static final RegistrySupplier<Item> PIDGEOTITE = registerHeldItem("pidgeotite");
    public static final RegistrySupplier<Item> PINSIRITE = registerHeldItem("pinsirite");
    public static final RegistrySupplier<Item> SABLENITE = registerHeldItem("sablenite");
    public static final RegistrySupplier<Item> SALAMENCITE = registerHeldItem("salamencite");
    public static final RegistrySupplier<Item> SCEPTILITE = registerHeldItem("sceptilite");
    public static final RegistrySupplier<Item> SCIZORITE = registerHeldItem("scizorite");
    public static final RegistrySupplier<Item> SHARPEDONITE = registerHeldItem("sharpedonite");
    public static final RegistrySupplier<Item> SLOWBRONITE = registerHeldItem("slowbronite");
    public static final RegistrySupplier<Item> STEELIXITE = registerHeldItem("steelixite");
    public static final RegistrySupplier<Item> SWAMPERTITE = registerHeldItem("swampertite");
    public static final RegistrySupplier<Item> TYRANITARITE = registerHeldItem("tyranitarite");
    public static final RegistrySupplier<Item> VENUSAURITE = registerHeldItem("venusaurite");

    public static final RegistrySupplier<Item> BUG_MEMORY_DRIVE = registerHeldItem("bug_memory_drive");
    public static final RegistrySupplier<Item> DARK_MEMORY_DRIVE = registerHeldItem("dark_memory_drive");
    public static final RegistrySupplier<Item> DRAGON_MEMORY_DRIVE = registerHeldItem("dragon_memory_drive");
    public static final RegistrySupplier<Item> ELECTRIC_MEMORY_DRIVE = registerHeldItem("electric_memory_drive");
    public static final RegistrySupplier<Item> FAIRY_MEMORY_DRIVE = registerHeldItem("fairy_memory_drive");
    public static final RegistrySupplier<Item> FIGHTING_MEMORY_DRIVE = registerHeldItem("fighting_memory_drive");
    public static final RegistrySupplier<Item> FIRE_MEMORY_DRIVE = registerHeldItem("fire_memory_drive");
    public static final RegistrySupplier<Item> FLYING_MEMORY_DRIVE = registerHeldItem("flying_memory_drive");
    public static final RegistrySupplier<Item> GHOST_MEMORY_DRIVE = registerHeldItem("ghost_memory_drive");
    public static final RegistrySupplier<Item> GRASS_MEMORY_DRIVE = registerHeldItem("grass_memory_drive");
    public static final RegistrySupplier<Item> GROUND_MEMORY_DRIVE = registerHeldItem("ground_memory_drive");
    public static final RegistrySupplier<Item> ICE_MEMORY_DRIVE = registerHeldItem("ice_memory_drive");
    public static final RegistrySupplier<Item> POISON_MEMORY_DRIVE = registerHeldItem("poison_memory_drive");
    public static final RegistrySupplier<Item> PSYCHIC_MEMORY_DRIVE = registerHeldItem("psychic_memory_drive");
    public static final RegistrySupplier<Item> ROCK_MEMORY_DRIVE = registerHeldItem("rock_memory_drive");
    public static final RegistrySupplier<Item> STEEL_MEMORY_DRIVE = registerHeldItem("steel_memory_drive");
    public static final RegistrySupplier<Item> WATER_MEMORY_DRIVE = registerHeldItem("water_memory_drive");

    public static final RegistrySupplier<Item> DRACO_PLATE = registerHeldItem("draco_plate");
    public static final RegistrySupplier<Item> DREAD_PLATE = registerHeldItem("dread_plate");
    public static final RegistrySupplier<Item> EARTH_PLATE = registerHeldItem("earth_plate");
    public static final RegistrySupplier<Item> FIST_PLATE = registerHeldItem("fist_plate");
    public static final RegistrySupplier<Item> FLAME_PLATE = registerHeldItem("flame_plate");
    public static final RegistrySupplier<Item> ICICLE_PLATE = registerHeldItem("icicle_plate");
    public static final RegistrySupplier<Item> INSECT_PLATE = registerHeldItem("insect_plate");
    public static final RegistrySupplier<Item> IRON_PLATE = registerHeldItem("iron_plate");
    public static final RegistrySupplier<Item> MEADOW_PLATE = registerHeldItem("meadow_plate");
    public static final RegistrySupplier<Item> MIND_PLATE = registerHeldItem("mind_plate");
    public static final RegistrySupplier<Item> PIXIE_PLATE = registerHeldItem("pixie_plate");
    public static final RegistrySupplier<Item> SKY_PLATE = registerHeldItem("sky_plate");
    public static final RegistrySupplier<Item> SPLASH_PLATE = registerHeldItem("splash_plate");
    public static final RegistrySupplier<Item> SPOOKY_PLATE = registerHeldItem("spooky_plate");
    public static final RegistrySupplier<Item> STONE_PLATE = registerHeldItem("stone_plate");
    public static final RegistrySupplier<Item> TOXIC_PLATE = registerHeldItem("toxic_plate");
    public static final RegistrySupplier<Item> ZAP_PLATE = registerHeldItem("zap_plate");

    public static final RegistrySupplier<Item> BUGINIUM_Z = registerHeldItem("buginium_z");
    public static final RegistrySupplier<Item> DARKINIUM_Z = registerHeldItem("darkinium_z");
    public static final RegistrySupplier<Item> DRAGONIUM_Z = registerHeldItem("dragonium_z");
    public static final RegistrySupplier<Item> ELECTRIUM_Z = registerHeldItem("electrium_z");
    public static final RegistrySupplier<Item> FAIRIUM_Z = registerHeldItem("fairium_z");
    public static final RegistrySupplier<Item> FIGHTINIUM_Z = registerHeldItem("fightinium_z");
    public static final RegistrySupplier<Item> FIRIUM_Z = registerHeldItem("firium_z");
    public static final RegistrySupplier<Item> FLYINIUM_Z = registerHeldItem("flyinium_z");
    public static final RegistrySupplier<Item> GHOSTIUM_Z = registerHeldItem("ghostium_z");
    public static final RegistrySupplier<Item> GRASSIUM_Z = registerHeldItem("grassium_z");
    public static final RegistrySupplier<Item> GROUNDIUM_Z = registerHeldItem("groundium_z");
    public static final RegistrySupplier<Item> ICIUM_Z = registerHeldItem("icium_z");
    public static final RegistrySupplier<Item> NORMALIUM_Z = registerHeldItem("normalium_z");
    public static final RegistrySupplier<Item> POISONIUM_Z = registerHeldItem("poisonium_z");
    public static final RegistrySupplier<Item> PSYCHIUM_Z = registerHeldItem("psychium_z");
    public static final RegistrySupplier<Item> ROCKIUM_Z = registerHeldItem("rockium_z");
    public static final RegistrySupplier<Item> STEELIUM_Z = registerHeldItem("steelium_z");
    public static final RegistrySupplier<Item> WATERIUM_Z = registerHeldItem("waterium_z");

    public static final RegistrySupplier<Item> ALORAICHIUM_Z = registerHeldItem("aloraichium_z");
    public static final RegistrySupplier<Item> DECIDIUM_Z = registerHeldItem("decidium_z");
    public static final RegistrySupplier<Item> EEVIUM_Z = registerHeldItem("eevium_z");
    public static final RegistrySupplier<Item> INCINIUM_Z = registerHeldItem("incinium_z");
    public static final RegistrySupplier<Item> KOMMONIUM_Z = registerHeldItem("kommonium_z");
    public static final RegistrySupplier<Item> LUNALIUM_Z = registerHeldItem("lunalium_z");
    public static final RegistrySupplier<Item> LYCANIUM_Z = registerHeldItem("lycanium_z");
    public static final RegistrySupplier<Item> MARSHADIUM_Z = registerHeldItem("marshadium_z");
    public static final RegistrySupplier<Item> MEWNIUM_Z = registerHeldItem("mewnium_z");
    public static final RegistrySupplier<Item> MIMIKIUM_Z = registerHeldItem("mimikium_z");
    public static final RegistrySupplier<Item> PIKANIUM_Z = registerHeldItem("pikanium_z");
    public static final RegistrySupplier<Item> PIKASHUNIUM_Z = registerHeldItem("pikashunium_z");
    public static final RegistrySupplier<Item> PRIMARIUM_Z = registerHeldItem("primarium_z");
    public static final RegistrySupplier<Item> SNORLIUM_Z = registerHeldItem("snorlium_z");
    public static final RegistrySupplier<Item> SOLGANIUM_Z = registerHeldItem("solganium_z");
    public static final RegistrySupplier<Item> TAPUNIUM_Z = registerHeldItem("tapunium_z");
    public static final RegistrySupplier<Item> ULTRANECROZIUM_Z = registerHeldItem("ultranecrozium_z");

    public static final RegistrySupplier<Item> ELECTRIC_SEED = registerHeldItem("electric_seed");
    public static final RegistrySupplier<Item> MISTY_SEED = registerHeldItem("misty_seed");
    public static final RegistrySupplier<Item> GRASSY_SEED = registerHeldItem("grassy_seed");
    public static final RegistrySupplier<Item> PSYCHIC_SEED = registerHeldItem("psychic_seed");
    public static final RegistrySupplier<Item> RED_SCARF = registerHeldItem("red_scarf");
    public static final RegistrySupplier<Item> LEGEND_PLATE = registerHeldItem("legend_plate");
    public static final RegistrySupplier<Item> LUSTROUS_GLOBE = registerHeldItem("lustrous_globe");
    public static final RegistrySupplier<Item> ADAMANT_CRYSTAL = registerHeldItem("adamant_crystal");
    public static final RegistrySupplier<Item> GRISEOUS_CORE = registerHeldItem("griseous_core");
    public static final RegistrySupplier<Item> LOADED_DICE = registerHeldItem("loaded_dice");
    public static final RegistrySupplier<Item> PUNCHING_GLOVE = registerHeldItem("punching_glove");
    public static final RegistrySupplier<Item> CLEAR_AMULET = registerHeldItem("clear_amulet");
    public static final RegistrySupplier<Item> COVERT_CLOAK = registerHeldItem("covert_cloak");
    public static final RegistrySupplier<Item> BOOSTER_ENERGY = registerHeldItem("booster_energy");
    public static final RegistrySupplier<Item> FAIRY_FEATHER = registerHeldItem("fairy_feather");

    /**
     * Vanilla Like Materials
     */
    public static final RegistrySupplier<Item> Z_INGOT = register("z_ingot", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> DYNITE_ORE = register("dynite_ore", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> MEGASTONE_SHARD = register("mega_stone_shard", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> KEY_STONE = register("key_stone", Item::new, PLAYER_ITEMS);



    public static final RegistrySupplier<Item> COPPER_PLATE = register("copper_plate", Item::new, PLAYER_ITEMS);

    /**
     * Player Items
     */
    public static final RegistrySupplier<Item> MARK_CHARM = register("mark_charm", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> CATCHING_CHARM = register("catching_charm", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> EXP_CHARM = register("exp_charm", Item::new, PLAYER_ITEMS);
    /*, TieredFishingHookEntity.Teir.OLD*/
    public static final RegistrySupplier<Item> OLD_ROD = register("old_rod", properties -> new TieredFishingRodItem(properties, TieredFishingHookEntity.Teir.OLD), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> GOOD_ROD = register("good_rod", properties -> new TieredFishingRodItem(properties, TieredFishingHookEntity.Teir.GOOD), PLAYER_ITEMS);
    /*, TieredFishingHookEntity.Teir.SUPER*/
    public static final RegistrySupplier<Item> SUPER_ROD = register("super_rod", properties -> new TieredFishingRodItem(properties, TieredFishingHookEntity.Teir.SUPER), PLAYER_ITEMS);
    /*, TieredFishingHookEntity.Teir.RUBY*/
    public static final RegistrySupplier<RubyRodItem> RUBY_ROD = register("ruby_rod", properties -> new RubyRodItem(properties, TieredFishingHookEntity.Teir.RUBY), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> CAMERA = register("camera", CameraItem::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> SNAP_CAMERA = register("snap_camera", CameraItem::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> FILM = register("film", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> REPEL = register("repel", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> SUPER_REPEL = register("super_repel", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> MAX_REPEL = register("max_repel", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> WAILMER_PAIL = register("wailmer_pail", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> SPRINK_LOTAD = register("sprink_lotad", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> SPRAYDUCK = register("sprayduck", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> SQUIRT_BOTTLE = register("squirt_bottle", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> MEGA_BRACELET = register("mega_bracelet", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> MEGA_CHARM = register("mega_charm", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> MEGA_CUFF = register("mega_cuff", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> MEGA_RING = register("mega_ring", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> Z_POWER_RING = register("z_power_ring", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> Z_RING = register("z_ring", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    /*
    public static final RegistrySupplier<Item> RED_BIKE = register("red_bike", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> ORANGE_BIKE = register("orange_bike", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> YELLOW_BIKE = register("yellow_bike", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> GREEN_BIKE = register("green_bike", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> BLUE_BIKE = register("blue_bike", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> PURPLE_BIKE = register("purple_bike", Item::new, PLAYER_ITEMS);
    */
    public static final RegistrySupplier<Item> ROTOM_CATALOG = register("rotom_catalog", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> POKEDEX = register("pokedex", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> LURE_MODULE = register("lure_module", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> BOTTLE_CAP = register("bottle_cap", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> GOLD_BOTTLE_CAP = register("gold_bottle_cap", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> ABILITY_CAPSULE = register("ability_capsule", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> ABILITY_PATCH = register("ability_patch", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> WISHING_STAR = register("wishing_star", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> DYNAMAX_BAND = register("dynamax_band", properties -> new Item(properties.stacksTo(1)), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> TIME_CAPSULE = register("time_capsule", properties -> new TimeCapsule(properties.fireResistant().stacksTo(1)), PLAYER_ITEMS);


    /**
     * Legendary Items
     */
    public static final RegistrySupplier<ItemWithLangTooltipImpl> ORB = register("orb", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<CreationTrioItem> ADAMANT_ORB = register("adamant_orb", properties -> new CreationTrioItem(properties.stacksTo(1), LegendKeys.DIALGA, GenerationsCore.id("models/block/shrines/creation_trio/adamant_orb.pk")), LEGENDARY_ITEMS);
    public static final RegistrySupplier<CreationTrioItem> GRISEOUS_ORB = register("griseous_orb", properties -> new CreationTrioItem(properties.stacksTo(1), LegendKeys.GIRATINA, GenerationsCore.id("models/block/shrines/creation_trio/griseous_orb.pk")), LEGENDARY_ITEMS);
    public static final RegistrySupplier<CreationTrioItem> LUSTROUS_ORB = register("lustrous_orb", properties -> new CreationTrioItem(properties.stacksTo(1), LegendKeys.PALKIA, GenerationsCore.id("models/block/shrines/creation_trio/lustrous_orb.pk")), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHATTERED_ICE_KEY_1 = register("shattered_ice_key_1", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHATTERED_ICE_KEY_2 = register("shattered_ice_key_2", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHATTERED_ICE_KEY_3 = register("shattered_ice_key_3", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHATTERED_ICE_KEY_4 = register("shattered_ice_key_4", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiKeyItem> ICEBERG_KEY = register("iceberg_key", properties -> new RegiKeyItem(properties, LegendKeys.REGICE), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> CRUMBLED_ROCK_KEY_1 = register("crumbled_rock_key_1", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> CRUMBLED_ROCK_KEY_2 = register("crumbled_rock_key_2", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> CRUMBLED_ROCK_KEY_3 = register("crumbled_rock_key_3", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> CRUMBLED_ROCK_KEY_4 = register("crumbled_rock_key_4", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiKeyItem> ROCK_PEAK_KEY = register("rock_peak_key", properties -> new RegiKeyItem(properties, LegendKeys.REGIROCK), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> RUSTY_IRON_KEY_1 = register("rusty_iron_key_1", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> RUSTY_IRON_KEY_2 = register("rusty_iron_key_2", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> RUSTY_IRON_KEY_3 = register("rusty_iron_key_3", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> RUSTY_IRON_KEY_4 = register("rusty_iron_key_4", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiKeyItem> IRON_KEY = register("iron_key", properties -> new RegiKeyItem(properties, LegendKeys.REGISTEEL), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> FRAGMENTED_DRAGO_KEY_1 = register("fragmented_drago_key_1", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> FRAGMENTED_DRAGO_KEY_2 = register("fragmented_drago_key_2", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> FRAGMENTED_DRAGO_KEY_3 = register("fragmented_drago_key_3", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> FRAGMENTED_DRAGO_KEY_4 = register("fragmented_drago_key_4", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiKeyItem> DRAGO_KEY = register("drago_key", properties -> new RegiKeyItem(properties, LegendKeys.REGIDRAGO), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> DISCHARGED_ELEKI_KEY_1 = register("discharged_eleki_key_1", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> DISCHARGED_ELEKI_KEY_2 = register("discharged_eleki_key_2", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> DISCHARGED_ELEKI_KEY_3 = register("discharged_eleki_key_3", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> DISCHARGED_ELEKI_KEY_4 = register("discharged_eleki_key_4", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiKeyItem> ELEKI_KEY = register("eleki_key", properties -> new RegiKeyItem(properties, LegendKeys.REGIELEKI), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHATTERED_RELIC_SONG_1 = register("shattered_relic_song_1", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHATTERED_RELIC_SONG_2 = register("shattered_relic_song_2", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHATTERED_RELIC_SONG_3 = register("shattered_relic_song_3", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHATTERED_RELIC_SONG_4 = register("shattered_relic_song_4", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<RelicSongItem> RELIC_SONG = createRelicSong(false);
    public static final RegistrySupplier<RelicSongItem> INERT_RELIC_SONG = createRelicSong(true);
    public static final RegistrySupplier<RedChainItem> RED_CHAIN = register("red_chain", properties -> new RedChainItem(properties.stacksTo(1)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> DNA_SPLICERS = register("dna_splicers", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> REINS_OF_UNITY = register("reins_of_unity", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> N_SOLARIZER = register("n_solarizer", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> N_LUNARIZER = register("n_lunarizer", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> LEGEND_FINDER = register("legend_finder", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> HOOPA_RING = register("hoopa_ring", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> RED_ORB = register("red_orb", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ElementalPostBattleUpdateItemImpl> FADED_RED_ORB = register("faded_red_orb", properties -> new ElementalPostBattleUpdateItemImpl(properties.stacksTo(1).durability(300), ElementalTypes.INSTANCE.getFIRE()), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ElementalPostBattleUpdateItemImpl> FADED_BLUE_ORB = register("faded_blue_orb", properties -> new ElementalPostBattleUpdateItemImpl(properties.stacksTo(1).durability(300), ElementalTypes.INSTANCE.getWATER()), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ElementalPostBattleUpdateItemImplImpl> FADED_JADE_ORB = register("faded_jade_orb", properties -> new ElementalPostBattleUpdateItemImplImpl(properties.stacksTo(1).durability(300), LegendKeys.RAYQUAZA, ElementalTypes.INSTANCE.getFLYING()), LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> BLUE_ORB = register("blue_orb", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<JadeOrb> JADE_ORB = register("jade_orb", properties -> new JadeOrb(properties.stacksTo(1)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<TaoTrioStoneItem> LIGHT_STONE = register("light_stone", properties -> new TaoTrioStoneItem(properties.stacksTo(1).durability(100), LegendKeys.RESHIRAM), LEGENDARY_ITEMS);
    public static final RegistrySupplier<TaoTrioStoneItem> DARK_STONE = register("dark_stone", properties -> new TaoTrioStoneItem(properties.stacksTo(1).durability(100), LegendKeys.ZEKROM), LEGENDARY_ITEMS);
    public static final RegistrySupplier<TaoTrioStoneItem> DRAGON_STONE = register("dragon_stone", properties -> new TaoTrioStoneItem(properties.stacksTo(1).durability(100), LegendKeys.KYUREM), LEGENDARY_ITEMS);
    public static final RegistrySupplier<WingItem> RAINBOW_WING = register("rainbow_wing", properties -> new WingItem(properties, "rainbow", ElementalTypes.INSTANCE.getFLYING(), LegendKeys.HO_OH), LEGENDARY_ITEMS);
    public static final RegistrySupplier<WingItem> SILVER_WING = register("silver_wing", properties -> new WingItem(properties.stacksTo(1), "silver", ElementalTypes.INSTANCE.getFLYING(), LegendKeys.LUGIA), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> DARK_SOUL = register("dark_soul", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> DRAGON_SOUL = register("dragon_soul", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> MELODY_FLUTE = register("melody_flute", MelodyFluteItem::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SPARKLING_SHARD = register("sparkling_shard", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SPARKLING_STONE = register("sparkling_stone", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> RUSTY_FRAGMENT = register("rusty_fragment", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ElementalPostBattleUpdateItemImplImpl> RUSTY_SWORD = register("rusty_sword", properties -> new ElementalPostBattleUpdateItemImplImpl(properties.stacksTo(1).durability(100), LegendKeys.ZACIAN, ElementalTypes.INSTANCE.getSTEEL()), LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> CROWNED_SWORD = register("crowned_sword", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ElementalPostBattleUpdateItemImplImpl> RUSTY_SHIELD = register("rusty_shield", properties -> new ElementalPostBattleUpdateItemImplImpl(properties.stacksTo(1).durability(100), LegendKeys.ZAMAZENTA, ElementalTypes.INSTANCE.getSTEEL()), LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> CROWNED_SHIELD = register("crowned_shield", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SCROLL_PAGE = register("scroll_page", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<PostBattleUpdatingWithItem> SECRET_ARMOR_SCROLL = register("secret_armor_scroll", properties -> new PostBattleUpdatingWithItem(properties.stacksTo(1).durability(100), LegendKeys.KUBFU, "pixelmon.secret_armor_scoll.amountfull", (player, stack, battle) -> battle.isNpc()) {
        @Override
        protected int spawnedLevel() {
            return 10;
        }
    }, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ZygardeCubeItem> ZYGARDE_CUBE = register("zygarde_cube", properties -> new ZygardeCubeItem(properties.stacksTo(1).durability(ZygardeCubeItem.FULL)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<MeltanBox> MELTAN_BOX = register("meltan_box", properties -> new MeltanBox(properties.stacksTo(1).durability(200)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> MELTAN_BOX_CHARGED = register("meltan_box_charged", properties -> new ItemWithLangTooltipImpl(properties.stacksTo(1)) {
        @Override
        public boolean isFoil(@NotNull ItemStack stack) {
            return true;
        }
    }, LEGENDARY_ITEMS);
    public static final RegistrySupplier<TimeGlassItem> TIME_GLASS = register("time_glass", properties -> new TimeGlassItem(properties.stacksTo(1).durability(100)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> MOON_FLUTE = register("moon_flute", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> SUN_FLUTE = register("sun_flute", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> LAVA_CRYSTAL = register("lava_crystal", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> JEWEL_OF_LIFE = register("jewel_of_life", Item::new, LEGENDARY_ITEMS);
//    public static final RegistrySupplier<Item> PRISON_BOTTLE = register("prison_bottle", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> MIRROR = register("mirror", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> UNENCHANTED_ICEROOT_CARROT = register("unenchanted_iceroot_carrot", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> ICEROOT_CARROT = register("iceroot_carrot", properties -> new CalyrexSteedItem("iceroot", properties.stacksTo(1).food(new FoodProperties.Builder().alwaysEat().build()), LegendKeys.GLASTRIER, UNENCHANTED_ICEROOT_CARROT), LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> UNENCHANTED_SHADEROOT_CARROT = register("unenchanted_shaderoot_carrot", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> SHADEROOT_CARROT = register("shaderoot_carrot", properties -> new CalyrexSteedItem("shaderoot", properties.stacksTo(1).food(new FoodProperties.Builder().alwaysEat().build()), LegendKeys.SPECTRIER, UNENCHANTED_SHADEROOT_CARROT), LEGENDARY_ITEMS);
    public static final RegistrySupplier<EnigmaStoneItem> ENIGMA_STONE = register("enigma_stone", properties -> new EnigmaStoneItem(properties.stacksTo(1).durability(100)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> ENIGMA_SHARD = register("enigma_shard", properties -> new ItemWithLangTooltipImpl(properties.stacksTo(64)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> ENIGMA_FRAGMENT = register("enigma_fragment", properties -> new ItemWithLangTooltipImpl(properties.stacksTo(4).fireResistant() /* just incase it falls into lava while in nether*/), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SACRED_ASH = register("sacred_ash", properties -> new ItemWithLangTooltipImpl(properties.stacksTo(1).durability(1)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHARD_OF_WILLPOWER = register("shard_of_willpower", properties -> new ItemWithLangTooltipImpl(properties.stacksTo(9)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHARD_OF_EMOTION = register("shard_of_emotion", properties -> new ItemWithLangTooltipImpl(properties.stacksTo(9)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> SHARD_OF_KNOWLEDGE = register("shard_of_knowledge", properties -> new ItemWithLangTooltipImpl(properties.stacksTo(9)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<LakeCrystalItem> CRYSTAL_OF_WILLPOWER = register("crystal_of_willpower", properties -> new LakeCrystalItem(properties.durability(100), LegendKeys.AZELF), LEGENDARY_ITEMS);
    public static final RegistrySupplier<LakeCrystalItem> CRYSTAL_OF_EMOTION = register("crystal_of_emotion", properties -> new LakeCrystalItem(properties.durability(100), LegendKeys.MESPRIT), LEGENDARY_ITEMS);
    public static final RegistrySupplier<LakeCrystalItem> CRYSTAL_OF_KNOWLEDGE = register("crystal_of_knowledge", properties -> new LakeCrystalItem(properties.durability(100), LegendKeys.UXIE), LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiOrbItem> REGICE_ORB = register("regice_orb", properties -> new RegiOrbItem(properties, "regice"), LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiOrbItem> REGIROCK_ORB = register("regirock_orb", properties -> new RegiOrbItem(properties, "regirock"), LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiOrbItem> REGISTEEL_ORB = register("registeel_orb", properties -> new RegiOrbItem(properties,"registeel"), LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiOrbItem> REGIDRAGO_ORB = register("regidrago_orb", properties -> new RegiOrbItem(properties, "regidrago"), LEGENDARY_ITEMS);
    public static final RegistrySupplier<RegiOrbItem> REGIELEKI_ORB = register("regieleki_orb", properties -> new RegiOrbItem(properties, "regieleki"), LEGENDARY_ITEMS);
    public static final RegistrySupplier<MagmaCrystal> MAGMA_CRYSTAL = register("magma_crystal", properties -> new MagmaCrystal(properties.stacksTo(1)), LEGENDARY_ITEMS);
    public static final RegistrySupplier<WingItem> ICY_WING = register("icy_wing", properties -> new WingItem(properties.stacksTo(1), "icy", ElementalTypes.INSTANCE.getICE(), LegendKeys.ARTICUNO), LEGENDARY_ITEMS);
    public static final RegistrySupplier<WingItem> ELEGANT_WING = register("elegant_wing", properties -> new WingItem(properties.stacksTo(1), "elegant", ElementalTypes.INSTANCE.getPSYCHIC(), LegendKeys.GALARIAN_ARTICUNO), LEGENDARY_ITEMS);
    public static final RegistrySupplier<WingItem> STATIC_WING = register("static_wing", properties -> new WingItem(properties.stacksTo(1), "static", ElementalTypes.INSTANCE.getELECTRIC(), LegendKeys.ZAPDOS), LEGENDARY_ITEMS);
    public static final RegistrySupplier<WingItem> BELLIGERENT_WING = register("belligerent_wing", properties -> new WingItem(properties.stacksTo(1), "belligerent", ElementalTypes.INSTANCE.getFIGHTING(), LegendKeys.GALARIAN_ZAPDOS), LEGENDARY_ITEMS);
    public static final RegistrySupplier<WingItem> FIERY_WING = register("fiery_wing", properties -> new WingItem(properties.stacksTo(1).fireResistant(), "fiery", ElementalTypes.INSTANCE.getFIRE(), LegendKeys.MOLTRES), LEGENDARY_ITEMS);
    public static final RegistrySupplier<WingItem> SINISTER_WING = register("sinister_wing", properties -> new WingItem(properties.stacksTo(1), "sinister", ElementalTypes.INSTANCE.getDARK(), LegendKeys.GALARIAN_MOLTRES), LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> MEW_DNA_FIBER = register("mew_dna_fiber", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> MEW_FOSSIL = register("mew_fossil", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> LIGHT_SOUL = register("light_soul", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);

    //TODO: Turn back to 10,000 before release
    public static final RegistrySupplier<LegendaryEggItem> WONDER_EGG = register("wonder_egg", properties -> new LegendaryEggItem(properties.stacksTo(1), LegendKeys.MANAPHY, 100), LEGENDARY_ITEMS);

    //TODO: Turn back to 10,000 before release
    public static final RegistrySupplier<LegendaryEggItem> PHIONE_EGG = register("phione_egg", properties -> new LegendaryEggItem(properties.stacksTo(1), LegendKeys.PHIONE, 100), LEGENDARY_ITEMS);
    public static final RegistrySupplier<SingleElmentPostUpdatingItem> SOUL_HEART = register("soul_heart", properties -> new SingleElmentPostUpdatingItem(properties.stacksTo(1).durability(100), ElementalTypes.INSTANCE.getFAIRY()), LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> BLUE_PETAL = register("blue_petal", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> GREEN_PETAL = register("green_petal", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> ORANGE_PETAL = register("orange_petal", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> PINK_PETAL = register("pink_petal", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> PURPLE_PETAL = register("purple_petal", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> RADIANT_PETAL = register("radiant_petal", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> RED_PETAL = register("red_petal", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> YELLOW_PETAL = register("yellow_petal", Item::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> METEORITE_SHARD = register("meteorite_shard", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> BLACK_MANE_HAIR = register("black_mane_hair", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> WHITE_MANE_HAIR = register("white_mane_hair", ItemWithLangTooltipImpl::new, LEGENDARY_ITEMS);

    /**
     * Naturals
     */
    public static final RegistrySupplier<Item> CRYSTAL = register("crystal", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> RUBY = register("ruby", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> SAPPHIRE = register("sapphire", Item::new, PLAYER_ITEMS);
    public static final RegistrySupplier<Item> SILICON = register("silicon", Item::new, PLAYER_ITEMS);

    /**
     * Utility Items
     */
    public static final RegistrySupplier<Item> POKEMON_WAND = register("pokemon_wand", Item::new, UTILITY);
    public static final RegistrySupplier<Item> CHISEL = register("chisel", StatueSpawnerItem::new, UTILITY);
    public static final RegistrySupplier<Item> SUICUNE_STATUE = register("suicune_statue", properties -> new StatueSpawnerItem(properties, LegendKeys.SUICUNE), LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> RAIKOU_STATUE = register("raikou_statue", properties -> new StatueSpawnerItem(properties, LegendKeys.RAIKOU), LEGENDARY_ITEMS);
    public static final RegistrySupplier<Item> ENTEI_STATUE = register("entei_statue", properties -> new StatueSpawnerItem(properties, LegendKeys.ENTEI), LEGENDARY_ITEMS);

    public static final RegistrySupplier<Item> GIFT_BOX = register("gift_box", Item::new, UTILITY);
    public static final RegistrySupplier<Item> NPC_WAND = register("npc_wand", NpcWandItem::new, UTILITY);
    public static final RegistrySupplier<Item> NPC_PATH_TOOL = register("npc_path_tool", NpcPathTool::new, UTILITY);
    public static final RegistrySupplier<Item> ZONE_WAND = register("zone_wand", Item::new, UTILITY);
    public static final RegistrySupplier<Item> BIKE_FRAME = register("bike_frame", Item::new, UTILITY);
    public static final RegistrySupplier<Item> BIKE_HANDLEBARS = register("bike_handlebars", Item::new, UTILITY);
    public static final RegistrySupplier<Item> BIKE_SEAT = register("bike_seat", Item::new, UTILITY);
    public static final RegistrySupplier<Item> BIKE_WHEEL = register("bike_wheel", Item::new, UTILITY);
    public static final RegistrySupplier<Item> HIDDEN_IRON_DOOR = register("hidden_iron_door", Item::new, UTILITY);
    public static final RegistrySupplier<Item> HIDDEN_WOODEN_DOOR = register("hidden_wooden_door", Item::new, UTILITY);
    public static final RegistrySupplier<Item> HIDDEN_LEVER = register("hidden_lever", Item::new, UTILITY);
    public static final RegistrySupplier<Item> HIDDEN_PRESSURE_PLATE = register("hidden_pressure_plate", Item::new, UTILITY);
    public static final RegistrySupplier<Item> HIDDEN_CUBE = register("hidden_cube", Item::new, UTILITY);
    public static final RegistrySupplier<Item> HIDDEN_BUTTON = register("hidden_button", Item::new, UTILITY);

    /**
     * Form Items
     */
    public static final RegistrySupplier<MeteoriteItem> METEORITE = register("meteorite", MeteoriteItem::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> GRACIDEA = register("gracidea", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<ItemWithLangTooltipImpl> REVEAL_GLASS = register("reveal_glass", ItemWithLangTooltipImpl::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> ROCKSTAR_COSTUME = register("rockstar_costume", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> BELLE_COSTUME = register("belle_costume", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> POPSTAR_COSTUME = register("popstar_costume", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> PHD_COSTUME = register("phd_costume", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> LIBRE_COSTUME = register("libre_costume", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> MEWTWO_ARMOR = register("mewtwo_armor", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> PINK_NECTAR = register("pink_nectar", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> PURPLE_NECTAR = register("purple_nectar", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> RED_NECTAR = register("red_nectar", Item::new, FORM_ITEMS);
    public static final RegistrySupplier<Item> YELLOW_NECTAR = register("yellow_nectar", Item::new, FORM_ITEMS);

    /**
     * Mail
     */
    public static final RegistrySupplier<Item> POKEMAIL_AIR = register("pokemail_air", properties -> new MailItem(MailType.AIR, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_AIR_CLOSED = register("pokemail_air_closed", properties -> new ClosedMailItem(MailType.AIR, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BLOOM = register("pokemail_bloom", properties -> new MailItem(MailType.BLOOM, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BLOOM_CLOSED = register("pokemail_bloom_closed", properties -> new ClosedMailItem(MailType.BLOOM, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRICK = register("pokemail_brick", properties -> new MailItem(MailType.BRICK, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRICK_CLOSED = register("pokemail_brick_closed", properties -> new ClosedMailItem(MailType.BRICK, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_D = register("pokemail_bridge_d", properties -> new MailItem(MailType.BRIDGE_D, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_D_CLOSED = register("pokemail_bridge_d_closed", properties -> new ClosedMailItem(MailType.BRIDGE_D, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_M = register("pokemail_bridge_m", properties -> new MailItem(MailType.BRIDGE_M, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_M_CLOSED = register("pokemail_bridge_m_closed", properties -> new ClosedMailItem(MailType.BRIDGE_M, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_S = register("pokemail_bridge_s", properties -> new MailItem(MailType.BRIDGE_S, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_S_CLOSED = register("pokemail_bridge_s_closed", properties -> new ClosedMailItem(MailType.BRIDGE_S, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_T = register("pokemail_bridge_t", properties -> new MailItem(MailType.BRIDGE_T, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_T_CLOSED = register("pokemail_bridge_t_closed", properties -> new ClosedMailItem(MailType.BRIDGE_T, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_V = register("pokemail_bridge_v", properties -> new MailItem(MailType.BRIDGE_V, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BRIDGE_V_CLOSED = register("pokemail_bridge_v_closed", properties -> new ClosedMailItem(MailType.BRIDGE_V, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BUBBLE = register("pokemail_bubble", properties -> new MailItem(MailType.BUBBLE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_BUBBLE_CLOSED = register("pokemail_bubble_closed", properties -> new ClosedMailItem(MailType.BUBBLE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_DREAM = register("pokemail_dream", properties -> new MailItem(MailType.DREAM, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_DREAM_CLOSED = register("pokemail_dream_closed", properties -> new ClosedMailItem(MailType.DREAM, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_FAB = register("pokemail_fab", properties -> new MailItem(MailType.FAB, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_FAB_CLOSED = register("pokemail_fab_closed", properties -> new ClosedMailItem(MailType.FAB, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_FAVORED = register("pokemail_favored", properties -> new MailItem(MailType.FAVORED, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_FAVORED_CLOSED = register("pokemail_favored_closed", properties -> new ClosedMailItem(MailType.FAVORED, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_FLAME = register("pokemail_flame", properties -> new MailItem(MailType.FLAME, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_FLAME_CLOSED = register("pokemail_flame_closed", properties -> new ClosedMailItem(MailType.FLAME, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_GLITTER = register("pokemail_glitter", properties -> new MailItem(MailType.GLITTER, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_GLITTER_CLOSED = register("pokemail_glitter_closed", properties -> new ClosedMailItem(MailType.GLITTER, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_GRASS = register("pokemail_grass", properties -> new MailItem(MailType.GRASS, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_GRASS_CLOSED = register("pokemail_grass_closed", properties -> new ClosedMailItem(MailType.GRASS, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_GREET = register("pokemail_greet", properties -> new MailItem(MailType.GREET, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_GREET_CLOSED = register("pokemail_greet_closed", properties -> new ClosedMailItem(MailType.GREET, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_HARBOR = register("pokemail_harbor", properties -> new MailItem(MailType.HARBOR, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_HARBOR_CLOSED = register("pokemail_harbor_closed", properties -> new ClosedMailItem(MailType.HARBOR, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_HEART = register("pokemail_heart", properties -> new MailItem(MailType.HEART, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_HEART_CLOSED = register("pokemail_heart_closed", properties -> new ClosedMailItem(MailType.HEART, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_INQUIRY = register("pokemail_inquiry", properties -> new MailItem(MailType.INQUIRY, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_INQUIRY_CLOSED = register("pokemail_inquiry_closed", properties -> new ClosedMailItem(MailType.INQUIRY, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_LIKE = register("pokemail_like", properties -> new MailItem(MailType.LIKE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_LIKE_CLOSED = register("pokemail_like_closed", properties -> new ClosedMailItem(MailType.LIKE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_MECH = register("pokemail_mech", properties -> new MailItem(MailType.MECH, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_MECH_CLOSED = register("pokemail_mech_closed", properties -> new ClosedMailItem(MailType.MECH, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_MOSAIC = register("pokemail_mosaic", properties -> new MailItem(MailType.MOSAIC, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_MOSAIC_CLOSED = register("pokemail_mosaic_closed", properties -> new ClosedMailItem(MailType.MOSAIC, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_ORANGE = register("pokemail_orange", properties -> new MailItem(MailType.ORANGE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_ORANGE_CLOSED = register("pokemail_orange_closed", properties -> new ClosedMailItem(MailType.ORANGE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_REPLY = register("pokemail_reply", properties -> new MailItem(MailType.REPLY, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_REPLY_CLOSED = register("pokemail_reply_closed", properties -> new ClosedMailItem(MailType.REPLY, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_RETRO = register("pokemail_retro", properties -> new MailItem(MailType.RETRO, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_RETRO_CLOSED = register("pokemail_retro_closed", properties -> new ClosedMailItem(MailType.RETRO, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_RSVP = register("pokemail_rsvp", properties -> new MailItem(MailType.RSVP, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_RSVP_CLOSED = register("pokemail_rsvp_closed", properties -> new ClosedMailItem(MailType.RSVP, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_SHADOW = register("pokemail_shadow", properties -> new MailItem(MailType.SHADOW, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_SHADOW_CLOSED = register("pokemail_shadow_closed", properties -> new ClosedMailItem(MailType.SHADOW, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_SNOW = register("pokemail_snow", properties -> new MailItem(MailType.SNOW, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_SNOW_CLOSED = register("pokemail_snow_closed", properties -> new ClosedMailItem(MailType.SNOW, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_SPACE = register("pokemail_space", properties -> new MailItem(MailType.SPACE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_SPACE_CLOSED = register("pokemail_space_closed", properties -> new ClosedMailItem(MailType.SPACE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_STEEL = register("pokemail_steel", properties -> new MailItem(MailType.STEEL, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_STEEL_CLOSED = register("pokemail_steel_closed", properties -> new ClosedMailItem(MailType.STEEL, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_THANKS = register("pokemail_thanks", properties -> new MailItem(MailType.THANKS, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_THANKS_CLOSED = register("pokemail_thanks_closed", properties -> new ClosedMailItem(MailType.THANKS, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_TROPIC = register("pokemail_tropic", properties -> new MailItem(MailType.TROPIC, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_TROPIC_CLOSED = register("pokemail_tropic_closed", properties -> new ClosedMailItem(MailType.TROPIC, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_TUNNEL = register("pokemail_tunnel", properties -> new MailItem(MailType.TUNNEL, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_TUNNEL_CLOSED = register("pokemail_tunnel_closed", properties -> new ClosedMailItem(MailType.TUNNEL, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_WAVE = register("pokemail_wave", properties -> new MailItem(MailType.WAVE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_WAVE_CLOSED = register("pokemail_wave_closed", properties -> new ClosedMailItem(MailType.WAVE, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_WOOD = register("pokemail_wood", properties -> new MailItem(MailType.WOOD, properties.stacksTo(1)), POKEMAIL);
    public static final RegistrySupplier<Item> POKEMAIL_WOOD_CLOSED = register("pokemail_wood_closed", properties -> new ClosedMailItem(MailType.WOOD, properties.stacksTo(1)), POKEMAIL);

    /**
     * Valuable Items
     */
    public static final RegistrySupplier<Item> RELIC_GOLD = register("relic_gold", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> RELIC_COPPER = register("relic_copper", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> RELIC_BAND = register("relic_band", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> RELIC_SILVER = register("relic_silver", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> RELIC_STATUE = register("relic_statue", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> RELIC_VASE = register("relic_vase", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> RELIC_CROWN = register("relic_crown", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> HEART_SCALE = register("heart_scale", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> SHOAL_SHELL = register("shoal_shell", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> SHOAL_SALT = register("shoal_salt", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> STARDUST = register("stardust", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> RARE_BONE = register("rare_bone", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> SILVER_LEAF = register("silver_leaf", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> STRANGE_SOUVENIR = register("strange_souvenir", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> SLOWPOKE_TAIL = register("slowpoke_tail", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> ODD_KEYSTONE = register("odd_keystone", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> ESCAPE_ROPE = register("escape_rope", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> BEACH_GLASS = register("beach_glass", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> CHALKY_STONE = register("chalky_stone", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> LONE_EARRING = register("lone_earring", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> PRETTY_FEATHER = register("pretty_feather", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> MARBLE = register("marble", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> POLISHED_MUD_BALL = register("polished_mud_ball", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> STRETCHY_SPRING = register("stretchy_spring", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> TROPICAL_SHELL = register("tropical_shell", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> BALM_MUSHROOM = register("balm_mushroom", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> BIG_MUSHROOM = register("big_mushroom", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> BIG_NUGGET = register("big_nugget", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> BIG_PEARL = register("big_pearl", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> GOLD_LEAF = register("gold_leaf", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> SMALL_BOUQUET = register("small_bouquet", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> BLUE_SHARD = register("blue_shard", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> COMET_SHARD = register("comet_shard", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> GREEN_SHARD = register("green_shard", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> NUGGET = register("nugget", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> PEARL = register("pearl", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> PEARL_STRING = register("pearl_string", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> RED_SHARD = register("red_shard", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> STAR_PIECE = register("star_piece", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> TINY_MUSHROOM = register("tiny_mushroom", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> YELLOW_SHARD = register("yellow_shard", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> HONEY = register("honey", Item::new, VALUABLES);

    public static final RegistrySupplier<Item> BUG_CANDY = register("bug_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> DARK_CANDY = register("dark_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> DRAGON_CANDY = register("dragon_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> ELECTRIC_CANDY = register("electric_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> FAIRY_CANDY = register("fairy_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> FIGHTING_CANDY = register("fighting_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> FIRE_CANDY = register("fire_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> FLYING_CANDY = register("flying_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> GHOST_CANDY = register("ghost_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> GRASS_CANDY = register("grass_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> GROUND_CANDY = register("ground_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> ICE_CANDY = register("ice_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> NORMAL_CANDY = register("normal_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> POISON_CANDY = register("poison_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> PSYCHIC_CANDY = register("psychic_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> ROCK_CANDY = register("rock_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> STEEL_CANDY = register("steel_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> WATER_CANDY = register("water_candy", Item::new, VALUABLES);
    public static final RegistrySupplier<Item> NULL_CANDY = register("null_candy", Item::new, VALUABLES);

    /**
     * Curry Ingredients
     */
    public static final RegistrySupplier<Item> BACHS_FOOD_TIN = register("bachs_food_tin", properties -> new CurryIngredient(CurryType.Rich, properties), CUISINE);
    public static final RegistrySupplier<Item> BOBS_FOOD_TIN = register("bobs_food_tin", properties -> new CurryIngredient(CurryType.Juicy, properties), CUISINE);
    public static final RegistrySupplier<Item> BOILED_EGG = register("boiled_egg", properties -> new CurryIngredient(CurryType.BoiledEgg, properties), CUISINE);
    public static final RegistrySupplier<Item> BREAD = register("bread", properties -> new CurryIngredient(CurryType.Toast, properties), CUISINE);
    public static final RegistrySupplier<Item> BRITTLE_BONES = register("brittle_bones", properties -> new CurryIngredient(CurryType.Bone, properties), CUISINE);
    public static final RegistrySupplier<Item> COCONUT_MILK = register("coconut_milk", properties -> new CurryIngredient(CurryType.Coconut, properties), CUISINE);
    public static final RegistrySupplier<Item> FANCY_APPLE = register("fancy_apple", properties -> new CurryIngredient(CurryType.Apple, properties), CUISINE);
    public static final RegistrySupplier<Item> FRESH_CREAM = register("fresh_cream", properties -> new CurryIngredient(CurryType.WhippedCream, properties), CUISINE);
    public static final RegistrySupplier<Item> FRIED_FOOD = register("fried_food", properties -> new CurryIngredient(CurryType.FriedFood, properties), CUISINE);
    public static final RegistrySupplier<Item> FRUIT_BUNCH = register("fruit_bunch", properties -> new CurryIngredient(CurryType.Tropical, properties), CUISINE);
    public static final RegistrySupplier<Item> INSTANT_NOODLES = register("instant_noodles", properties -> new CurryIngredient(CurryType.InstantNoodle, properties), CUISINE);
    public static final RegistrySupplier<Item> LARGE_LEEK = register("large_leek", properties -> new CurryIngredient(CurryType.Leek, properties), CUISINE);
    public static final RegistrySupplier<Item> MIXED_MUSHROOMS = register("mixed_mushrooms", properties -> new CurryIngredient(CurryType.MushroomMedley, properties), CUISINE);
    public static final RegistrySupplier<Item> MOOMOO_CHEESE = register("moomoo_cheese", properties -> new CurryIngredient(CurryType.CheeseCovered, properties), CUISINE);
    public static final RegistrySupplier<Item> PACK_OF_POTATOES = register("pack_of_potatoes", properties -> new CurryIngredient(CurryType.PlentyOfPotato, properties), CUISINE);
    public static final RegistrySupplier<Item> PACKAGED_CURRY = register("packaged_curry", properties -> new CurryIngredient(CurryType.Decorative, properties), CUISINE);
    public static final RegistrySupplier<Item> PASTA = register("pasta", properties -> new CurryIngredient(CurryType.Pasta, properties), CUISINE);
    public static final RegistrySupplier<Item> PRECOOKED_BURGER = register("precooked_burger", properties -> new CurryIngredient(CurryType.BurgerSteak, properties), CUISINE);
    public static final RegistrySupplier<Item> PUNGENT_ROOT = register("pungent_root", properties -> new CurryIngredient(CurryType.HerbMedley, properties), CUISINE);
    public static final RegistrySupplier<Item> SALAD_MIX = register("salad_mix", properties -> new CurryIngredient(CurryType.Salad, properties), CUISINE);
    public static final RegistrySupplier<Item> SAUSAGES = register("sausages", properties -> new CurryIngredient(CurryType.Sausage, properties), CUISINE);
    public static final RegistrySupplier<Item> SMOKED_POKE_TAIL = register("smoked_poke_tail", properties -> new CurryIngredient(CurryType.SmokedTail, properties), CUISINE);
    public static final RegistrySupplier<Item> SPICE_MIX = register("spice_mix", properties -> new CurryIngredient(CurryType.Seasoned, properties), CUISINE);
    public static final RegistrySupplier<Item> TIN_OF_BEANS = register("tin_of_beans", properties -> new CurryIngredient(CurryType.BeanMedley, properties), CUISINE);
    public static final RegistrySupplier<Item> GIGANTAMIX = register("gigantamix", properties -> new CurryIngredient(CurryType.Gigantamax, properties), CUISINE);

    /**
     * Player Consumables
     */
    public static final RegistrySupplier<Item> KOMALA_COFFEE = register("komala_coffee", properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).alwaysEat().build())), CUISINE);
    public static final RegistrySupplier<Item> OMELETTE = register("omelette", properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).alwaysEat().build())), CUISINE);
    public static final RegistrySupplier<Item> PINAP_JUICE = register("pinap_juice", properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).alwaysEat().build())), CUISINE);
    public static final RegistrySupplier<Item> ROSERADE_TEA = register("roserade_tea", properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).alwaysEat().build())), CUISINE);
    public static final RegistrySupplier<Item> TAPU_COCOA = register("tapu_cocoa", properties -> new Item(properties.food(new FoodProperties.Builder().nutrition(8).saturationMod(0.8f).alwaysEat().build())), CUISINE);

    /**
     * Fossils
     */
    public static final RegistrySupplier<Item> ARMOR_FOSSIL = register("armor_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> BIRD_FOSSIL = register("bird_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> CLAW_FOSSIL = register("claw_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> COVER_FOSSIL = register("cover_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> DINO_FOSSIL = register("dino_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> DOME_FOSSIL = register("dome_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> DRAKE_FOSSIL = register("drake_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> FISH_FOSSIL = register("fish_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> FOSSIL = register("fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> HELIX_FOSSIL = register("helix_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> JAW_FOSSIL = register("jaw_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> OLD_AMBER = register("old_amber", Item::new, NATURAL);
    public static final RegistrySupplier<Item> PLUME_FOSSIL = register("plume_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> ROOT_FOSSIL = register("root_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> SAIL_FOSSIL = register("sail_fossil", Item::new, NATURAL);
    public static final RegistrySupplier<Item> SKULL_FOSSIL = register("skull_fossil", Item::new, NATURAL);

    //Walkmons

    public static final RegistrySupplier<Item> POKE_WALKMON = register("poke_walkmon", properties -> new WalkmonItem(properties, 1, "poke_walkmon"), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> GREAT_WALKMON = register("great_walkmon", properties -> new WalkmonItem(properties, 2, "great_walkmon"), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> ULTRA_WALKMON = register("ultra_walkmon", properties -> new WalkmonItem(properties, 3, "ultra_walkmon"), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> MASTER_WALKMON = register("master_walkmon", properties -> new WalkmonItem(properties, 4, "master_walkmon"), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> HI_TECH_EARBUDS = register("hi_tech_earbuds", properties -> new WalkmonItem(properties, 4, "hi_tech_earbuds"), PLAYER_ITEMS);
    public static final RegistrySupplier<Item> GB_SOUNDS = register("gb_sounds", properties -> new WalkmonItem(properties, 4, "hi_tech_earbuds"));

    //Discs

    public static final RegistrySupplier<Item> AZALEA_TOWN_DISC = createMusicDisc("azalea_town_disc", GenerationsSounds.AZALEA_TOWN, 200);
    public static final RegistrySupplier<Item> CASCARRAFA_CITY_DISC = createMusicDisc("cascarrafa_city_disc", GenerationsSounds.CASCARRAFA_CITY, 169);
    public static final RegistrySupplier<Item> CERULEAN_CITY_DISC = createMusicDisc("cerulean_city_disc", GenerationsSounds.CERULEAN_CITY, 184);
    public static final RegistrySupplier<Item> ETERNA_CITY_DISC = createMusicDisc("eterna_city_disc", GenerationsSounds.ETERNA_CITY, 136);
    public static final RegistrySupplier<Item> GOLDENROD_CITY_DISC = createMusicDisc("goldenrod_city_disc", GenerationsSounds.GOLDENROD_CITY, 182);
    public static final RegistrySupplier<Item> ICIRRUS_CITY_DISC = createMusicDisc("icirrus_city_disc", GenerationsSounds.ICIRRUS_CITY, 148);
    public static final RegistrySupplier<Item> JUBILIFE_VILLAGE_DISC = createMusicDisc("jubilife_village_disc", GenerationsSounds.JUBILIFE_VILLAGE, 202);
    public static final RegistrySupplier<Item> LAKE_OF_RAGE_DISC = createMusicDisc("lake_of_rage_disc", GenerationsSounds.LAKE_OF_RAGE, 139);
    public static final RegistrySupplier<Item> LAVERRE_CITY_DISC = createMusicDisc("laverre_city_disc", GenerationsSounds.LAVERRE_CITY, 281);
    public static final RegistrySupplier<Item> LILLIE_DISC = createMusicDisc("lillie_disc", GenerationsSounds.LILLIE, 312);
    public static final RegistrySupplier<Item> POKEMON_CENTER_DISC = createMusicDisc("pokemon_center_disc", GenerationsSounds.POKEMON_CENTER, 240);
    public static final RegistrySupplier<Item> ROUTE_228_DISC = createMusicDisc("route_228_disc", GenerationsSounds.ROUTE_228, 418);
    public static final RegistrySupplier<Item> SLUMBERING_WEALD_DISC = createMusicDisc("slumbering_weald_disc", GenerationsSounds.SLUMBERING_WEALD, 262);
    public static final RegistrySupplier<Item> SURF_DISC = createMusicDisc("surf_disc", GenerationsSounds.SURF, 261);
    public static final RegistrySupplier<Item> VERMILION_CITY_DISC = createMusicDisc("vermilion_city_disc", GenerationsSounds.VERMILION_CITY, 216);
    public static final RegistrySupplier<Item> CYNTHIA_DISC = createMusicDisc("cynthia_disc", GenerationsSounds.CYNTHIA, 385);
    public static final RegistrySupplier<Item> DEOXYS_DISC = createMusicDisc("deoxys_disc", GenerationsSounds.DEOXYS, 414);
    public static final RegistrySupplier<Item> IRIS_DISC = createMusicDisc("iris_disc", GenerationsSounds.IRIS, 291);
    public static final RegistrySupplier<Item> KANTO_DISC = createMusicDisc("kanto_disc", GenerationsSounds.KANTO, 337);
    public static final RegistrySupplier<Item> LUSAMINE_DISC = createMusicDisc("lusamine_disc", GenerationsSounds.LUSAMINE, 337);
    public static final RegistrySupplier<Item> NEMONA_DISC = createMusicDisc("nemona_disc", GenerationsSounds.NEMONA, 158);
    public static final RegistrySupplier<Item> NESSA_DISC = createMusicDisc("nessa_disc", GenerationsSounds.NESSA, 263);
    public static final RegistrySupplier<Item> PENNY_DISC = createMusicDisc("penny_disc", GenerationsSounds.PENNY, 267);
    public static final RegistrySupplier<Item> RIVAL_DISC = createMusicDisc("rival_disc", GenerationsSounds.RIVAL, 221);
    public static final RegistrySupplier<Item> SADA_AND_TURO_DISC = createMusicDisc("sada_and_turo_disc", GenerationsSounds.SADA_AND_TURO, 349);
    public static final RegistrySupplier<Item> SOUTH_PROVINCE_DISC = createMusicDisc("south_province_disc", GenerationsSounds.SOUTH_PROVINCE, 214);
    public static final RegistrySupplier<Item> TEAM_ROCKET_DISC = createMusicDisc("team_rocket_disc", GenerationsSounds.TEAM_ROCKET, 186);
    public static final RegistrySupplier<Item> ULTRA_NECROZMA_DISC = createMusicDisc("ultra_necrozma_disc", GenerationsSounds.ULTRA_NECROZMA, 296);
    public static final RegistrySupplier<Item> XY_LEGENDARY_DISC = createMusicDisc("xy_legendary_disc", GenerationsSounds.XY_LEGENDARY, 261);
    public static final RegistrySupplier<Item> ZINNIA_DISC = createMusicDisc("zinnia_disc", GenerationsSounds.ZINNIA, 320);
    public static final RegistrySupplier<Item> LAVENDER_TOWN_DISC = createMusicDisc("lavender_town_disc", GenerationsSounds.LAVENDER_TOWN, 369);
    public static final RegistrySupplier<Item> LUGIA_DISC = createMusicDisc("lugia_disc", GenerationsSounds.LUGIA, 341);
    public static final RegistrySupplier<Item> MT_PYRE_DISC = createMusicDisc("mt_pyre_disc", GenerationsSounds.MT_PYRE, 219);

    /**
     * Un-Implemented Items : Items currently have no in-game function
     */
    public static final RegistrySupplier<Item> ABILITY_URGE = register("ability_urge", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ADVENTURE_GUIDE = register("adventure_guide", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> APRICORN_BOX = register("apricorn_box", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> AQUA_SUIT = register("aqua_suit", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ARMOR_PASS = register("armor_pass", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ARMORITE_ORE = register("armorite_ore", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> AURORA_TICKET = register("aurora_ticket", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> AUTOGRAPH = register("autograph", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> AZURE_FLUTE = register("azure_flute", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> BAND_AUTOGRAPH = register("band_autograph", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> BASEMENT_KEY_1 = register("basement_key_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> BASEMENT_KEY_2 = register("basement_key_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> BERRY_PLANTER = register("berry_planter", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> BERRY_POUCH = register("berry_pouch", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> BIKE_VOUCHER = register("bike_voucher", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> BLUE_CARD = register("blue_card", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> BLUE_SCARF = register("blue_scarf", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> BLUE_SPHERE = register("blue_sphere", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> CAMPING_GEAR = register("camping_gear", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> CARD_KEY_1 = register("card_key_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> CARD_KEY_2 = register("card_key_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> CARROT_SEEDS = register("carrot_seeds", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> CLEAR_BELL = register("clear_bell", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COIN = register("coin", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COIN_CASE = register("coin_case", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COLRESS_MACHINE = register("colress_machine", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COMMON_STONE = register("common_stone", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> CONTEST_COSTUME_1 = register("contest_costume_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> CONTEST_COSTUME_2 = register("contest_costume_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> CONTEST_PASS = register("contest_pass", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COUPON_1 = register("coupon_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COUPON_2 = register("coupon_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COUPON_3 = register("coupon_3", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COURAGE_CANDY = register("courage_candy", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COURAGE_CANDY_L = register("courage_candy_l", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> COURAGE_CANDY_XL = register("courage_candy_xl", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> CROWN_PASS = register("crown_pass", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DATA_CARDS = register("data_cards", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DEVON_PARTS = register("devon_parts", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DEVON_SCOPE = register("devon_scope", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DEVON_SCUBA_GEAR = register("devon_scuba_gear", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DIRE_HIT_2 = register("dire_hit_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DIRE_HIT_3 = register("dire_hit_3", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DISCOUNT_COUPON = register("discount_coupon", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DOWSING_MACHINE_1 = register("dowsing_machine_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DOWSING_MACHINE_2 = register("dowsing_machine_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DOWSING_MCHN = register("dowsing_mchn", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DRAGON_SKULL = register("dragon_skull", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DROPPED_ITEM_RED = register("dropped_item_red", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> DROPPED_ITEM_YELLOW = register("dropped_item_yellow", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ELEVATOR_KEY = register("elevator_key", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ENDORSEMENT = register("endorsement", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> EON_FLUTE = register("eon_flute", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> EON_TICKET = register("eon_ticket", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> EXPLORER_KIT = register("explorer_kit", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> FAME_CHECKER = register("fame_checker", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> FASHION_CASE = register("fashion_case", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> FESTIVAL_TICKET = register("festival_ticket", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> FORAGE_BAG = register("forage_bag", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GALACTIC_KEY = register("galactic_key", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GO_GOGGLES = register("go_goggles", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GOLD_TEETH = register("gold_teeth", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GOLDEN_NANAB_BERRY = register("golden_nanab_berry", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GOLDEN_PINAP_BERRY = register("golden_pinap_berry", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GOLDEN_RAZZ_BERRY = register("golden_razz_berry", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GRAM = register("gram", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);

    public static final RegistrySupplier<Item> GREEN_SCARF = register("green_scarf", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GREEN_SPHERE = register("green_sphere", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GREEN_TEA = register("green_tea", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GRUBBY_HANKY = register("grubby_hanky", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> HEALTH_CANDY = register("health_candy", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> HEALTH_CANDY_L = register("health_candy_l", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> HEALTH_CANDY_XL = register("health_candy_xl", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> HOLO_CASTER_1 = register("holo_caster_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> HOLO_CASTER_2 = register("holo_caster_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> HONOR_OF_KALOS = register("honor_of_kalos", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> INTRIGUING_STONE = register("intriguing_stone", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ITEM_DROP = register("item_drop", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ITEM_URGE = register("item_urge", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> JOURNAL = register("journal", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> KEY_STONE_2 = register("key_stone_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> KEY_TO_ROOM_1 = register("key_to_room_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> KEY_TO_ROOM_2 = register("key_to_room_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> KEY_TO_ROOM_4 = register("key_to_room_4", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> KEY_TO_ROOM_6 = register("key_to_room_6", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LEAF_LETTER = register("leaf_letter", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LEGENDARY_CLUE = register("legendary_clue", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LENS_CASE = register("lens_case", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LETTER = register("letter", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LIBERTY_PASS = register("liberty_pass", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LIFT_KEY = register("lift_key", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LOCK_CAPSULE_1 = register("lock_capsule_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LOCK_CAPSULE_2 = register("lock_capsule_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LOOKER_TICKET = register("looker_ticket", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LOOT_SACK = register("loot_sack", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LOST_ITEM_1 = register("lost_item_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LOST_ITEM_2 = register("lost_item_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LUNAR_FEATHER = register("lunar_feather", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> LURE = register("lure", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MACHINE_PART = register("machine_part", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MAGMA_EMBLEM = register("magma_emblem", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MAGMA_SUIT = register("magma_suit", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MAKEUP_BAG = register("makeup_bag", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MAX_LURE = register("max_lure", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MEDAL_BOX = register("medal_box", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MEMBER_CARD = register("member_card", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MIGHTY_CANDY = register("mighty_candy", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MIGHTY_CANDY_L = register("mighty_candy_l", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MIGHTY_CANDY_XL = register("mighty_candy_xl", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> MYSTIC_TICKET = register("mystic_ticket", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> OAKS_LETTER = register("oaks_letter", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> OAKS_PARCEL = register("oaks_parcel", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> OLD_CHARM = register("old_charm", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> OLD_LETTER = register("old_letter", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> OLD_SEA_MAP = register("old_sea_map", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PAIR_OF_TICKETS = register("pair_of_tickets", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PAL_PAD = register("pal_pad", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PALE_SPHERE = register("pale_sphere", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PASS = register("pass", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PASS_ORB = register("pass_orb", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PERMIT = register("permit", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PEWTER_CRUNCHIES = register("pewter_crunchies", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PINK_SCARF = register("pink_scarf", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PLASMA_CARD = register("plasma_card", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POFFIN = register("poffin", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POFFIN_CASE = register("poffin_case", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POINT_CARD = register("point_card", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POKE_FLUTE = register("poke_flute", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POKE_RADAR = register("poke_radar", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POKEBLOCK_CASE = register("pokeblock_case", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POKEBLOCK_KIT = register("pokeblock_kit", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POKETCH_BLUE = register("poketch_blue", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POKETCH_RED = register("poketch_red", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POWDER_JAR = register("powder_jar", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> POWER_PLANT_PASS = register("power_plant_pass", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PRISM_SPHERE = register("prism_sphere", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PROFESSORS_MASK = register("professors_mask", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PROFS_LETTER = register("profs_letter", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> PROP_CASE = register("prop_case", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> QUICK_CANDY = register("quick_candy", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> QUICK_CANDY_L = register("quick_candy_l", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> QUICK_CANDY_XL = register("quick_candy_xl", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);

    public static final RegistrySupplier<Item> RAINBOW_FLOWER = register("rainbow_flower", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> RAINBOW_PASS = register("rainbow_pass", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);

    public static final RegistrySupplier<Item> RED_SCALE = register("red_scale", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> RED_SPHERE = register("red_sphere", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> RESET_URGE = register("reset_urge", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> RIDE_PAGER = register("ride_pager", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROLLER_SKATES = register("roller_skates", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_BARGAIN = register("roto_bargain", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_BOOST = register("roto_boost", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_CATCH = register("roto_catch", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_ENCOUNTER = register("roto_encounter", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_EXP_POINTS = register("roto_exp_points", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_FRIENDSHIP = register("roto_friendship", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_HATCH = register("roto_hatch", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_HP_RESTORE = register("roto_hp_restore", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_PP_RESTORE = register("roto_pp_restore", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_PRIZE_MONEY = register("roto_prize_money", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> ROTO_STEALTH = register("roto_stealth", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> RULE_BOOK = register("rule_book", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SCANNER = register("scanner", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SEAL_BAG = register("seal_bag", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SEAL_CASE = register("seal_case", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SECRET_KEY_1 = register("secret_key_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SECRET_KEY_2 = register("secret_key_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SECRET_MEDICINE = register("secret_medicine", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SILPH_SCOPE = register("silph_scope", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SILVER_NANAB_BERRY = register("silver_nanab_berry", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SILVER_PINAP_BERRY = register("silver_pinap_berry", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SILVER_RAZZ_BERRY = register("silver_razz_berry", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SINNOH_STONE = register("sinnoh_stone", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SMART_CANDY = register("smart_candy", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SMART_CANDY_L = register("smart_candy_l", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SMART_CANDY_XL = register("smart_candy_xl", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SONIAS_BOOK = register("sonias_book", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SOOT_SACK = register("soot_sack", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SS_TICKET = register("ss_ticket", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> STORAGE_KEY_1 = register("storage_key_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> STORAGE_KEY_2 = register("storage_key_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> STYLE_CARD = register("style_card", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SUITE_KEY = register("suite_key", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> SUPER_LURE = register("super_lure", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TEACHY_TV = register("teachy_tv", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TIDAL_BELL = register("tidal_bell", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TM_CASE = register("tm_case", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TM_MATERIAL = register("tm_material", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TMV_PASS = register("tmv_pass", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TOTEM_STICKER = register("totem_sticker", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TOUGH_CANDY = register("tough_candy", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TOUGH_CANDY_L = register("tough_candy_l", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TOUGH_CANDY_XL = register("tough_candy_xl", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TOWN_MAP_1 = register("town_map_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TOWN_MAP_2 = register("town_map_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TOWN_MAP_3 = register("town_map_3", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TRAVEL_TRUNK_1 = register("travel_trunk_1", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TRAVEL_TRUNK_2 = register("travel_trunk_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> TRI_PASS = register("tri_pass", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> UNOVA_STONE = register("unova_stone", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> UNOWN_REPORT = register("unown_report", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> VS_RECORDER = register("vs_recorder", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> VS_SEEKER = register("vs_seeker", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> WISHING_CHIP = register("wishing_chip", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> WISHING_PIECE = register("wishing_piece", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> WOODEN_CROWN = register("wooden_crown", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> WORKS_KEY = register("works_key", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_ACCURACY_2 = register("x_accuracy_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_ACCURACY_3 = register("x_accuracy_3", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_ACCURACY_6 = register("x_accuracy_6", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_ATTACK_2 = register("x_attack_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_ATTACK_3 = register("x_attack_3", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_ATTACK_6 = register("x_attack_6", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_DEFENSE_2 = register("x_defense_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_DEFENSE_3 = register("x_defense_3", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_DEFENSE_6 = register("x_defense_6", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_SPECIAL_ATTACK_2 = register("x_special_attack_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_SPECIAL_ATTACK_3 = register("x_special_attack_3", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_SPECIAL_ATTACK_6 = register("x_special_attack_6", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_SPECIAL_DEFENSE_2 = register("x_special_defense_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_SPECIAL_DEFENSE_3 = register("x_special_defense_3", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_SPECIAL_DEFENSE_6 = register("x_special_defense_6", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_SPEED_2 = register("x_speed_2", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_SPEED_3 = register("x_speed_3", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_SPEED_6 = register("x_speed_6", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_TRANSCEIVER_BLUE = register("x_transceiver_blue", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_TRANSCEIVER_RED = register("x_transceiver_red", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> X_TRANSCEIVER_YELLOW = register("x_transceiver_yellow", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> YELLOW_SCARF = register("yellow_scarf", properties -> new Item(properties.stacksTo(1)), UNIMPLEMENTED);
    public static final RegistrySupplier<Item> GALARICA_TWIG = register("galarica_twig", Item::new, UNIMPLEMENTED);

    /**
     * Items to be included in Minecraft Default Section.
     */

    public static final RegistrySupplier<Item> CURRY = register("curry", ItemCurry::new, CUISINE);

    public static final RegistrySupplier<Item> ULTRA_DARK_SIGN = registerSign("ultra_dark_sign", properties -> new SignItem(properties.stacksTo(16), GenerationsWood.ULTRA_DARK_SIGN.get(), GenerationsWood.ULTRA_DARK_WALL_SIGN.get()));
    public static final RegistrySupplier<Item> ULTRA_DARK_HANGING_SIGN = registerSign("ultra_dark_hanging_sign", properties -> new HangingSignItem(GenerationsWood.ULTRA_DARK_HANGING_SIGN.get(), GenerationsWood.ULTRA_DARK_WALL_HANGING_SIGN.get(), properties.stacksTo(16)));
    public static final RegistrySupplier<Item> ULTRA_JUNGLE_SIGN = registerSign("ultra_jungle_sign", properties -> new SignItem(properties.stacksTo(16), GenerationsWood.ULTRA_JUNGLE_SIGN.get(), GenerationsWood.ULTRA_JUNGLE_WALL_SIGN.get()));
    public static final RegistrySupplier<Item> ULTRA_JUNGLE_HANGING_SIGN = registerSign("ultra_jungle_hanging_sign", properties -> new HangingSignItem(GenerationsWood.ULTRA_JUNGLE_HANGING_SIGN.get(), GenerationsWood.ULTRA_JUNGLE_WALL_HANGING_SIGN.get(), properties.stacksTo(16)));
    public static final RegistrySupplier<Item> GHOST_SIGN = registerSign("ghost_sign", properties -> new SignItem(properties.stacksTo(16), GenerationsWood.GHOST_SIGN.get(), GenerationsWood.GHOST_WALL_SIGN.get()));
    public static final RegistrySupplier<Item> GHOST_HANGING_SIGN = registerSign("ghost_hanging_sign", properties -> new HangingSignItem(GenerationsWood.GHOST_HANGING_SIGN.get(), GenerationsWood.GHOST_WALL_HANGING_SIGN.get(), properties.stacksTo(16)));

    public static final RegistrySupplier<Item> GHOST_BOAT_ITEM = register("ghost_boat", properties -> new GenerationsBoatItem(properties, GenerationsBoatEntity.Type.GHOST), BUILDING_BLOCKS);
    public static final RegistrySupplier<Item> GHOST_CHEST_BOAT_ITEM = register("ghost_boat_with_chest", properties -> new GenerationsChestBoatItem(properties, GenerationsChestBoatEntity.Type.GHOST), BUILDING_BLOCKS);
    public static final RegistrySupplier<Item> ULTRA_DARK_BOAT_ITEM = register("ultra_dark_boat", properties -> new GenerationsBoatItem(properties, GenerationsBoatEntity.Type.ULTRA_DARK), BUILDING_BLOCKS);
    public static final RegistrySupplier<Item> ULTRA_DARK_CHEST_BOAT_ITEM = register("ultra_dark_boat_with_chest", properties -> new GenerationsChestBoatItem(properties, GenerationsChestBoatEntity.Type.ULTRA_DARK), BUILDING_BLOCKS);
    public static final RegistrySupplier<Item> ULTRA_JUNGLE_BOAT_ITEM = register("ultra_jungle_boat", properties -> new GenerationsBoatItem(properties, GenerationsBoatEntity.Type.ULTRA_JUNGLE), BUILDING_BLOCKS);
    public static final RegistrySupplier<Item> ULTRA_JUNGLE_CHEST_BOAT_ITEM = register("ultra_jungle_boat_with_chest", properties -> new GenerationsChestBoatItem(properties, GenerationsChestBoatEntity.Type.ULTRA_JUNGLE), BUILDING_BLOCKS);

    private static RegistrySupplier<RelicSongItem> createRelicSong(boolean inert) {
        return register((inert ? "inert_" : "") + "relic_song", properties -> new RelicSongItem(properties, inert), LEGENDARY_ITEMS);
    }

    public static RegistrySupplier<Item> registerHeldItem(String name) {
        return register(name, properties -> {
            var item = new Item(properties);

            CobblemonHeldItemManager.INSTANCE.registerRemap(item, name.replace("_", ""));

            return item;
        }, HELD_ITEMS);
    }

    public static Item.Properties of() {
        return new Item.Properties();
    }

    public static <T extends Item> RegistrySupplier<T> register(String name, Function<Item.Properties, T> itemSupplier, DeferredRegister<Item> register) {
        return register.register(name, () -> itemSupplier.apply(of()));
    }

    public static <T extends Item> RegistrySupplier<T> register(String name, Function<Item.Properties, T> itemSupplier) {
        return register(name, itemSupplier, ITEMS);
    }

    public static RegistrySupplier<Item> registerSign(String name, Function<Item.Properties, Item> itemSupplier) {
        return register(name, itemSupplier);
    }

    public static RegistrySupplier<Item> createBadge(String id) {
        /*elementType*/
        return BADGES.register(id + "_badge", () -> new BadgeItem(new Item.Properties()));
    }

    public static RegistrySupplier<Item> createRibbon(String id) {
        return RIBBONS.register(id, () -> new RibbonItem(new Item.Properties()));
    }

    private static RegistrySupplier<Item> createMusicDisc(String name, RegistrySupplier<SoundEvent> sound, int ticks) {
        return PLAYER_ITEMS.register(name, () -> new ArchitecturyRecordItem(0, sound, new Item.Properties().arch$tab(CreativeModeTabs.TOOLS_AND_UTILITIES), ticks));
    }

    public static void init() {
        GenerationsCore.LOGGER.info("Registering Generations Items");
        ITEMS.register();
        RIBBONS.register();
        BADGES.register();
        UNIMPLEMENTED.register();
        CUISINE.register();
        NATURAL.register();
        RESTORATION.register();
        PLAYER_ITEMS.register();
        HELD_ITEMS.register();
        POKEMAIL.register();
        LEGENDARY_ITEMS.register();
        UTILITY.register();
        VALUABLES.register();
        FORM_ITEMS.register();
        BUILDING_BLOCKS.register();
    }
}

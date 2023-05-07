/**
 * The Main Class of the Generations-Core mod. (Common)
 * Registers the mod's items and blocks with Minecraft using Architectury.
 * @author J.T. McQuigg
 *
 * CopyRight (c) 2023 Generations-Mod
 */

package generations.gg.generations.core.generationscore;

import com.mojang.logging.LogUtils;
import generations.gg.generations.core.generationscore.world.item.GenerationsItems;
import generations.gg.generations.core.generationscore.world.level.block.*;
import generations.gg.generations.core.generationscore.world.level.block.entities.GenerationsBlockEntities;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import org.slf4j.Logger;


public class GenerationsCore
{

	/** The mod id of the Generations-Core mod. */
	public static final String MOD_ID = "generations-core";

	/** The random source for Generations-Core mod. */
	public static final RandomSource RANDOM_SOURCE = RandomSource.create();

	/** The logger for the Generations-Core mod. */
	public static final Logger LOGGER = LogUtils.getLogger();

	/**
	 * Initializes the Generations-Core mod.
	 */
	public static void init() {
		GenerationsItems.init();
		GenerationsBlocks.init();
		GenerationsWood.init();
		GenerationsOres.init();
		GenerationsPokeDolls.init();
		GenerationsShrines.init();
		GenerationsUtilityBlocks.init();
		GenerationsBlockEntities.init();
	}

	/**
	 * Creates a {@link ResourceLocation} with the Generations-Core Mod id.
	 */
	public static ResourceLocation id(String path) {
		return new ResourceLocation(MOD_ID, path);
	}
}
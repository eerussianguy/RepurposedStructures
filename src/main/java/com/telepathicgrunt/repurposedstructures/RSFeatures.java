package com.telepathicgrunt.repurposedstructures;

import java.util.function.Supplier;

import com.telepathicgrunt.repurposedstructures.world.features.BoulderGiant;
import com.telepathicgrunt.repurposedstructures.world.features.BoulderTiny;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonBadlands;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonDarkForest;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonDesert;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonEnd;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonJungle;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonMushroom;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonNether;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonOcean;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonSnow;
import com.telepathicgrunt.repurposedstructures.world.features.DungeonSwamp;
import com.telepathicgrunt.repurposedstructures.world.features.FortressBreakage;
import com.telepathicgrunt.repurposedstructures.world.features.JungleStructuresVines;
import com.telepathicgrunt.repurposedstructures.world.features.StrongholdChains;
import com.telepathicgrunt.repurposedstructures.world.features.SwampVillageVines;
import com.telepathicgrunt.repurposedstructures.world.features.TreeSwampHorned;
import com.telepathicgrunt.repurposedstructures.world.features.VinesShort;
import com.telepathicgrunt.repurposedstructures.world.features.WellBadlands;
import com.telepathicgrunt.repurposedstructures.world.features.WellForest;
import com.telepathicgrunt.repurposedstructures.world.features.WellMossyStone;
import com.telepathicgrunt.repurposedstructures.world.features.WellNether;
import com.telepathicgrunt.repurposedstructures.world.features.WellSnow;

import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RSFeatures {
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, RepurposedStructures.MODID);
	
	//Static instance of our structure so we can reference it and add it to biomes easily.
	public static final RegistryObject<Feature<NoFeatureConfig>> BADLANDS_DUNGEONS = createFeature("dungeons_badlands", () -> new DungeonBadlands(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> DARK_FOREST_DUNGEONS = createFeature("dungeons_dark_forest", () -> new DungeonDarkForest(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> DESERT_DUNGEONS = createFeature("dungeons_desert", () -> new DungeonDesert(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> END_DUNGEONS = createFeature("dungeons_end", () -> new DungeonEnd(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> NETHER_DUNGEONS = createFeature("dungeons_nether", () -> new DungeonNether(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> SNOW_DUNGEONS = createFeature("dungeons_snow", () -> new DungeonSnow(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> SWAMP_DUNGEONS = createFeature("dungeons_swamp", () -> new DungeonSwamp(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> MUSHROOM_DUNGEONS = createFeature("dungeons_mushroom", () -> new DungeonMushroom(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> JUNGLE_DUNGEONS = createFeature("dungeons_jungle", () -> new DungeonJungle(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> OCEAN_DUNGEONS = createFeature("dungeons_ocean", () -> new DungeonOcean(NoFeatureConfig.CODEC));
	
	public static final RegistryObject<Feature<NoFeatureConfig>> BADLANDS_WELL = createFeature("well_badlands", () -> new WellBadlands(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> NETHER_WELL = createFeature("well_nether", () -> new WellNether(NoFeatureConfig.CODEC));
	public static final RegistryObject<Feature<NoFeatureConfig>> SNOW_WELL = createFeature("well_snow", () -> new WellSnow(NoFeatureConfig.CODEC));
  	public static final RegistryObject<Feature<NoFeatureConfig>> MOSSY_STONE_WELL = createFeature("well_mossy_stone", () -> new WellMossyStone(NoFeatureConfig.CODEC));
  	public static final RegistryObject<Feature<NoFeatureConfig>> FOREST_WELL = createFeature("well_forest", () -> new WellForest(NoFeatureConfig.CODEC));

  	public static final RegistryObject<Feature<NoFeatureConfig>> BOULDER_GIANT = createFeature("boulder_giant", () -> new BoulderGiant(NoFeatureConfig.CODEC));
  	public static final RegistryObject<Feature<NoFeatureConfig>> BOULDER_TINY = createFeature("boulder_tiny", () -> new BoulderTiny(NoFeatureConfig.CODEC));
  	public static final RegistryObject<Feature<BaseTreeFeatureConfig>> HORNED_SWAMP_TREE = createFeature("horned_swamp_tree", () -> new TreeSwampHorned(BaseTreeFeatureConfig.CODEC));
  	public static final RegistryObject<Feature<NoFeatureConfig>> SHORT_VINES = createFeature("short_vines", () -> new VinesShort(NoFeatureConfig.CODEC));
  	public static final RegistryObject<Feature<NoFeatureConfig>> SWAMP_VILLAGE_VINES = createFeature("swamp_village_vines", () -> new SwampVillageVines(NoFeatureConfig.CODEC));
  	public static final RegistryObject<Feature<NoFeatureConfig>> JUNGLE_STRUCTURES_VINES = createFeature("jungle_structures_vines", () -> new JungleStructuresVines(NoFeatureConfig.CODEC));
  	public static final RegistryObject<Feature<NoFeatureConfig>> FORTRESS_BREAKAGE = createFeature("fortress_breakage", () -> new FortressBreakage(NoFeatureConfig.CODEC));
  	public static final RegistryObject<Feature<NoFeatureConfig>> STRONGHOLD_CHAINS = createFeature("stronghold_chains", () -> new StrongholdChains(NoFeatureConfig.CODEC));
	
	private static <F extends Feature<?>> RegistryObject<F> createFeature(String name, Supplier<F> feature)
    {
		return FEATURES.register(name, feature);
	}
}

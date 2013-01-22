package lyneira.goblintribes;

import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * The base class for the mod.
 * 
 * @author Lyneira
 */
@Mod(modid = "GoblinTribes", name = "Goblin Tribes", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class GoblinTribes {

	private final static Item goblinSpawnEggItem = new GoblinSpawnEggItem(27900);

	@Instance("GoblinTribes")
	public static GoblinTribes instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "lyneira.goblintribes.client.ClientProxy", serverSide = "lyneira.goblintribes.CommonProxy")
	public static CommonProxy proxy;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		// Stub Method
	}

	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
		LanguageRegistry.addName(goblinSpawnEggItem, "Goblin Spawn Egg");
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}

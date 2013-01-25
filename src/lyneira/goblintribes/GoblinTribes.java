package lyneira.goblintribes;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;

import lyneira.goblintribes.common.CommonProxy;
import lyneira.goblintribes.common.entity.EntityGenericGoblin;

import net.minecraft.item.Item;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.FMLLog;
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
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * The base class for the mod.
 * 
 * @author Lyneira, max96at
 */
@Mod(modid = GoblinTribes.ID, name = "Goblin Tribes", version = GoblinTribes.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class GoblinTribes {

	public static final String ID = "GoblinTribes";
	public static final String VERSION = "0.0.1";

	@Instance("GoblinTribes")
	public static GoblinTribes instance;

	// Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide = "lyneira.goblintribes.client.ClientProxy", serverSide = "lyneira.goblintribes.common.CommonProxy")
	public static CommonProxy proxy;

	public static Logger logger;

	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		logger = Logger.getLogger(ID);
		logger.setParent(FMLLog.getLogger());
	}

	@Init
	public void load(FMLInitializationEvent event) {
		proxy.registerEntities();
		proxy.registerRenderers();
		proxy.registerLanguage();
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		// Stub Method
	}
}

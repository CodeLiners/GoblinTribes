package lyneira.goblintribes.common;

import java.awt.Color;

import lyneira.goblintribes.common.entity.EntityGenericGoblin;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * The common proxy where server side stuff happens.
 * 
 * @author Lyneira, max96at
 */
public class CommonProxy {

	public static String TEXTUR_DIR = "/lyneira/goblintribes/client/textures/";
	public static String ITEMS_PNG = TEXTUR_DIR + "items.png";

	// public static String BLOCK_PNG = "/lyneira/goblintribes/textures/block.png";

	// Client stuff
	public void registerRenderers() {
		// Nothing here as the server doesn't render graphics!
	}

	public void registerEntities() {
		EntityRegistry.registerGlobalEntityID(EntityGenericGoblin.class, "GenericGoblin", EntityRegistry.findGlobalUniqueEntityId(), getColorInt(105, 72, 17), getColorInt(23, 230, 54));
	}

	public void registerLanguage() {
		LanguageRegistry.instance().addStringLocalization("entity.GenericGoblin.name", "en_US", "Goblin");
	}

	public int getColorInt(Integer red, Integer blue, Integer green) {
		Color col = new Color(red, blue, green);
		return (col.getRed() << 16) + (col.getGreen() << 8) + col.getBlue();
	}

}

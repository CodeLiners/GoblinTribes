package lyneira.goblintribes.client;

import lyneira.goblintribes.CommonProxy;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * The client proxy where client side stuff happens.
 * 
 * @author Lyneira
 */
public class ClientProxy extends CommonProxy {
	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		// MinecraftForgeClient.preloadTexture(BLOCK_PNG);
	}
}

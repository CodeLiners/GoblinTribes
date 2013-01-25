package lyneira.goblintribes.client;

import cpw.mods.fml.client.registry.RenderingRegistry;
import lyneira.goblintribes.client.model.ModelGenericGoblin;
import lyneira.goblintribes.client.renderer.RenderGenericGoblin;
import lyneira.goblintribes.common.CommonProxy;
import lyneira.goblintribes.common.entity.EntityGenericGoblin;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.model.ModelPig;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.entity.passive.EntityCow;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * The client proxy where client side stuff happens.
 * 
 * @author Lyneira, max96at
 */
public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenderers() {
		MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		// MinecraftForgeClient.preloadTexture(BLOCK_PNG);
		RenderingRegistry.registerEntityRenderingHandler(EntityGenericGoblin.class, new RenderGenericGoblin(new ModelGenericGoblin(), 0.3F));
	}
}

package lyneira.goblintribes.client.renderer;

import static net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED;
import static net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D;

import org.lwjgl.opengl.GL11;

import lyneira.goblintribes.client.model.ModelGenericGoblin;
import lyneira.goblintribes.common.entity.EntityGenericGoblin;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.model.ModelZombieVillager;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.tileentity.TileEntitySkullRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

/**
 * The Goblin renderer.
 * 
 * @author max96at
 */


@SideOnly(Side.CLIENT)
public class RenderGenericGoblin extends RenderLiving
{
	 public RenderGenericGoblin(ModelBase par1ModelBase, float par2)
	    {
	        super(par1ModelBase, par2);
	    }

	    public void renderGoblin(EntityGenericGoblin par1EntityGenericGoblin, double par2, double par4, double par6, float par8, float par9)
	    {
	        super.doRenderLiving(par1EntityGenericGoblin, par2, par4, par6, par8, par9);
	    }

	    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	    {
	        this.renderGoblin((EntityGenericGoblin)par1EntityLiving, par2, par4, par6, par8, par9);
	    }

	    /**
	     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	     */
	    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	    {
	        this.renderGoblin((EntityGenericGoblin)par1Entity, par2, par4, par6, par8, par9);
	    }
}
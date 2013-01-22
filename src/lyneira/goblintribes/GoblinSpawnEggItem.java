package lyneira.goblintribes;

import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * An item intended for testing or creative mode that spawns goblins.
 * 
 * @author Lyneira
 */
public class GoblinSpawnEggItem extends Item {

	public GoblinSpawnEggItem(int id) {
		super(id);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setIconIndex(0);
		setItemName("goblinSpawnEggItem");
	}

	@Override
	public String getTextureFile() {
		return CommonProxy.ITEMS_PNG;
	}
	
	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
		System.out.println(this.getItemName() + " was rightclicked: " + par4 + ", " + par5 + ", " + par6 + ", " + par7 + ", " + par8 + ", " + par9 + ", " + par10 + ", ");
        return true;
    }
}

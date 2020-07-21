package Moegaddon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import Moegaddon.ItemLoader;

public class texture {
	public texture(Block block,String name)
    {
		block.setBlockTextureName("advancedRocketry:" + name);
    }


}

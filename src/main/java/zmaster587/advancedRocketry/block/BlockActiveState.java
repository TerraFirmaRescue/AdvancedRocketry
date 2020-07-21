package zmaster587.advancedRocketry.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class BlockActiveState extends Block {

	public IIcon activeIcon;
	String activeTextureString;
	Class tileClass;
	
	public BlockActiveState(Material mat, TileEntity tile) {
		super(mat);
		tileClass = tile == null ? null : tile.getClass();
	}

	@Override
	public boolean hasTileEntity(int metadata) {
		return tileClass != null;
	}
	
	public Block setBlockActiveIcon(String icon) {
		this.activeTextureString = icon;
		return this;
	}
	
	@Override
	public IIcon getIcon(IBlockAccess access, int x,
			int y, int z, int p_149673_5_) {
		return access.getBlockMetadata(x, y, z) == 1 ? activeIcon : super.getIcon(access, x, y, z, p_149673_5_);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister iicon) {
		super.registerBlockIcons(iicon);
		activeIcon = iicon.registerIcon(activeTextureString);
	}
}

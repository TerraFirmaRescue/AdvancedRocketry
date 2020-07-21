package zmaster587.advancedRocketry.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMoegaddon extends Block {

    public BlockMoegaddon(String aName, int aHarvestLevel, String aTool) {
        super(Material.rock);
        this.setBlockName(aName);
        this.setHardness(3.0F);
        this.setStepSound(soundTypeStone);
        this.setHarvestLevel(aTool, aHarvestLevel);
        this.setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(this, aName);
    }
}


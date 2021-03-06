package zmaster587.advancedRocketry.inventory.modules;

import java.util.LinkedList;
import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.ResourceLocation;
import zmaster587.advancedRocketry.dimension.DimensionProperties;
import zmaster587.advancedRocketry.inventory.GuiPlanetButton;
import zmaster587.libVulpes.gui.GuiImageButton;
import zmaster587.libVulpes.inventory.modules.IButtonInventory;
import zmaster587.libVulpes.inventory.modules.ModuleButton;

public class ModuleButtonPlanet extends ModuleButton {

	DimensionProperties properties;
	
	public ModuleButtonPlanet(int offsetX, int offsetY, int buttonId,
			String text, IButtonInventory tile,
			DimensionProperties properties, String tooltipText, int sizeX,
			int sizeY) {
		super(offsetX, offsetY, buttonId, text, tile, null, tooltipText, sizeX,
				sizeY);
		this.properties = properties;
	}
	
	@SideOnly(Side.CLIENT)
	public List<GuiButton> addButtons(int x, int y) {

		List<GuiButton> list = new LinkedList<GuiButton>();

		button = new GuiPlanetButton(buttonId, x + offsetX, y + offsetY, sizeX, sizeY, properties);

		button.visible = visible;

		if(!sound.isEmpty()) {
			button.setSound(sound);
			sound = "";
		}

		button.setBackgroundColor(bgColor);
		list.add(button);

		return list;
	}

}

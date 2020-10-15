package zmaster587.advancedRocketry.atmosphere;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import zmaster587.libVulpes.LibVulpes;

public class AtmosphereHighPressure extends AtmosphereNeedsSuit {
	
	public AtmosphereHighPressure(boolean canTick, boolean isBreathable, boolean allowsCombustion,
			String name) {
		super(canTick, isBreathable, allowsCombustion, name);
	}
	

	@Override
	public String getDisplayMessage() {
		return LibVulpes.proxy.getLocalizedString("msg.highPressure");
	}
	
	// Needs full pressure suit
	protected boolean onlyNeedsMask()
	{
		return false;
	}
	
	@Override
	public void onTick(EntityLivingBase player) {
		if(player.worldObj.getTotalWorldTime() % 20  == 0 && !isImmune(player)) {
			player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 40, 3));
			player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 40, 3));
		}
	}
}

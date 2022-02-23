package net.haladie.foecore;

import net.fabricmc.api.ModInitializer;
import net.haladie.foecore.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FOECore implements ModInitializer
{
	public static final Logger LOGGER = LoggerFactory.getLogger("foecore");
	public static final String MOD_ID = "foecore";
	@Override
	public void onInitialize()
	{
		ModItems.registerModItems();
	}
}

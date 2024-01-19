package unillion.eternumart;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import unillion.eternumart.item.ItemGroup;
import unillion.eternumart.item.ModItem;

public class EternumArt implements ModInitializer {
	public static final String MOD_ID = "eternumart";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemGroup.registerItemGroups();
		ModItem.registerModItems();
	}
}
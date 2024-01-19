package unillion.eternumart.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import unillion.eternumart.EternumArt;

public class ItemGroup {
    public static final net.minecraft.item.ItemGroup ETERNUMART_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(EternumArt.MOD_ID, "eternumart"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.eternumart"))
                    .icon(() -> new ItemStack(Items.ITEM_FRAME)).entries((displayContext, entries) -> {
                        entries.add(Items.DIAMOND);
                        entries.add(ModItem.ETERNAL_SCANNER);
                    }).build());


    public static void registerItemGroups() {
        EternumArt.LOGGER.info("Registering Item Groups for " + EternumArt.MOD_ID);
    }
}

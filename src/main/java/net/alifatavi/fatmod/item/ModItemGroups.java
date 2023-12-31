package net.alifatavi.fatmod.item;

import net.alifatavi.fatmod.FatMod;
import net.alifatavi.fatmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FAT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FatMod.MOD_ID, "fatmod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fatmod"))
                    .icon(() -> new ItemStack(ModItems.FATORE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.FATORE);
                        entries.add(ModItems.FATORE_NUGGET);
                        entries.add(ModBlocks.FATORE_BLOCK);
                        entries.add(Items.DIAMOND);
                    }).build());


    public static void registerItemGroups() {
        FatMod.LOGGER.info("Registering Item Groups for " + FatMod.MOD_ID);
    }
}

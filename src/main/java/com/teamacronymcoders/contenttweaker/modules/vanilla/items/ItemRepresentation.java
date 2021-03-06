package com.teamacronymcoders.contenttweaker.modules.vanilla.items;

import com.teamacronymcoders.base.registrysystem.ItemRegistry;
import com.teamacronymcoders.contenttweaker.ContentTweaker;
import com.teamacronymcoders.contenttweaker.api.IRepresentation;
import com.teamacronymcoders.contenttweaker.modules.vanilla.functions.*;
import com.teamacronymcoders.contenttweaker.modules.vanilla.resources.creativetab.MCCreativeTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import stanhebben.zenscript.annotations.ZenClass;
import stanhebben.zenscript.annotations.ZenMethod;
import stanhebben.zenscript.annotations.ZenProperty;

@ZenClass("mods.contenttweaker.Item")
public class ItemRepresentation implements IRepresentation<Item> {
    @ZenProperty
    public String unlocalizedName;
    @ZenProperty
    public int maxStackSize = 64;
    @ZenProperty
    public String rarity = EnumRarity.COMMON.toString();
    @ZenProperty
    public ICreativeTab creativeTab = new MCCreativeTab(CreativeTabs.MISC);
    @ZenProperty
    public float smeltingExperience = -1;
    @ZenProperty
    public String toolClass = "";
    @ZenProperty
    public int toolLevel = -1;
    @ZenProperty
    public boolean beaconPayment = false;
    @ZenProperty
    public IItemRightClick itemRightClick = null;
    @ZenProperty
    public String itemUseAction = EnumAction.NONE.toString();
    @ZenProperty
    public boolean glowing;
    @ZenProperty
    public IItemUse onItemUse = null;
    @ZenProperty
    public int maxDamage = -1;
    @ZenProperty
    public IItemDestroySpeed itemDestroySpeed;
    @ZenProperty
    public IItemDestroyedBlock itemDestroyedBlock;

    @ZenProperty
    public IItemCrafted itemCrafted = null;

    @ZenMethod
    public IItemCrafted getItemCrafted() {
        return itemCrafted;
    }

    @ZenMethod
    public void setItemCrafted(IItemCrafted itemCrafted) {
        this.itemCrafted = itemCrafted;
    }

    @ZenMethod
    public String getUnlocalizedName() {
        return unlocalizedName;
    }

    @ZenMethod
    public void setUnlocalizedName(String unlocalizedName) {
        this.unlocalizedName = unlocalizedName;
    }

    @ZenMethod
    public int getMaxStackSize() {
        return maxStackSize;
    }

    @ZenMethod
    public void setMaxStackSize(int maxStackSize) {
        this.maxStackSize = maxStackSize;
    }

    @ZenMethod
    public String getRarity() {
        return rarity;
    }

    @ZenMethod
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    @ZenMethod
    public ICreativeTab getCreativeTab() {
        return creativeTab;
    }

    @ZenMethod
    public void setCreativeTab(ICreativeTab creativeTab) {
        this.creativeTab = creativeTab;
    }

    @ZenMethod
    public float getSmeltingExperience() {
        return smeltingExperience;
    }

    @ZenMethod
    public void setSmeltingExperience(float smeltingExperience) {
        this.smeltingExperience = smeltingExperience;
    }

    @ZenMethod
    public String getToolClass() {
        return toolClass;
    }

    @ZenMethod
    public void setToolClass(String toolClass) {
        this.toolClass = toolClass;
    }

    @ZenMethod
    public int getToolLevel() {
        return toolLevel;
    }

    @ZenMethod
    public void setToolLevel(int toolLevel) {
        this.toolLevel = toolLevel;
    }

    @ZenMethod
    public boolean isBeaconPayment() {
        return beaconPayment;
    }

    @ZenMethod
    public void setBeaconPayment(boolean beaconPayment) {
        this.beaconPayment = beaconPayment;
    }

    @ZenMethod
    public IItemRightClick getItemRightClick() {
        return this.itemRightClick;
    }

    @ZenMethod
    public void setItemRightClick(IItemRightClick itemRightClick) {
        this.itemRightClick = itemRightClick;
    }

    @ZenMethod
    public String getItemUseAction() {
        return itemUseAction;
    }

    @ZenMethod
    public void setItemUseAction(String itemUseAction) {
        this.itemUseAction = itemUseAction;
    }

    @ZenMethod
    public boolean isGlowing() {
        return glowing;
    }

    @ZenMethod
    public void setGlowing(boolean glowing) {
        this.glowing = glowing;
    }

    @ZenMethod
    public IItemUse getOnItemUse() {
        return onItemUse;
    }

    @ZenMethod
    public void setOnItemUse(IItemUse itemUse) {
        this.onItemUse = itemUse;
    }

    @ZenMethod
    public int getMaxDamage() {
        return maxDamage;
    }

    @ZenMethod
    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    @ZenMethod
    public IItemDestroySpeed getItemDestroySpeed() {
        return itemDestroySpeed;
    }

    @ZenMethod
    public void setItemDestroySpeed(IItemDestroySpeed itemDestroySpeed) {
        this.itemDestroySpeed = itemDestroySpeed;
    }

    @ZenMethod
    public IItemDestroyedBlock getItemDestroyedBlock() {
        return itemDestroyedBlock;
    }

    @ZenMethod
    public void setItemDestroyedBlock(IItemDestroyedBlock itemDestroyedBlock) {
        this.itemDestroyedBlock = itemDestroyedBlock;
    }

    @Override
    public String getName() {
        return this.getUnlocalizedName();
    }

    @Override
    public String getTypeName() {
        return "Item";
    }

    @ZenMethod
    public void register() {
        ContentTweaker.instance.getRegistry(ItemRegistry.class, "ITEM").register(new ItemContent(this));
    }

    @Override
    public Item getInternal() {
        return ContentTweaker.instance.getRegistry(ItemRegistry.class, "ITEM").get(new ResourceLocation(
                ContentTweaker.MOD_ID, this.getUnlocalizedName()));
    }


}

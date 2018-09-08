package com.valentin4311.candycraftmod.items;

import com.valentin4311.candycraftmod.CandyCraft;
import com.valentin4311.candycraftmod.blocks.CCBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

public class CCItems {
    /**
     * Items
     **/
    // /Materials
    // Marshmallow
    public static Item marshmallowStick;
    public static Item marshmallowSword;
    public static Item marshmallowShovel;
    public static Item marshmallowPickaxe;
    public static Item marshmallowAxe;
    public static Item marshmallowHoe;
    // Licorice
    public static Item licorice;
    public static Item licoriceSpear;
    public static Item licoriceSword;
    public static Item licoriceShovel;
    public static Item licoricePickAxe;
    public static Item licoriceAxe;
    public static Item licoriceHoe;
    public static Item licoriceHelmet;
    public static Item licoricePlate;
    public static Item licoriceLeggings;
    public static Item licoriceBoots;
    // HoneyComb
    public static Item honeyShard;
    public static Item honeycomb;
    public static Item honeyHelmet;
    public static Item honeyPlate;
    public static Item honeyLeggings;
    public static Item honeyBoots;
    public static Item honeySword;
    public static Item honeyShovel;
    public static Item honeyPickaxe;
    public static Item honeyAxe;
    public static Item honeyHoe;
    public static Item caramelBow;
    public static Item honeyArrow;
    public static Item caramelCrossbow;
    public static Item honeyBolt;
    // PEZ
    public static Item PEZ;
    public static Item PEZDust;
    public static Item PEZHelmet;
    public static Item PEZPlate;
    public static Item PEZLeggings;
    public static Item PEZBoots;
    public static Item PEZSword;
    public static Item PEZShovel;
    public static Item PEZPickaxe;
    public static Item PEZAxe;
    public static Item PEZHoe;
    // Gummy
    public static Item gummy;
    public static Item hotGummy;
    public static Item gummyBall;
    // Others
    public static Item candyCane;
    public static Item cottonCandy;
    public static Item cranberryScale;
    public static Item sugarCrystal;
    public static Item nougatPowder;
    // /StoryBoard
    // Dungeon Keys
    public static Item orangeKey;
    public static Item blueKey;
    public static Item whiteKey;
    public static Item purpleKey;
    // Boss keys
    public static Item jellySentryKey;
    public static Item jellyBossKey;
    public static Item suguardSentryKey;
    public static Item suguardBossKey;
    // Emblems
    public static Item honeyEmblem;
    // /Materials End
    public static Item jellyEmblem;
    public static Item suguardEmblem;
    public static Item cranberryEmblem;
    public static Item gingerbreadEmblem;
    public static Item waterEmblem;
    public static Item chewingGumEmblem;
    public static Item skyEmblem;
    // /Food Purpose
    public static Item cranberryFish;
    public static Item cranberryFishCooked;
    public static Item caramelBucket;
    public static Item waffleNugget;
    public static Item waffle;
    public static Item lollipop;
    public static Item dragibus;
    public static Item candiedCherry;
    public static Item sugarPill;
    // /Storyboard End
    // /Misc
    // Record
    public static Item CD1;
    public static Item CD2;
    public static Item CD3;
    public static Item CD4;
    // Equipment & Tools
    public static Item fork;
    public static Item dragibusStick;
    public static Item jellyCrown;
    public static Item jellyWand;
    public static Item jumpWand;
    // /Food Purpose End
    public static Item jellyBoots;
    public static Item waterMask;
    public static Item dynamite;
    public static Item glueDynamite;
    // Block Placing
    public static Item lollipopSeeds;
    public static Item marshmallowDoor;
    public static Item grenadineBucket;
    public static Item cottonCandyBed;
    // Others
    public static Item marshmallowFlower;
    public static Item chewingGum;
    public static Item chocolateCoin;
    public static Item wiki;
    public static Item candyPlacer;
    /**
     * Materials
     **/
    private static ToolMaterial licoriceMaterial = EnumHelper.addToolMaterial("Licorice", 1, 175, 4.0F, 1, 8);
    private static ArmorMaterial licoriceArmorMaterial = EnumHelper.addArmorMaterial("Licorice", "licorice", 18, new int[]{1, 5, 4, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    private static ToolMaterial honeyMaterial = EnumHelper.addToolMaterial("Honey", 3, 400, 7.0F, 2.0F, 18);
    private static ArmorMaterial honeyArmorMaterial = EnumHelper.addArmorMaterial("Honey", "honey", 22, new int[]{2, 7, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F);
    private static ToolMaterial PEZMaterial = EnumHelper.addToolMaterial("PEZ", 4, 1034, 7.6F, 3.4F, 3);
    private static ArmorMaterial PEZArmorMaterial = EnumHelper.addArmorMaterial("PEZ", "pez", 24, new int[]{4, 9, 7, 4}, 6, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    private static ArmorMaterial jellyCrownMaterial = EnumHelper.addArmorMaterial("Jelly_Crown", "Jelly_Crown", 0, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
    private static ArmorMaterial waterMaskMaterial = EnumHelper.addArmorMaterial("Water_Mask", "Armor_Mask", 0, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);
    private static ArmorMaterial jellyBootsMaterial = EnumHelper.addArmorMaterial("Jelly_Boots", "Armor_Boots", 0, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0F);

    // Misc End
    private static Side currentSide = null;

    public static void loadItems() {
        licorice = new ItemFood(6, true).setRegistryName("licorice").setCreativeTab(CandyCraft.getCandyTab());
        licoriceSpear = new ItemSword(licoriceMaterial).setRegistryName("licorice_spear").setCreativeTab(CandyCraft.getCandyTab());
        licoriceSword = new ItemSword(licoriceMaterial).setRegistryName("licorice_sword").setCreativeTab(CandyCraft.getCandyTab());
        licoriceShovel = new ItemSpade(licoriceMaterial).setRegistryName("licorice_shovel").setCreativeTab(CandyCraft.getCandyTab());
        licoricePickAxe = new ItemCandyPickaxe(licoriceMaterial).setRegistryName("licorice_pickaxe").setCreativeTab(CandyCraft.getCandyTab());
        licoriceAxe = new ItemCandyAxe(licoriceMaterial).setRegistryName("licorice_axe").setCreativeTab(CandyCraft.getCandyTab());
        licoriceHoe = new ItemHoe(licoriceMaterial).setRegistryName("licorice_hoe").setCreativeTab(CandyCraft.getCandyTab());
        licoriceHelmet = new ItemCandyArmor(licoriceArmorMaterial, EntityEquipmentSlot.HEAD).setRegistryName("licorice_helmet").setCreativeTab(CandyCraft.getCandyTab());
        licoricePlate = new ItemCandyArmor(licoriceArmorMaterial, EntityEquipmentSlot.CHEST).setRegistryName("licorice_plate").setCreativeTab(CandyCraft.getCandyTab());
        licoriceLeggings = new ItemCandyArmor(licoriceArmorMaterial, EntityEquipmentSlot.LEGS).setRegistryName("licorice_leggings").setCreativeTab(CandyCraft.getCandyTab());
        licoriceBoots = new ItemCandyArmor(licoriceArmorMaterial, EntityEquipmentSlot.FEET).setRegistryName("licorice_boots").setCreativeTab(CandyCraft.getCandyTab());
        candyCane = new ItemFood(4, true).setRegistryName("candy_cane").setCreativeTab(CandyCraft.getCandyTab());
        caramelBucket = new ItemCaramelBucket().setRegistryName("caramel_bucket").setCreativeTab(CandyCraft.getCandyTab()).setContainerItem(Items.BUCKET);
        lollipopSeeds = new ItemCandySeeds().setRegistryName("lollipop_seeds").setCreativeTab(CandyCraft.getCandyTab());
        lollipop = new ItemLollipop().setRegistryName("lollipop").setCreativeTab(CandyCraft.getCandyTab());
        fork = new ItemFork().setRegistryName("fork").setCreativeTab(CandyCraft.getCandyTab());
        dragibus = (new ItemCandySeedFood(1, 0.3F, CCBlocks.dragibusCrops)).setRegistryName("dragibus").setCreativeTab(CandyCraft.getCandyTab());
        dragibusStick = new ItemDragibusStick().setRegistryName("dragibus_stick").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowStick = new Item().setRegistryName("marshmallow_stick").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowDoor = (new ItemCandyDoor(CCBlocks.marshmallowDoor)).setCreativeTab(CandyCraft.getCandyTab()).setRegistryName("marshmallow_door_item");
        honeyShard = new Item().setRegistryName("honey_shard").setCreativeTab(CandyCraft.getCandyTab());
        chocolateCoin = new ItemFood(2, false).setRegistryName("chocolate_coin").setCreativeTab(CandyCraft.getCandyTab());
        honeycomb = new Item().setRegistryName("honeycomb").setCreativeTab(CandyCraft.getCandyTab());
        honeyHelmet = new ItemCandyArmor(honeyArmorMaterial, EntityEquipmentSlot.HEAD).setRegistryName("honey_helmet").setCreativeTab(CandyCraft.getCandyTab());
        honeyPlate = new ItemCandyArmor(honeyArmorMaterial, EntityEquipmentSlot.CHEST).setRegistryName("honey_plate").setCreativeTab(CandyCraft.getCandyTab());
        honeyLeggings = new ItemCandyArmor(honeyArmorMaterial, EntityEquipmentSlot.LEGS).setRegistryName("honey_leggings").setCreativeTab(CandyCraft.getCandyTab());
        honeyBoots = new ItemCandyArmor(honeyArmorMaterial, EntityEquipmentSlot.FEET).setRegistryName("honey_boots").setCreativeTab(CandyCraft.getCandyTab());
        honeySword = new ItemSword(honeyMaterial).setRegistryName("honey_sword").setCreativeTab(CandyCraft.getCandyTab());
        honeyShovel = new ItemSpade(honeyMaterial).setRegistryName("honey_shovel").setCreativeTab(CandyCraft.getCandyTab());
        honeyPickaxe = new ItemCandyPickaxe(honeyMaterial).setRegistryName("honey_pickaxe").setCreativeTab(CandyCraft.getCandyTab());
        honeyAxe = new ItemCandyAxe(honeyMaterial).setRegistryName("honey_axe").setCreativeTab(CandyCraft.getCandyTab());
        honeyHoe = new ItemHoe(honeyMaterial).setRegistryName("honey_hoe").setCreativeTab(CandyCraft.getCandyTab());
        caramelBow = new ItemCandyBow().setRegistryName("caramel_bow").setCreativeTab(CandyCraft.getCandyTab());
        honeyArrow = new Item().setRegistryName("honey_arrow").setCreativeTab(CandyCraft.getCandyTab());
        gummy = new ItemFood(4, false).setPotionEffect(new PotionEffect(MobEffects.NAUSEA, 30, 0), 0.9F).setRegistryName("gummy").setCreativeTab(CandyCraft.getCandyTab());
        hotGummy = new ItemFood(7, false).setPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, 60, 1), 0.9F).setRegistryName("hot_gummy").setCreativeTab(CandyCraft.getCandyTab());
        gummyBall = new ItemGummyBall().setRegistryName("gummy_ball").setCreativeTab(CandyCraft.getCandyTab());
        PEZ = new ItemFood(10, false).setPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 60, 0), 0.9F).setAlwaysEdible().setRegistryName("PEZ").setCreativeTab(CandyCraft.getCandyTab());
        PEZDust = new Item().setRegistryName("PEZ_dust").setCreativeTab(CandyCraft.getCandyTab());
        PEZHelmet = new ItemCandyArmor(PEZArmorMaterial, EntityEquipmentSlot.HEAD).setRegistryName("PEZ_helmet").setCreativeTab(CandyCraft.getCandyTab());
        PEZPlate = new ItemCandyArmor(PEZArmorMaterial, EntityEquipmentSlot.CHEST).setRegistryName("PEZ_plate").setCreativeTab(CandyCraft.getCandyTab());
        PEZLeggings = new ItemCandyArmor(PEZArmorMaterial, EntityEquipmentSlot.LEGS).setRegistryName("PEZ_leggings").setCreativeTab(CandyCraft.getCandyTab());
        PEZBoots = new ItemCandyArmor(PEZArmorMaterial, EntityEquipmentSlot.FEET).setRegistryName("PEZ_boots").setCreativeTab(CandyCraft.getCandyTab());
        PEZSword = new ItemSword(PEZMaterial).setRegistryName("PEZ_sword").setCreativeTab(CandyCraft.getCandyTab());
        PEZShovel = new ItemSpade(PEZMaterial).setRegistryName("PEZ_shovel").setCreativeTab(CandyCraft.getCandyTab());
        PEZPickaxe = new ItemCandyPickaxe(PEZMaterial).setRegistryName("PEZ_pickaxe").setCreativeTab(CandyCraft.getCandyTab());
        PEZAxe = new ItemCandyAxe(PEZMaterial).setRegistryName("PEZ_axe").setCreativeTab(CandyCraft.getCandyTab());
        PEZHoe = new ItemHoe(PEZMaterial).setRegistryName("PEZ_hoe").setCreativeTab(CandyCraft.getCandyTab());
        grenadineBucket = new ItemBucket(CCBlocks.grenadine).setRegistryName("grenadine_bucket").setCreativeTab(CandyCraft.getCandyTab()).setContainerItem(Items.BUCKET);
        cottonCandy = new ItemFood(3, true).setPotionEffect(new PotionEffect(MobEffects.HASTE, 30, 0), 0.9F).setRegistryName("cotton_candy").setCreativeTab(CandyCraft.getCandyTab());
        cranberryFish = new ItemFood(2, true).setPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 30, 0), 0.9F).setRegistryName("cranberry_fish").setCreativeTab(CandyCraft.getCandyTab());
        cranberryFishCooked = new ItemFood(6, true).setPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 60, 0), 0.9F).setRegistryName("cranberry_fish_cooked").setCreativeTab(CandyCraft.getCandyTab());
        cranberryScale = new Item().setRegistryName("cranberry_scale").setCreativeTab(CandyCraft.getCandyTab());
        cottonCandyBed = (new ItemCandyBed()).setMaxStackSize(1).setRegistryName("cotton_candy_bed").setCreativeTab(CandyCraft.getCandyTab());
        sugarCrystal = new Item().setRegistryName("sugar_crystal").setCreativeTab(CandyCraft.getCandyTab());
        jellyCrown = new ItemCandyArmor(jellyCrownMaterial, EntityEquipmentSlot.HEAD).setRegistryName("jelly_crown").setCreativeTab(CandyCraft.getCandyTab());
        jellyWand = new ItemJellyWand().setRegistryName("jelly_wand").setCreativeTab(CandyCraft.getCandyTab());
        waterMask = new ItemCandyArmor(waterMaskMaterial, EntityEquipmentSlot.HEAD).setRegistryName("water_mask").setCreativeTab(CandyCraft.getCandyTab());
        jumpWand = new ItemJumpWand().setRegistryName("jump_wand").setCreativeTab(CandyCraft.getCandyTab());
        jellyBoots = new ItemCandyArmor(jellyBootsMaterial, EntityEquipmentSlot.FEET).setRegistryName("jelly_boots").setCreativeTab(CandyCraft.getCandyTab());
        candiedCherry = new ItemFood(3, true).setRegistryName("candied_cherry").setCreativeTab(CandyCraft.getCandyTab());
        waffleNugget = new ItemFood(1, true).setRegistryName("waffle_nugget").setCreativeTab(CandyCraft.getCandyTab());
        waffle = new ItemFood(10, true).setRegistryName("waffle").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowSword = new ItemSword(ToolMaterial.WOOD).setRegistryName("marshmallow_sword").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowShovel = new ItemSpade(ToolMaterial.WOOD).setRegistryName("marshmallow_shovel").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowPickaxe = new ItemCandyPickaxe(ToolMaterial.WOOD).setRegistryName("marshmallow_pickaxe").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowAxe = new ItemCandyAxe(ToolMaterial.WOOD).setRegistryName("marshmallow_axe").setCreativeTab(CandyCraft.getCandyTab());
        marshmallowHoe = new ItemHoe(ToolMaterial.WOOD).setRegistryName("marshmallow_hoe").setCreativeTab(CandyCraft.getCandyTab());
        nougatPowder = new ItemNougatPowder(3, true).setRegistryName("nougat_powder").setCreativeTab(CandyCraft.getCandyTab());
        dynamite = new ItemDynamite().setRegistryName("dynamite").setCreativeTab(CandyCraft.getCandyTab());
        glueDynamite = new ItemDynamite().setRegistryName("glue_dynamite").setCreativeTab(CandyCraft.getCandyTab());
        chewingGum = new Item().setRegistryName("chewing_gum").setCreativeTab(CandyCraft.getCandyTab());
        sugarPill = ((ItemFood) new ItemGrenadineCandy().setRegistryName("sugar_pill")).setAlwaysEdible().setCreativeTab(null);
        marshmallowFlower = new Item().setRegistryName("marshmallow_flower").setCreativeTab(CandyCraft.getCandyTab());
        honeyBolt = new Item().setRegistryName("honey_bolt").setCreativeTab(CandyCraft.getCandyTab());
        caramelCrossbow = new ItemCandyCrossbow().setRegistryName("caramel_crossbow").setCreativeTab(CandyCraft.getCandyTab());

        CD1 = new ItemCandyRecord("CD-1", "C418 - Sweden - Remix Caution & Crisis", "Sweden Remix").setRegistryName("record_1").setCreativeTab(CandyCraft.getCandyTab());
        CD2 = new ItemCandyRecord("CD-2", "Jakim - Every", "Every").setRegistryName("record_2").setCreativeTab(CandyCraft.getCandyTab());
        CD3 = new ItemCandyRecord("CD-3", "Rainbow Bunchie", "Rainbow Bunchie").setRegistryName("record_3").setCreativeTab(CandyCraft.getCandyTab());
        CD4 = new ItemCandyRecord("CD-4", "C418 - Einfallslos", "Einfallslos").setRegistryName("record_4").setCreativeTab(CandyCraft.getCandyTab());

        candyPlacer = new ItemCandyMonsterPlacer().setRegistryName("candy_spawn_egg").setCreativeTab(CandyCraft.getCandyTab());
        wiki = new ItemWiki().setRegistryName("wiki").setCreativeTab(CandyCraft.getCandyTab());
        orangeKey = new ItemDungeonKey(0).setRegistryName("jelly_key").setCreativeTab(CandyCraft.getCandyTab());
        blueKey = new ItemDungeonKey(1).setRegistryName("suguard_key").setCreativeTab(CandyCraft.getCandyTab());
        whiteKey = new ItemDungeonKey(2).setRegistryName("sky_key").setCreativeTab(CandyCraft.getCandyTab());
        purpleKey = new ItemDungeonKey(3).setRegistryName("beetle_key").setCreativeTab(CandyCraft.getCandyTab());

        honeyEmblem = new ItemEmblem("HoneyEmblem").setRegistryName("honey_emblem").setCreativeTab(CandyCraft.getCandyTab());
        jellyEmblem = new ItemEmblem("JellyEmblem").setRegistryName("jelly_emblem").setCreativeTab(CandyCraft.getCandyTab());
        suguardEmblem = new ItemEmblem("SuguardEmblem").setRegistryName("suguard_emblem").setCreativeTab(CandyCraft.getCandyTab());
        cranberryEmblem = new ItemEmblem("CranberryEmblem").setRegistryName("cranberry_emblem").setCreativeTab(CandyCraft.getCandyTab());
        gingerbreadEmblem = new ItemEmblem("GingerbreadEmblem").setRegistryName("gingerbread_emblem").setCreativeTab(CandyCraft.getCandyTab());
        waterEmblem = new ItemEmblem("WaterEmblem").setRegistryName("water_emblem").setCreativeTab(CandyCraft.getCandyTab());
        chewingGumEmblem = new ItemEmblem("ChewingGumEmblem").setRegistryName("chewing_gum_emblem").setCreativeTab(CandyCraft.getCandyTab());
        skyEmblem = new ItemEmblem("SkyEmblem").setRegistryName("sky_emblem").setCreativeTab(CandyCraft.getCandyTab());

        jellySentryKey = new ItemBossKey(0).setRegistryName("jelly_sentry_key").setCreativeTab(CandyCraft.getCandyTab());
        jellyBossKey = new ItemBossKey(1).setRegistryName("jelly_boss_key").setCreativeTab(CandyCraft.getCandyTab());
        suguardSentryKey = new ItemBossKey(2).setRegistryName("suguard_sentry_key").setCreativeTab(CandyCraft.getCandyTab());
        suguardBossKey = new ItemBossKey(3).setRegistryName("suguard_boss_key").setCreativeTab(CandyCraft.getCandyTab());

        licoriceMaterial.setRepairItem(new ItemStack(licorice));
        licoriceArmorMaterial.customCraftingMaterial = licorice;
        honeyMaterial.setRepairItem(new ItemStack(honeycomb));
        honeyArmorMaterial.customCraftingMaterial = honeycomb;
        PEZMaterial.setRepairItem(new ItemStack(PEZ));
        PEZArmorMaterial.customCraftingMaterial = PEZ;
    }

    public static void registerItems(Side side) {
        currentSide = side;
        registerItem(marshmallowStick);
        registerItem(marshmallowDoor);
        registerItem(cottonCandyBed);
        registerItem(fork);
        registerItem(dragibus);
        registerItem(dragibusStick);
        registerItem(lollipopSeeds);
        registerItem(lollipop);
        registerItem(candyCane);
        registerItem(marshmallowSword);
        registerItem(marshmallowShovel);
        registerItem(marshmallowPickaxe);
        registerItem(marshmallowAxe);
        registerItem(marshmallowHoe);
        registerItem(gummy);
        registerItem(hotGummy);
        registerItem(cottonCandy);
        registerItem(cranberryFish);
        registerItem(cranberryFishCooked);
        registerItem(gummyBall);
        registerItem(chocolateCoin);
        registerItem(caramelBucket);
        registerItem(grenadineBucket);
        registerItem(licorice);
        registerItem(licoriceSpear);
        registerItem(licoriceSword);
        registerItem(licoriceShovel);
        registerItem(licoricePickAxe);
        registerItem(licoriceAxe);
        registerItem(licoriceHoe);
        registerItem(licoriceHelmet);
        registerItem(licoricePlate);
        registerItem(licoriceLeggings);
        registerItem(licoriceBoots);
        registerItem(honeyShard);
        registerItem(honeycomb);
        registerItem(honeySword);
        registerItem(honeyShovel);
        registerItem(honeyPickaxe);
        registerItem(honeyAxe);
        registerItem(honeyHoe);
        registerItem(honeyHelmet);
        registerItem(honeyPlate);
        registerItem(honeyLeggings);
        registerItem(honeyBoots);
        registerItem(PEZ);
        registerItem(PEZDust);
        registerItem(PEZSword);
        registerItem(PEZShovel);
        registerItem(PEZPickaxe);
        registerItem(PEZAxe);
        registerItem(PEZHoe);
        registerItem(PEZHelmet);
        registerItem(PEZPlate);
        registerItem(PEZLeggings);
        registerItem(PEZBoots);
        registerItem(caramelBow);
        registerItem(honeyArrow);
        registerItem(caramelCrossbow);
        registerItem(honeyBolt);
        registerItem(cranberryScale);
        registerItem(sugarCrystal);
        registerItem(jellyWand);
        registerItem(jumpWand);
        registerItem(waterMask);
        registerItem(jellyCrown);
        registerItem(jellyBoots);
        registerItem(candiedCherry);
        registerItem(waffleNugget);
        registerItem(waffle);
        registerItem(nougatPowder);
        registerItem(dynamite);
        registerItem(glueDynamite);
        registerItem(chewingGum);
        registerItem(marshmallowFlower);
        registerItem(sugarPill);
        registerItem(honeyEmblem);
        registerItem(jellyEmblem);
        registerItem(suguardEmblem);
        registerItem(cranberryEmblem);
        registerItem(gingerbreadEmblem);
        registerItem(waterEmblem);
        registerItem(chewingGumEmblem);
        registerItem(skyEmblem);
        registerItem(CD1);
        registerItem(CD2);
        registerItem(CD3);
        registerItem(CD4);
        registerItem(orangeKey);
        registerItem(blueKey);
        registerItem(whiteKey);
        registerItem(purpleKey);
        registerItem(jellySentryKey);
        registerItem(jellyBossKey);
        registerItem(suguardSentryKey);
        registerItem(suguardBossKey);
        registerItem(candyPlacer);
        registerItem(wiki);
    }

    public static void registerItem(final Item item) {
        GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
        CandyCraft.getItemList().add(item);
        if (currentSide == Side.CLIENT) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation("candycraftmod:" + item.getUnlocalizedName().substring(5), "inventory"));
        }
    }
}

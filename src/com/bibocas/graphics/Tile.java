package com.bibocas.graphics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import com.bibocas.main.Game;

public class Tile {

    public static BufferedImage TILE_GRASS_FLOOR = Game.sprite.GetSprite(0, 0, 16, 16);
    public static BufferedImage TILE_CRACKED_FLOOR = Game.sprite.GetSprite(16, 0, 16, 16);
    public static BufferedImage TILE_BTICK_WALL = Game.sprite.GetSprite(32, 0, 16, 16);
    public static BufferedImage TILE_WATER = Game.sprite.GetSprite(48, 0, 16, 16);
    public static BufferedImage TILE_FLOOR = Game.sprite.GetSprite(64, 0, 16, 16);
    public static BufferedImage TILE_SAND_FLOOR = Game.sprite.GetSprite(80, 0, 16, 16);
    public static BufferedImage TILE_WOOD_FLOOR = Game.sprite.GetSprite(256, 64, 16, 16);

    public static BufferedImage TILE_BUSH_SAND_FLOOR = Game.sprite.GetSprite(144, 16, 16, 16);
    public static BufferedImage TILE_LONG_BUSH_01_SAND_FLOOR = Game.sprite.GetSprite(144, 320, 16, 16);
    public static BufferedImage TILE_LONG_BUSH_02_SAND_FLOOR = Game.sprite.GetSprite(144, 336, 16, 16);

    public static BufferedImage TILE_BUSH_CRACKED_FLOOR = Game.sprite.GetSprite(192, 96, 16, 16);
    public static BufferedImage TILE_LONG_BUSH_01_CRACKED_FLOOR = Game.sprite.GetSprite(160, 320, 16, 16);
    public static BufferedImage TILE_LONG_BUSH_02_CRACKED_FLOOR = Game.sprite.GetSprite(160, 336, 16, 16);

    public static BufferedImage TILE_BUSH_GRASS_FLOOR = Game.sprite.GetSprite(244, 96, 16, 16);
    public static BufferedImage TILE_LONG_BUSH_01_GRASS_FLOOR = Game.sprite.GetSprite(176, 320, 16, 16);
    public static BufferedImage TILE_LONG_BUSH_02_GRASS_FLOOR = Game.sprite.GetSprite(176, 336, 16, 16);

    public static BufferedImage TILE_BUSH_WATER_FLOOR = Game.sprite.GetSprite(244, 96, 16, 16);
    public static BufferedImage TILE_LONG_BUSH_01_WATER_FLOOR = Game.sprite.GetSprite(192, 320, 16, 16);
    public static BufferedImage TILE_LONG_BUSH_02_WATER_FLOOR = Game.sprite.GetSprite(192, 336, 16, 16);

    public static BufferedImage TILE_DRY_BUSH_SAND_FLOOR = Game.sprite.GetSprite(64, 16, 16, 16);
    public static BufferedImage TILE_DRY_LONG_BUSH_01_SAND_FLOOR = Game.sprite.GetSprite(64, 320, 16, 16);
    public static BufferedImage TILE_DRY_LONG_BUSH_02_SAND_FLOOR = Game.sprite.GetSprite(64, 336, 16, 16);

    public static BufferedImage TILE_DRY_BUSH_CRACKED_FLOOR = Game.sprite.GetSprite(224, 80, 16, 16);
    public static BufferedImage TILE_DRY_LONG_BUSH_01_CRACKED_FLOOR = Game.sprite.GetSprite(64, 320, 16, 16);
    public static BufferedImage TILE_DRY_LONG_BUSH_02_CRACKED_FLOOR = Game.sprite.GetSprite(64, 336, 16, 16);

    public static BufferedImage TILE_DRY_BUSH_GRASS_FLOOR = Game.sprite.GetSprite(224, 80, 16, 16);
    public static BufferedImage TILE_DRY_LONG_BUSH_01_GRASS_FLOOR = Game.sprite.GetSprite(64, 320, 16, 16);
    public static BufferedImage TILE_DRY_LONG_BUSH_02_GRASS_FLOOR = Game.sprite.GetSprite(64, 336, 16, 16);

    public static BufferedImage TILE_DRY_BUSH_WATER_FLOOR = Game.sprite.GetSprite(224, 80, 16, 16);
    public static BufferedImage TILE_DRY_LONG_BUSH_01_WATER_FLOOR = Game.sprite.GetSprite(64, 320, 16, 16);
    public static BufferedImage TILE_DRY_LONG_BUSH_02_WATER_FLOOR = Game.sprite.GetSprite(64, 336, 16, 16);

    public static BufferedImage TILE_CACTUS_SAND_FLOOR = Game.sprite.GetSprite(80, 16, 16, 16);
    public static BufferedImage TILE_LONG_CACTUS_01_SAND_FLOOR = Game.sprite.GetSprite(80, 32, 16, 16);
    public static BufferedImage TILE_LONG_CACTUS_02_SAND_FLOOR = Game.sprite.GetSprite(80, 48, 16, 16);

    public static BufferedImage TILE_CACTUS_CRACKED_FLOOR = Game.sprite.GetSprite(224, 80, 16, 16);
    public static BufferedImage TILE_LONG_CACTUS_01_CRACKED_FLOOR = Game.sprite.GetSprite(256, 80, 16, 16);
    public static BufferedImage TILE_LONG_CACTUS_02_CRACKED_FLOOR = Game.sprite.GetSprite(256, 96, 16, 16);

    public static BufferedImage TILE_CACTUS_WATER_FLOOR = Game.sprite.GetSprite(288, 64, 16, 16);
    public static BufferedImage TILE_LONG_CACTUS_01_WATER_FLOOR = Game.sprite.GetSprite(304, 48, 16, 16);
    public static BufferedImage TILE_LONG_CACTUS_02_WATER_FLOOR = Game.sprite.GetSprite(304, 64, 16, 16);

    public static BufferedImage TILE_CACTUS_GRASS_FLOOR = Game.sprite.GetSprite(208, 96, 16, 16);
    public static BufferedImage TILE_LONG_CACTUS_01_GRASS_FLOOR = Game.sprite.GetSprite(288, 80, 16, 16);
    public static BufferedImage TILE_LONG_CACTUS_02_GRASS_FLOOR = Game.sprite.GetSprite(288, 96, 16, 16);

    public static BufferedImage TILE_LEAVES_01_TREES_SAND_FLOOR = Game.sprite.GetSprite(96, 32, 16, 16);
    public static BufferedImage TILE_LEAVES_02_TREES_SAND_FLOOR = Game.sprite.GetSprite(112, 32, 16, 16);
    public static BufferedImage TILE_LEAVES_03_TREES_SAND_FLOOR = Game.sprite.GetSprite(128, 32, 16, 16);
    public static BufferedImage TILE_LEAVES_04_TREES_SAND_FLOOR = Game.sprite.GetSprite(96, 48, 16, 16);
    public static BufferedImage TILE_LEAVES_05_TREES_SAND_FLOOR = Game.sprite.GetSprite(112, 48, 16, 16);
    public static BufferedImage TILE_LEAVES_06_TREES_SAND_FLOOR = Game.sprite.GetSprite(128, 48, 16, 16);
    public static BufferedImage TILE_STEM_07_TREES_SAND_FLOOR = Game.sprite.GetSprite(112, 64, 16, 16);

    public static BufferedImage TILE_LEAVES_01_TREES_CRACKED_FLOOR = Game.sprite.GetSprite(64, 304, 16, 16);
    public static BufferedImage TILE_LEAVES_02_TREES_CRACKED_FLOOR = Game.sprite.GetSprite(80, 304, 16, 16);
    public static BufferedImage TILE_LEAVES_03_TREES_CRACKED_FLOOR = Game.sprite.GetSprite(96, 304, 16, 16);
    public static BufferedImage TILE_LEAVES_04_TREES_CRACKED_FLOOR = Game.sprite.GetSprite(64, 320, 16, 16);
    public static BufferedImage TILE_LEAVES_06_TREES_CRACKED_FLOOR = Game.sprite.GetSprite(96, 320, 16, 16);
    public static BufferedImage TILE_STEM_07_TREES_CRACKED_FLOOR = Game.sprite.GetSprite(80, 336, 16, 16);

    public static BufferedImage TILE_LEAVES_01_TREES_GRASS_FLOOR = Game.sprite.GetSprite(0, 304, 16, 16);
    public static BufferedImage TILE_LEAVES_02_TREES_GRASS_FLOOR = Game.sprite.GetSprite(16, 304, 16, 16);
    public static BufferedImage TILE_LEAVES_03_TREES_GRASS_FLOOR = Game.sprite.GetSprite(32, 304, 16, 16);
    public static BufferedImage TILE_LEAVES_04_TREES_GRASS_FLOOR = Game.sprite.GetSprite(0, 320, 16, 16);
    public static BufferedImage TILE_LEAVES_06_TREES_GRASS_FLOOR = Game.sprite.GetSprite(32, 320, 16, 16);
    public static BufferedImage TILE_STEM_07_TREES_GRASS_FLOOR = Game.sprite.GetSprite(16, 336, 16, 16);

    public static BufferedImage TILE_LEAVES_01_TREES_WATER_FLOOR = Game.sprite.GetSprite(96, 304, 16, 16);
    public static BufferedImage TILE_LEAVES_02_TREES_WATER_FLOOR = Game.sprite.GetSprite(112, 304, 16, 16);
    public static BufferedImage TILE_LEAVES_03_TREES_WATER_FLOOR = Game.sprite.GetSprite(128, 304, 16, 16);
    public static BufferedImage TILE_LEAVES_04_TREES_WATER_FLOOR = Game.sprite.GetSprite(96, 320, 16, 16);
    public static BufferedImage TILE_LEAVES_06_TREES_WATER_FLOOR = Game.sprite.GetSprite(128, 320, 16, 16);
    public static BufferedImage TILE_STEM_07_TREES_WATER_FLOOR = Game.sprite.GetSprite(112, 336, 16, 16);

    public static BufferedImage TILE_FENCE_CRACKED_FLOOR = Game.sprite.GetSprite(80, 176, 16, 16);
    public static BufferedImage TILE_FENCE_SAND_FLOOR = Game.sprite.GetSprite(80, 160, 16, 16);
    public static BufferedImage TILE_FENCE_GRASS_FLOOR = Game.sprite.GetSprite(80, 146, 16, 16);
    public static BufferedImage TILE_FENCE_WATER_FLOOR = Game.sprite.GetSprite(304, 32, 16, 16);

    public static BufferedImage TILE_DOG_CRACKED_FLOOR = Game.sprite.GetSprite(96, 64, 16, 16);
    public static BufferedImage TILE_DOG_SAND_FLOOR = Game.sprite.GetSprite(144, 64, 16, 16);
    public static BufferedImage TILE_DOG_GRASS_FLOOR = Game.sprite.GetSprite(128, 64, 16, 16);
    public static BufferedImage TILE_DOG_WATER_FLOOR = Game.sprite.GetSprite(224, 32, 16, 16);

    public static BufferedImage TILE_PLATE_GRASS_FLOOR = Game.sprite.GetSprite(160, 64, 16, 16);
    public static BufferedImage TILE_PLATE_SAND_FLOOR = Game.sprite.GetSprite(160, 96, 16, 16);
    public static BufferedImage TILE_PLATE_CRACKED_FLOOR = Game.sprite.GetSprite(144, 96, 16, 16);
    public static BufferedImage TILE_PLATE_WATER_FLOOR = Game.sprite.GetSprite(128, 80, 16, 16);

    public static BufferedImage TILE_CLAY_VASE_GRASS_FLOOR = Game.sprite.GetSprite(64, 144, 16, 16);
    public static BufferedImage TILE_CLAY_VASE_SAND_FLOOR = Game.sprite.GetSprite(64, 176, 16, 16);
    public static BufferedImage TILE_CLAY_VASE_CRACKED_FLOOR = Game.sprite.GetSprite(64, 160, 16, 16);
    public static BufferedImage TILE_CLAY_VASE_FLOOR = Game.sprite.GetSprite(128, 96, 16, 16);

    public static BufferedImage TILE_CARCASS_01_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(176, 304, 16, 16);
    public static BufferedImage TILE_CARCASS_02_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(192, 304, 16, 16);
    public static BufferedImage TILE_CARCASS_01_SAND_FLOOR_LEFT = Game.sprite.GetSprite(144, 304, 16, 16);
    public static BufferedImage TILE_CARCASS_02_SAND_FLOOR_LEFT = Game.sprite.GetSprite(160, 304, 16, 16);
    public static BufferedImage TILE_CARCASS_01_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(64, 112, 16, 16);
    public static BufferedImage TILE_CARCASS_02_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(80, 112, 16, 16);
    public static BufferedImage TILE_CARCASS_01_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(32, 112, 16, 16);
    public static BufferedImage TILE_CARCASS_02_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(48, 112, 16, 16);

    public static BufferedImage TILE_WAGON_01_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(0, 128, 16, 16);
    public static BufferedImage TILE_WAGON_02_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(16, 128, 16, 16);
    public static BufferedImage TILE_WAGON_03_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(32, 128, 16, 16);
    public static BufferedImage TILE_WAGON_04_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(48, 128, 16, 16);
    public static BufferedImage TILE_WAGON_05_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(64, 144, 16, 16);
    public static BufferedImage TILE_WAGON_06_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(80, 144, 16, 16);
    public static BufferedImage TILE_WAGON_07_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(96, 144, 16, 16);
    public static BufferedImage TILE_WAGON_08_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(112, 144, 16, 16);
    public static BufferedImage TILE_WAGON_01_SAND_FLOOR_LEFT = Game.sprite.GetSprite(0, 160, 16, 16);
    public static BufferedImage TILE_WAGON_02_SAND_FLOOR_LEFT = Game.sprite.GetSprite(16, 160, 16, 16);
    public static BufferedImage TILE_WAGON_03_SAND_FLOOR_LEFT = Game.sprite.GetSprite(32, 160, 16, 16);
    public static BufferedImage TILE_WAGON_04_SAND_FLOOR_LEFT = Game.sprite.GetSprite(48, 160, 16, 16);
    public static BufferedImage TILE_WAGON_05_SAND_FLOOR_LEFT = Game.sprite.GetSprite(64, 176, 16, 16);
    public static BufferedImage TILE_WAGON_06_SAND_FLOOR_LEFT = Game.sprite.GetSprite(80, 176, 16, 16);
    public static BufferedImage TILE_WAGON_07_SAND_FLOOR_LEFT = Game.sprite.GetSprite(96, 176, 16, 16);
    public static BufferedImage TILE_WAGON_08_SAND_FLOOR_LEFT = Game.sprite.GetSprite(112, 176, 16, 16);

    public static BufferedImage TILE_WAGON_01_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(0, 352, 16, 16);
    public static BufferedImage TILE_WAGON_02_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(16, 352, 16, 16);
    public static BufferedImage TILE_WAGON_03_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(32, 352, 16, 16);
    public static BufferedImage TILE_WAGON_04_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(48, 352, 16, 16);
    public static BufferedImage TILE_WAGON_05_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(64, 368, 16, 16);
    public static BufferedImage TILE_WAGON_06_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(80, 368, 16, 16);
    public static BufferedImage TILE_WAGON_07_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(96, 368, 16, 16);
    public static BufferedImage TILE_WAGON_08_CRACKED_FLOOR_RIGHT = Game.sprite.GetSprite(112, 368, 16, 16);
    public static BufferedImage TILE_WAGON_01_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(0, 384, 16, 16);
    public static BufferedImage TILE_WAGON_02_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(16, 384, 16, 16);
    public static BufferedImage TILE_WAGON_03_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(32, 384, 16, 16);
    public static BufferedImage TILE_WAGON_04_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(48, 384, 16, 16);
    public static BufferedImage TILE_WAGON_05_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(64, 400, 16, 16);
    public static BufferedImage TILE_WAGON_06_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(80, 400, 16, 16);
    public static BufferedImage TILE_WAGON_07_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(96, 400, 16, 16);
    public static BufferedImage TILE_WAGON_08_CRACKED_FLOOR_LEFT = Game.sprite.GetSprite(112, 400, 16, 16);

    public static BufferedImage TILE_WAGON_01_GRASS_FLOOR_RIGHT = Game.sprite.GetSprite(64, 352, 16, 16);
    public static BufferedImage TILE_WAGON_02_GRASS_FLOOR_RIGHT = Game.sprite.GetSprite(80, 352, 16, 16);
    public static BufferedImage TILE_WAGON_03_GRASS_FLOOR_RIGHT = Game.sprite.GetSprite(96, 352, 16, 16);
    public static BufferedImage TILE_WAGON_04_GRASS_FLOOR_RIGHT = Game.sprite.GetSprite(112, 352, 16, 16);
    public static BufferedImage TILE_WAGON_05_GRASS_FLOOR_RIGHT = Game.sprite.GetSprite(64, 368, 16, 16);
    public static BufferedImage TILE_WAGON_06_GRASS_FLOOR_RIGHT = Game.sprite.GetSprite(80, 368, 16, 16);
    public static BufferedImage TILE_WAGON_07_GRASS_FLOOR_RIGHT = Game.sprite.GetSprite(96, 368, 16, 16);
    public static BufferedImage TILE_WAGON_08_GRASS_FLOOR_RIGHT = Game.sprite.GetSprite(112, 368, 16, 16);
    public static BufferedImage TILE_WAGON_01_GRASS_FLOOR_LEFT = Game.sprite.GetSprite(64, 384, 16, 16);
    public static BufferedImage TILE_WAGON_02_GRASS_FLOOR_LEFT = Game.sprite.GetSprite(80, 384, 16, 16);
    public static BufferedImage TILE_WAGON_03_GRASS_FLOOR_LEFT = Game.sprite.GetSprite(96, 384, 16, 16);
    public static BufferedImage TILE_WAGON_04_GRASS_FLOOR_LEFT = Game.sprite.GetSprite(112, 384, 16, 16);
    public static BufferedImage TILE_WAGON_05_GRASS_FLOOR_LEFT = Game.sprite.GetSprite(64, 400, 16, 16);
    public static BufferedImage TILE_WAGON_06_GRASS_FLOOR_LEFT = Game.sprite.GetSprite(80, 400, 16, 16);
    public static BufferedImage TILE_WAGON_07_GRASS_FLOOR_LEFT = Game.sprite.GetSprite(96, 400, 16, 16);
    public static BufferedImage TILE_WAGON_08_GRASS_FLOOR_LEFT = Game.sprite.GetSprite(112, 400, 16, 16);

    public static BufferedImage TILE_WAGON_01_WATER_FLOOR_RIGHT = Game.sprite.GetSprite(0, 352, 16, 16);
    public static BufferedImage TILE_WAGON_02_WATER_FLOOR_RIGHT = Game.sprite.GetSprite(16, 352, 16, 16);
    public static BufferedImage TILE_WAGON_03_WATER_FLOOR_RIGHT = Game.sprite.GetSprite(32, 352, 16, 16);
    public static BufferedImage TILE_WAGON_04_WATER_FLOOR_RIGHT = Game.sprite.GetSprite(48, 352, 16, 16);
    public static BufferedImage TILE_WAGON_05_WATER_FLOOR_RIGHT = Game.sprite.GetSprite(64, 368, 16, 16);
    public static BufferedImage TILE_WAGON_06_WATER_FLOOR_RIGHT = Game.sprite.GetSprite(80, 368, 16, 16);
    public static BufferedImage TILE_WAGON_07_WATER_FLOOR_RIGHT = Game.sprite.GetSprite(96, 368, 16, 16);
    public static BufferedImage TILE_WAGON_08_WATER_FLOOR_RIGHT = Game.sprite.GetSprite(112, 368, 16, 16);
    public static BufferedImage TILE_WAGON_01_WATER_FLOOR_LEFT = Game.sprite.GetSprite(128, 384, 16, 16);
    public static BufferedImage TILE_WAGON_02_WATER_FLOOR_LEFT = Game.sprite.GetSprite(144, 384, 16, 16);
    public static BufferedImage TILE_WAGON_03_WATER_FLOOR_LEFT = Game.sprite.GetSprite(160, 384, 16, 16);
    public static BufferedImage TILE_WAGON_04_WATER_FLOOR_LEFT = Game.sprite.GetSprite(176, 384, 16, 16);
    public static BufferedImage TILE_WAGON_05_WATER_FLOOR_LEFT = Game.sprite.GetSprite(128, 400, 16, 16);
    public static BufferedImage TILE_WAGON_06_WATER_FLOOR_LEFT = Game.sprite.GetSprite(144, 400, 16, 16);
    public static BufferedImage TILE_WAGON_07_WATER_FLOOR_LEFT = Game.sprite.GetSprite(160, 400, 16, 16);
    public static BufferedImage TILE_WAGON_08_WATER_FLOOR_LEFT = Game.sprite.GetSprite(176, 400, 16, 16);

    public static BufferedImage TILE_MUD_HOUSE_01_SAND_FLOOR_LEFT = Game.sprite.GetSprite(96, 112, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_02_SAND_FLOOR_LEFT = Game.sprite.GetSprite(112, 112, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_03_SAND_FLOOR_LEFT = Game.sprite.GetSprite(128, 112, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_04_SAND_FLOOR_LEFT = Game.sprite.GetSprite(144, 112, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_05_SAND_FLOOR_LEFT = Game.sprite.GetSprite(96, 128, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_06_SAND_FLOOR_LEFT = Game.sprite.GetSprite(112, 128, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_07_SAND_FLOOR_LEFT = Game.sprite.GetSprite(128, 128, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_08_SAND_FLOOR_LEFT = Game.sprite.GetSprite(144, 128, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_09_SAND_FLOOR_LEFT = Game.sprite.GetSprite(96, 144, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_10_SAND_FLOOR_LEFT = Game.sprite.GetSprite(112, 144, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_11_SAND_FLOOR_LEFT = Game.sprite.GetSprite(128, 144, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_12_SAND_FLOOR_LEFT = Game.sprite.GetSprite(144, 144, 16, 16);

    public static BufferedImage TILE_MUD_HOUSE_01_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(96, 160, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_02_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(112, 160, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_03_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(128, 160, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_04_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(144, 160, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_05_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(96, 176, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_06_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(112, 176, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_07_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(128, 176, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_08_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(144, 176, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_09_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(96, 192, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_10_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(112, 192, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_11_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(128, 192, 16, 16);
    public static BufferedImage TILE_MUD_HOUSE_12_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(144, 192, 16, 16);

    public static BufferedImage TILE_MASONRY_HOUSE_01_SAND_FLOOR_LEFT = Game.sprite.GetSprite(160, 112, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_02_SAND_FLOOR_LEFT = Game.sprite.GetSprite(176, 112, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_03_SAND_FLOOR_LEFT = Game.sprite.GetSprite(192, 112, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_04_SAND_FLOOR_LEFT = Game.sprite.GetSprite(208, 112, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_05_SAND_FLOOR_LEFT = Game.sprite.GetSprite(160, 128, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_06_SAND_FLOOR_LEFT = Game.sprite.GetSprite(176, 128, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_07_SAND_FLOOR_LEFT = Game.sprite.GetSprite(192, 128, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_08_SAND_FLOOR_LEFT = Game.sprite.GetSprite(208, 128, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_09_SAND_FLOOR_LEFT = Game.sprite.GetSprite(160, 144, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_10_SAND_FLOOR_LEFT = Game.sprite.GetSprite(176, 144, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_11_SAND_FLOOR_LEFT = Game.sprite.GetSprite(192, 144, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_12_SAND_FLOOR_LEFT = Game.sprite.GetSprite(208, 144, 16, 16);

    public static BufferedImage TILE_MASONRY_HOUSE_01_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(160, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_02_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(176, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_03_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(192, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_04_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(208, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_05_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(160, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_06_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(176, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_07_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(192, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_08_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(208, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_09_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(160, 192, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_10_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(176, 192, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_11_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(192, 192, 16, 16);
    public static BufferedImage TILE_MASONRY_HOUSE_12_SAND_FLOOR_RIGHT = Game.sprite.GetSprite(208, 192, 16, 16);

    public static BufferedImage TILE_MASONRY_BIG_HOUSE_01_SAND_FLOOR = Game.sprite.GetSprite(224, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_02_SAND_FLOOR = Game.sprite.GetSprite(240, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_03_SAND_FLOOR = Game.sprite.GetSprite(256, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_04_SAND_FLOOR = Game.sprite.GetSprite(272, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_05_SAND_FLOOR = Game.sprite.GetSprite(288, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_06_SAND_FLOOR = Game.sprite.GetSprite(304, 160, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_07_SAND_FLOOR = Game.sprite.GetSprite(224, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_08_SAND_FLOOR = Game.sprite.GetSprite(240, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_09_SAND_FLOOR = Game.sprite.GetSprite(256, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_10_SAND_FLOOR = Game.sprite.GetSprite(272, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_11_SAND_FLOOR = Game.sprite.GetSprite(288, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_12_SAND_FLOOR = Game.sprite.GetSprite(304, 176, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_13_SAND_FLOOR = Game.sprite.GetSprite(224, 192, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_14_SAND_FLOOR = Game.sprite.GetSprite(240, 192, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_15_SAND_FLOOR = Game.sprite.GetSprite(256, 192, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_16_SAND_FLOOR = Game.sprite.GetSprite(172, 192, 16, 16);
    public static BufferedImage TILE_MASONRY_BIG_HOUSE_17_SAND_FLOOR = Game.sprite.GetSprite(288, 192, 16, 16);

    public static BufferedImage TILE_ROOF_HOUSE_01_CRACKED_FLOOR = Game.sprite.GetSprite(224, 176, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_02_CRACKED_FLOOR = Game.sprite.GetSprite(240, 176, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_03_CRACKED_FLOOR = Game.sprite.GetSprite(256, 176, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_04_CRACKED_FLOOR = Game.sprite.GetSprite(224, 192, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_05_CRACKED_FLOOR = Game.sprite.GetSprite(240, 192, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_06_CRACKED_FLOOR = Game.sprite.GetSprite(256, 192, 16, 16);

    public static BufferedImage TILE_ROOF_HOUSE_01_GRASS_FLOOR = Game.sprite.GetSprite(272, 176, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_02_GRASS_FLOOR = Game.sprite.GetSprite(288, 176, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_03_GRASS_FLOOR = Game.sprite.GetSprite(304, 176, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_04_GRASS_FLOOR = Game.sprite.GetSprite(272, 192, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_05_GRASS_FLOOR = Game.sprite.GetSprite(288, 192, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_06_GRASS_FLOOR = Game.sprite.GetSprite(304, 192, 16, 16);

    public static BufferedImage TILE_ROOF_HOUSE_01_WATER_FLOOR = Game.sprite.GetSprite(272, 272, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_02_WATER_FLOOR = Game.sprite.GetSprite(288, 272, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_03_WATER_FLOOR = Game.sprite.GetSprite(304, 272, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_04_WATER_FLOOR = Game.sprite.GetSprite(272, 288, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_05_WATER_FLOOR = Game.sprite.GetSprite(288, 288, 16, 16);
    public static BufferedImage TILE_ROOF_HOUSE_06_WATER_FLOOR = Game.sprite.GetSprite(304, 288, 16, 16);

    private BufferedImage sprite;
    private int x, y;

    public Tile(int x, int y, BufferedImage sprite) {
        this.x = x;
        this.y = y;
        this.sprite = sprite;
    }

    public void render(Graphics g) {
        g.drawImage(sprite, x, y, null);
    }

}

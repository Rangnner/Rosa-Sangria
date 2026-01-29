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
    public static BufferedImage TILE_BUSH_CRACKED_FLOOR = Game.sprite.GetSprite(144, 16, 16, 16);
    public static BufferedImage TILE_DRY_BUSH_CRACKED_FLOOR = Game.sprite.GetSprite(144, 16, 16, 16);
    public static BufferedImage TILE_CACTUS_CRACKED_FLOOR = Game.sprite.GetSprite(144, 16, 16, 16);

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

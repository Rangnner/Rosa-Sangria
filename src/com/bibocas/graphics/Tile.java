package com.bibocas.graphics;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import com.bibocas.main.Game;

public class Tile {

    public static BufferedImage TILE_FLOOR = Game.sprite.GetSprite(80, 0, 16, 16);
    public static BufferedImage TILE_WALL = Game.sprite.GetSprite(80, 176, 16, 16);

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

package com.bibocas.world;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import javax.imageio.ImageIO;

import com.bibocas.entities.Entity;
import com.bibocas.entities.BulletPack;
import com.bibocas.entities.Macaco;
import com.bibocas.entities.Garrucha;
import com.bibocas.entities.LifePack;
import com.bibocas.graphics.Tile;
import com.bibocas.main.Game;

public class World {

    private Tile[] tiles;
    public static int WIDTH, HEIGHT;

    public World(String path) {
        try {
            BufferedImage map = ImageIO.read(getClass().getResource(path));
            int[] pixels = new int[map.getWidth() * map.getHeight()];
            WIDTH = map.getWidth();
            HEIGHT = map.getHeight();
            tiles = new Tile[map.getWidth() * map.getHeight()];
            map.getRGB(0, 0, map.getWidth(), map.getHeight(), pixels, 0, map.getWidth());
            for (int xx = 0; xx < map.getWidth(); xx++) {
                for (int yy = 0; yy < map.getHeight(); yy++) {
                    int pixelAtual = pixels[xx + (yy * map.getWidth())];
                    tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_GRASS_FLOOR);
                    if (pixelAtual == 0xFF000000) {
                        tiles[xx + (yy * WIDTH)] = new FloorTile(xx * 16, yy * 16, Tile.TILE_GRASS_FLOOR);
                    } else if (pixelAtual == 0xFFFFFFFF) {
                        tiles[xx + (yy * WIDTH)] = new WallTile(xx * 16, yy * 16, Tile.TILE_BTICK_WALL);
                    } else if (pixelAtual == 0xFF0000FF) {
                        Game.player.setX(xx * 16);
                        Game.player.setY(yy * 16);
                    } else if (pixelAtual == 0xFFFF0000) {
                        Game.entities.add(new Macaco(xx * 16, yy * 16, 16, 16, Entity.MACACO_EN));
                    } else if (pixelAtual == 0xFF00FF00) {
                        Game.entities.add(new BulletPack(xx * 16, yy * 16, 16, 16, Entity.BULLETPACK_EN));
                    } else if (pixelAtual == 0xFFFFFF00) {
                        Game.entities.add(new Garrucha(xx * 16, yy * 16, 16, 16, Entity.GARRUCHA_EN));
                    } else if (pixelAtual == 0xFFFF00FF) {
                        Game.entities.add(new LifePack(xx * 16, yy * 16, 16, 16, Entity.LIFEPACK_EN));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void render(Graphics g) {
        for (int xx = 0; xx < WIDTH; xx++) {
            for (int yy = 0; yy < HEIGHT; yy++) {
                Tile tile = tiles[xx + (yy * WIDTH)];
                tile.render(g);
            }
        }
    }

}

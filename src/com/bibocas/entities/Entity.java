package com.bibocas.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.bibocas.main.Game;

public class Entity {

	public static BufferedImage LIFEPACK_EN = Game.sprite.GetSprite(144, 0, 16, 16);
	public static BufferedImage BULLETPACK_EN = Game.sprite.GetSprite(128, 0, 16, 16);
	public static BufferedImage GARRUCHA_EN = Game.sprite.GetSprite(112, 0, 16, 16);
	public static BufferedImage MACACO_EN = Game.sprite.GetSprite(160, 0, 16, 16);

	protected double x;
	protected double y;
	protected int width;
	protected int height;

	private BufferedImage spriteSheet;

	public Entity(int x, int y, int width, int height, BufferedImage spriteSheet) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.spriteSheet = spriteSheet;
	}

	public int getX() {
		return (int) this.x;
	}

	public void setX(double newX) {
		this.x = newX;
	}

	public int getY() {
		return (int) this.y;
	}

	public void setY(double newY) {
		this.y = newY;
	}

	public int getWidth() {
		return this.width;
	}

	public int getHeight() {
		return this.height;
	}

	public void update() {

	}

	public void render(Graphics g) {
		g.drawImage(spriteSheet, this.getX(), this.getY(), null);
	}
}

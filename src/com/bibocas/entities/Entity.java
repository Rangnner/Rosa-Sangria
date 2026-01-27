package com.bibocas.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {

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

	public int GetX() {
		return (int) this.x;
	}

	public void SetX(double newX) {
		this.x = newX;
	}

	public int GetY() {
		return (int) this.y;
	}

	public void SetY(double newY) {
		this.y = newY;
	}

	public int GetWidth() {
		return this.width;
	}

	public int GetHeight() {
		return this.height;
	}

	public void update() {

	}

	public void render(Graphics g) {
		g.drawImage(spriteSheet, this.GetX(), this.GetY(), null);
	}
}

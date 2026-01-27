package com.bibocas.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Entity {

	public double x;
	public double y;
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

	public int GetY() {
		return (int) this.y;
	}

	public int GetWidth() {
		return this.width;
	}

	public int GetHeight() {
		return this.height;
	}

	public void SetX(int newX) {
		this.x = newX;
	}

	public void SetY(int newY) {
		this.y = newY;
	}

	public void Update() {

	}

	public void Render(Graphics g) {
		g.drawImage(spriteSheet, this.GetX(), this.GetY(), null);
	}
}

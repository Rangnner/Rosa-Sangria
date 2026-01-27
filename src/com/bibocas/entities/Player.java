package com.bibocas.entities;

import java.awt.image.BufferedImage;

public class Player extends Entity {

	public boolean right, left, up, down;
	public double speed = 1.5;

	public Player(int x, int y, int width, int height, BufferedImage spriteSheet) {
		super(x, y, width, height, spriteSheet);
	}

	public void update() {
		if (right) {
			x += speed;
		} else if (left) {
			x -= speed;
		} else if (up) {
			y -= speed;
		} else if (down) {
			y += speed;
		}
	}

}

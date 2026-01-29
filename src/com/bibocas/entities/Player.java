package com.bibocas.entities;

import java.awt.image.BufferedImage;
import java.awt.Graphics;
import com.bibocas.main.Game;

public class Player extends Entity {

	public boolean right, left, up, down;
	public double speed = 1.5;
	public int rightDir = 0, leftDir = 1, upDir = 2, downDir = 3;
	public int dir = downDir;

	private int frames = 0;
	private int maxFrames = 10;
	private int index = 0;
	private int maxIndex = 3;
	private boolean moved = false;

	private BufferedImage[] rightPlayer;
	private BufferedImage[] leftPlayer;
	private BufferedImage[] upPlayer;
	private BufferedImage[] downPlayer;

	public Player(int x, int y, int width, int height, BufferedImage spriteSheet) {
		super(x, y, width, height, spriteSheet);
		rightPlayer = new BufferedImage[4];
		leftPlayer = new BufferedImage[4];
		upPlayer = new BufferedImage[4];
		downPlayer = new BufferedImage[4];

		for (int i = 0; i < 4; i++) {
			rightPlayer[i] = Game.sprite.GetSprite(0 + (i * 16), 48, 16, 16);
			leftPlayer[i] = Game.sprite.GetSprite(0 + (i * 16), 64, 16, 16);
			upPlayer[i] = Game.sprite.GetSprite(0 + (i * 16), 32, 16, 16);
			downPlayer[i] = Game.sprite.GetSprite(0 + (i * 16), 16, 16, 16);
		}

	}

	public void update() {

		moved = false;

		if (right) {
			moved = true;
			dir = rightDir;
			x += speed;
		} else if (left) {
			moved = true;
			dir = leftDir;
			x -= speed;
		} else if (up) {
			moved = true;
			dir = upDir;
			y -= speed;
		} else if (down) {
			moved = true;
			dir = downDir;
			y += speed;
		}

		if (moved) {
			frames++;
			if (frames == maxFrames) {
				frames = 0;
				index++;
				if (index > maxIndex) {
					index = 0;
				}
			}
		}

	}

	public void render(Graphics g) {
		if (dir == rightDir) {
			g.drawImage(rightPlayer[index], this.getX(), this.getY(), null);
		} else if (dir == leftDir) {
			g.drawImage(leftPlayer[index], this.getX(), this.getY(), null);
		} else if (dir == upDir) {
			g.drawImage(upPlayer[index], this.getX(), this.getY(), null);
		} else if (dir == downDir) {
			g.drawImage(downPlayer[index], this.getX(), this.getY(), null);
		}
	}

}

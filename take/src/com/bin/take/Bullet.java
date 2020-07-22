package com.bin.take;

import java.awt.Color;
import java.awt.Graphics;

/**
 * �ӵ���
 * @author Administrator
 *
 */
public class Bullet {
	//�ٶ�
	private static final int SPEED = 10;
	//���Ϳ�
	private static int WINTH = 30, HEIGHT = 30;
	//λ��
	private int x, y;
	//����
	private Dir dir;

	public Bullet(int x, int y, Dir dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
	}

	public void paint(Graphics g) {
		//��ȡ��ɫ���ȸ�ֵΪred����ָ���ֵ
		Color c = g.getColor();
		g.setColor(Color.RED);
		//��һ��Բ���ڵ�
		g.fillOval(x, y, WINTH, HEIGHT);
		g.setColor(c);
		move();
	}

	private void move() {
		switch (dir) {
		case LEFT:
			x -= SPEED;
			break;
		case UP:
			y -= SPEED;
			break;
		case RIGHT:
			x += SPEED;
			break;
		case DOWN:
			y += SPEED;
			break;

		}
	}
}

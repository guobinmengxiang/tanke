package com.bin.take;

import java.awt.Color;
import java.awt.Graphics;

/**
 * 子弹类
 * @author Administrator
 *
 */
public class Bullet {
	//速度
	private static final int SPEED = 1;
	//长和宽
	private static int WINTH = 30, HEIGHT = 30;
	//位置
	private int x, y;
	//方向
	private Dir dir;
	//子弹是否存活
	private boolean live = true;
	TankFrame tf = null;
	public Bullet(int x, int y, Dir dir,TankFrame tf) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
		this.tf=tf;
	}

	public void paint(Graphics g) {
		//如果子弹消亡则直接remove掉
		if(!live) {
			tf.bullets.remove(this);
		}
		//获取颜色，先赋值为red，后恢复赋值
		Color c = g.getColor();
		g.setColor(Color.RED);
		//画一个圆形炮弹
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
		//设置子弹消亡条件
		if(x < 0 || y < 0 || x > TankFrame.GAME_WIDTH || y > TankFrame.GAME_HEIGHT) live = false;
	}
}

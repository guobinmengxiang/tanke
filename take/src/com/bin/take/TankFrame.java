package com.bin.take;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	//初始化一个坦克
	Tank myTank = new Tank(200, 200, Dir.DOWN);
	
	/**
	 * 画布
	 */
	public TankFrame() {
		//画布大小
		setSize(800, 600);
		//把窗口固定，不允许拖拽改变大小
		setResizable(false);
		//title
		setTitle("tank war");
		//画好不显示
		setVisible(true);
		
		this.addKeyListener(new MyKeyListener());
		
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	/* 一支画笔， 会被自动调用
	 * 画了个黑方块，
	 * 改变坐标，使其移动
	 * 改变坐标，使其移动 
	 * 根据按键进行移动
	 * 
	 */
	@Override
	public void paint(Graphics g) {
		//坦克自己画自己
		myTank.paint(g);
		
	}
	
	
	class MyKeyListener extends KeyAdapter {
		
		boolean bL = false;
		boolean bU = false;
		boolean bR = false;
		boolean bD = false;

		/* 
		 * 获取按键
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_LEFT:
				bL = true;
				break;
			case KeyEvent.VK_UP:
				bU = true;
				break;
			case KeyEvent.VK_RIGHT:
				bR = true;
				break;
			case KeyEvent.VK_DOWN:
				bD = true;
				break;

			default:
				break;
			}
			
			setMainTankDir();
		}

		@Override
		public void keyReleased(KeyEvent e) {
			int key = e.getKeyCode();
			switch (key) {
			case KeyEvent.VK_LEFT:
				bL = false;
				break;
			case KeyEvent.VK_UP:
				bU = false;
				break;
			case KeyEvent.VK_RIGHT:
				bR = false;
				break;
			case KeyEvent.VK_DOWN:
				bD = false;
				break;

			default:
				break;
			}
			
			setMainTankDir();
		}

		/**
		 * 根据按键给方向赋值
		 */
		private void setMainTankDir() {
			if(bL) myTank.setDir(Dir.LEFT);
			if(bU) myTank.setDir(Dir.UP);
			if(bR) myTank.setDir(Dir.RIGHT);
			if(bD) myTank.setDir(Dir.DOWN);
		}
		
	}
	
	
}
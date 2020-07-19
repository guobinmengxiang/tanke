package com.bin.take;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankeFrame extends Frame{
	int x=200 ,y=200;
	public TankeFrame(){
		  setSize(800, 600);
		  //把窗口固定，不允许拖拽改变大小
		  setResizable(false);
		  //窗口title
		  setTitle("tank");
		  // 让窗口显示出来
		  setVisible(true);
		  this.addKeyListener(new MykeyListener());
		  //写一个监听器，监视点击X，如果点击了，则退出
		  addWindowListener(new WindowAdapter(){
			  @Override
			  public void windowClosing(WindowEvent e){
				  System.exit(0);
			  }
		  });
	}
	
	/* 一支画笔， 会被自动调用
	 * 画了个黑方块，
	 * 改变坐标，使其移动
	 */
	@Override
	public void paint(Graphics g){
		g.fillRect(x, y, 50, 50);
		x+=10;
		y+=10;
		
	
	}
	class MykeyListener extends KeyAdapter{

		/* 
		 * 一个键被按下去执行
		 */
		@Override
		public void keyPressed(KeyEvent arg0) {
			
		}

		/* 
		 * 一个键被抬起时调用
		 */
		@Override
		public void keyReleased(KeyEvent arg0) {
		}
		
	}

}

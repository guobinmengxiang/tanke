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
		
	
	}
	class MykeyListener extends KeyAdapter{
		boolean bL=false;
		boolean bU=false;
		boolean bR=false;
		boolean bD=false;

		/* 
		 * 一个键被按下去执行
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			//获取按键
			int key =e.getKeyCode();
			switch(key){
			case KeyEvent.VK_LEFT:
				bL=true;
				break;
			case KeyEvent.VK_UP:
				bU=true;
				break;
			case KeyEvent.VK_RIGHT:
				bR=true;
				break;
			case KeyEvent.VK_DOWN:
				bD=true;
				break;
			default:
				break;
			}

		}

		/* 
		 * 一个键被抬起时调用
		 */
		@Override
		public void keyReleased(KeyEvent k) {
			int key =k.getKeyCode();
			switch(key){
		case KeyEvent.VK_LEFT:
			bL=false;
			break;
		case KeyEvent.VK_UP:
			bU=false;
			break;
		case KeyEvent.VK_RIGHT:
			bR=false;
			break;
		case KeyEvent.VK_DOWN:
			bD=false;
			break;
		default:
			break;
		}
		}
		
	}

}

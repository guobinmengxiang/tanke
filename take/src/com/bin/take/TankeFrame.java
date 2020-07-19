package com.bin.take;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankeFrame extends Frame{
	
	public TankeFrame(){
		  setSize(800, 600);
		  //把窗口固定，不允许拖拽改变大小
		  setResizable(false);
		  //窗口title
		  setTitle("tank");
		  // 让窗口显示出来
		  setVisible(true);
		  //写一个监听器，监视点击X，如果点击了，则退出
		  
		  addWindowListener(new WindowAdapter(){
			  @Override
			  public void windowClosing(WindowEvent e){
				  System.exit(0);
			  }
		  });
	}
	@Override
	public void paint(Graphics g){
		g.fillRect(200, 200, 50, 50);
	}
	

}

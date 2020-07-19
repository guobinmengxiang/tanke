package com.bin.take;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {

	public static void main(String[] args) {
	 //创建一个窗口
	  Frame f = new Frame();
	 //设置窗口大小
	  f.setSize(800, 600);
	  //把窗口固定，不允许拖拽改变大小
	  f.setResizable(false);
	  //窗口title
	  f.setTitle("tank");
	  // 让窗口显示出来
	  f.setVisible(true);
	  //写一个监听器，监视点击X，如果点击了，则退出
	  f.addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent e){
			  System.exit(0);
		  }
	  });

	}

}

package com.bin.take;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankeFrame extends Frame{
	
	public TankeFrame(){
		  setSize(800, 600);
		  //�Ѵ��ڹ̶�����������ק�ı��С
		  setResizable(false);
		  //����title
		  setTitle("tank");
		  // �ô�����ʾ����
		  setVisible(true);
		  //дһ�������������ӵ��X���������ˣ����˳�
		  
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

package com.bin.take;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class T {

	public static void main(String[] args) {
	 //����һ������
	  Frame f = new Frame();
	 //���ô��ڴ�С
	  f.setSize(800, 600);
	  //�Ѵ��ڹ̶�����������ק�ı��С
	  f.setResizable(false);
	  //����title
	  f.setTitle("tank");
	  // �ô�����ʾ����
	  f.setVisible(true);
	  //дһ�������������ӵ��X���������ˣ����˳�
	  f.addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent e){
			  System.exit(0);
		  }
	  });

	}

}

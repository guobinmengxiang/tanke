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
		  //�Ѵ��ڹ̶�����������ק�ı��С
		  setResizable(false);
		  //����title
		  setTitle("tank");
		  // �ô�����ʾ����
		  setVisible(true);
		  this.addKeyListener(new MykeyListener());
		  //дһ�������������ӵ��X���������ˣ����˳�
		  addWindowListener(new WindowAdapter(){
			  @Override
			  public void windowClosing(WindowEvent e){
				  System.exit(0);
			  }
		  });
	}
	
	/* һ֧���ʣ� �ᱻ�Զ�����
	 * ���˸��ڷ��飬
	 * �ı����꣬ʹ���ƶ�
	 */
	@Override
	public void paint(Graphics g){
		g.fillRect(x, y, 50, 50);
		x+=10;
		y+=10;
		
	
	}
	class MykeyListener extends KeyAdapter{

		/* 
		 * һ����������ȥִ��
		 */
		@Override
		public void keyPressed(KeyEvent arg0) {
			
		}

		/* 
		 * һ������̧��ʱ����
		 */
		@Override
		public void keyReleased(KeyEvent arg0) {
		}
		
	}

}

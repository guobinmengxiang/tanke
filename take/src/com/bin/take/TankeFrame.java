package com.bin.take;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankeFrame extends Frame{
	int x=200 ,y=200; 
	//̹�˵ĳ�ʼ����
	Dir dir =Dir.DOWN;
	//̹�˵��ٶ�
	private static final int SPEED=10;
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
	 * ���ݰ��������ƶ�
	 * 
	 */
	@Override
	public void paint(Graphics g){
		g.fillRect(x, y, 50, 50);
		switch(dir){
		case LEFT:
			x-=SPEED;
			break;
		case UP:
			y-=SPEED;
			break;
		case RIGHT:
			x+=SPEED;
			break;
		case DOWN:
			y+=SPEED;
			break;
		}
	
	}
	class MykeyListener extends KeyAdapter{
		boolean bL=false;
		boolean bU=false;
		boolean bR=false;
		boolean bD=false;

		/* 
		 * һ����������ȥִ��
		 */
		@Override
		public void keyPressed(KeyEvent e) {
			//��ȡ����
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
setMainTankDir();
		}

		/**
		 * ����������ֵ
		 */
		private void setMainTankDir() {
		if(bL) dir =Dir.LEFT;
		if(bU) dir =Dir.UP;
		if(bR) dir =Dir.RIGHT;
		if(bD) dir =Dir.DOWN;
		}

		/* 
		 * һ������̧��ʱ����
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
			setMainTankDir();
		}
		
	}

}

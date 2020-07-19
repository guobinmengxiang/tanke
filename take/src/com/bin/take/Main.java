package com.bin.take;
public class Main {

	public static void main(String[] args) throws InterruptedException {
          TankeFrame tf = new TankeFrame();
         
         while(true){
        	 Thread.sleep(50);
        	 tf.repaint();
         }
	}

}

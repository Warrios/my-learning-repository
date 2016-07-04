package application;

import java.awt.EventQueue;

import windows.FrameClass;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("Standard Hello World message!");
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				FrameClass ramka = new FrameClass();
				
			}
			
		});

	}

}

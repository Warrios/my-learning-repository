package windows;

import java.awt.Dimension;

import javax.swing.JFrame;

public class FrameClass extends JFrame {

	public FrameClass(){
		super("Ramka");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(300,300));
	}
	
}

package windows;

import java.awt.Dimension;

import javax.swing.JFrame;

import panels.PanelClass;

public class FrameClass extends JFrame {

	PanelClass panel;
	public FrameClass(){
		super("Ramka");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(300,300));
		panel = new PanelClass();
		add(panel);
		pack();
	}
	
}

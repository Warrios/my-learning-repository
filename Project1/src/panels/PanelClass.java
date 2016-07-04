package panels;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelClass extends JPanel{

	JButton but1;
	JButton but2;
	JButton but3;
	
	public PanelClass(){
		super();
		but1 = new JButton("A");
		but2 = new JButton("B");
		but3 = new JButton("C");
		setLayout(new GridLayout(3,0));
		add(but1);
		add(but2);
		add(but3);
		
		
	}
	
}

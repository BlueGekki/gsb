import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Fenetre extends JFrame implements ActionListener{
	
	private JPanel monPanel;
	
	public Fenetre(){
		
		this.setTitle("GSB");
		this.setSize(800,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
				
		monPanel = new JPanel();
		
		this.getContentPane().add(monPanel);	
		this.setVisible(true);		
	}

	public void actionPerformed(ActionEvent e) {

	}

}

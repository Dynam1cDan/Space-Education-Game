

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;

public class Space extends JFrame {
	
	
	public Space() {
		initUI();
	}
	
	private void initUI() {
		add(new Board());

		setResizable(false);
		pack();
		
		setTitle("Space Education Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		JFrame s = new Space();
		s.setVisible(true);
	}

}

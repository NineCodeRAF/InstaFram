package app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import view.AboutView;
import view.MainFrame;

public class Main {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		} 
		MainFrame.getInstance();
	}

}

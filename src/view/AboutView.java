package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class AboutView extends JDialog{
	JLabel lbName;
	JLabel lbIndex;
	JButton btnClose;
	JLabel image;
	JPanel panel;
	private static AboutView instance = null;
	public AboutView() {
		
		// TODO Auto-generated constructor stub
		lbName = new JLabel("Ime: Nikola Adamovic");
		lbIndex = new JLabel("Indeks: RN42/17");
		image = new JLabel(new ImageIcon("images/ja.png"));
		panel = new JPanel();
		panel.add(lbName);
		panel.add(lbIndex);
		panel.setLayout(new GridLayout(2, 1));
		add(panel);
		add(image);
		setSize(300, 500);
		setResizable(false);
		setLayout(new GridLayout(2, 1));
		
		setIconImage(new ImageIcon("images/link.png").getImage());
		setTitle("About");
		setLocationRelativeTo(MainFrame.getInstance());
	}
	
	public static AboutView getInstance() {
		if(instance == null) instance = new AboutView();
		return instance;
	}
}

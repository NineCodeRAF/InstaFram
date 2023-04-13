package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MenuBar;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToolBar;

import actions.ActionManager;
import model.observer.ObsList;

public class MainFrame extends JFrame{
	private static MainFrame instance = null;
	private Toolkit tk;
	private JMenuBar menuBar;
	private JPanel jpTop;
	private JToolBar tb;
	
	private CentarFrame splitPanel = new CentarFrame();
	private BotPanel bottomPanel = new BotPanel();
	private JPanel leftPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	
	private ObsList obsList = new ObsList();
	
	public MainFrame() {
		tk = Toolkit.getDefaultToolkit();
		menuBar = new view.menu.MenuBar();
		jpTop = new JPanel();
		tb = new ToolBar(1);
		Dimension screenSize = tk.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth/2, screenHeight/2);
		setJMenuBar(menuBar);
		
		
		add(tb,BorderLayout.NORTH);
		add(splitPanel, BorderLayout.CENTER);
		add(bottomPanel, BorderLayout.SOUTH);
		add(leftPanel, BorderLayout.WEST);
		add(rightPanel, BorderLayout.EAST);
		
		setIconImage(new ImageIcon("images/link.png").getImage());
		setTitle("InstaFram");
		setVisible(true);
		setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		closeMethod();
		
		
	}
	
	private void closeMethod()
	{
		addWindowListener(new WindowAdapter() {
			  public void windowClosing(WindowEvent e) {
				    int confirmed = JOptionPane.showConfirmDialog(null, 
				        "Do you want exit?", "Exit",
				        JOptionPane.YES_NO_OPTION);

				    if (confirmed == JOptionPane.YES_OPTION) {
				    	AboutView.getInstance().dispose();
					    HelpView.getInstance().dispose();
				        dispose();
				      
				    }
				  }
				});
	}
	
	public ObsList getObsList() {
		return obsList;
	}
	
	public static MainFrame getInstance() {
		if (instance == null) instance = new MainFrame();
		return instance;
	}
	
	public CentarFrame getSplitPanel() {
		return splitPanel;
	}
}

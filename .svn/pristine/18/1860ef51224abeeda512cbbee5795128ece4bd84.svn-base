package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.plaf.SplitPaneUI;
import javax.swing.plaf.basic.BasicBorders.SplitPaneBorder;

public class CentarFrame extends JSplitPane{
	private JPanel leftPanel = new JPanel();
	private GridLayout grid = new GridLayout(2, 1);
	private JPanel rightPanelTop = new JPanel();
	private JPanel rightPanel = new JPanel();

	private ToolBar toolBar = new ToolBar(2);
	
	private Tree tree = new Tree();
	private FlowLayout lpFlow = new FlowLayout(FlowLayout.LEADING);
	private RightBot rightBot = new RightBot();
	private TabView tab = new TabView();
	private JScrollPane scrollPane = new JScrollPane(tab);
	
	public CentarFrame () {
		setLeftComponent(leftPanel);
		setRightComponent(rightPanel);
		
		getLeftComponent().setMinimumSize(new Dimension(200, 1));
		
		FlowLayout leftLayout = (FlowLayout) leftPanel.getLayout();
		leftLayout.setHgap(150);
		
		
		rightPanelTop.setLayout(new BorderLayout());

		rightPanelTop.setMinimumSize(new Dimension(1, 100));
		rightPanelTop.add(scrollPane, BorderLayout.CENTER);
		rightPanelTop.add(toolBar, BorderLayout.NORTH);
		
		rightPanel.setLayout(grid);
		rightPanel.add(rightPanelTop);
		rightPanel.add(rightBot);
		
		
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		
		leftPanel.add(tree);
		leftPanel.setLayout(lpFlow);
		leftPanel.setBackground(Color.WHITE);
		
	}
	
	public RightBot getRightBot() {
		return rightBot;
	}
	
	public TabView getTab() {
		return tab;
	}
	
	public Tree getTree() {
		return tree;
	}
}

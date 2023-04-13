package view;

import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class RightBot extends JPanel{
	private JLabel lbName = new JLabel("Name: ");
	private JLabel lbParent = new JLabel("Name of parent: ");
	private JLabel lbLeaf = new JLabel("Number of leafs: ");
	private JLabel lbChildren = new JLabel("Number of children");
	private JTextArea textArea = new JTextArea();
	private JScrollPane scroll = new JScrollPane(textArea);
	
	public RightBot() {
		addComponents();
	}
	
	private void addComponents()
	{
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		textArea.setFont(new Font("Arial", Font.PLAIN, 14));
		textArea.setEditable(false);
		add(lbName);
		add(lbParent);
		add(lbChildren);
		add(lbLeaf);
		add(scroll);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	}
	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
	
	public JTextArea getTextArea() {
		return textArea;
	}
	
	public JLabel getLbChildren() {
		return lbChildren;
	}
	public JLabel getLbLeaf() {
		return lbLeaf;
	}
	public JLabel getLbName() {
		return lbName;
	}
	public JLabel getLbParent() {
		return lbParent;
	}

}

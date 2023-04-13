



package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

import model.myTree.MyTreeNode;
import view.MainFrame;
import view.TabView;

public class MyListener implements KeyListener{

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		String text = ((JTextArea)arg0.getSource()).getText();
		TabView tabView = MainFrame.getInstance().getSplitPanel().getTab();
		int index = MainFrame.getInstance().getSplitPanel().getTab().getSelectedIndex();
		MyTreeNode selected = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getLastSelectedPathComponent();
		tabView.setText(text, index);
		selected.setNodeBookText(text);
		MainFrame.getInstance().getObsList().notifyObserver("key", tabView, index);
		MainFrame.getInstance().getObsList().notifyObserver("node", "", selected);
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}

package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import model.myTree.MyTreeNode;
import view.MainFrame;
import view.TabView;

public class OpenTab extends MouseAdapter{
	
	private MyTreeNode selected = null;
	private TabView tab = null;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		MyTreeNode selected = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getLastSelectedPathComponent();
		tab = MainFrame.getInstance().getSplitPanel().getTab();
		if(e.getClickCount() == 1)
		{
			tab.openTab(selected);
			MainFrame.getInstance().getObsList().notifyObserver("node","", selected);
		}
	}

}

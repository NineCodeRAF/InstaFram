package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.MenuItem;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import actions.ActionManager;
import view.menu.MenuTools;

public class ToolBar extends JToolBar {
	
	
	public ToolBar(int x) {
		dodaj(x);
	}
	
	private void dodaj(int x)
	{
		if(x==1) {
			add(ActionManager.getInstance().getOpenFile());
			add(ActionManager.getInstance().getAddNode());
			add(ActionManager.getInstance().getDeleteNode());
			add(ActionManager.getInstance().getSave());
			add(ActionManager.getInstance().getSaveAs());
		}
		else
			add(ActionManager.getInstance().getCloseTab());
	}
	

}

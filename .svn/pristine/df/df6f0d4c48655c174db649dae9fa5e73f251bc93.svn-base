package view.menu;

import javax.swing.JMenu;
import javax.swing.JMenuItem;

import actions.ActionManager;

public class MenuFile extends JMenu{
	
	
	
	public MenuFile() {
		 setText("File");
		 addComp();
	}
	
	
	
	
	private void addComp()
	{
		add(ActionManager.getInstance().getOpenFile());
		addSeparator();
		add(ActionManager.getInstance().getAddNode());
		add(ActionManager.getInstance().getDeleteNode());
		addSeparator();
		add(ActionManager.getInstance().getSave());
		add(ActionManager.getInstance().getSaveAs());
		
		
	}
	
}

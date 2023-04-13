package view;


import javax.swing.JTree;

import actions.ActionManager;
import controller.TreeCellEditor;
import model.MyTreeModel;

public class Tree extends JTree{
	private TreeCellEditor editor;
	public Tree() {
		//MyTreeModel tModel = new MyTreeModel();
		//tModel=ActionManager.getInstance().getReadFromFile().func("Tree.txt");
		editor = new TreeCellEditor(this, new TreeCellRenderer());
		this.setModel(null);
		this.setCellEditor(editor);
		this.setCellRenderer(new TreeCellRenderer());
		this.setEditable(true);
		this.setInvokesStopCellEditing(true);
		addMouseListener(new ActionManager().getOpenTab());
	}

	public void removeRoot() {
		MyTreeModel model = (MyTreeModel) getModel();
		model.getRoot().removeAllChildren();
		model.removeAll();
		model.removeRoot();
		model.reload();
		setModel(null);
		
		
		
	}

	
	
}

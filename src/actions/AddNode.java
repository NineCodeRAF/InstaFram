package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import model.MyTreeModel;
import model.myTree.MyTreeNode;
import view.MainFrame;

public class AddNode extends AbstractActions{

	public AddNode() {
		// TODO Auto-generated method stub
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/add.png"));
		putValue(NAME, "New project");
		putValue(SHORT_DESCRIPTION, "New project");
	}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	MyTreeNode selectedNode = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getLastSelectedPathComponent();
	MyTreeNode root;
	if((MainFrame.getInstance().getSplitPanel().getTree().getModel()) == null)
	{
		//MyTreeModel model = new MyTreeModel();
		MainFrame.getInstance().getSplitPanel().getTree().setModel(new MyTreeModel());
		root = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getModel().getRoot();
		MainFrame.getInstance().getObsList().notifyObserver("node", "", root);
	}
	else {
	if(selectedNode==null) {
		root = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getModel().getRoot();
		root.addNode(new MyTreeNode("Project "+(root.getChildCount()+1)));
		MainFrame.getInstance().getObsList().notifyObserver("node", "", root);
	}
	else
		selectedNode.addNode(new MyTreeNode("Project " + (selectedNode.getChildCount()+1)));
		MainFrame.getInstance().getObsList().notifyObserver("node", "", selectedNode);
	}
	
	SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getSplitPanel().getTree());
}
	

}

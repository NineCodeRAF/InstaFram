package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import model.MyTreeModel;
import model.myTree.MyTreeNode;
import model.observer.Obs;
import view.MainFrame;
import view.TabView;

public class DeleteNode extends AbstractActions implements Obs{

	public DeleteNode() {
		// TODO Auto-generated method stub
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_D, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/delete.png"));
		putValue(NAME, "Delete project");
		putValue(SHORT_DESCRIPTION, "Delete project");
	}

@Override
public void actionPerformed(ActionEvent e) {
	Object selectedNode =  MainFrame.getInstance().getSplitPanel().getTree().getLastSelectedPathComponent();
	/*if(selectedNode!=null) {
	if(selectedNode == (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getModel().getRoot())
		MainFrame.getInstance().getSplitPanel().getTree().removeRoot();
	else
		selectedNode.removeFromParent();
	SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getSplitPanel().getTree());*/
	if(selectedNode instanceof MyTreeNode)
		deleteAlert(selectedNode);
	//}
}

@Override
public void update(String str, Object obj1, Object obj2) {
	// TODO Auto-generated method stub
	if(str.equals("delete"))
	{
		if(obj1 instanceof MyTreeNode)
		{
			TabView tabView = MainFrame.getInstance().getSplitPanel().getTab();
			MyTreeNode node = (MyTreeNode) obj1;
			try {
				if(tabView.getNodes().size()!=0 && tabView.getNodes().contains(node))
				{
					int index = tabView.getNodes().indexOf(node);
					tabView.getNodes().remove(node);
					tabView.removeTabAt(index);
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
}
	public void deleteAlert(Object obj)
	{
		MyTreeNode selected = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getLastSelectedPathComponent();
		JLabel lbChildren = new JLabel("Number of children: "+selected.getChildCount());
		JLabel lbLeaf = new JLabel("Number of leafs: "+selected.getLeafCount());
		int dialog2 = JOptionPane.showConfirmDialog(null, "You really want to delete nodes?\n"+lbChildren.getText()+"\n"+lbLeaf.getText(),"Alert",JOptionPane.YES_NO_OPTION);
		if(dialog2 == JOptionPane.YES_OPTION) {
			if(((MyTreeNode)obj)!=null) {
				if(((MyTreeNode)obj) == (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getModel().getRoot()) {
					MainFrame.getInstance().getSplitPanel().getTree().removeRoot();
					MainFrame.getInstance().getSplitPanel().getTree().setModel(null);
					}
				else
					((MyTreeNode)obj).removeFromParent();
				SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getSplitPanel().getTree());
				update("delete", obj, "");
		}
	}


}
}

package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

import model.myTree.MyTreeNode;
import view.MainFrame;
import view.TabView;

public class CloseTab extends AbstractActions{
	
	public CloseTab() {
		// TODO Auto-generated method stub
		putValue(SMALL_ICON, loadIcon("images/delete.png"));
		putValue(NAME, "Close tab");
		putValue(SHORT_DESCRIPTION, "Close tab");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		TabView tabView = MainFrame.getInstance().getSplitPanel().getTab();
		MyTreeNode selected = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getLastSelectedPathComponent();
		int index = tabView.getSelectedIndex();
		try {
			if(tabView.getNodes().size()!=0 && tabView.getNodes().get(index).equals(selected))
			{
				tabView.getNodes().remove(selected);
				tabView.removeTabAt(index);
			}
			else if(tabView.getNodes().size() != 0)
			{
				selected = tabView.getNodes().get(index);
				tabView.getNodes().remove(selected);
				tabView.removeTabAt(index);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

}

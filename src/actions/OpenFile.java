package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

import model.myTree.MyTreeNode;
import view.MainFrame;

public class OpenFile extends AbstractActions{
	public OpenFile() {
		// TODO Auto-generated constructor stub
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/new_folder.png"));
		putValue(NAME, "Open file");
		putValue(SHORT_DESCRIPTION, "Open File");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		MyTreeNode selectedNode = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getLastSelectedPathComponent();
		if(selectedNode == null) {
			//MainFrame.getInstance().getSplitPanel().getTree().setModel(null);
			MainFrame.getInstance().getSplitPanel().getTree().setModel(ActionManager.getInstance().readFromFile.funcNovi());
		}
		else
			ActionManager.getInstance().readFromFile.funcDodaj(selectedNode);
		SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getSplitPanel().getTree());
	}

}

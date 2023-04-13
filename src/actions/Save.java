package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class Save extends AbstractActions{
	
	public Save() {
		// TODO Auto-generated method stub
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/save.png"));
		putValue(NAME, "Save");
		putValue(SHORT_DESCRIPTION, "Save");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		ActionManager.getInstance().getWriteInFIle().save();
	}

}

package actions;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.KeyStroke;

public class SaveAs extends AbstractActions{
	
	public SaveAs() {
		// TODO Auto-generated method stub
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		putValue(SMALL_ICON, loadIcon("images/save_as.png"));
		putValue(NAME, "Save as");
		putValue(SHORT_DESCRIPTION, "Save as");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		ActionManager.getInstance().getWriteInFIle().saveAs();
		
	}

}

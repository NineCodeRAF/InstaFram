package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AboutView;
import view.MainFrame;

public class AboutListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		AboutView.getInstance().setVisible(true);;
	}

}

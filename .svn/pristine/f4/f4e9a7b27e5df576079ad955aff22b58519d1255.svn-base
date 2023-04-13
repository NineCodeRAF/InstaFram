package actions;

import java.awt.Image;
import java.net.URL;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class AbstractActions extends AbstractAction{
	
	public Icon loadIcon(String fileName){
		Icon icon = new ImageIcon(((new ImageIcon(fileName)).getImage().getScaledInstance(24, 24, Image.SCALE_SMOOTH)));
		return icon;
	}
}

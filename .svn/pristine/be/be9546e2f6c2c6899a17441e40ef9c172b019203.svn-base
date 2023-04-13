package view;

import java.awt.Component;
import java.awt.Image;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;


public class TreeCellRenderer extends DefaultTreeCellRenderer{
	
	public TreeCellRenderer() {
		// TODO Auto-generated constructor stub
	}
	
	public Component getTreeCellRendererComponent(
            JTree tree,
            Object value,
            boolean selected,
            boolean expanded,
            boolean leaf,
            int row,
            boolean hasFocus) {
                super.getTreeCellRendererComponent(tree, value, selected,expanded, leaf, row,hasFocus);
                
           
           if (leaf) {
        	   if(selected)
        		   setIcon(new ImageIcon(((new ImageIcon("images/crni_list.png")).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH))));
        	   else
        		   setIcon(new ImageIcon(((new ImageIcon("images/paper.png")).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH))));
           } 
           else  {
        	   if(expanded) {
        		   if(selected)
        			   setIcon(new ImageIcon(((new ImageIcon("images/crni_open_folder.png")).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH))));
        		   else
        			   setIcon(new ImageIcon(((new ImageIcon("images/open_folder.png")).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH))));
        	   }
        	   else
        	   {
        		   if(selected)
        			   setIcon(new ImageIcon(((new ImageIcon("images/crni_folder.png")).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH))));
        		   else
        			   setIcon(new ImageIcon(((new ImageIcon("images/folder.png")).getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH))));
        	   }
                 
          } 
           
         
           
          return this;
}

}

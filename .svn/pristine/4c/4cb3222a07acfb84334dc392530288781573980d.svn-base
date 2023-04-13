package view;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

import controller.MyListener;
import model.myTree.MyTreeNode;

public class TabView extends JTabbedPane{
	
	private ArrayList<MyTreeNode> nodes = new ArrayList<>();
	public void openTab(MyTreeNode node)
	{
		JTextArea tabArea = new JTextArea();
		tabArea.setFont(new Font("Arial", Font.PLAIN, 14));
		if(!nodes.contains(node))
		{
			nodes.add(getTabCount(), node);
			addTab(node.toString(), tabArea);
			setSelectedComponent(tabArea);
			tabArea.addKeyListener(new MyListener());
			tabArea.setText(node.getNodeBook().getText());
		}
		else setSelectedComponent(this.getComponentAt(nodes.indexOf(node)));
		
		
	}
	
	public void setText(String str, int index)
	{
		JTextArea textArea = (JTextArea)(getComponentAt(index));
		textArea.setText(str);
	}
	
	public ArrayList<MyTreeNode> getNodes() {
		return nodes;
	}
	
	public void setNodeName(MyTreeNode beforeNode, MyTreeNode tempNode)
	{
		if(nodes.contains(beforeNode))
		{
			int index = nodes.indexOf(beforeNode);
			setTitleAt(index, tempNode.toString());
		}
	}

}

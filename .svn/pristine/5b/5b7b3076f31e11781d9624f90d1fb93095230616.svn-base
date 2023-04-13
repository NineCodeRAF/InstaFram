package model.myTree;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

import model.observer.Obs;
import model.observer.ObsList;
import view.MainFrame;
import view.RightBot;
import view.TabView;
import view.Tree;

public class MyTreeNode extends DefaultMutableTreeNode implements Obs{
	
	private ArrayList<MyTreeNode> children = new ArrayList<>();
	private MyTreeNode parent;
	private String name;
	private ObsList obsList = MainFrame.getInstance().getObsList();
	private JTextArea nodeBook = new JTextArea();
	
	public MyTreeNode(String name) {
		this.name=name;
		obsList.register((Obs) this);
		
	}

	@Override
	public Enumeration children() {
		// TODO Auto-generated method stub
		return Collections.enumeration(children);
	}

	@Override
	public boolean getAllowsChildren() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public TreeNode getChildAt(int childIndex) {
		// TODO Auto-generated method stub
		return children.get(childIndex);
	}

	@Override
	public int getChildCount() {
		// TODO Auto-generated method stub
		return children.size();
	}

	@Override
	public int getIndex(TreeNode node) {
		// TODO Auto-generated method stub
		return children.indexOf(node);
	}

	@Override
	public MyTreeNode getParent() {
		// TODO Auto-generated method stub
		return parent;
	}

	
	public ArrayList<MyTreeNode> getChildren() {
		return children;
	}

	@Override
	public void insert(MutableTreeNode child, int index) {
		if(this.children.contains(child))
		{
			this.children.remove(child);
		}
		
		this.children.add(index, (MyTreeNode)child);
		
		
	}

	@Override
	public void remove(int index) {
		this.children.get(index).setParent(null);
		this.children.remove(index);
		
	}

	@Override
	public void remove(MutableTreeNode node) {

		this.children.get(this.children.indexOf(node)).setParent(null);
		this.children.remove(node);
	}

	@Override
	public void removeFromParent() {
		
		parent.remove(this);
		this.setParent(null);
		
	}

	@Override
	public void setParent(MutableTreeNode parent) {
		
		this.parent = (MyTreeNode)parent;
	}

	@Override
	public void setUserObject(Object arg0) {
		// TODO Auto-generated method stub
			}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isLeaf() {
		if(this.children.size()==0)
			return true;
		return false;
	}
	
	public void setName(String name) {
		MyTreeNode prev = this;
		this.name = name;
		obsList.notifyObserver("rename", prev, this);
	}
	
	public void addNode(MyTreeNode node)
	{
		children.add(node);
		node.setParent(this);
	}
	public void setNodeBook(JTextArea nodeBook) {
		this.nodeBook = nodeBook;
	}
	
	public void setNodeBookText(String text) {
		this.nodeBook.setText(text);
	}
	
	public JTextArea getNodeBook() {
		return nodeBook;
	}
	
	@Override
	public void update(String str, Object prev, Object temp)
	{
		if(str.equals("key"))
		{
			if(prev instanceof TabView && temp instanceof Integer)
			{
				int index = (int) temp;
				TabView tabview = (TabView) prev;
				MyTreeNode root =  (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getModel().getRoot();
				Enumeration<MyTreeNode> enumer = root.preorderEnumeration();
				try {
					while (enumer.hasMoreElements()) {
						MyTreeNode node = enumer.nextElement();
						if(node.toString().equals(tabview.getTitleAt(index)))
						{
							node.setNodeBook(((JTextArea)tabview.getComponentAt(index)));
							break;
						}
						
						
					}
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}
		else if(str.equals("node"))
		{
			if(temp instanceof MyTreeNode)
			{
				RightBot rightBot = MainFrame.getInstance().getSplitPanel().getRightBot();
				MyTreeNode selected = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getLastSelectedPathComponent();
				if(((MyTreeNode)temp).equals(selected))
				{
					rightBot.getLbName().setText("Name: "+((MyTreeNode)temp).toString());
					rightBot.getLbParent().setText("Name of parent: "+((MyTreeNode)temp).getParent());
					rightBot.getLbChildren().setText("Number of children: "+((MyTreeNode)temp).getChildCount());
					rightBot.getLbLeaf().setText("Number of leafs: "+((MyTreeNode)temp).getLeafCount());
					rightBot.getTextArea().setText(((MyTreeNode) temp).getNodeBook().getText());
				}
			}
		}
		else if(str.equals("rename"))
		{
			if(prev instanceof MyTreeNode && temp instanceof MyTreeNode)
			{
				MyTreeNode selected = (MyTreeNode) MainFrame.getInstance().getSplitPanel().getTree().getLastSelectedPathComponent();
				TabView tabView = MainFrame.getInstance().getSplitPanel().getTab();
				RightBot rightBot = MainFrame.getInstance().getSplitPanel().getRightBot();
				tabView.setNodeName((MyTreeNode)prev, (MyTreeNode)temp);
				if(((MyTreeNode)temp).equals(selected))
					rightBot.getLbName().setText("Name: "+(MyTreeNode)temp);
			}
		}
	}
}

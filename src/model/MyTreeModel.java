package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import model.myTree.MyTreeNode;

public class MyTreeModel extends DefaultTreeModel {
	
	private static  MyTreeNode root = new MyTreeNode("Root");
	private File file = null;
	
	public MyTreeModel() {
		super(root=new MyTreeNode("Root"));
		
	}
	
	
	
	public void addChild(MyTreeNode node)
	{
		root.getChildren().add(node);
		node.setParent(root);
	}
	
	public MyTreeNode getRoot() {
		// TODO Auto-generated method stub
		return root;
	}
	
	public void setRoot(MyTreeNode root1) {
		// TODO Auto-generated method stub
		 root = root1;
	}
	
	public void removeRoot()
	{
		this.setRoot(null);
	}
	
	public MyTreeNode getChild(MyTreeNode parent, int index) {
		// TODO Auto-generated method stub
		return (MyTreeNode) parent.getChildAt(index);
	}
	
	public int getChildCount(MyTreeNode parent) {
		// TODO Auto-generated method stub
		return parent.getChildCount();
	}
	
	public boolean isLeaf(MyTreeNode node) {
		if(node.getChildCount() == 0)
			return true;
		return false;
	}
	
	public int getIndexOfChild(MyTreeNode parent, MyTreeNode child) {
		// TODO Auto-generated method stub
		return parent.getIndex(child);
	}
	
	public void removeAll()
	{
		root.removeAllChildren();
	}
	public void setFile(File file) {
		this.file = file;
	}
	
	public File getFile() {
		return file;
	}
	
	
	
	/*@Override
	public void valueForPathChanged(TreePath path, Object newValue) {
		// TODO Auto-generated method stub
		super.valueForPathChanged(path, newValue);
	}
	
	
	
	@Override
	public void addTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		super.addTreeModelListener(l);
	}
	
	@Override
	public void removeTreeModelListener(TreeModelListener l) {
		// TODO Auto-generated method stub
		super.removeTreeModelListener(l);
	}
	*/

	
	}
	
	



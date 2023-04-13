package controller;

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;

import actions.AbstractActions;
import model.MyTreeModel;
import model.myTree.MyTreeNode;
import view.MainFrame;

public class ReadFromFile extends AbstractActions{
	
	public ReadFromFile() {
		// TODO Auto-generated constructor stub
	}
	
	public MyTreeModel funcNovi()
	{
		
		File file = null;
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			file = fileChooser.getSelectedFile();
		MyTreeModel mModel = (MyTreeModel) MainFrame.getInstance().getSplitPanel().getTree().getModel();
		if(mModel!=null) {
			if(mModel.getRoot()!=null) {
					mModel.removeAll();
					mModel.removeRoot();
			}
		mModel.reload();
		}
		
		try {
			int tabCount, prevtabCount=0,i,j,k;
			String line;
			MyTreeModel model = new MyTreeModel();
			MyTreeNode node,prevNode;
			if(file == null)
				return null;
			model.setFile(file);
			FileReader fr = new FileReader(model.getFile());
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			String[] splitovano;
			splitovano = line.split("~~");
			model.setRoot(node = new MyTreeNode(splitovano[0]));
			if(splitovano.length>1)
				node.setNodeBookText(splitovano[1].replaceAll("@#@#", "\n"));
			while((line=br.readLine())!=null)
			{
				tabCount=0;
				splitovano = line.split("~~");
				for(i=0;i<splitovano[0].length();i++)
				{
					if(splitovano[0].charAt(i)=='\t')
						tabCount++;
					else
						break;
				}
				
				if(tabCount == 1)
				{
					prevNode = node;
					model.addChild(node = new MyTreeNode(splitovano[0].substring(i, splitovano[0].length())));
					node.setParent(model.getRoot());
					if(splitovano.length>1)
						node.setNodeBookText(splitovano[1].replaceAll("@#@#", "\n"));
				}
				else {
				
				if(prevtabCount<tabCount)
				{
					prevNode = node;
					prevNode.getChildren().add(node= new MyTreeNode(splitovano[0].substring(i, splitovano[0].length())));
					node.setParent(prevNode);
					if(splitovano.length>1)
						node.setNodeBookText(splitovano[1].replaceAll("@#@#", "\n"));
				}
				else if(prevtabCount>tabCount)
				{
					k = prevtabCount - tabCount;
					for(j=0 ; j<=k ; j++)
					{
						node = node.getParent();
					}
					prevNode = node;
					prevNode.getChildren().add(node = new MyTreeNode(splitovano[0].substring(i, splitovano[0].length())));
					node.setParent(prevNode);
					if(splitovano.length>1)
						node.setNodeBookText(splitovano[1].replaceAll("@#@#", "\n"));
				}
				else
				{
					prevNode = node;
					prevNode.getParent().getChildren().add(node = new MyTreeNode(splitovano[0].substring(i, splitovano[0].length())));
					node.setParent(prevNode.getParent());
					if(splitovano.length>1)
						node.setNodeBookText(splitovano[1].replaceAll("@#@#", "\n"));
				}
				}
				prevtabCount = tabCount;
				
			}
			
			
			br.close();
			
			return model;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	public void funcDodaj(MyTreeNode selected)
	{
		File file = null;
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
			file = fileChooser.getSelectedFile();
		if(file != null)
		{
		try {
			int tabCount, prevtabCount=0,i,j,k;
			String line;
			MyTreeNode node,prevNode;
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			line = br.readLine();
			String[] splitovano;
			node = selected;
			while((line=br.readLine())!=null)
			{
				tabCount=0;
				splitovano = line.split("~~");
				for(i=0;i<splitovano[0].length();i++)
				{
					if(splitovano[0].charAt(i)=='\t')
						tabCount++;
					else
						break;
				}
				
				
				if(prevtabCount<tabCount)
				{
					prevNode = node;
					prevNode.getChildren().add(node= new MyTreeNode(splitovano[0].substring(i, splitovano[0].length())));
					node.setParent(prevNode);
					if(splitovano.length>1)
						node.setNodeBookText(splitovano[1].replaceAll("@#@#", "\n"));
				}
				else if(prevtabCount>tabCount)
				{
					k = prevtabCount - tabCount;
					for(j=0 ; j<=k ; j++)
					{
						node = node.getParent();
					}
					prevNode = node;
					prevNode.getChildren().add(node = new MyTreeNode(splitovano[0].substring(i, splitovano[0].length())));
					node.setParent(prevNode);
					if(splitovano.length>1)
						node.setNodeBookText(splitovano[1].replaceAll("@#@#", "\n"));
				}
				else
				{
					prevNode = node;
					prevNode.getParent().getChildren().add(node = new MyTreeNode(splitovano[0].substring(i, splitovano[0].length())));
					node.setParent(prevNode.getParent());
					if(splitovano.length>1)
						node.setNodeBookText(splitovano[1].replaceAll("@#@#", "\n"));
				}
				prevtabCount = tabCount;
				
			}
			
			
			br.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}    

}

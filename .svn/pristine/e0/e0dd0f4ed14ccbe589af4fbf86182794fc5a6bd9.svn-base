package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Enumeration;

import javax.swing.JFileChooser;
import javax.swing.KeyStroke;

import actions.AbstractActions;
import model.MyTreeModel;
import model.myTree.MyTreeNode;
import view.MainFrame;
import view.Tree;

public class WriteInFile extends AbstractActions {

	public WriteInFile() {
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void save()
	{
		Tree tree = MainFrame.getInstance().getSplitPanel().getTree();
		if(tree.getModel()!=null) {
		MyTreeNode root = (MyTreeNode) tree.getModel().getRoot();
		Enumeration<MyTreeNode> lista = root.preorderEnumeration();
		MyTreeNode cvor = lista.nextElement();
		MyTreeNode temp;
		String countTabs;
		String tekst="";
		File file;
		String tekstArea;
		MyTreeModel model = (MyTreeModel) MainFrame.getInstance().getSplitPanel().getTree().getModel();
		JFileChooser fileChooser = new JFileChooser();
		if(model.getFile() == null) {
			if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
				model.setFile(file = fileChooser.getSelectedFile());
			else
				file = null;
		}
		else
			file = model.getFile();
		if(file != null && model != null) {

		try {
			FileWriter fw = new FileWriter(file+".txt");
			BufferedWriter bw = new BufferedWriter(fw);
			while (cvor != null) {
				temp = cvor;
				countTabs = "";
				while (temp.getParent() != null) {
					countTabs = countTabs + "\t";
					temp = temp.getParent();
				}
				tekstArea = cvor.getNodeBook().getText();
				tekstArea = tekstArea.replaceAll("\n", "@#@#");
				tekst = tekst + countTabs + cvor.toString() + "~~" + tekstArea;
				cvor = (MyTreeNode) cvor.getNextNode();
				if(cvor != null)
					tekst = tekst + "\n";
			}
			bw.write(tekst);
			bw.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
	}
	public void saveAs()
	{
		Tree tree = MainFrame.getInstance().getSplitPanel().getTree();
		if(tree.getModel() != null) {
		MyTreeNode root = (MyTreeNode) tree.getModel().getRoot();
		Enumeration<MyTreeNode> lista = root.preorderEnumeration();
		MyTreeNode cvor = lista.nextElement();
		MyTreeNode temp;
		String countTabs;
		String tekst="";
		File file;
		String tekstArea;
		MyTreeModel model = (MyTreeModel) MainFrame.getInstance().getSplitPanel().getTree().getModel();
		JFileChooser fileChooser = new JFileChooser();
		if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION)
			model.setFile(file = fileChooser.getSelectedFile());
		else
			file = null;
		if(file != null && model != null) {

		try {
			FileWriter fw = new FileWriter(file+".txt");
			BufferedWriter bw = new BufferedWriter(fw);
			while (cvor != null) {
				temp = cvor;
				countTabs = "";
				while (temp.getParent() != null) {
					countTabs = countTabs + "\t";
					temp = temp.getParent();
				}
				tekstArea = cvor.getNodeBook().getText();
				tekstArea = tekstArea.replaceAll("\n", "@#@#");
				tekst = tekst + countTabs + cvor.toString() + "~~" + tekstArea;
				tekst = tekst + countTabs + cvor.toString();
				cvor = (MyTreeNode) cvor.getNextNode();
				if(cvor != null)
					tekst = tekst + "\n";
			}
			bw.write(tekst);
			bw.close();

		} catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
	}

}

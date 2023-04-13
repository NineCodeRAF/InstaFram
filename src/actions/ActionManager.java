package actions;

import controller.OpenTab;
import controller.ReadFromFile;
import controller.WriteInFile;

public class ActionManager {
	
	private static ActionManager instance = null;
	ReadFromFile readFromFile;
	AddNode addNode;
	DeleteNode deleteNode;
	WriteInFile writeInFIle;
	OpenFile openFile;
	Save save;
	SaveAs saveAs;
	AboutListener aboutListener;
	OpenTab openTab;
	CloseTab closeTab;
	HelpListener helpListener;
	
	public ActionManager() {
		// TODO Auto-generated constructor stub
		readFromFile = new ReadFromFile();
		addNode = new AddNode();
		deleteNode = new DeleteNode();
		writeInFIle = new WriteInFile();
		openFile = new OpenFile();
		save = new Save();
		saveAs = new SaveAs();
		aboutListener = new AboutListener();
		openTab = new OpenTab();
		closeTab = new CloseTab();
		helpListener = new HelpListener();
	}
	
	public CloseTab getCloseTab() {
		return closeTab;
	}
	
	public OpenTab getOpenTab() {
		return openTab;
	}
	
	public HelpListener getHelpListener() {
		return helpListener;
	}
	
	public static ActionManager getInstance() {
		if (instance == null) instance = new ActionManager();
		return instance;
	}
	
	public AboutListener getAboutListener() {
		return aboutListener;
	}
	
	public SaveAs getSaveAs() {
		return saveAs;
	}
	
	public Save getSave() {
		return save;
	}
	
	public ReadFromFile getReadFromFile() {
		return readFromFile;
	}
	
	public AddNode getAddNode() {
		return addNode;
	}
	
	public DeleteNode getDeleteNode() {
		return deleteNode;
	}
	
	public WriteInFile getWriteInFIle() {
		return writeInFIle;
	}
	
	public OpenFile getOpenFile() {
		return openFile;
	}
	
}

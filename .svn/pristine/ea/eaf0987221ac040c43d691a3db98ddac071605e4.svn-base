package view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class HelpView extends JDialog{
	JTextArea text;
	JPanel panel;
	private static HelpView instance = null;
	public HelpView() {
		
		// TODO Auto-generated constructor stub
		text = new JTextArea("Ukoliko dodajete novi cvor, a u tom trenutnku ne postoji stablo i koren, automatski ce se napraviti.\n"
				+ "Ako nije oznacen ni jedan cvor i dodajete cvorove automatski se dodaje na koren, a u suprotnom se dodaju novi cvorovi na koren.\n"
				+ "Ubacivanje novog stabla se vrsi tako sto ni jedan cvor nije selektovan,\na dodavanje stabla na neki cvor se vrsi tako sto se selektuje cvor i onda se ucita novo stablo\n"
				+ "Save funkcionise tako sto samo prvi put pita za lokaciju gde da sacuva, ukoliko nije ucitan iz nekog fajla,\n"
				+ "svaki sledeci put cuva na tu lokaciju, "
				+ "dok save as uvek pita za lokaciju.\n"
				+ "Delete brise cvor koji je selektovan, pa cak i koren, ukoliko nista nije selektovano ne brise nista.\n"
				+ "Rename se vrsi tako sto tri puta kliknete na cvor koji zelite da promenite.\n"
				+ "Program radi boli glava, usi odpadaju...(ne postoji exception koji program nije uhvatio)");
		text.setEditable(false);
		
		add(text);
		
		setLayout(new GridLayout(1, 1));
		setSize(850, 300);
		setResizable(false);
		text.setFont(new Font(getName(), Font.PLAIN, 14));
		
		setTitle("Help");
		setLocationRelativeTo(MainFrame.getInstance());
	}
	
	public static HelpView getInstance() {
		if(instance == null) instance = new HelpView();
		return instance;
	}
}

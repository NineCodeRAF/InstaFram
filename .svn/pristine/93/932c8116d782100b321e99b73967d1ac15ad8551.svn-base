package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class BotPanel extends JPanel{
	private JPanel datumPanel = new JPanel();
	private JPanel korisnikPanel = new JPanel();
	private JPanel akcijaPanel = new JPanel();
	private JPanel statusPanel = new JPanel();
	
	private JLabel lbDatum = new JLabel();
	private JLabel lbKorisnik = new JLabel();
	private JLabel lbAkcija = new JLabel();
	private JLabel lbStatus = new JLabel();
	
	public BotPanel () {
		setLayout(new GridLayout(1, 4));
		addPanels();
	}
	
	private void addPanels () {
		add(datumPanel);
		datumPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		datumPanel.setBackground(Color.lightGray);
		datumPanel.add(lbDatum);
		clock(); // real time date
		
		add(korisnikPanel);
		korisnikPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		korisnikPanel.setBackground(Color.WHITE);
		lbKorisnik.setText("Korisnik: ");
		korisnikPanel.add(lbKorisnik);
		
		add(akcijaPanel);
		akcijaPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		akcijaPanel.setBackground(Color.PINK);
		lbAkcija.setText("Akcija: ");
		akcijaPanel.add(lbAkcija);
		
		add(statusPanel);
		statusPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
		statusPanel.setBackground(Color.yellow);
		lbStatus.setText("Status: ");
		statusPanel.add(lbStatus);
	}
	
	private void clock () {
		Thread clock = new Thread() {
			public void run () {
				try {
					while (true) {
						DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
						Date date = new Date();

						lbDatum.setText("Datum i vreme: (" + sdf.format(date) + ")");						
						sleep(1000);
					}
				} catch (InterruptedException err) {
					err.printStackTrace();
				}
			}
		};
		clock.start();
	}
	
}


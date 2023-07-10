package clases;

import gui.MainWindow;

public class Conversor {
	
	private MainWindow ventana;
	
	public Conversor() {
		
		this.ventana = new MainWindow();
		//this.ventana.setVisible(true);
	
	}
	public void displayWindow() {
		this.ventana.setVisible(true);
	}
}

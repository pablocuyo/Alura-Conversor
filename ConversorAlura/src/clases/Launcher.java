package clases;

import gui.MainWindow;

public class Launcher {
	
	private MainWindow ventana;
	
	public Launcher() {
		
		this.ventana = new MainWindow();
		//this.ventana.setVisible(true);
	
	}
	public void displayWindow() {
		this.ventana.setVisible(true);
	}
}

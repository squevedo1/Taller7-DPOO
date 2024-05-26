package uniandes.dpoo.taller7.interfaz1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class Ventana extends JFrame{
	
	public Ventana() {
		setTitle("Juego de LightsOut");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Ventana();
	}
}

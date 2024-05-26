package uniandes.dpoo.taller7.interfaz2;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
	private Norte panelSuperior;
	private Este panelDerecha;
	private Sur panelInferior;
	
	public Ventana() {
		setLayout(new BorderLayout());
		
		setTitle("Juego de LightsOut");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		panelSuperior = new Norte();
		add(panelSuperior, BorderLayout.NORTH);
		
		panelDerecha = new Este();
		add(panelDerecha, BorderLayout.EAST);
		
		panelInferior = new Sur();
		add(panelInferior, BorderLayout.SOUTH);
		
		revalidate();
	}
	
	
	
	public static void main(String[] args) {
		new Ventana();
	}
}

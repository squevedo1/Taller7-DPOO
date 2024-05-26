package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
	private Norte panelSuperior;
	private Este panelDerecha;
	private Sur panelInferior;
	private Tablero tablero;
	
	public Ventana() {
		setLayout(new BorderLayout());
		
		setTitle("Juego de LightsOut");
		setSize(650, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		panelSuperior = new Norte();
		add(panelSuperior, BorderLayout.NORTH);
		
		panelDerecha = new Este();
		add(panelDerecha, BorderLayout.EAST);
		
		panelInferior = new Sur();
		add(panelInferior, BorderLayout.SOUTH);
		
		tablero = new Tablero();
		add(tablero, BorderLayout.CENTER);
		
		tablero.repaint();
		
		
		revalidate();
	}
	
	
	
	public static void main(String[] args) {
		new Ventana();
	}
}

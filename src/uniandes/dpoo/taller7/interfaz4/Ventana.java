package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
	private Norte panelSuperior;
	private Este panelDerecha;
	private Sur panelInferior;
	private Paneles tablero;
	
	public Ventana() {
		setLayout(new BorderLayout());
		
		setTitle("Juego de LightsOut");
		setSize(650, 480);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		panelSuperior = new Norte();
		add(panelSuperior, BorderLayout.NORTH);
		
		
		panelInferior = new Sur();
		add(panelInferior, BorderLayout.SOUTH);
		
		tablero = new Paneles(panelInferior);
		add(tablero, BorderLayout.CENTER);
		
		panelDerecha = new Este(tablero, panelInferior);
		add(panelDerecha, BorderLayout.EAST);
		
		
		revalidate();
	}
	
	
	
	public static void main(String[] args) {
		new Ventana();
	}
	
}

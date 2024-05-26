package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class Este extends JPanel{
	private JButton nuevo;
	private JButton reiniciar;
	private JButton top10;
	private JButton cambiarJug;
	
	public Este() {
		
		setLayout(new GridLayout(0, 1, 0, 10));
		
		nuevo = new JButton("Nuevo");
		add(nuevo);
		
		reiniciar = new JButton("Reinciar");
		add(reiniciar);
		
		top10 = new JButton("Top-10");
		add(top10);
		
		cambiarJug = new JButton("Cambiar Jugador");
		add(cambiarJug);
		
        
        
	}
}

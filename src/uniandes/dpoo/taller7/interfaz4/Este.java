package uniandes.dpoo.taller7.interfaz4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import uniandes.dpoo.taller7.modelo.Tablero;

import java.awt.*;

public class Este extends JPanel{
	private JButton nuevo;
	private JButton reiniciar;
	private JButton top10;
	private JButton cambiarJug;
	private Observador2 observer2;
	private Observador3 observer3;
	
	public Este(Observador2 observer2, Sur observer3) {
		this.observer2 = observer2;
		setLayout(new GridLayout(0, 1, 0, 10));
		
		nuevo = new JButton("Nuevo");
		add(nuevo);
		
		reiniciar = new JButton("Reinciar");
		add(reiniciar);
		
		top10 = new JButton("Top-10");
		add(top10);
		
		cambiarJug = new JButton("Cambiar Jugador");
		add(cambiarJug);
		
        nuevo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	observer2.nuevoJuego();
            }
        });
        
        reiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	observer2.reiniciar();
            }
        });
        
        cambiarJug.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	

            }
        });
        
	}
	
}

package uniandes.dpoo.taller7.interfaz4;


import javax.swing.*;

import uniandes.dpoo.taller7.modelo.Tablero;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Norte extends JPanel {
    private JLabel tamano;
    private JComboBox<String> opciones;
    private JRadioButton facil;
    private JRadioButton medio;
    private JRadioButton dificil;
    private ButtonGroup buttonGroup;
    private int tam = 5;

    public Norte() {
        setLayout(new FlowLayout());

        tamano = new JLabel("Tamaño ");
        add(tamano);

        String[] tamanos = {"5x5", "6x6", "7x7"};
        opciones = new JComboBox<>(tamanos);
        add(opciones);
        
        opciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tamano = (String) opciones.getSelectedItem();
                if (tamano.equals("5x5")){
                	tam = 5;
                	Paneles.setTamano(tam);
                	Tablero tablero = new Tablero(tam); 
                	Paneles.setTablero(tablero);
                	repaint();
                }
                if (tamano.equals("6x6")){
                	tam = 6;
                	Paneles.setTamano(tam);
                	Tablero tablero = new Tablero(tam); 
                	Paneles.setTablero(tablero);
                	repaint();
                }
                if (tamano.equals("7x7")){
                	tam = 7;
                	Paneles.setTamano(tam);
                	Tablero tablero = new Tablero(tam); 
                	Paneles.setTablero(tablero);
                	repaint();
	
                }

                
            }
        });

        facil = new JRadioButton("Fácil");
        medio = new JRadioButton("Medio");
        dificil = new JRadioButton("Difícil");

        buttonGroup = new ButtonGroup();
        buttonGroup.add(facil);
        buttonGroup.add(medio);
        buttonGroup.add(dificil);

        add(facil);
        add(medio);
        add(dificil);
        
        facil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Tablero tablero = new Tablero(tam); 
            	tablero.desordenar(3);
            	Paneles.setTablero(tablero);
            	Paneles.setDificultad(3);
            }
        });
        
        medio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Tablero tablero = new Tablero(tam); 
            	tablero.desordenar(7);
            	Paneles.setTablero(tablero);
            	Paneles.setDificultad(7);
            }
        });
        
        dificil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Tablero tablero = new Tablero(tam); 
            	tablero.desordenar(15);
            	Paneles.setTablero(tablero);
            	Paneles.setDificultad(15);
            }
        });

        
    }


}
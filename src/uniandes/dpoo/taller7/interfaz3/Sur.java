package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class Sur extends JPanel{
	
	private JLabel jugadas;
	private JTextField numJugadas;
	private JLabel jugador;
	private JTextField nomJugador;
	
	public Sur() {
		setLayout(new FlowLayout());
		
		jugadas = new JLabel("Jugadas");
		add(jugadas);
		
		numJugadas = new JTextField("0", 20);
		add(numJugadas);
		
		jugador = new JLabel("Jugador");
		add(jugador);
		
		nomJugador = new JTextField(20);
		add(nomJugador);
		
	}

}

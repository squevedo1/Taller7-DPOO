package uniandes.dpoo.taller7.interfaz4;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;

public class Sur extends JPanel implements Observador1, Observador3{
	
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


	public void actualizar(int jugadas) {
		numJugadas.setText(String.valueOf(jugadas + 1));
		revalidate();
	}


	@Override
	public void cambiarJug() {
		// TODO Auto-generated method stub
		
	}
}





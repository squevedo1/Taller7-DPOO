package uniandes.dpoo.taller7.interfaz3;

import java.awt.*;
import javax.swing.*;

public class Tablero extends JPanel{
	
	private int tamano;
	

    public Tablero() {
    
    	tamano = 5;
       
    }
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Llamar al método padre para asegurarse de que se dibujen otros componentes correctamente

        Graphics2D g2d = (Graphics2D) g;
        
        if (tamano == 5){
        	for (int k = 0; k < tamano; k++) {
        		for (int l = 0; l < tamano; l++){
        			g2d.setColor(Color.YELLOW);
        			g2d.fillRect(100*k, 70*l, 100, 70);
        			g2d.setColor(Color.BLACK);
        			g2d.drawRect(100*k, 70*l, 100, 70);
        		}
        		
        	}
        }
        
        if (tamano == 6){
        	for (int k = 0; k < tamano; k++) {
        		for (int l = 0; l < tamano; l++){
        			g2d.setColor(Color.YELLOW);
        			g2d.fillRect(83*k, 60*l, 83, 60);
        			g2d.setColor(Color.BLACK);
        			g2d.drawRect(83*k, 60*l, 83, 60);
        		}
        		
        	}

        }
        
        if (tamano == 7){
        	for (int k = 0; k < tamano; k++) {
        		for (int l = 0; l < tamano; l++){
        			g2d.setColor(Color.YELLOW);
        			g2d.fillRect(71*k, 50*l, 71, 50);
        			g2d.setColor(Color.BLACK);
        			g2d.drawRect(71*k, 50*l, 71, 50);
        		}
        		
        	}

        }
	}
}

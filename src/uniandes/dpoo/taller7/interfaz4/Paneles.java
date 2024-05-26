package uniandes.dpoo.taller7.interfaz4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import uniandes.dpoo.taller7.modelo.*;
import java.awt.*;
import javax.swing.*;

public class Paneles extends JPanel implements Observador2{
	
	private static int tamano = 5;
	private static Tablero tablero = new Tablero(tamano);;
	private int x;
	private int y;
	private int columna;
	private int fila;
	private static int dificultad = 0;
	private Observador1 observerSur;
	private static int jugadas = 0;
	private String jugador;

    public Paneles(Observador1 observer) {
    	this.observerSur = observer;
    	addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               x = e.getX();
               y = e.getY();
               observer.actualizar(jugadas);
               if (tamano == 5) {
            	   if (0 < x && x < 100) {
            		   setColumna(0);
            	   }
            	   if (100 < x && x < 200) {
            		   setColumna(1);
            	   }
            	   if (200 < x && x < 300) {
            		   setColumna(2);
            	   }
            	   if (300 < x && x < 400) {
            		   setColumna(3);
            	   }
            	   if (400 < x && x < 500) {
            		   setColumna(4);
            	   }
            	   
            	   if (0 < y && y < 70) {
            		   setFila(0);
            	   }
            	   if (70 < y && y < 140) {
            		   setFila(1);
            	   }
            	   if (140 < y && y < 210) {
            		   setFila(2);
            	   }
            	   if (210 < y && y < 280) {
            		   setFila(3);
            	   }
            	   if (280 < y && y < 350) {
            		   setFila(4);
            	   }
               }
               
               if (tamano == 6) {
            	   if (0 < x && x < 83) {
            		   setColumna(0);
            	   }
            	   if (83 < x && x < 166) {
            		   setColumna(1);
            	   }
            	   if (166 < x && x < 249) {
            		   setColumna(2);
            	   }
            	   if (249 < x && x < 332) {
            		   setColumna(3);
            	   }
            	   if (332 < x && x < 415) {
            		   setColumna(4);
            	   }
            	   if (415 < x && x < 498) {
            		   setColumna(5);
            	   }
            	   
            	   if (0 < y && y < 60) {
            		   setFila(0);
            	   }
            	   if (60 < y && y < 120) {
            		   setFila(1);
            	   }
            	   if (120 < y && y < 180) {
            		   setFila(2);
            	   }
            	   if (180 < y && y < 240) {
            		   setFila(3);
            	   }
            	   if (240 < y && y < 300) {
            		   setFila(4);
            	   }
            	   if (300 < y && y < 360) {
            		   setFila(5);
            	   }
               }
               
               if (tamano == 7) {
            	   if (0 < x && x < 71) {
            		   setColumna(0);
            	   }
            	   if (71 < x && x < 142) {
            		   setColumna(1);
            	   }
            	   if (142 < x && x < 213) {
            		   setColumna(2);
            	   }
            	   if (213 < x && x < 284) {
            		   setColumna(3);
            	   }
            	   if (284 < x && x < 355) {
            		   setColumna(4);
            	   }
            	   if (355 < x && x < 426) {
            		   setColumna(5);
            	   }
            	   if (426 < x && x < 497) {
            		   setColumna(6);
            	   }
            	   
            	   if (0 < y && y < 50) {
            		   setFila(0);
            	   }
            	   if (50 < y && y < 100) {
            		   setFila(1);
            	   }
            	   if (100 < y && y < 150) {
            		   setFila(2);
            	   }
            	   if (150 < y && y < 200) {
            		   setFila(3);
            	   }
            	   if (200 < y && y < 250) {
            		   setFila(4);
            	   }
            	   if (250 < y && y < 300) {
            		   setFila(5);
            	   }
            	   if (300 < y && y < 350) {
            		   setFila(6);
            	   }
            	   
               }
               refrescar();

           }
       });
    }
    
    public static void setTamano(int nuevo) {
    	tamano = nuevo;
    }
    
    public void refrescar() {
    	tablero.jugar(fila, columna);  
    	jugadas = tablero.darJugadas();
    	
    }
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        
	    if (tamano == 5){
	        	for (int k = 0; k < tamano; k++) {
	        		for (int l = 0; l < tamano; l++){
	        			if (tablero.darTablero()[l][k]) {
		        			g2d.setColor(Color.YELLOW);
		        			g2d.fillRect(100*k, 70*l, 100, 70);
		        			g2d.setColor(Color.BLACK);
		        			g2d.drawRect(100*k, 70*l, 100, 70);
	        			}
	        			else {
		        			g2d.setColor(Color.BLACK);
		        			g2d.fillRect(100*k, 70*l, 100, 70);
		        			g2d.setColor(Color.YELLOW);
		        			g2d.drawRect(100*k, 70*l, 100, 70);
	        			}

	        		}	
	        	}
	        	repaint();
	        }
	        
	     if (tamano == 6){
	    	 for (int k = 0; k < tamano; k++) {
	        		for (int l = 0; l < tamano; l++){
	        			if (tablero.darTablero()[l][k]) {
		        			g2d.setColor(Color.YELLOW);
		        			g2d.fillRect(83*k, 60*l, 83, 60);
		        			g2d.setColor(Color.BLACK);
		        			g2d.drawRect(83*k, 60*l, 83, 60);
	        			}
	        			else {
	        				g2d.setColor(Color.BLACK);
		        			g2d.fillRect(83*k, 60*l, 83, 60);
		        			g2d.setColor(Color.YELLOW);
		        			g2d.drawRect(83*k, 60*l, 83, 60);
	        			}

	        		}	
	        	}
	        	repaint();
	        }
	        
	      if (tamano == 7){
		    	 for (int k = 0; k < tamano; k++) {
		        		for (int l = 0; l < tamano; l++){
		        			if (tablero.darTablero()[l][k]) {
			        			g2d.setColor(Color.YELLOW);
			        			g2d.fillRect(71*k, 50*l, 71, 50);
			        			g2d.setColor(Color.BLACK);
			        			g2d.drawRect(71*k, 50*l, 71, 50);
		        			}
		        			else {
		        				g2d.setColor(Color.BLACK);
			        			g2d.fillRect(71*k, 50*l, 71, 50);
			        			g2d.setColor(Color.YELLOW);
			        			g2d.drawRect(71*k, 50*l, 71, 50);
		        			}

		        		}	
		        	}
		        	repaint();
	      }
	}


	public void setFila(int x) {
		this.fila = x;
	}
	
	public void setColumna(int y) {
		this.columna = y;
	}
	
	public static void setTablero(Tablero nuevo) {
		tablero = nuevo;
	}
	
	public static void setDificultad(int x) {
		dificultad = x;
	}

	public void nuevoJuego() {
		Tablero tablero = new Tablero(tamano);
		tablero.desordenar(dificultad);
    	jugadas = tablero.darJugadas();
		this.tablero = tablero;
		
	}
	
	public void reiniciar() {
		this.tablero.reiniciar();
		jugadas = tablero.darJugadas();
	}
	
	

}

package uniandes.dpoo.taller7.interfaz3;

import javax.swing.*;
import java.awt.*;

public class Norte extends JPanel {
    private JLabel tamano;
    private JComboBox<String> opciones;
    private JRadioButton facil;
    private JRadioButton medio;
    private JRadioButton dificil;
    private ButtonGroup buttonGroup;

    public Norte() {
        setLayout(new FlowLayout());

        tamano = new JLabel("Tamaño ");
        add(tamano);

        String[] tamanos = {"5x5", "6x6", "7x7"};
        opciones = new JComboBox<>(tamanos);
        add(opciones);

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
    }


}
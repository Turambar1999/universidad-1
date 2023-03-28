package com.demo.proyecto_intro_progra;

import static com.demo.proyecto_intro_progra.Proyecto_intro_progra.Back1;
import static com.demo.proyecto_intro_progra.Proyecto_intro_progra.D1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Menu {

    public void menu() {
        JButton a = getButton("1. Registrar a los desarrolladores");
        JButton b = getButton("2. Registrar los requerimientos en Backlog");
        JButton c = getButton("3. Registrar los registros de iteraciones");
        JButton d = getButton("4. Registrar la asignación de trabajo");
        JButton e = getButton("5. Registrar la asignación de trabajo");
        JButton f = getButton("6. Registrar el cierre de una iteración");
        JButton g = getButton("7. Abrir el módulo de reportes");

        Object[] opciones = {a, b, c, d, e, f, g};

        JOptionPane.showOptionDialog(null, opciones, "Elija una opción:",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null,
                new String[]{"Salir"},
                null);
    }

    public static JButton getButton(String text) {
        final JButton button = new JButton(text);
        ActionListener actionListener = new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                String opcion = actionEvent.getActionCommand().substring(0, 1);
                switch (opcion) {
                    case "1" ->
                        D1.regDesarrolladores();
                    case "2" ->
                        Back1.regRequerimientosBacklog();
                    case "3" ->
                        JOptionPane.showMessageDialog(null, "3. Registrar los registros de iteraciones");
                    case "4" ->
                        JOptionPane.showMessageDialog(null, "4. Registrar la asignación de trabajo");
                    case "5" ->
                        JOptionPane.showMessageDialog(null, "5. Registrar la asignación de trabajo");
                    case "6" ->
                        JOptionPane.showMessageDialog(null, "6. Registrar el cierre de una iteración");
                    case "7" ->
                        JOptionPane.showMessageDialog(null, "7. Abrir el módulo de reportes");
                }
            }
        };

        button.addActionListener(actionListener);
        return button;
    }
}

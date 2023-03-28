package com.demo.proyecto_intro_progra;

import static com.demo.proyecto_intro_progra.Proyecto_intro_progra.requerimientosTotal;
import javax.swing.JOptionPane;

public class Backlog {

    //Atributos
    private int id;
    private String nombre;
    private int esfuerzo;
    private String estado;
    
    //Constructores

    public Backlog() {
    }

    public Backlog(int id, String nombre, int esfuerzo, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.esfuerzo = esfuerzo;
        this.estado = estado;
    }
    

    //Metodos
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEsfuerzo(int esfuerzo) {
        this.esfuerzo = esfuerzo;
    }

    public int getEsfuerzo() {
        return esfuerzo;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    // Método para validación de Strings
    public static boolean esString(String str) {
        return str.matches("[a-zA-Z]+");
    }
    public void regRequerimientosBacklog() {
        // Array para guardar los objetos backlog
        String lectura;
        int cantidad;
        String[] listaOpciones = {"1", "2", "3", "4", "5"};

        lectura = (String) JOptionPane.showInputDialog(null, "Elija cuántos requerimientos desea registrar",
                "Requerimientos",
                JOptionPane.DEFAULT_OPTION,
                null,
                listaOpciones, listaOpciones[0]);

        cantidad = Integer.parseInt(lectura);
        Backlog[] backlog = new Backlog[cantidad];

        //Ciclo for para crear las instancias requeridas por el usuario y llenar los atributos de las mismas
        for (int i = 0; i < backlog.length; i++) {
            requerimientosTotal++;
            backlog[i] = new Backlog();
            ingresarDatosBacklog(backlog[i], requerimientosTotal);
        }
    }

    public static void ingresarDatosBacklog(Backlog backlog, int n) {
        String lectura;
        int validarId;
        int id = 0;
        String nombre = "";
        int validarEsfuerzo;
        int esfuerzo = 0;

        do {
            lectura = JOptionPane.showInputDialog("Digite el Id del requerimiento #" + n + ":");
            validarId = Integer.parseInt(lectura);
            if (validarId <= 0) {
                JOptionPane.showMessageDialog(null, "¡Opción inválida!\n\nDebe escribir un número mayor a 0...");
            } else {
                id = validarId;
            }
        } while (validarId <= 0);

        do {
            lectura = JOptionPane.showInputDialog("Digite el nombre del requerimiento #" + n + ":");
            if (!esString(lectura)) {
                JOptionPane.showMessageDialog(null, "¡Opción inválida!\n\nDebe escribir las siglas sin espacios y sin carácteres especiales...");
            } else {
                nombre = (lectura);
            }
        } while (!esString(lectura));

        do {
            lectura = JOptionPane.showInputDialog("Digite el esfuerzo del requerimiento #" + n + ":");
            validarEsfuerzo = Integer.parseInt(lectura);
            if (validarEsfuerzo <= 0) {
                JOptionPane.showMessageDialog(null, "¡Opción inválida!\n\nDebe escribir un número mayor a 0...");
            } else {
                esfuerzo = validarEsfuerzo;
            }
        } while (validarEsfuerzo <= 0);

        //Asignacion de valores a los atributos del objeto
        backlog.setId(id);
        backlog.setNombre(nombre);
        backlog.setEsfuerzo(esfuerzo);

        JOptionPane.showMessageDialog(null, "Se ha agregado el requerimiento #" + n + ".");
    }
}

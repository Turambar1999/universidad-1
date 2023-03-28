package com.demo.proyecto_intro_progra;

import javax.swing.JOptionPane;

public class Desarrollador {

    //Atributos
    private String nombre;
    private String siglas;
    private double costo;
    private double id;

    //Constuctores
    public Desarrollador() {
    }

    public Desarrollador(String nombre, String siglas, double costo, double id) {
        this.nombre = nombre;
        this.siglas = siglas;
        this.costo = costo;
        this.id = id;
    }

    //Metodos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getId() {
        return id;
    }

    // Método para validación de Strings
    public static boolean esString(String str) {
        return str.matches("[a-zA-Z]+");
    }

    public static void ingresarDatosDesarolladores(Desarrollador desarrollador, int n) {
        //Obtencion de datos en variables para poder añadir a los objetos
        String lectura;
        String nombre = "";
        String siglas = "";
        double costo = 1;
        double validarCosto;

        //Validación de datos para que no se coloquen enteros, Strings, etc... dependiendo del caso
        //Validación de Strings (Nombre del desarrollador)
        do {
            lectura = JOptionPane.showInputDialog("Digite el nombre del desarrollador #" + n + ":");
            if (!esString(lectura)) {
                JOptionPane.showMessageDialog(null, "¡Opción inválida!\n\nDebe escribir el nombre sin espacios...");
            } else {
                nombre = lectura;
            }
        } while (!esString(lectura));

        //Validación de datos (Siglas del desarrollador)
        do {
            lectura = JOptionPane.showInputDialog("Digite las siglas del desarrollador #" + n + ":");
            if (!esString(lectura)) {
                JOptionPane.showMessageDialog(null, "¡Opción inválida!\n\nDebe escribir las siglas sin espacios y sin carácteres especiales...");
            } else {
                siglas = lectura;
            }
        } while (!esString(lectura));

        //Validación de datos(Costo x día del desarrollador)
        do {
            lectura = JOptionPane.showInputDialog("Digite cuánto es el costo por día del desarrollador #" + n + ":");
            validarCosto = Double.parseDouble(lectura);
            if (validarCosto <= 0) {
                JOptionPane.showMessageDialog(null, "¡Opción inválida!\n\nDebe escribir un número mayor a 0...");
            } else {
                costo = Integer.parseInt(lectura);
            }
        } while (validarCosto <= 0);

        //Se asigna el id de manera aleatoria automáticamente (debajo está el código anterior comentado)
        int id = (int) (Math.random() * 1000) + 1;

        //Asignacion de valores a los atributos del objeto
        desarrollador.setNombre(nombre);
        desarrollador.setSiglas(siglas);
        desarrollador.setCosto(costo);
        desarrollador.setId(id);

        JOptionPane.showMessageDialog(null, "Se ha agregado el desarrollador #" + n + ".");
    }

    public void regDesarrolladores() {
        // Array para guardar los objetos desarrolladores
        String lectura;
        int cantidad;

        // Validación de datos para seleccionar entre 1 y 5 desarrolladores        
        do {
            lectura = JOptionPane.showInputDialog("Digite cuántos desarrolladores desea registrar al sistema:");
            cantidad = Integer.parseInt(lectura);
            if (cantidad > 5 || cantidad < 1) {
                JOptionPane.showMessageDialog(null, "Opción inválida\n\nElija una opción entre 1 y 5...");
            }
        } while (cantidad > 5 || cantidad < 1);

        Desarrollador[] desarrollador = new Desarrollador[cantidad];

        //Ciclo for para crear las instancias requeridas por el usuario y llenar los atributos de las mismas
        for (int i = 0; i < desarrollador.length; i++) {
            desarrollador[i] = new Desarrollador();
            ingresarDatosDesarolladores(desarrollador[i], i + 1);
            JOptionPane.showMessageDialog(null,
                    desarrollador[i].getCosto() + "\n"
                    + desarrollador[i].getNombre() + "\n"
                    + desarrollador[i].getSiglas() + "\n"
                    + desarrollador[i].getId());
        }
    }
}

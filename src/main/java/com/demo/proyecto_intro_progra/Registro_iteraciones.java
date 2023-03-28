package com.demo.proyecto_intro_progra;

import javax.swing.JOptionPane;

public class Registro_iteraciones {

    //Atributos
    private int id_iteracion;
    private int cantidadSemanas;

    //Metodos 
    public Registro_iteraciones() {
    }

    public Registro_iteraciones(int id_iteracion, int cantidadSemanas) {
        this.id_iteracion = id_iteracion;
        this.cantidadSemanas = cantidadSemanas;
    }

    public int getId_iteracion() {
        return id_iteracion;
    }

    public void setId_iteracion(int id_iteracion) {
        this.id_iteracion = id_iteracion;
    }

    public int getCantidadSemanas() {
        return cantidadSemanas;
    }

    public void setCantidadSemanas(int cantidadSemanas) {
        this.cantidadSemanas = cantidadSemanas;
    }

    public void crearRegistroIteraciones() {
        String entrada;
        entrada = JOptionPane.showInputDialog(" Digite el id de la iteracion por favor: ");
        setId_iteracion(Integer.parseInt(entrada));
        entrada = JOptionPane.showInputDialog(" Digite el numero de semanas por favor : ");
        setCantidadSemanas(Integer.parseInt(entrada));
    }
}

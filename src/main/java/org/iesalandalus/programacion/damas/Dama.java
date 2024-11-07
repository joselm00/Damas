package org.iesalandalus.programacion.damas;

import java.util.Random;

public class Dama {

    private Color color;
    private Posicion posicion;
    boolean esDamaEspecial;

    public Dama(Color color, Posicion posicion, boolean esDamaEspecial) {

        this.color = Color.BLANCO;
        this.posicion = generarPosicion();
        this.esDamaEspecial = esDamaEspecial;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {

        if (color == null) {
            throw new IllegalArgumentException("Error, el color no puede ser nulo");
        }
        this.color = color;
    }

    public boolean isEsDamaEspecial() {
        return esDamaEspecial;
    }

    public void setEsDamaEspecial(boolean esDamaEspecial) {
        this.esDamaEspecial = esDamaEspecial;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        if (posicion == null) {
            throw new IllegalArgumentException("Error, la posición no puede ser nula");
        }
        this.posicion = posicion;
    }

    private Posicion generarPosicion() {

        Random rm = new Random();
        int filaA = rm.nextInt(3) + 1;
        char columna = 'a';
        int columnaA = rm.nextInt(4);
        if (filaA % 2 == 1) {
            if (columnaA == 0) {
                columna='b';
            } else if (columnaA==1) {
                columna='d';
            } else if (columnaA==2) {
                columna='f';
            } else if (columnaA==3) {
                columna='h';
            }
        } else {
            if (columnaA==0){
                columna='a';
            } else if (columnaA==1) {
                columna='c';
            } else if (columnaA==2) {
                columna='e';
            } else if (columnaA==3) {
                columna='g';
            }
        }
           return new Posicion(filaA,columna);
    }
}

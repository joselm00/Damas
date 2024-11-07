package org.iesalandalus.programacion.damas;

public class Dama {

        private Color color;
        private Posicion posicion;
        boolean esDamaEspecial;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {

        if (color==null){
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
        if (posicion==null){
            throw new IllegalArgumentException("Error, la posición no puede ser nula");
        }
        this.posicion = posicion;
    }
}

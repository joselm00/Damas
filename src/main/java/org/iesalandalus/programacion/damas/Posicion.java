package org.iesalandalus.programacion.damas;

import java.util.Objects;

public class Posicion{

    int fila;
    char columna;

    private Posicion(int fila, char columna){
        setFila(fila);
        setColumna(columna);
    }

    public Posicion(Posicion otraPosicion) {
        if (otraPosicion == null) {
            throw new IllegalArgumentException("La posición no puede ser nula");
        }
        this.fila = otraPosicion.fila;
        this.columna = otraPosicion.columna;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        if (columna<'a'||columna>'h'){
            throw new IllegalArgumentException("ERROR, valor incorrecto, vuelva a introducirlo");
        }
        this.columna=columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if (fila<1 || fila>8){
            throw new IllegalArgumentException("ERROR, valor incorrecto, vuelva a introducirlo");
        }
        this.fila=fila;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }
}

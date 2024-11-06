package org.iesalandalus.programacion.damas;

public class Posicion {

    int fila;
    char columna;

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

}

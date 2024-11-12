package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;
import java.util.Random;

public class Dama {

    private Color color;
    private Posicion posicion;
    boolean esDamaEspecial;

    public Dama(Color color, Posicion posicion, boolean esDamaEspecial) {

        this.color = Color.BLANCO;
        this.posicion = crearPosicionInicial();
        this.esDamaEspecial = esDamaEspecial;
    }

    public Dama() {
        this.color = Color.BLANCO;
        this.posicion = new Posicion(1, 'a');
        this.esDamaEspecial = false;
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

    private Posicion crearPosicionInicial() {

        Random rm = new Random();
        int filaA;
        char columna = 'a';
        if (color==Color.BLANCO){
            filaA = rm.nextInt(3) + 1;
        } else {
            filaA = rm.nextInt(3) + 6;
        }
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

    private void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
        if (direccion==null){
            throw new NullPointerException("ERROR: La dirrecion erronea");
        }
        if (pasos<1){
            throw new IllegalArgumentException("ERROR: pasos erroneos");
        }
        if (!esDamaEspecial){

            if ((color==Color.BLANCO && (direccion!=Direccion.NOROESTE && direccion!=Direccion.NORESTE))||(color==Color.NEGRO && (direccion!=Direccion.SUROESTE && direccion!=Direccion.SURESTE))){
                    throw new OperationNotSupportedException("ERROR: movimiento no permitido para damas no especiales");
            }
                pasos=1;
        }

        int nuevaFila=posicion.getFila();
        char nuevaColumna=posicion.getColumna();

        switch (direccion){

            case NORESTE -> {
                nuevaFila+=pasos;
                nuevaColumna=(char) (nuevaColumna + pasos);
            }
            case NOROESTE ->{
                nuevaFila+=pasos;
                nuevaColumna=(char) (nuevaColumna - pasos);
            }
            case SURESTE -> {
                nuevaFila-=pasos;
                nuevaColumna=(char) (nuevaColumna + pasos);
            }
            case SUROESTE -> {
                nuevaFila-=pasos;
                nuevaColumna=(char) (nuevaColumna - pasos);
            }
        }
        if (nuevaFila<1 || nuevaFila>8 || nuevaColumna<'a' || nuevaColumna>'h'){
            throw new OperationNotSupportedException("ERROR: movimiento no permitido");
        }

        posicion=new Posicion(nuevaFila, nuevaColumna);
        if ((color==Color.BLANCO && nuevaFila==8)||(color==Color.NEGRO && nuevaFila==1)){
            esDamaEspecial=true;
        }
    }
    @Override
    public String toString() {
        return "Dama{" +
                "color=" + color +
                ", posicion=" + posicion +
                '}';
    }
}

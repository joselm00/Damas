package org.iesalandalus.programacion.damas;

public enum Direccion {
    NORESTE("Noreste"),SURESTE("Sureste"),NOROESTE("Noroeste"),SUROESTE("Suroeste");

    private String cadenaAMostrar;
    private Direccion(String cadenaAMostrar){
        this.cadenaAMostrar=cadenaAMostrar;
    }

}

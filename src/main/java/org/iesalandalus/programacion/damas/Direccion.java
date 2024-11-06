package org.iesalandalus.programacion.damas;

public enum Direccion {
    NORESTE("Noreste"),SURESTE("Sureste"),NOROESTE("Noroeste"),SUROESTE("Suroeste");

    private String Cadena;
    private Direccion(String Cadena){
        this.Cadena=Cadena;
    }
}

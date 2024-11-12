package org.iesalandalus.programacion.damas;

import javax.naming.OperationNotSupportedException;


public class MainApp {

    public static Dama dama;

    private static void ejecutarOpcion(int opcion){

        switch (opcion){

            case 1 -> {
                crearDamaDefecto();
            }
            case 2 -> {
                System.out.println("Nuevo dama color");
            }
            case 3 -> {
                System.out.println("Mover dama");
            }
            case 4 -> {
                System.out.println("Mostrar dama");
            }
            case 5 -> {
                System.out.println("Despedida");
            }
            default -> {System.out.println("Opcion no valida");}

        }
    }

    private static void crearDamaDefecto(){
        dama= new Dama();
        System.out.println("Dama creada con los valores por defecto:" + dama.getColor() + ", " + dama.getPosicion() );
    }



}

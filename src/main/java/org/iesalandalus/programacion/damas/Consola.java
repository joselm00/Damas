package org.iesalandalus.programacion.damas;

import java.util.Scanner;

public class Consola {

    private static final Scanner entrada = new Scanner(System.in);

    private Consola() {


    }

    public static void mostrarMenu(){
        System.out.println("Menú de opciones: ");
        System.out.println("==============================================");
        System.out.println("1.Crear dama por defecto");
        System.out.println("2.Crear dama eligiendo color");
        System.out.println("3.Mover dama");
        System.out.println("4.Salir");
    }

    public static int  elegirOpcionMenu(){
    int opcion = 0;
    do {
        System.out.println("Introduce por teclado una opcion del menú de opciones(1-4): ");
            while (!entrada.hasNextInt()){
                System.out.println("ERROR, debes ingresar un numero entre 1 y 4");
                entrada.next();
                System.out.println("Introduce por teclado una opcion del menú de opciones(1-4): ");
        }
            opcion= entrada.nextInt();
    }while (opcion<1||opcion>4);
        return opcion;
    }

    public static Color elegirOpcion(){
        Color color = null;

        do {
            System.out.println("Introduzca el color Blanco o Negro.");
        }while (color!=Color.BLANCO || color!=Color.NEGRO);

        return color;
    }

    public static void mostrarMenuDirecciones(){

            System.out.println("Mover hacia Sureste.1");
            System.out.println("Mover hacia Suroeste.2");
            System.out.println("Mover hacia Noreste.3");
            System.out.println("Mover hacia Noroeste.4");

    }

    public static Direccion elegirDireccion(){
        int opcion=0;
        do {
            System.out.println("Elige la direccion (1-4)");
             entrada.nextInt();
             while (!entrada.hasNextInt()){
                 System.out.println("ERROR, debes ingresar un numero entre 1 y 4");
                 entrada.next();
                 System.out.println("Elige la direccion (1-4)");
             }
            opcion= entrada.nextInt();
        }while (opcion<=0 || opcion>4);

        switch (opcion){

            case 1 -> {
                return Direccion.SURESTE;
            }
            case 2 -> {
                return Direccion.SUROESTE;
            }
            case 3 -> {
                return Direccion.NORESTE;
            }
            case 4 -> {
                return Direccion.NOROESTE;
            }
            default -> {
                return null;
            }
        }
    }

    public static int elegirPasos(){
        int pasos=0;
        do {
            System.out.println("Elige el numero de pasos minimos");
            entrada.nextInt();
            while (!entrada.hasNextInt()){
                System.out.println("ERROR, debes ingresar un numero entero positivo mayor o igual a 1");
                entrada.next();
                System.out.println("Elige el numero de pasos minimos");
            }
            pasos = entrada.nextInt();
        }while (pasos<1);

        return pasos;
    }

}

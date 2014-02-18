/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombers;

import java.util.Scanner;

/**
 *
 * @author Jelly
 */
public class Bombers {

    static String nombre;
    static int edad;
    static String puesto;
    static int salario;
    static Scanner leer = new Scanner(System.in);
    static int i, j, k, f, g, y;
    

    public static void main(String[] args) {

        System.out.println("Introducir nombre, edad, puesto y salario separados por espacios.");
        System.out.println("Bombero 1");
        CocheBomberos miCoche = new CocheBomberos();
        nombre = leer.next();
        edad = leer.nextInt();
        puesto = leer.next();
        salario = leer.nextInt();
        Bombero bombero1 = new Bombero(nombre, edad, puesto, salario);

        System.out.println("Bombero 2: ");
        nombre = leer.next();
        edad = leer.nextInt();
        puesto = leer.next();
        salario = leer.nextInt();
        Bombero bombero2 = new Bombero(nombre, edad, puesto, salario);

        System.out.println("Bombero 3: ");
        nombre = leer.next();
        edad = leer.nextInt();
        puesto = leer.next();
        salario = leer.nextInt();
        Bombero bombero3 = new Bombero(nombre, edad, puesto, salario);

        System.out.println("Bombero 4: ");
        nombre = leer.next();
        edad = leer.nextInt();
        puesto = leer.next();
        salario = leer.nextInt();
        Bombero bombero4 = new Bombero(nombre, edad, puesto, salario);

        System.out.println("Bombero 5: ");
        nombre = leer.next();
        edad = leer.nextInt();
        puesto = leer.next();
        salario = leer.nextInt();
        Bombero bombero5 = new Bombero(nombre, edad, puesto, salario);

        System.out.println("Bombero 6: ");
        nombre = leer.next();
        edad = leer.nextInt();
        puesto = leer.next();
        salario = leer.nextInt();
        Bombero bombero6 = new Bombero(nombre, edad, puesto, salario);

        OperacionBombero operacion = new OperacionBombero();
        operacion.ponerBomberos(bombero1, bombero2, bombero3, bombero4, bombero5, bombero6);
        while (true) {
            System.out.println("Operacion a realizar:");
            System.out.println("    1. Sumar.");
            System.out.println("    2. Preparar coche.");

            int c = leer.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Numero del primer bombero a sumar: ");
                    i = leer.nextInt()-1;
                    System.out.println("Numero del segundo: ");
                    j = leer.nextInt()-1;

                    System.out.println(operacion.suma(i, j).toString());
                    break;
                case 2:

                    System.out.println("Bomberos a meter en el coche: ");
                    k = leer.nextInt();

                    while (k > 6 || k == 0) {
                        System.out.println("Los coches solo puedes contener un maximo de 6 bomberos y al menos 1");
                        k = leer.nextInt();
                    }

                    switch (k) {
                        case 1:
                            System.out.println("Numero del bombero: ");
                            i = leer.nextInt()-1;
                            operacion.prepararCoche1(i);
                            miCoche = operacion.prepararCoche1(i);
                            System.out.println(miCoche.toString());
                            break;
                        case 2:
                            System.out.println("Primer bombero: ");
                            i = leer.nextInt()-1;
                            System.out.println("Segundo bombero: ");
                            j = leer.nextInt()-1;
                            operacion.prepararCoche2(i, j);
                            miCoche = operacion.prepararCoche2(i, j);
                            System.out.println(miCoche.toString());
                            break;
                        case 3:
                            System.out.println("Primer bombero: ");
                            i = leer.nextInt()-1;
                            System.out.println("Segundo bombero: ");
                            j = leer.nextInt()-1;
                            System.out.println("Tercer bombero: ");
                            k = leer.nextInt()-1;
                            miCoche = operacion.prepararCoche3(i, j, k);
                            System.out.println(miCoche.toString()); 
                            break;
                        case 4:
                            System.out.println("Primer bombero: ");
                            i = leer.nextInt()-1;
                            System.out.println("Segundo bombero: ");
                            j = leer.nextInt()-1;
                            System.out.println("Tercer bombero: ");
                            k = leer.nextInt()-1;
                            System.out.println("Cuarto bombero: ");
                            f = leer.nextInt()-1;
                            operacion.prepararCoche4(i, j, k, f);
                            miCoche = operacion.prepararCoche4(i, j, k, f);
                            System.out.println(miCoche.toString());
                            break;
                        case 5:
                            System.out.println("Primer bombero: ");
                            i = leer.nextInt()-1;
                            System.out.println("Segundo bombero: ");
                            j = leer.nextInt()-1;
                            System.out.println("Tercer bombero: ");
                            k = leer.nextInt()-1;
                            System.out.println("Cuarto bombero: ");
                            f = leer.nextInt()-1;
                            System.out.println("Quinto bombero: ");
                            g = leer.nextInt()-1;
                            operacion.prepararCoche5(i, j, k, f, g);
                            miCoche = operacion.prepararCoche5(i, j, k,f,g);
                            System.out.println(miCoche.toString());
                            break;
                        case 6:
                            System.out.println("Primer bombero: ");
                            i = leer.nextInt()-1;
                            System.out.println("Segundo bombero: ");
                            j = leer.nextInt()-1;
                            System.out.println("Tercer bombero: ");
                            k = leer.nextInt()-1;
                            System.out.println("Cuarto bombero: ");
                            f = leer.nextInt()-1;
                            System.out.println("Quinto bombero: ");
                            g = leer.nextInt()-1;
                            System.out.println("Sexto bombero: ");
                            y = leer.nextInt()-1;
                            operacion.prepararCoche6(i, j, k, f, g, y);
                            miCoche = operacion.prepararCoche6(i, j, k,f,g,y);
                            System.out.println(miCoche.toString());
                            break;
                    }

            }
        }

    }
}

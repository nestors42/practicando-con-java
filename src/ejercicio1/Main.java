package ejercicio1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

/*
* Ejercicio 1:
Escribe un programa en Java que solicite al usuario ingresar su edad y determine si es mayor de edad o no.
*  Si la edad es mayor o igual a 18, el programa debe imprimir 'Eres mayor de edad';
*  de lo contrario, debe imprimir 'Eres menor de edad'.
* */

//        escribo variables que vamos a pedirle al usuario
        int edad = 0;

        System.out.println("ingrese su edad");

        Scanner teclado = new Scanner(System.in);
        edad = teclado.nextInt();
        System.out.println(edad);

        if (edad >= 18){
            System.out.println("eres mayor de edad");
        }else {
            System.out.println("eres menor de edad");
        }







    }
}
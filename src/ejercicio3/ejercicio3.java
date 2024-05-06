package ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        /*
        *
        * Ejercicio 3:
Desarrolla un programa en Java que solicite al usuario ingresar un número entero.
*  El programa debe determinar
*  si el número ingresado es positivo, negativo o igual a cero, e imprimir el resultad
        * */

        int numeroUsuario;
        System.out.println("ingrese un numero");
        Scanner teclado = new Scanner(System.in);
        numeroUsuario = teclado.nextInt();
//        System.out.println(numeroUsuario);

        if(numeroUsuario > 0){
            System.out.println("el numero es positivo");
        } else if (numeroUsuario == 0) {
            System.out.println("el numero es igual a cero");
        }else {
            System.out.println("el numero es negativo");
        }



    }
}

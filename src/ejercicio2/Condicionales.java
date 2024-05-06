package ejercicio2;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {

        /*
        * Ejercicio 2:
Crea un programa en Java que calcule el precio total de una compra en función del monto de la compra y la edad del cliente.
*  Si el monto de la compra es mayor o igual a 1000 y el cliente es mayor de 60 años, se aplicará un descuento del 15%.
*  De lo contrario, no se aplicará ningún descuento. El programa debe imprimir el precio total a pagar.
        * */


        int edad;
        int descuento = 0;
        int precioTotal = 0;
        int monto;

        System.out.println("ingrese el monto de la compra");

        Scanner teclado = new Scanner(System.in);
        monto = teclado.nextInt();
//        System.out.println(monto);
        System.out.println("ingrese su edad");
        edad = teclado.nextInt();
//        System.out.println(edad);

        if(monto >= 1000 && edad >= 60){
            descuento = (int) (monto * .15);
            System.out.println("su compra fue de: $"+ monto + ", usted tiene un descuento de: "+ "$"+descuento);
            System.out.println("Precio final: $"+ (precioTotal = monto - descuento));
        }else {
            System.out.println("su compra fue de: "+ monto);
        }




    }
}

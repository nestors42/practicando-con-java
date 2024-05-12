package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {


//Escribe un programa en el que el usuario ingrese el día de la semana como un número (1 para lunes, 2 para martes, etc.).
// Luego, utiliza un switch para mostrar un mensaje que indique si es un día laborable o un fin de semana."

        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el dia");
        int numeroDia = teclado.nextInt();
        String mostrarMensaje;

        switch (numeroDia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                mostrarMensaje = "es un dia laborable";
                break;
            case 6:
            case 7:
                mostrarMensaje = "es un fin de semana, NO es laborable";
                break;
            default:
                mostrarMensaje = "Numero ingresado invalido, ingrese del 1 al 7";
        }

        System.out.println(mostrarMensaje);






    }
}

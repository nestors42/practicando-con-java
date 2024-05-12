package ejercicio5;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

//        Ejercicio 5
//Pide al usuario un número entre 0 y 99 y muéstralo escrito en letras .
//
//Ejemplo: 56 (cincuenta y seis) o 56 ( cincuenta y seis )


        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese un numero entre el 0 y el 99");
        int numeroUsuario = teclado.nextInt();
        String convertido;
//        System.out.println(numeroUsuario);

        switch (numeroUsuario) {
            case 1:
                convertido = "uno";
                System.out.println("Se escribe: "+convertido);
                break;
            case 2: convertido = "dos";
                System.out.println("Se escribe: "+convertido);
                break;
            case 3:
                convertido = "tres";
                System.out.println("Se escribe: "+convertido);
                break;
            case 4:
                convertido = "cuatro";
                System.out.println("Se escribe: "+convertido);
                break;
            case 5:
                convertido = "cinco";
                System.out.println("Se escribe: "+convertido);
                break;
            case 6:
                convertido = "seis";
                System.out.println("Se escribe: "+convertido);
                break;
            case 7:
                convertido = "siete";
                System.out.println("Se escribe: "+convertido);
                break;
            case 8:
                convertido = "ocho";
                System.out.println("Se escribe: "+convertido);
                break;
            case 9:
                convertido = "nueve";
                System.out.println("Se escribe: "+convertido);
                break;
            case 10:
                convertido = "diez";
                System.out.println("Se escribe: "+convertido);
                break;



        }



    }
}

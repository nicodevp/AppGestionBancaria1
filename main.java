/*
Crear un programa que genere números enteros
aleatorios y muestre cuáles son primos y cuáles no.
Debe seguir las siguientes condiciones:
1. La cantidad de números aleatorios será indicada
por el usuario.
2. Los números aleatorios estarán comprendidos entre
1 y el número máximo sugerido por el usuario.
*/


import java.util.Scanner;
import java.util.Random;


public class main{
    public static void main(String args[]){

        // creacion scanner y random
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // creation values and lenght for the array
        System.out.print("Ingrese la cantidad de numeros aleatorios a realizar: ");
        int cantidad = scanner.nextInt();
        int[] numeros = new int[cantidad];
        System.out.print("Ingrese el numero maximo para generar los aleatorios: ");
        int maximo = scanner.nextInt();


        // creation array with values the client

        for(int i = 0; i < cantidad; i++){
            numeros[i] = random.nextInt(1, maximo);
            if (numeros[i] % 2 == 1){
                System.out.println("El numero " + numeros[i] + " es impar.");
            } else {
                System.out.println("El numero " + numeros[i] + " es par.");
            }

        }



    }
}
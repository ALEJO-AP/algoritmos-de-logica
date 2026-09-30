package EjerciciosCesde;

import java.util.Scanner;

public class RecorrerUnArrayUsandoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] ages = new int[7];

        int i = 0;

        while (i < 7){
            System.out.print("Digite la edad " + (i+1) + ": ");
            ages[i] = scanner.nextInt();
            i++;
        }

        int j = 0;

        System.out.println("Las edades ingresadas son:");
        while (j < 7) {
            System.out.println("Edad " + (j+1) + ": " + ages[j]);
            j++;
        }
    }
}

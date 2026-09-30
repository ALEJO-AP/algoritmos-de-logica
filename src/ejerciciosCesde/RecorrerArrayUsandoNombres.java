package EjerciciosCesde;

import java.util.Scanner;

public class RecorrerArrayUsandoNombres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = new String[4];

        int i = 0;

        while (i < 4){
            System.out.print("Digite el nombre de la posicion " + (i+1) + ": ");
            names[i] = scanner.nextLine();
            i++;
        }

        int j = 0;

        while (j < 4){
            System.out.println((j+1) + ": " + names[j]);
            j++;
        }
    }
}

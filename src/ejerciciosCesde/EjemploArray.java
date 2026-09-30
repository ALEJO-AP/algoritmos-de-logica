package EjerciciosCesde;

import java.util.Scanner;

public class EjemploArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] names = {"Maria","Luis","Juan"}; // array inicializado

        int ages[] = new int[4]; // array declarado

        ages[0] = 23;
        ages[1] = 26;
        ages[2] = 34;
        ages[3] = 19;

        System.out.println("Posición 1: " + ages[0]);
        System.out.println("Posición 2: " + ages[1]);
        System.out.println("Posición 3: " + ages[2]);
        System.out.println("Posición 4: " + ages[3]);

        // las siguientes lineas se usan para capturar valores por consola.
         double[] salaries = new double[3];

         salaries[0] = scanner.nextDouble();
         salaries[1] = scanner.nextDouble();
         salaries[2] = scanner.nextDouble();

        System.out.println(salaries[0] + "\n" + salaries[1] + "\n" + salaries[2]);

    }
}

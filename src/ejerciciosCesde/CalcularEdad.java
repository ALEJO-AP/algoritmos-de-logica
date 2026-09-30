package EjerciciosCesde;

import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroNacimiento;
        int numeroActual;
        int edad;

        System.out.print("Digite el año de nacimiento: ");
        numeroNacimiento = scanner.nextInt();
        System.out.print("Digite el año actual: ");
        numeroActual = scanner.nextInt();

        edad = numeroActual - numeroNacimiento;

        if (edad >= 18){
            System.out.println("Su edad aproximada es: " + edad + "\n" + "Y usted es mayor de edad. ");
        } else {
            System.out.println("Su edad aproximada es: " + edad + "\n" + "Y usted es menor de edad.");
        }
    }
}

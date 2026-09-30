package EjerciciosCesde;

import java.util.Scanner;

public class ejemploSumaFuncionVacia {

    public static int sumar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int resultado,num1,num2;

        System.out.print("Ingrese el primer número: ");
        num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el segundo número: ");
        num2 = Integer.parseInt(scanner.nextLine());

        resultado = sumar(num1, num2);

        System.out.println("La suma es: " + resultado);

        scanner.close();
    }
} 
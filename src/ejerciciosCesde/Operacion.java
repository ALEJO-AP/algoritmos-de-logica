package logicnotes;

import java.util.Scanner;

public class Operacion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero1;
        int numero2;
        int resultado;

        System.out.print("Digite el primer número: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite el segundo número: ");
        numero2 = scanner.nextInt();

        resultado = numero1 * numero2;

        System.out.println("El resultado de la suma es: " + resultado);
    }
}

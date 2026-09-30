package EjerciciosCesde;

import java.util.Scanner;

public class ejemplofuncionVacia {

    public static void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombre; 

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        saludar(nombre); 

        scanner.close();
    }
}


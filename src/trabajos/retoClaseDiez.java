package trabajos;

import java.util.Scanner;

public class retoClaseDiez {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String[] usuarios = new String[5];
        String[] claves = new String[5];
        String[] nombres = new String[5];
        String[] correos = new String[5];
        int[] edades = new int[5];

        int cantidad = 0; // cuántos usuarios hay registrados
        int opcion = 0;


        while (opcion != 3) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Registrarse");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Salir");
            System.out.print("Elija una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {

                case 1:
                    if (cantidad < 5) {
                        System.out.println("\nREGISTRO");
                        System.out.print("Ingrese un nombre de usuario: ");
                        usuarios[cantidad] = leer.nextLine();

                        System.out.print("Ingrese una clave: ");
                        claves[cantidad] = leer.nextLine();

                        System.out.print("Ingrese su nombre completo: ");
                        nombres[cantidad] = leer.nextLine();

                        System.out.print("Ingrese su correo: ");
                        correos[cantidad] = leer.nextLine();

                        System.out.print("Ingrese su edad: ");
                        edades[cantidad] = leer.nextInt();
                        leer.nextLine();

                        cantidad = cantidad + 1;
                        System.out.println("Usuario registrado con exito!");
                    } else {
                        System.out.println("Ya no hay espacio para mas usuarios.");
                    }
                    break;

                case 2:
                    System.out.println("\nINICIAR SESION");
                    System.out.print("Usuario: ");
                    String userLogin = leer.nextLine();
                    System.out.print("Clave: ");
                    String claveLogin = leer.nextLine();

                    boolean encontrado = false;
                    int posicion = -1;

                    int i = 0;
                    while (i < cantidad) {
                        if (usuarios[i].equals(userLogin) && claves[i].equals(claveLogin)) {
                            encontrado = true;
                            posicion = i;
                        }
                        i = i + 1;
                    }

                    if (encontrado == true) {
                        System.out.println("\nBienvenido " + nombres[posicion]);
                        System.out.println("DATOS REGISTRADOS");
                        System.out.println("Usuario: " + usuarios[posicion]);
                        System.out.println("Nombre:  " + nombres[posicion]);
                        System.out.println("Correo:  " + correos[posicion]);
                        System.out.println("Edad:    " + edades[posicion]);
                    } else {
                        System.out.println("Usuario o clave incorrectos.");
                    }
                    break;

                case 3:
                    System.out.println("Salir del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }

        leer.close();
    }
}

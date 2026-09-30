package EjerciciosCesde;

import java.util.Scanner;

public class ejercicioLogin {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);

        String correo, telefono, nombre,  clave, usuario, password;

        System.out.print("Digite su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Digite su correo: ");
        correo = sc.nextLine();
        System.out.print("Digite su teléfono: ");
        telefono = sc.nextLine();
        System.out.print("Crear contraseña: ");
        clave = sc.nextLine();

        System.out.println("\n Registro completado. Ahora inicia sesión.\n");

        System.out.print("Digite su usuario: ");
        usuario = sc.nextLine();
        System.out.print("Ingrese la contraseña: ");
        password = sc.nextLine();

        boolean accesoPermitido = false;

        if(usuario.equals(nombre)){
            if(password.equals(clave)){
                accesoPermitido = true;
            } else {
                System.out.print("La contraseña ingresada es incorrecta.");
            }
        }
        else if(usuario.equals(correo)){
            if(password.equals(clave)){
                accesoPermitido = true;
            } else {
                System.out.print("La contraseña ingresada es incorrecta.");
            }
        }
        else if(usuario.equals(telefono)){
            if(password.equals(clave)){
                accesoPermitido = true;
            } else {
                System.out.print("La contraseña ingresada es incorrecta.");
            }            
        } else {
            System.out.print("El usuario ingreso es incorrecto");
        }
        
        if (accesoPermitido) {
            System.out.println(" ¡Bienvenido " + nombre + "! Acceso concedido.");
        } else {
            System.out.println(" Acceso denegado. Revisa tus datos.");
        }

    }
}

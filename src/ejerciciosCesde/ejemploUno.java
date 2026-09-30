package EjerciciosCesde;

import java.util.Scanner;

public class ejemploUno {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        String origen, destino, nombre;
        int precioBase, precioFinal, distancia;

        System.out.print("Digite su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Digite el lugar de inicio del viaje: ");
        origen = sc.nextLine();
        System.out.print("Digite el destino: ");
        destino = sc.nextLine();
        System.out.print("digite la distancia del viaje: ");
        distancia = sc.nextInt();
        System.out.print("digite el precio base: ");
        precioBase = sc.nextInt();
        
        precioFinal = precioBase + (distancia * 100);

        System.out.println("nombre: " + nombre);
        System.out.println("Origen: " + origen);
        System.out.println("Destino " + destino); 
        System.out.println("Distancia: " + distancia + "km ");
        System.out.println("valor del pasaje es de: $" + precioFinal);

    };
    
}
package notes;

import java.util.Scanner;

public class Lavadero {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int particulares;
        int camionetas;
        int buses;
        int motos;
        float porcentajeParticulares, porcentajeCamionetas, porcentajeBuses, porcentajeMotos,total;

        System.out.print("Ingrese la cantidad de particulares: ");
        particulares = scanner.nextInt();
        System.out.print("Ingrese la cantidad de camionetas: ");
        camionetas = scanner.nextInt();
        System.out.print("Ingrese la cantidad de buses: ");
        buses = scanner.nextInt();
        System.out.print("Ingrese la cantidad de motos: ");
        motos = scanner.nextInt();

        total = particulares + camionetas + buses + motos;

        porcentajeParticulares = particulares / total * 100;
        porcentajeCamionetas = camionetas / total * 100;
        porcentajeBuses = buses / total * 100;
        porcentajeMotos = motos / total * 100;

        System.out.println("El porcentaje de los vehículos en el parqueadero son los siguientes: " + "\n"
                + "Particulares: " + String.format("%.2f", porcentajeParticulares) + "%" + "\n"
                + "Camionetas: " + String.format("%.2f", porcentajeCamionetas) + "%" + "\n"
                + "Buses: " + String.format("%2f", porcentajeBuses) + "%" + "\n"
                + "Motos: " + String.format("%2f", porcentajeMotos) + "%");
    }
}

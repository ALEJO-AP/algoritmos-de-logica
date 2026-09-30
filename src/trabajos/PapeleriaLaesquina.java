package EjerciciosCesde;

import java.util.Scanner;

public class PapeleriaLaesquina {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double totalCompra = 0;
        int totalProductos = 0;

        String continuar = "S";

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el valor unitario: ");
            double valorUnitario=scanner.nextDouble();
            System.out.print("Ingrese la cantidad: ");
            int cantidad = scanner.nextInt();

            scanner.nextLine();

            double subtotal = valorUnitario * cantidad;

            System.out.println("Subtotal de " + nombre + ": $" + subtotal);

            totalCompra = totalCompra + subtotal;
            totalProductos = totalProductos + 1;

            System.out.print("precione la tecla S si desea registrar otro producto o precione cualquier tecla para omitir: ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("S"));

        double porcentajeDescuento = 0;

        if(totalCompra < 20000){
            porcentajeDescuento = 0;
        } else if (totalCompra < 50000) {
            porcentajeDescuento = 0.05;
        } else if (totalCompra < 100000) {
            porcentajeDescuento = 0.10;
        } else {
            porcentajeDescuento = 0.15;
        }
        double descuentoVolumen = totalCompra * porcentajeDescuento;
        double totalConDescuento = totalCompra - descuentoVolumen;

        System.out.println("Seleccione el medio de pago: ");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.println("3. Tranferencia");
        System.out.println("4. Otro");
        System.out.println("Ingrese el número de opción: ");
        int opcionPago = scanner.nextInt();

        double ajustePago = 0;

        switch (opcionPago){
            case 1:
                ajustePago = totalConDescuento * 0.02;
                System.out.println("Medio de pago: Efectivo (2% descuento adicional)");
                break;
            case 2: ajustePago = totalConDescuento * 0.03;
                System.out.println("Medio de pago: Tarjeta (3% recargo)");
                break;
            case 3:
        }
    }
}

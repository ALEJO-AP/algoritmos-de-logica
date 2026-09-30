package EjerciciosCesde;

import java.util.Scanner;

public class conficionalAnidado {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        /*ejemplo de condicional compuesto usando if y else */

        float nota1, nota2, nota3, promedio;

        System.out.print("Digite la primer nota: ");
        nota1 = sc.nextFloat();
        System.out.print("Digite la segunda nota: ");
        nota2 = sc.nextFloat();
        System.out.print("Digite la tercer nota: ");
        nota3 = sc.nextFloat();

        promedio = (nota1 + nota2 + nota3)/3;
        // el comando de la linea 21 sirve para que me muestre la nota solo con un numero decimal.
        String resultado = String.format("%.1f", promedio).replace('.', ',');

        if (promedio < 3) {
            System.out.print("Tu nota de " + resultado + " es insuficiente.");
        } else if (promedio >= 3 && promedio < 4){
            System.out.print("Tu nota de " + resultado + " es sobresaliente.");
        } else if(promedio >= 4 && promedio < 5){
            System.out.print("Tu nota de " + resultado + " es superior.");
        } else if(promedio == 5){
            System.out.print("Tu nota de " + resultado + " es excelente.");
        } else {
            System.out.print("Error, usted a digitado mal los valores de las notas.");
        }

    }

}

package EjerciciosCesde;

public class WhileAcumulador {
    public static void main(String[] args){

        int contador = 0;

        do {

            System.out.println("Número de intentos: " + ++contador);

        }while (contador < 3);
    }
}

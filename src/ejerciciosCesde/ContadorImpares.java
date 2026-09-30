package EjerciciosCesde;

public class ContadorImpares {
    public static void main(String[] args) {

        int contador = 0;

        while (contador != 100){

            if (contador % 2 == 1){
                System.out.println(contador);

            }
            contador++;
        }
    }
}
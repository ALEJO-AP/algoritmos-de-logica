package ejerciciosCesde;

public class metodosReturn {

    public static void main(String[] args) {
        int resultado = sumerDosNumeros(100,500);
        System.out.println("el resultado es: " + resultado);
    }
    public static int sumerDosNumeros(int numero1, int numero2){
        int resultado = numero1 + numero2;
        return resultado;
    }

}

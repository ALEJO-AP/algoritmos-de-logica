package ejerciciosCesde;

public class metodosVoid {

    public static void main(String[] args) {
        saludarPorNombre("Alejo");
        sumarDosNumeros(100,220);
    }

    public static void saludarPorNombre(String nombre){
        System.out.println("Hola " + nombre);
    }

    public static void sumarDosNumeros (int numero1, int numero2){
        int resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);
    }

}

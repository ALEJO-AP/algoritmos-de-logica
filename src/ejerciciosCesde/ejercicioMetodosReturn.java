package ejerciciosCesde;

public class ejercicioMetodosReturn {

    public static void main(String[] args) {
        float promedio = promedioNota(4.5f, 3f, 3.5f);
        System.out.println("el promedio de nota es: " + promedio);
    }

    public static float promedioNota(float nota1, float nota2, float nota3){
        float promedio = (nota1+nota2+nota3)/3;
        return promedio;
    }
}

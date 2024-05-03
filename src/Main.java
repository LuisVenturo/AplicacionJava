import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pelicula Matrix");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";

        String sinopsis = """
                La mejor película del fin del milenio
                """;

        System.out.println("Pelicula :" +nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3)/3;
        System.out.println("Mediante la evaluación de Matrix: "+mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){

            System.out.println("Pelicula popular ene el momento");
        }else {
            System.out.println("Pelicula retro, que vale la pena ver");
        }

        for (int i = 0; i< 3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("INgrese la nota que le darías a matrix ");
            double notaMatrix = sc.nextDouble();
            mediaEvaluacion = mediaEvaluacion + notaMatrix;

        }
        System.out.println("La media de la pelicula " +
                "matrix calculada por el usuario es: "+mediaEvaluacion/3);
    }
}

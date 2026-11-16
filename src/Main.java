

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Pregunta del ejercicio
        String pregunta = "Indica cual de las siguientes opciones no es un tipo primitivo en Java:";

        // Posibles respuestas
        String[] respuestas = {
                "a. int",
                "b. char",
                "c. boolean",
                "d. String"
        };

        // Mostrar pregunta
        System.out.println(pregunta);

        // Mostrar las cuatro opciones
        for (int i = 0; i < respuestas.length; i++) {
            System.out.println(respuestas[i]);
        }

    }
}

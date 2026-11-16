import java.util.Scanner;
public class Ex5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String pregunta = "Indica cual de las siguientes opciones no es un tipo primitivo en Java:";
        String[] respuestas = {
                "a. int",
                "b. char",
                "c. boolean",
                "d. String"
        };

        System.out.println(pregunta);
        for (int i = 0; i < respuestas.length; i++) {
            System.out.println(respuestas[i]);
        }

    }
}

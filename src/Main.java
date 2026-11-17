import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < Preguntas.preguntas.length; i++) {
            System.out.println(Preguntas.preguntas[i]);

            for (String opcion : Preguntas.opciones[i]) {
                System.out.println(opcion);
            }

            System.out.print("Tu respuesta: ");

            if (!teclado.hasNextLine()) {
                break;
            }

            String respuesta = teclado.nextLine();

            if (!respuesta.equals("a") && !respuesta.equals("b")
                    && !respuesta.equals("c") && !respuesta.equals("d")) {
                break;
            }

            comprobar(respuesta, Preguntas.respuestasCorrectas[i]);
            System.out.println();
        }

        teclado.close();
    }

    static void comprobar(String respuesta, String correcta) {
        if (respuesta.equals(correcta)) {
            System.out.println("Has acertado");
        } else {
            System.out.println("Has fallado");
        }
    }
}



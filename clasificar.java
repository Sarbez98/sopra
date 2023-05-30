import java.util.Scanner;

class Persona {
    String SEXO;
    int EDAD;
}

public class clasificar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Persona[] PERSONAS = new Persona[50];
        int mayorEdad = 0;//Cantidad de personas mayores de edad
        int menorEdad = 0;//Cantidad de personas menores de edad
        int hombresMayor = 0;//Cantidad de personas masculinas mayores de edad.
        int mujeresMenor = 0;//Cantidad de personas femeninas menores de edad
        for (int i = 0; i < 50; i++) {
            PERSONAS[i] = new Persona();
            System.out.print("LEER PERSONAS: ");
            System.out.print("SEXO: ");
            PERSONAS[i].SEXO = scanner.next();
            System.out.print("EDAD: ");
            PERSONAS[i].EDAD = scanner.nextInt();
            if (PERSONAS[i].EDAD >= 18) {
                mayorEdad++;
                if (PERSONAS[i].SEXO.equals("M")) {
                    hombresMayor++;
                }
            } else {
                menorEdad++;
                if (PERSONAS[i].SEXO.equals("F")) {
                    mujeresMenor++;
                }
            }
        }
        double porcentajeMayoresDeEdad = (mayorEdad / 50.0) * 100;
        double porcentajeMujeres = (mujeresMenor + (50 - hombresMayor - mujeresMenor - (50 - mayorEdad))) / 50.0 * 100;
        System.out.println("a. Cantidad de personas mayores de edad: " + mayorEdad);
        System.out.println("b. Cantidad de personas menores de edad: " + menorEdad);
        System.out.println("c. Cantidad de personas masculinas mayores de edad: " + hombresMayor);
        System.out.println("d. Cantidad de personas femeninas menores de edad: " + mujeresMenor);
        System.out.println("e. Porcentaje que representan las personas mayores de edad respecto al total de personas: " + porcentajeMayoresDeEdad + "%");
        System.out.println("f. Porcentaje que representan las mujeres respecto al total de personas: " + porcentajeMujeres + "%");
    }
}

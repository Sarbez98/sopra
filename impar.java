import java.util.Scanner;

public class impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("LEER NUMERO: ");
        int NUMERO = scanner.nextInt();
        if (NUMERO % 2 == 0) {
            System.out.println("Numero par.");
            for (int i = NUMERO; i >= 0; i -= 2) {
                System.out.println(i);
            }
        } else {
            for (int i = NUMERO; i >= 1; i -= 2) {
                System.out.println("Numero impar.");
                System.out.println(i);
            }
        }
    }
}

import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("LEER HORASTRABAJADAS: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("LEER TARIFA: ");
        double tarifa = scanner.nextDouble();

        double sueldo;

        if (horasTrabajadas > 40) {
            int horasplus = horasTrabajadas - 40;//horas extras
            double tarifaplus = tarifa * 1.5;//tarifa+50%
            
            double salario = tarifa * 40;//salario base
            double salarioplus = tarifaplus * horasplus;//horas extras con su tarifaplus
            
            sueldo = salario + salarioplus;//suma
        } else {
            sueldo = tarifa * horasTrabajadas;
        }

        System.out.println("El sueldo es: " + sueldo);
    }
}

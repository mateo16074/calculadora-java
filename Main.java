import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int num2 = scanner.nextInt();

        Operaciones operaciones = new Operaciones(num1, num2);

        System.out.println("Seleccione la operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        int resultado = 0;

        try{
            switch (opcion) {
                case 1:
                    resultado = operaciones.suma();
                    break;
                case 2:
                    resultado = operaciones.resta();
                    break;
                case 3:
                    resultado = operaciones.multiplicacion();
                    break;
                case 4:
                    resultado = operaciones.division();
                    break;

            }

            System.out.println("El resultado es: " + resultado);

        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}

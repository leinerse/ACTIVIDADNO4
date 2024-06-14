/*
    Crear una calculadora con 8 operaciones matemáticas, se debe presentar un menú con el
    nombre de las operaciones (pedir 2 números) y mostrar el resultado. Una vez mostrado el
    resultado se debe mostrar otra vez el menú. Hacer validaciones de datos.
     */
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculator = new Calculadora();
        boolean exit = false;

        while (!exit) {
            System.out.println("Selecciona una operacion:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Modulo");
            System.out.println("6. Potencia");
            System.out.println("7. Raiz cuadrada");
            System.out.println("8. Valor absoluto");
            System.out.println("9. Salir");

            int choice = scanner.nextInt();

            if (choice == 9) {
                exit = true;
                System.out.println("Saliendo...");
                continue;
            }

            double num1 = 0, num2 = 0;
            if (choice >= 1 && choice <= 6) {
                System.out.print("Introduce el primer numero: ");
                num1 = scanner.nextDouble();
                System.out.print("Introduce el segundo numero: ");
                num2 = scanner.nextDouble();
            } else if (choice == 7 || choice == 8) {
                System.out.print("Introduce el numero: ");
                num1 = scanner.nextDouble();
            } else {
                System.out.println("Opción no valida.");
                continue;
            }

            try {
                switch (choice) {
                    case 1:
                        System.out.println("Resultado: " + calculator.add(num1, num2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + calculator.subtract(num1, num2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + calculator.multiply(num1, num2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + calculator.divide(num1, num2));
                        break;
                    case 5:
                        System.out.println("Resultado: " + calculator.modulus(num1, num2));
                        break;
                    case 6:
                        System.out.println("Resultado: " + calculator.power(num1, num2));
                        break;
                    case 7:
                        System.out.println("Resultado: " + calculator.squareRoot(num1));
                        break;
                    case 8:
                        System.out.println("Resultado: " + calculator.absoluteValue(num1));
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }

            System.out.println();
        }

        scanner.close();
    }
}

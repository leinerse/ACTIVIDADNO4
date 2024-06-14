
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Alcancia alcancia = new Alcancia();
        boolean continuar = true;

        while (continuar) {
            System.out.println("1. Ingresar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Consultar total de dinero");
            System.out.println("4. Consultar transacciones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad de dinero a ingresar: ");
                    double ingreso = scanner.nextDouble();
                    alcancia.ingresarDinero(ingreso);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de dinero a retirar: ");
                    double retiro = scanner.nextDouble();
                    alcancia.retirarDinero(retiro);
                    break;
                case 3:
                    System.out.println("Total de dinero en la alcancía: $" + alcancia.getTotalDinero());
                    break;
                case 4:
                    System.out.println("Transacciones realizadas:");
                    for (Transaccion transaccion : alcancia.getTransacciones()) {
                        System.out.println(transaccion);
                    }
                    System.out.println("Total de transacciones: " + alcancia.getTotalTransacciones());
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            System.out.println();
        }

        scanner.close();
    }
}

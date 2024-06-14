
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReportePromedios reporte = new ReportePromedios();

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el apellido del estudiante: ");
            String apellido = scanner.nextLine();

            System.out.print("Ingrese la carrera del estudiante: ");
            String carrera = scanner.nextLine();

            System.out.print("Ingrese el semestre del estudiante: ");
            int semestre = scanner.nextInt();

            System.out.print("Ingrese la cantidad de notas del estudiante: ");
            int cantidadNotas = scanner.nextInt();

            double[] notas = new double[cantidadNotas];
            for (int i = 0; i < cantidadNotas; i++) {
                System.out.print("Ingrese la nota " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            }

            // Limpiar el buffer
            scanner.nextLine();

            Estudiantes estudiantes = new Estudiantes(nombre, apellido, carrera, semestre, notas);
            reporte.agregarEstudiantes(estudiantes);

            System.out.print("¿Desea agregar otro estudiante? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        reporte.imprimirReporte();
        scanner.close();
    }
}

/*
 El departamento escolar de la facultad de ingeniería necesita obtener un reporte global de
los promedios de sus estudiantes y que muestre el promedio de cada uno, nombres,
apellidos, carrera y semestre. Se debe imprimir el promedio global y cada uno de los datos
de los estudiantes.
 */
import java.util.ArrayList;

public class ReportePromedios {

    private ArrayList<Estudiantes> estudiantes;

    public ReportePromedios() {
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiantes(Estudiantes estudiante) {
        estudiantes.add(estudiante);
    }

    public void imprimirReporte() {
        double sumaPromedios = 0;

        for (Estudiantes estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("Carrera: " + estudiante.getCarrera());
            System.out.println("Semestre: " + estudiante.getSemestre());
            System.out.println("Promedio: " + estudiante.getPromedio());
            System.out.println("-------------------------");

            sumaPromedios += estudiante.getPromedio();
        }

        double promedioGlobal = sumaPromedios / estudiantes.size();
        System.out.println("Promedio Global: " + promedioGlobal);
    }
}

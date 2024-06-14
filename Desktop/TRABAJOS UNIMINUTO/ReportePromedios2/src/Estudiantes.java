/*
El departamento escolar de la facultad de ingeniería necesita obtener un reporte global de
los promedios de sus estudiantes y que muestre el promedio de cada uno, nombres,
apellidos, carrera y semestre. Se debe imprimir el promedio global y cada uno de los datos
de los estudiantes.
 */
public class Estudiantes {

    private String nombre;
    private String apellido;
    private String carrera;
    private int semestre;
    private double[] notas;

    public Estudiantes(String nombre, String apellido, String carrera, int semestre, double[] notas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.semestre = semestre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public double getPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}

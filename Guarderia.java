import java.util.ArrayList;
import java.util.List;

public class Guarderia {
    private String nombre, NIT;
    private List<Estudiante> estudiantes;

    public Guarderia(String nombre, String NIT) {
        this.nombre = nombre;
        this.NIT = NIT;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void aniadirEstudiante(Estudiante estudiante) { estudiantes.add(estudiante); }

    public void eliminarEstudiante(Estudiante estudiante) { estudiantes.remove(estudiante); }

    public void mostrarInformacion() {
        System.out.println("Guarderia: " + nombre);
        System.out.println("NIT: " + NIT);
        System.out.println("Lista de Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public List<Estudiante> obtenerEstudiantesMayoresA5() {
        List<Estudiante> mayoresA5 = new ArrayList<>();
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getEdad() > 5) {
                mayoresA5.add(estudiante);
            }
        }
        return mayoresA5;
    }

    @Override
    public String toString() {
        return "Guarderia{" +
                "nombre='" + nombre + '\'' +
                ", NIT='" + NIT + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }
}


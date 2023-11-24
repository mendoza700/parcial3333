package ejercicio3_7;
import java.util.Scanner;
public class Curso {
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;

    public Curso(int cantidadMaximaEstudiantes) {
        estudiantes = new Estudiante[cantidadMaximaEstudiantes];
        cantidadEstudiantes = 0;
    }
///////////////////////////
    public void añadirEstudiante(Estudiante estudiante) {
        if (cantidadEstudiantes < estudiantes.length) {
            estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
            System.out.println(" el estudiante fue añadido correctamente.");
        } else {
            System.out.println("ya no hay cupo para para etsudiantes");
        }
    }
///////////////////////////////
    public Estudiante buscarEstudiante(int codigo) {
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                return estudiantes[i];
            }
        }
        return null;
    }

    public void eliminarEstudiante(int codigo) {
        Estudiante estudiante = buscarEstudiante(codigo);
        if (estudiante != null) {
            estudiante.mostrarInformacion();
            Scanner scanner = new Scanner(System.in);
            System.out.print("¿Está seguro que desea eliminar este estudiante? (Sí/No): ");
            String confirmacion = scanner.next();
            if (confirmacion.equalsIgnoreCase("Sí")) {
                for (int i = 0; i < cantidadEstudiantes; i++) {
                    if (estudiantes[i].getCodigo() == codigo) {
                        estudiantes[i] = estudiantes[cantidadEstudiantes - 1];
                        estudiantes[cantidadEstudiantes - 1] = null;
                        cantidadEstudiantes--;
                        System.out.println("Estudiante eliminado correctamente.");
                        return;
                    }
                }
            } else {
                System.out.println("Eliminación cancelada.");
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
///////////////////////////////////////////
    public double calcularPromedio() {
        double sumaNotas = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            sumaNotas += estudiantes[i].getNotaFinal();
        }
        return cantidadEstudiantes > 0 ? sumaNotas / cantidadEstudiantes : 0;
    }

    public int obtenerCantidadEstudiantesAprobados() {
        int cantidadAprobados = 0;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            if (estudiantes[i].getNotaFinal() >= 3.0) {
                cantidadAprobados++;
            }
        }
        return cantidadAprobados;
    }

    public double obtenerPorcentajeEstudiantesAprobados() {
        return cantidadEstudiantes > 0 ?
                ((double) obtenerCantidadEstudiantesAprobados() / cantidadEstudiantes) * 100 : 0;
    }
}


package ejercicio3_7;
import java.util.*;
public class Prueba2 {
        public static void main(String[] args) {
            Tienda2 tienda = new Tienda2("Tienda Cuántica","juan lopez", 123456);

            Computador computador1 = new Computador("racer", 50, "Intel iCore 7","Windows", 18500000);
            Computador computador2 = new Computador("Toshiba", 80,"Intel iCore 5","Windows", 15500000);
            Computador computador3 = new Computador("Mac", 100,"Intel iCore 7", "Mac", 2500000);
            tienda.añadir(computador1);
            tienda.añadir(computador2);
            tienda.añadir(computador3);
            Scanner sc = new Scanner(System.in);
            System.out.println("primeramente ponga la marca de una computadora.......\n Acer.....Toshiba.....Mac.....");
            String marca = sc.next();
            System.out.println("El computador a buscar: " + marca + " se encuentra en la posición " + tienda.buscar(marca));
            tienda.imprimir();
            System.out.println("--------------------------------------------------------------------------------------");
            Scanner scanner = new Scanner(System.in);
            int cantidadMaximaEstudiantes = 20;
            Curso curso = new Curso(cantidadMaximaEstudiantes);

            while (true) {
                System.out.println("M:");
                System.out.println(". Añadir estudiante");
                System.out.println(". Buscar estudiante por código");
                System.out.println(" Eliminar estudiante por código");
                System.out.println(" Calcular promedio del curso");
                System.out.println(" Obtener cantidad de los estudiantes");
                System.out.println(" retirar");
                System.out.print("Ingrese su opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        Estudiante estudiante = new Estudiante();
                        curso.añadirEstudiante(estudiante);
                        break;
                    case 2:
                        System.out.print("Ingrese el código del estudiante a buscar: ");
                        int codigoBuscar = scanner.nextInt();
                        Estudiante estudianteEncontrado = curso.buscarEstudiante(codigoBuscar);
                        if (estudianteEncontrado != null) {
                            estudianteEncontrado.mostrarInformacion();
                        } else {
                            System.out.println("Estudiante no encontrado.");
                        }
                        break;
                    case 3:
                        System.out.print("Ingrese el código del estudiante a eliminar: ");
                        int codigoEliminar = scanner.nextInt();
                        curso.eliminarEstudiante(codigoEliminar);
                        break;
                    case 4:
                        double promedio = curso.calcularPromedio();
                        System.out.println("Promedio del curso: " + promedio);
                        break;
                    case 5:
                        int cantidadAprobados = curso.obtenerCantidadEstudiantesAprobados();
                        double porcentajeAprobados = curso.obtenerPorcentajeEstudiantesAprobados();
                        System.out.println("Cantidad de estudiantes aprobados: " + cantidadAprobados);
                        System.out.println("Porcentaje de estudiantes aprobados: " + porcentajeAprobados + "%");
                        break;
                    case 6:
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                }
            }
        }

    }


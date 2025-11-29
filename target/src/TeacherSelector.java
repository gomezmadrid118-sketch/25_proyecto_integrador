import java.util.Scanner;

public class TeacherSelector {
    public static void ejercicio() {
        Scanner formulario = new Scanner(System.in);

        String[] nombres = {
            "Juan", "Pablo", "Oscar", "Natalia",
            "Luis", "Alba", "Juana", "Carlos",
            "Luisa", "Maria", "Santiago", "Alex"
        };

        int[] materias = {
            1, 1, 1, 1,  // Matemáticas
            2, 2, 2, 2,  // Inglés
            3, 3, 3, 3   // Química
        };

        String[] experiencia = {
            "6 años de experiencia", "15 años de experiencia", "2 años de experiencia", "9 años de experiencia",
            "5 años de experiencia", "9 años de experiencia", "8 años de experiencia", "4 años de experiencia",
            "11 años de experiencia", "21 años de experiencia", "7 años de experiencia", "8 años de experiencia"
        };

        String[] estilo = {
            "enseña poco a poco", "le gusta la dificultad", "prefiere hacer actividades y ejemplos", "es claro pero tranquilo al explicar",
            "es claro pero tranquilo al explicar", "le gusta la dificultad", "prefiere hacer actividades y ejemplos", "enseña poco a poco",
            "le gusta la dificultad", "enseña poco a poco", "prefiere hacer actividades y ejemplos", "es claro pero tranquilo al explicar"
        };

        System.out.println("=== Selección de profesores ===");
        System.out.println("¿Qué materia quiere cursar? 1 para matemáticas, 2 para inglés, 3 para química:");
        int materiaDada = formulario.nextInt();
        formulario.nextLine();

        while (true) {
            mostrarMenu(materiaDada, nombres, materias);

            System.out.println("Seleccione el profesor interesado:");
            String profe = formulario.nextLine();

            boolean encontrado = false;

            for (int i = 0; i < nombres.length; i++) {
                if (nombres[i].equalsIgnoreCase(profe)) {
                    encontrado = true;
                    mostrarInfo(nombres[i], experiencia[i], estilo[i]);

                    if (materias[i] != materiaDada) {
                        System.out.println("Este profesor no pertenece a esta materia.");
                    } else {
                        System.out.println("¿Desea elegir este docente? 1 para continuar, 2 para buscar otra opción:");
                        int opcion = formulario.nextInt();
                        formulario.nextLine();

                        if (opcion == 1) {
                            System.out.println("Docente " + nombres[i] + " elegido.");
                            return;
                        } else {
                            System.out.println("Opción cancelada.");
                        }
                    }
                }
            }

            if (!encontrado) {
                System.out.println("Profesor no encontrado. Intente de nuevo.");
            }
        }
    }

    public static void mostrarInfo(String nombre, String experiencia, String estilo) {
        System.out.println("Nombre: " + nombre);
        System.out.println(experiencia);
        System.out.println(estilo);
    }

    public static void mostrarMenu(int materia, String[] nombres, int[] materias) {
        System.out.println("=== Profesores disponibles ===");
        for (int i = 0; i < nombres.length; i++) {
            if (materias[i] == materia) {
                System.out.println(nombres[i]);
            }
        }
    }
}



















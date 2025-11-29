import java.util.Scanner;

public class inventory {
    public static void main(String[] args) throws Exception {
        Scanner selector = new Scanner(System.in);
        while (true) {
            System.out.println("=== Menú de selección de ejercicios ===");
            System.out.println("1- Condiciones de temperatura");
            System.out.println("2- Registro");
            System.out.println("3- Log In");
            System.out.println("4- Selector de profesor");
            System.out.println("5- Selección de comida");
            System.out.println("0- para salir");
            System.out.println("Seleccione una actividad:");
            int opcion = selector.nextInt();
            switch (opcion) {
                case 1:
                    ConditionsOfTemperature.ejercicio();
                    break;
                case 2:
                    Register.ejercicio();
                    break;
                case 3:
                    LogIn.ejercicio();
                    break;
                case 4:
                    TeacherSelector.ejercicio();
                    break;
                case 5:
                    purchaseFood.ejercicio();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("opcion no encontrada");
                    break;

            }
        }
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LogIn {
    public static void ejercicio() {
        Scanner validacionInicio = new Scanner(System.in);
        System.out.println("=== Inicio de Sesión ===");
        List<String> usuario = new ArrayList<>();
        usuario.add("egomez1234@cesde.net");
        usuario.add("svalera12@cesde.net");
        usuario.add("varias08@cesde.net");
        usuario.add("ausuga@cesde.net");
        usuario.add("ocordoba@cesde.net");
        List<String> contraseña = new ArrayList<>();
        contraseña.add("1035424691");
        contraseña.add("7486593887");
        contraseña.add("8695038583");
        contraseña.add("3752905729");
        contraseña.add("9117548354"); 
       while (true) {
            System.out.print("Favor diga su usuario: ");
            String user = validacionInicio.nextLine();

            System.out.print("Favor diga su contraseña: ");
            String password = validacionInicio.nextLine();

            if (usuario.contains(user)) {
                int index = usuario.indexOf(user);
                if (contraseña.get(index).equals(password)) {
                    System.out.println("Acceso permitido, redireccionando a la página");
                    break;
                } else {
                    System.out.println("Contraseña incorrecta");
                }
            } else {
                System.out.println("Usuario no encontrado");
            }

            System.out.println("El acceso fue denegado\n");
        }
    }
}
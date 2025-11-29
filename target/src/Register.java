import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Register {
    public static void ejercicio() {
        Scanner analisisDeDatos = new Scanner(System.in);
        List<String> usuario = new ArrayList<>();
        List<String> correo = new ArrayList<>();
        List<String> contraseña = new ArrayList<>();
        System.out.println("Ingrese por favor un nombre de usuario");
        while (true) {
            String entrada1 = analisisDeDatos.nextLine();
            usuario.add(entrada1);

            while (true) {
                System.out.println("Ingrese por favor un correo");
                String entrada2 = analisisDeDatos.nextLine();
                if (entrada2.contains("@")) {
                    correo.add(entrada2);
                    break;
                } else {
                    System.out.println("el correo es inválido, por favor, coloque un correo válido");
                }
            }

            while (true) {
                System.out.println("Ingrese por favor una contraseña:");
                String entrada3 = analisisDeDatos.nextLine();

                if (entrada3.length() >= 8) {
                    contraseña.add(entrada3);
                    break;
                } else {
                    System.out.println(
                            "La contraseña es menor a 8 caracteres, por favor ingrese una contraseña más larga.");
                }
            }
            System.out.println("tu cuenta ha quedado registrada");
            break;
        }
    }
}
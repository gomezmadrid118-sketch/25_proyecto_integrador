import java.util.Scanner;

public class purchaseFood {
    public static void ejercicio() {
        Scanner pedido = new Scanner(System.in);
        int total = 0;
        while (true) {
            System.out.println("=== Gestion de restaurante ===");
            System.out.println("Estos son las comidas disponibles:");
            System.out.println("1- Hamburguesa a 25000");
            System.out.println("2- Bandeja paisa a 26000");
            System.out.println("3- Almuerzo simple a 17000");
            System.out.println("4- Consomé a 9000");
            System.out.println("5- Pescado frito a 30000");
            System.out.println("6- Mondongo a 28000");
            System.out.println("7- Carne a la plancha a 31000");
            System.out.println("8- Lasaña a 16000");
            System.out.println("9- Picada a 32000");
            System.out.println("10- Pollo broaster a 36000");
            System.out.println("Seleccione la comida deseada según el número correspondiente:");
            int comida = pedido.nextInt();
            switch (comida) {
                case 1:
                    System.out.println("Hamburguesa seleccionada");
                    total += 25000;
                    break;
                case 2:
                    System.out.println("Bandeja paisa seleccionada");
                    total += 26000;
                    break;
                case 3:
                    System.out.println("Almuerzo simple seleccionado");
                    total += 17000;
                    break;
                case 4:
                    System.out.println("Consomé seleccionado");
                    total += 9000;
                    break;
                case 5:
                    System.out.println("Pescado frito seleccionado");
                    total += 30000;
                    break;
                case 6:
                    System.out.println("Mondongo seleccionado");
                    total += 28000;
                    break;
                case 7:
                    System.out.println("Carne a la plancha seleccionada");
                    total += 31000;
                    break;
                case 8:
                    System.out.println("Lasaña seleccionada");
                    total += 16000;
                    break;
                case 9:
                    System.out.println("Picada seleccionada");
                    total += 32000;
                    break;
                case 10:
                    System.out.println("Pollo broaster seleccionado");
                    total += 36000;
                    break;
                default:
                    System.out.println("comida no encontrada");
                    continue;
            }
            System.out.println("¿Desea añadir otra comida? 1 para aceptar, 2 para cancelar");
            int opcion = pedido.nextInt();
            if (opcion == 1) {
                continue;
            } else if (opcion == 2) {
                break;
            }

        }
        System.out.println("La cuenta en total es de: " + total + " pesos");
    }
}
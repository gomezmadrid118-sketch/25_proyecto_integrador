import java.util.Scanner;

public class ConditionsOfTemperature {
    public static void ejercicio() {
        // la idea de este ejercicio es que analice el calor de la sala para activar el aire acondicionado

        Scanner validacionTemperatura = new Scanner(System.in);
        double temperatura = 0;
        boolean aireAcondicionado = false;
        int cantidadPersonas = 0;
        System.out.println("Ingrese la temperatura de la sala");
        temperatura = validacionTemperatura.nextDouble();
        System.out.println("Ingrese la cantidad de personas que hay en la sala");
        cantidadPersonas = validacionTemperatura.nextInt();
        if (temperatura <= 24) {
            System.out.println("No es necesario activar el aire acondicionado");
        } else if ((temperatura >= 25 && temperatura <= 28) || (cantidadPersonas > 7 && cantidadPersonas <= 12)) {
            System.out.println("Aumento de calor detectado, se activará el aire acondicionado durante 15 min");
            aireAcondicionado = true;
        } else if (temperatura >= 30 || cantidadPersonas > 12) {
            System.out.println(
                    "Gran aumento de temperatura detectado, se activará el aire acondicionado hasta que esta baje a 22°");
            aireAcondicionado = true;
        } else if (temperatura > 38) {
            System.out.println(
                    "Temperatura muy alta, favor reducir la cantidad de persons en la sala para que el aire acoedncionad surta efecto mas rapido");
            aireAcondicionado = true;
        } else if (temperatura < 0 || temperatura > 60) {
            System.out.println("temperatura inválida");
        }
        if (aireAcondicionado == true) {
            System.out.println("el aire acondicionado ha sido activado");
        } else {
            System.out.println("el aire acondicionado continuará desactivado");
        }
    }
}

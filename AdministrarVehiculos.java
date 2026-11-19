import java.util.Scanner;
import java.util.ArrayList;

public class AdministrarVehiculos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== CONTROL DE FLOTA =====");
            System.out.println("1. Crear vehiculo por defecto");
            System.out.println("2. Crear vehiculo con parametros");
            System.out.println("3. Modificar vehiculo");
            System.out.println("4. Visualizar vehiculos");
            System.out.println("5. Recorrer kilometros");
            System.out.println("6. Tanquear vehiculo");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();

            switch (opcion) {

                case 7:
                    System.out.println("Programa finalizado");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 7);

        entrada.close();
    }
}
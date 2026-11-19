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

                case 1:
                    Vehiculo v = new Vehiculo();
                    vehiculos.add(v);
                    System.out.println("Vehiculo creado correctamente");
                    break;

                case 2:
                    entrada.nextLine();

                    System.out.print("Ingrese la placa: ");
                    String placa = entrada.nextLine();

                    System.out.print("Ingrese el combustible: ");
                    double combustible = entrada.nextDouble();

                    System.out.print("Ingrese el rendimiento: ");
                    double rendimiento = entrada.nextDouble();

                    System.out.print("Ingrese el kilometraje: ");
                    double kilometraje = entrada.nextDouble();

                    if (combustible >= 0 && combustible <= 50
                            && rendimiento > 0 && kilometraje >= 0
                            && !placa.trim().isEmpty()) {

                        Vehiculo nuevo = new Vehiculo(
                                placa, combustible, rendimiento, kilometraje);
                        vehiculos.add(nuevo);
                        System.out.println("Vehiculo creado correctamente");
                    } else {
                        System.out.println("Datos invalidos");
                    }
                    break;

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
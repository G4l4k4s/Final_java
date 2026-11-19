public class Vehiculo {

    // Atributos
    private String placa;
    private Double combustible;
    private Double rendimiento;
    private Double kilometraje;


    // Constructor por defecto 
    public Vehiculo() {
        placa = "AAA000";
        combustible = 20.0;
        rendimiento = 40.0;
        kilometraje = 0.0;
    }

    // Constructor con parámetros
    public Vehiculo(String placa, Double combustible, Double rendimiento, Double kilometraje) {
        this.placa = placa;
        this.combustible = combustible;
        this.rendimiento = rendimiento;
        this.kilometraje = kilometraje;
    }

    // Métodos de comportamiento
}
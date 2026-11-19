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

    //getters
    public String getPlaca() {
        return placa;
    }

    public double getCombustible() {
        return combustible;
    }

    public double getRendimiento() {
        return rendimiento;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    //setters
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCombustible(double combustible) {
        if (combustible >= 0 && combustible <= 50) {
            this.combustible = combustible;
        } else {
            System.out.println("Combustible invalido");
        }
    }

    public void setRendimiento(double rendimiento) {
        if (rendimiento > 0) {
            this.rendimiento = rendimiento;
        } else {
            System.out.println("Rendimiento invalido");
        }
    }

    public void setKilometraje(double kilometraje) {
        if (kilometraje >= 0) {
            this.kilometraje = kilometraje;
        } else {
            System.out.println("Kilometraje invalido");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa);
        System.out.println("Combustible: " + combustible + " gal/L");
        System.out.println("Rendimiento: " + rendimiento + " km/gal");
        System.out.println("Kilometraje: " + kilometraje + " km");
    }
}
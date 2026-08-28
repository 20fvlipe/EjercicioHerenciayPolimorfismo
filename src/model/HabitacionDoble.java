package model;

public class HabitacionDoble extends Habitacion {
    private double cargoAdicional = 10000;

    public HabitacionDoble() {
    }

    public HabitacionDoble(int numero, int precioxNoche, int capacidad) {
        super(numero, precioxNoche, capacidad);
    }

    public double getCargoAdicional() {
        return cargoAdicional;
    }

    public void setCargoAdicional(double cargoAdicional) {
        this.cargoAdicional = cargoAdicional;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCargo Adicional: $" + cargoAdicional;
    }

    @Override
    public double calcularPrecio(int noches){
        double totalProvisorio = (noches * getPrecioxNoche()) + this.cargoAdicional;
        return totalProvisorio;
    }
}

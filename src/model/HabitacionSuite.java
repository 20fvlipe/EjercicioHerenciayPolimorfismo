package model;

public class HabitacionSuite extends Habitacion{
    private double recargo = 1.30;

    public HabitacionSuite() {
    }

    public HabitacionSuite(double recargo) {
        this.recargo = recargo;
    }

    public HabitacionSuite(int numero, int precioxNoche, int capacidad, double recargo) {
        super(numero, precioxNoche, capacidad);
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }

    public void setRecargo(double recargo) {
        this.recargo = recargo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRecargo: " + recargo;

    }

    @Override
    public double calcularPrecio(int noches){
        double totalProvisorio = (noches * getPrecioxNoche());
        return totalProvisorio;
    }
}

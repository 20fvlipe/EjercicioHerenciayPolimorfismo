package model;

public class HabitacionSimple extends Habitacion{

    public HabitacionSimple() {
    }

    public HabitacionSimple(int numero, int precioxNoche, int capacidad) {
        super(numero, precioxNoche, capacidad);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularPrecio(int noches){
        double totalProvisorio = noches * getPrecioxNoche();
        return totalProvisorio;
    }

}

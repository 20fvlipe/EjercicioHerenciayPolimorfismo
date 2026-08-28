package model;

public class Reserva {
    private Huesped huesped;
    private Habitacion habitacionCualquiera;
    private int cantidadNoche;

    public Reserva() {
    }

    public Reserva(Huesped huesped, Habitacion habitacionCualquiera, int cantidadNoche) {
        this.huesped = huesped;
        this.habitacionCualquiera = habitacionCualquiera;
        this.cantidadNoche = cantidadNoche;
    }

    public Huesped getHuesped() {
        return huesped;
    }

    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
    }

    public Habitacion getHabitacionCualquiera() {
        return habitacionCualquiera;
    }

    public void setHabitacionCualquiera(Habitacion habitacionCualquiera) {
        this.habitacionCualquiera = habitacionCualquiera;
    }

    public int getCantidadNoche() {
        return cantidadNoche;
    }

    public void setCantidadNoche(int cantidadNoche) {
        this.cantidadNoche = cantidadNoche;
    }

    @Override
    public String toString() {
        return "~~~ Reserva ~~~" +
                huesped +
                habitacionCualquiera +
                "\nCantidad de Noches: " + cantidadNoche;
    }

    public double calcularTotal(){
        double totalFinal = (habitacionCualquiera.calcularPrecio(this.cantidadNoche))* habitacionCualquiera.getCapacidad();
        return totalFinal;
    }
}

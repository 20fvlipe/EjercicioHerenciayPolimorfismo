package model;

public abstract class Habitacion {
    protected int numero;
    protected int precioxNoche;
    protected int capacidad;

    public Habitacion() {
    }

    public Habitacion(int numero, int precioxNoche, int capacidad) {
        this.numero = numero;
        this.precioxNoche = precioxNoche;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPrecioxNoche() {
        return precioxNoche;
    }

    public void setPrecioxNoche(int precioxNoche) {
        this.precioxNoche = precioxNoche;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "~~~ Habitacion ~~~" +
                "\nNumero: " + numero +
                "\nPrecio Por Noche: $" + precioxNoche +
                "\nCapacidad: " + capacidad;
    }

    public abstract double calcularPrecio(int noches);
}

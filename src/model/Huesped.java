package model;

public class Huesped {
    private String nombre;
    private String rut;

    public Huesped() {
    }

    public Huesped(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    @Override
    public String toString() {
        return "~~~ Huesped ~~~" +
                "\nNombre: " + nombre +
                "\nRut: " + rut;
    }
}

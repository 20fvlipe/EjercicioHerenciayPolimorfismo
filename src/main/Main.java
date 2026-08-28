package main;

import model.*;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Huesped huesped = new Huesped();
        Reserva reserva = new Reserva();

        System.out.println("~~~~~~~~~~~");
        System.out.println("Ingrese su Nombre:");
        huesped.setNombre(sc.nextLine());
        System.out.println("Ingrese su Rut;");
        huesped.setRut(sc.nextLine());
        System.out.println("Seleccione el tipo de Habitación que desee. (1. Simple 2. Doble 3. Suite)");
        int opcion = sc.nextInt();
        if (opcion == 1){
            HabitacionSimple habitacion = new HabitacionSimple();
            System.out.println("Ingrese el Número de Habitación");
            habitacion.setNumero(sc.nextInt());
            System.out.println("Ingrese Capacidad:");
            habitacion.setCapacidad(sc.nextInt());
            System.out.println("Ingrese el Precio por Noche:");
            habitacion.setPrecioxNoche(sc.nextInt());
            reserva.setHuesped(huesped);
            System.out.println("Ingrese la Cantidad de Noches");
            reserva.setCantidadNoche(sc.nextInt());
            reserva.setHabitacionCualquiera(habitacion);
            System.out.println(reserva.toString());
            System.out.println("Total: $" + reserva.calcularTotal());
        } else if (opcion == 2) {
            HabitacionDoble habitacion = new HabitacionDoble();
            System.out.println("Ingrese el Número de Habitación");
            habitacion.setNumero(sc.nextInt());
            System.out.println("Ingrese Capacidad:");
            habitacion.setCapacidad(sc.nextInt());
            System.out.println("Ingrese el Precio por Noche:");
            habitacion.setPrecioxNoche(sc.nextInt());
            reserva.setHuesped(huesped);
            System.out.println("Ingrese la Cantidad de Noches");
            reserva.setCantidadNoche(sc.nextInt());
            reserva.setHabitacionCualquiera(habitacion);
            System.out.println(reserva.toString());
            System.out.println("Total: $" + reserva.calcularTotal());
        }else{
            HabitacionSuite habitacion = new HabitacionSuite();
            System.out.println("Ingrese el Número de Habitación");
            habitacion.setNumero(sc.nextInt());
            System.out.println("Ingrese Capacidad:");
            habitacion.setCapacidad(sc.nextInt());
            System.out.println("Ingrese el Precio por Noche:");
            habitacion.setPrecioxNoche(sc.nextInt());
            reserva.setHuesped(huesped);
            System.out.println("Ingrese la Cantidad de Noches");
            reserva.setCantidadNoche(sc.nextInt());
            reserva.setHabitacionCualquiera(habitacion);
            System.out.println(reserva.toString());
            System.out.println("Total: $" + reserva.calcularTotal());
        }
    }
}

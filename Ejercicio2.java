package paquete_estructuras_de_control;

public class Ejercicio2 {
    public static void main(String args[]) {
        /**
         * Pide el nombre, edad y salario y muestra el salario.
         * Si es menor de 16 no tiene edad para trabajar
         * Entre 19 y 50 años el salario es un 5 por ciento más
         * Entre 51 y 60 años el salario es un 10 por ciento más
         * Si es mayor de 60 el salario es un 15 por ciento más
         * resultado el nombre con x an;os tienen un salario de x mas el % y poner el salario con el %
         */

        String nombre = "Juan Perez";
        int edad = 18;
        double salario = 300000;
        double salario2 = 0;
        double porcentaje = 0;
        if (edad < 19) {
            System.out.println(nombre + " no tiene edad para trabajar");
        } else if (edad > 18 && edad < 51) {
            porcentaje = 0.05;
            salario2 = (salario * porcentaje) + salario;
            System.out.println(nombre + " con " + edad + " anyos tiene un salario de " + salario + " mas un porcentaje de " + porcentaje + " tiene un salario total de " + salario2);

        } else if (edad >= 51 && edad < 61) {
            porcentaje = 0.10;
            salario2 = (salario * porcentaje) + salario;
            System.out.println(nombre + " con " + edad + " anyos tiene un salario de " + salario + " mas un porcentaje de " + porcentaje + " tiene un salario total de " + salario2);
        }else{
            porcentaje = 0.15;
            salario2 = (salario * porcentaje) + salario;
            System.out.println(nombre + " con " + edad + " anyos tiene un salario de " + salario + " mas un porcentaje de " + porcentaje + " tiene un salario total de " + salario2);

        }
    }


}


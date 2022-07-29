package paquete1;

import java.util.Scanner;

public class Tareas {
    public static void main(String args[]) {
        /** Tarea
         * Calcular el sueldo de un trabajador
         * Solicitar el numero de horas que ha trabajado en un mes,
         * y calcular el sueldo si la hora vale $10.
         */
        String trabajador = "Juan Perez";
        int precioxhora = 10000;
        Scanner horasTrabajadas = new Scanner(System.in);
        System.out.println("Ingrese el total de horas trabajadas:");
        int totalhoras = horasTrabajadas.nextInt();
        int sueldo = (totalhoras * precioxhora);

        System.out.println("El sueldo de " +trabajador+ " de este mes es "+ sueldo);

        /**Tarea 2
         *  pide un numero y dice si es positivo, negativo, par o impar
         */

        Scanner numeroIngresado = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = numeroIngresado.nextInt();
        if(numero >= 0){
            System.out.println("el numero es positivo");
        }else{
            System.out.println("el numero es negativo");
        }
        int residuo = (numero % 2);
        if(residuo == 0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }

            }
}

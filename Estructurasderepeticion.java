package paquete_estructuras_de_control;

public class Estructurasderepeticion {
    public static void main(String args[]) {
        /**
         * Calcula el factorial de un número
         * Donde factorial = n · (n-1)
         */

        int factorial = 0;
        int numero = 5;
        int factorialtotal = 0;

       //while
    /*     while (factorial <= numero) {
        factorialtotal += numero * (numero - 1);
        factorial ++;
            System.out.println(factorial);
        }
        System.out.println("el factorial de " + numero + " es " + factorialtotal);
*/

/** tarea For*/

        for (int factorialfor = 0; factorialfor <= numero; factorialfor++) {
            factorialtotal += numero * (numero - 1);
//si imprimo aca muestra el resultado de el ciclo completo  cada resultado hasta llegar al total final

    }
      System.out.println("el factorial de "+numero +" es "+factorialtotal);


/**tarea Do while*/
   /*     do {
            factorialtotal += numero * (numero - 1);
            factorial++;

        }
        while (factorial <= numero);
        System.out.println("el factorial de " + numero + " es " + factorialtotal);*/

    }
}

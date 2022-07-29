package metodos;

public class TareaMetodos {
   //esta es variable global puede usarse en toda la clase
    static int factorial = 0;
    public static void main(String args[]) {
        int numero = 50;
        ejecutarWhile(numero);
        System.out.println("el factorial de " + numero + " usando for es " + ejecutarFor(numero));
        ejecutarDoWhile(numero);

    }

    //usando while
    public static void ejecutarWhile(int numero) {
        //esta variable se puede usar solo dentor del metodo
        //int factorial = 0;
        int factorialtotal = 0;
        while (factorial <= numero) {

            factorialtotal += numero * (numero - 1);
            factorial++;
            System.out.println(factorial);
        }
        System.out.println("el factorial de " + numero + " usando While es " + factorialtotal);
    }

    //usando DoWhile
    public static void ejecutarDoWhile (int numero){
        int factorial = 0;
        int factorialtotal = 0;
        do {
            factorialtotal += numero * (numero - 1);
            factorial++;

        }
        while (factorial <= numero);
        System.out.println("el factorial de " + numero + " usando DoWhile es " + factorialtotal);

    }

    //usando For
    public static int ejecutarFor(int numero) {
        int factorialtotal = 0;
        for (int factorialfor = 0; factorialfor <= numero; factorialfor++) {
            factorialtotal += numero * (numero - 1);
        }
        return factorialtotal;
    }
  }

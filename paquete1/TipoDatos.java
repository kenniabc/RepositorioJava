package paquete1;

public class TipoDatos {
    public static void main(String args[]) {

        /****************** Variables ******************/
        /*//Declaracion
        int edad;

        //Asignacion
        edad = 20;

        //Declaracion y asignacion
        int precio = 50;

        System.out.println("Edad: " + edad);
        System.out.println("Precio: " + precio);*/

        /****************** Tipos de datos ******************/
        /*boolean interruptor = true; // Permite almacenar valores true or false
        System.out.println("Ejemplo valor boolean " + interruptor);

        char caracter = '\u0061'; // Permite almacenar un caracter Unicode
        System.out.println("Ejemplo de caracter en formato unicode: " + caracter);

        caracter = 'a';
        System.out.println("Ejemplo de caracter: " + caracter);

        byte byteNumber = 15;
        System.out.println("Ejemplo de un dato de dato tipo byte: " + byteNumber);

        short shortNumber = 66;
        System.out.println("Ejemplo de un dato tipo short: " + shortNumber);

        int intNumber = 1234;
        System.out.println("Ejemplo de un dato tipo integer: " + intNumber);

        long longNumber = 2365;
        System.out.println("Ejemplo de un dato tipo long: " + longNumber);

        float floatNumber = 12345f;
        System.out.println("Ejemplo de un dato tipo float: " + floatNumber);

        double doubleNumber = 1234.25;
        System.out.println("Ejemplo de un dato tipo double: " + doubleNumber);*/

        /****************** Operadores ******************/
        int a = 20;
        int b = 10;
        int c = 0;
        int d = 20;
        int e = 40;
        int f = 30;
        String x = "Thank";
        String y = "You";
        boolean condition = true;

        //Operador + y -
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));

        //Operador + con Strings
        System.out.println("x + y = " + x + y);

        //Operador * y /
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        //Operador de módulo o residuo
        System.out.println("a % b = " + (a % b));

        //Operador de pre-post incremento
        c = ++a;
        System.out.println("Valor de c (++a) = " + c);

        c = b++;
        System.out.println("Valor de c (b++) = " + c);
        c = b++;
        System.out.println("Valor de c (b++) = " + c);

        //Operador de pre-post decremento
        c = --d;
        System.out.println("Valor de c (--d) = " + c);

        c = e--;
        System.out.println("Valor de c (e--) = " + c);
        c = e--;
        System.out.println("Valor de c (e--) = " + c);

        //Operador lógico not
        System.out.println("Valor de !condition = " + !condition);

        //Operador de asignación simple
        c = b;
        System.out.println("Valor de c = " + c);

        //Operadores de asignación simples
        a = a + 1;
        b = b - 1;
        e = e * 2;
        f = f / 2;
        System.out.println("a, b, e, f = " + a + "," + b + "," + e + "," + f);
        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;
        System.out.println("a, b, e, f = " + a + "," + b + "," + e + "," + f);

        //Operadores de asignación compuestos/cortos
        a += 1;
        b -= 1;
        e *= 2;
        f /= 2;
        System.out.println("a,b,e,f (usando operadores cortos)= " + a + "," + b + "," + e + "," + f);

        //Operadores condicionales
        System.out.println("a == b :" + (a == b));
        System.out.println("a < b :" + (a < b));
        System.out.println("a <= b :" + (a <= b));
        System.out.println("a > b :" + (a > b));
        System.out.println("a >= b :" + (a >= b));
        System.out.println("a != b :" + (a != b));
    }

}

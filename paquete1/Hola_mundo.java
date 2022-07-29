package paquete1;
/**
 *  ejemplo de comentario
 */
//ejemplo de commentario 2
public class Hola_mundo {
    public static void main(String arg[]){
       /* System.out.println("Hola mundo");
//declaracion
        int a;
        int b;
        boolean c;
//asignar
        a = 20;
        b = 40;
        c = a>b;
        System.out.println("a es mayor que b? " + (a > b));
        System.out.println("a es mayor que b? usando asinacion " +c);
        c = a<b;
        System.out.println("nueva asignacion");
        System.out.println("a es menor que b? " + (a < b));
        System.out.println("a es igual que b? " + (a == b));
        System.out.println("usando c para menor " + c);*/

        /**
         * Calcule el promedio de las notas de un alumno,
         * solicitar el nombre del alumno y las notas de las 3 evaluaciones.
         * El promedio de la evaluación final seria la suma de las 3 evaluaciones entre 3
         */

        String nombre = "Kennia";
        int materia1 = 70;
        int materia2 = 80;
        int materia3 = 85;
        int evaluacionfinal = (materia1+materia2+materia3)/3;
       //esta linea es incorrecta porque gasta memoria
        System.out.println("la evaluacion final es " + ((materia1+materia2+materia3)/3));
        //linea correcta
        System.out.println("la evaluacion final de "+nombre + " es "+ evaluacionfinal);

        /** Tarea
         * Calcular el sueldo de un trabajador
         * Solicitar el numero de horas que ha trabajado en un mes,
         * y calcular el sueldo si la hora vale $10.
         */
        String trabajador = "Juan Perez";
         int totalhoras = 80;
         int precioxhora = 10;
         int sueldo = (totalhoras * precioxhora);
        System.out.println("El sueldo de " +trabajador+ " de este mes es "+ sueldo);


    }

}

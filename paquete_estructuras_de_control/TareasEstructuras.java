package paquete_estructuras_de_control;

public class TareasEstructuras {
    public static void main(String args[]) {
        /**
         * Identificar el numero de habitacion segun la cantidad de monedas
         *      5 Monedas - Habitacion 1
         *      10 Monedas - Habitacion 2
         *      15 Monedas - Habitacion 3
         *      20 Monedas - Habitacion 4
         *      Cualquier otro valor significa que no hay habitaciones disponibles
         * */
/**usando switch**/
        int monedas = 2;
        String habitacion = "";
        boolean habitacionvacia = true;
/**
 switch (monedas) {
 case 5:
 habitacion = "Habitacion 1";
 break;
 case 10:
 habitacion = "Habitacion 2";
 break;
 case 15:
 habitacion = "Habitacion 3";
 break;
 case 20:
 habitacion = "Habitacion 4";
 break;
 default:
 habitacion = "No hay habitaciones disponibles";
 break;
 }
 System.out.println("usando switch: " + habitacion);
 */

/**usando if else if **/
/**
 if (monedas == 5) {
 System.out.println("Habitacion 1");
 } else if (monedas == 10) {
 System.out.println("Habitacion 1");
 } else if (monedas == 15) {
 System.out.println("Habitacion 3");
 } else if (monedas == 20) {
 System.out.println("Habitacion 4");
 } else   System.out.println("usando if else if: No hay habitaciones disponibles");
 **/
/**usando if anidados**/

        if (habitacion == "") {
            if (monedas == 5) {
               habitacionvacia = false;
                System.out.println("Habitacion 1");
            }
            if (monedas == 10) {
                habitacionvacia = false;
                System.out.println("Habitacion 2");
            }
            if (monedas == 15) {
                habitacionvacia = false;
                System.out.println("Habitacion 3");
            }
            if (monedas == 20) {
                habitacionvacia = false;
                System.out.println("Habitacion 4");
            }
            if (habitacionvacia == true){
                System.out.println("usando if anidado: No hay habitaciones disponibles");
            }
        }
        }
    }



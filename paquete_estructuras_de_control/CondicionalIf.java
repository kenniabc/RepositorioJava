package paquete_estructuras_de_control;

//Clase Java para demostrar estructura de seleccion IF, IF ELSE, IF Anidados y Operador condicional
public class CondicionalIf {
    public static void main(String args[]) {

        boolean estaLloviendo = true;
        boolean haceFrio = false;
        boolean llevoAbrigo = true;

        /******************* IF *******************/
        //Si está lloviendo iré en metro al trabajo

        if (estaLloviendo) {
            System.out.println("Iré en metro");
        }

        /******************* IF ELSE *******************/
        //Si está lloviendo iré en metro al trabajo; si no, iré caminando

        if (estaLloviendo) {
            System.out.println("Iré en metro");
        } else {
            System.out.println("Iré caminando");
        }

        /******************* IF ELSE IF *******************/
        //Si está lloviendo iré en metro al trabajo; en otro caso, si no hace frío iré caminando, en el resto de casos corriendo

        if (estaLloviendo) {
            System.out.println("Iré en metro");
        } else if (haceFrio) {
            System.out.println("Iré corriendo");
        } else if (llevoAbrigo) {
            System.out.println("Iré abrigado");
        } else {
            System.out.println("Iré caminando");
        }

        /******************* IF ANIDADOS *******************/
        //Si está lloviendo y si no hace frío iré caminando a la oficina

        if(estaLloviendo) {
            if(!haceFrio) {
                System.out.println("Iré caminando");
            }else {
                System.out.println("Iré en metro");
            }
        }

        /******************* OPERADOR CONDICIONAL *******************/
        //Si está lloviendo iré en metro al trabajo; si no, iré caminando
        String msg = "";

        msg = estaLloviendo ? "Iré en metro" : "Iré caminando";
        System.out.println(msg);

    }
}

package paquete_estructuras_de_control;

public class CondicionSwitch {
    public static void main(String args[]) {

        int day = 2;
        String dayString = "";

        switch (day) {
            case 1:
                dayString = "Lunes";
                break;
            case 2:
                dayString = "Martes";
                break;
            case 3:
                dayString = "Miércoles";
                break;
            case 4:
                dayString = "Jueves";
                break;
            case 5:
                dayString = "Viernes";
                break;
            case 6:
                dayString = "Bisiesto";
                break;
            default:
                dayString = "Dia inválido";
                break;
        }
        System.out.println(dayString);



    }
}


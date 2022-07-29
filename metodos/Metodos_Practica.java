package metodos;

public class Metodos_Practica {
    public static void main(String args[]) {
        String saludo = "Hola ";
        String nombre = "Kennia";
        saludarNombre(saludo, nombre);
        int anyo = 1987;
        // System.out.println("La edad de "+ nombre +" es " +calcularEdad(anyo));
        calcularEdad(anyo, nombre);
    }


    public static void saludarNombre(String saludo, String nombre) {

        System.out.println(saludo + nombre);
    }

    //este es para la linea 11
  /*  public static  int calcularEdad (int anyo){
        int edad = 2022 - anyo;

        return edad;

    }*/
    //este es para  la linea 12 el metodo tiene para imprimir
    public static void calcularEdad(int anyo, String nombre) {
        int edad = 2022 - anyo;
        System.out.println("La edad de " + nombre + " es " + edad);
    }
}

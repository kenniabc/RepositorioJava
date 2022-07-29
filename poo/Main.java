package poo;

public class Main {
    public static void main(String args[]) {
        //nombre de la clase + nombre del objeto = new nombre de la clase ()
        //estoy haciendo la instancia de clase persona
        Persona estudiante = new Persona();
        // System.out.println(estudiante.toString());
        estudiante.nombre = "Kennia";
        estudiante.altura = 1.63;
        estudiante.edad = 18;
        estudiante.cedula = 113050087;
        estudiante.peso = 50;
        estudiante.sexo = 'M';
        Persona profesor = new Persona();
        profesor.nombre = "Angela";
        profesor.altura = 1.70;
        profesor.edad = 31;
        profesor.sexo = 'M';
        profesor.cedula = 10215599;
        System.out.println(profesor.toString());

        //llamar funcion para validar si la persona es mayor de edad
        boolean resultado = estudiante.VerificarEdad(estudiante.edad);
        System.out.println("es el objeto " + estudiante.nombre + " mayor de edad? " + resultado);
        //System.out.println("es el objeto " + estudiante.toString()+ " mayor de edad? "+ resultado);
    }
}

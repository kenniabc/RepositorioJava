package poo_practica;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
//      corresponde a practica 1 cuenta
     /*   Cuenta cuenta = new Cuenta();
        cuenta.ingresar(200.5);
        //cuenta.ingresar(-100);
        cuenta.retirar(100);
        //cuenta.retirar(300);
        //llamando con get la variable de la clase cuenta mediante el objeto cuenta
        System.out.println(cuenta.getCantidad());


        cuenta.setTitular("Kennia");
        cuenta.getTitular();
        System.out.println(cuenta.toString());*/

        //---------------------------------------------
        //1.el primer objeto obtendrá las anteriores variables pedidas por teclado
        poo_practica.Persona persona1 = new poo_practica.Persona();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        String nombre = scanner.next();
        persona1.setNombre(nombre);


        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();
        persona1.setEdad(edad);

        System.out.println("Ingrese el sexo: ");
        char sexo = scanner.next().charAt(0);
        persona1.setSexo(sexo);

        //cedula es solo lectura****
        persona1.getCedula();

        System.out.println("Ingrese el peso: ");
        double peso = scanner.nextDouble();
        persona1.setPeso(peso);

        System.out.println("Ingrese la altura: ");
        double altura = scanner.nextDouble();
        persona1.setAltura(altura);

        //2.	el segundo objeto obtendrá todos los anteriores menos el peso y la altura
        poo_practica.Persona persona2 = new poo_practica.Persona();
        System.out.println("Ingrese el nombre: ");
        nombre = scanner.next();
        persona2.setNombre(nombre);

        System.out.println("Ingrese el edad: ");
        edad = scanner.nextInt();
        persona2.setEdad(edad);

        persona2.getCedula();

        System.out.println("Ingrese el sexo: ");
        sexo = scanner.next().charAt(0);
        persona2.setSexo(sexo);
        //persona2.setAltura(0);



        //3.	el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
        System.out.println("");
        poo_practica.Persona persona = new poo_practica.Persona();
        persona.setNombre("Alejandra");
        persona.setEdad(17);
        persona.setSexo('F');
        persona.setPeso(55);
        persona.setAltura(1.63);


        //i. calcularIMC(): calculara si la persona esta en su peso ideal
        // double imcValor = persona.calcularIMC(persona.getPeso(), persona.getAltura());
        // System.out.println("El IMC es " + imcValor);
        //boolean imcTotal = persona.calcularTotalIMC();

        System.out.println(persona1.getNombre() + " tiene su IMC ideal? " + persona1.calcularTotalIMC());
        System.out.println(persona2.getNombre() + " tiene su IMC ideal? " + persona2.calcularTotalIMC());
        System.out.println(persona.getNombre() + " tiene su IMC ideal? " + persona.calcularTotalIMC());



     //ii.	esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
        boolean mayoriaDeEdad = persona.esMayorDeEdad(persona.getEdad());
        System.out.println("la edad de " + persona.getNombre() + " es de " + persona.getEdad() + ",tiene su mayoria de edad? " + mayoriaDeEdad);

        mayoriaDeEdad = persona1.esMayorDeEdad(persona1.getEdad());
        System.out.println("la edad de " + persona1.getNombre() + " es de " + persona1.getEdad() + ",tiene su mayoria de edad? " + mayoriaDeEdad);

        mayoriaDeEdad = persona2.esMayorDeEdad(persona2.getEdad());
        System.out.println("la edad de " + persona2.getNombre() + " es de " + persona2.getEdad() + ",tiene su mayoria de edad? " + mayoriaDeEdad);


        //iii.	comprobarSexo(char sexo):
   /*     char sexo = persona.comprobarSexo(persona.getSexo());
        System.out.println("el  sexo de  " + persona.getNombre() + " es " + persona.comprobarSexo(persona.getSexo()));
*/
        //iv. toString():
        System.out.println("informacion del objeto " + persona1.toString());
        System.out.println("informacion del objeto " + persona2.toString());
        System.out.println("informacion del objeto " + persona.toString());

     /*   //v.	identificarCedula():
        persona.identificarCedula(persona.getCedula());*/


    }


}

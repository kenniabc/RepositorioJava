package poo_practica;

public class Persona {
    private String nombre;
    private int edad;
    // esta mal tiene que ser privado y asignarle el valor
    //public String cedula;
    private String cedula = "112311112222";
    private char sexo;
    private double peso;
    private double altura;
    // tiene que ser privada
    private double imc; // varialbe de clase

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public char getSexo() {
        return sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    // agregar el get para cedula solo lectura
    public String getCedula() {
        return cedula;
    }

    //metodo para calcular el valor de IMC
 /*   public double calcularIMC(double peso, double altura) {
        imc = peso / (Math.pow(getAltura(), 2));

        return imc;

    }
*/
    //metodo para calcular IMC
    public boolean calcularTotalIMC() { //variable de metodo
        if (peso > 0 && altura > 0) {
            imc = this.peso / (Math.pow(getAltura(), 2));
            if (imc < 20) {
                System.out.println("El IMC indica que esta debajo de su peso ideal");
                return false;

            } else if (imc > 25) {
                System.out.println("El IMC indica que esta por encima de su peso ideal");
                return false;

            } else {
                System.out.println("El IMC indica que esta en su peso ideal");
                return true;
            }

        } else {
            System.out.println("Valor peso y altura deben de ser mayor a 0");
        }
        return false;
    }



    //ii.	esMayorDeEdad(): metodo para calcular si es mayor de edad
    public boolean esMayorDeEdad(int edad) {
        if (edad >= 18) {

            return true;
        }

        return false;
    }


    public char comprobarSexo(char sexo) {
        if (sexo == 'M') {
            setSexo('M');//asignando a la variable de clase el valor M
            return sexo = 'M';


        }
        setSexo('H'); //asignando a la variable de clase el valor H
        return sexo = 'H';
    }

    // iv. toString():
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", cedula=" + cedula +
                ", sexo=" + getSexo() +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    //v.	identificarCedula():
    public void identificarCedula(String cedula) {
        int totalCedula = cedula.length();
        if (totalCedula == 8) {
            System.out.println("la cedula es nacional");
        } else if (totalCedula == 12) {
            System.out.println("la cedula es extranjera");

        } else {
            System.out.println("la cedula es invalida");
        }
    }
}




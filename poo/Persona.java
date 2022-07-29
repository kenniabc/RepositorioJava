package poo;

public class Persona {
    //definir los atributos
    public String nombre;
    public int edad;
    public int cedula;
    public char sexo;
    public double peso;
    public double altura;

    //metodo para saber si es mayor de edad
    public boolean VerificarEdad (int edad) {
        if (edad >= 18) {
           // si se cumple el if
            return true;
        }
        //si no se cumple el if
        return false;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", cedula=" + cedula +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

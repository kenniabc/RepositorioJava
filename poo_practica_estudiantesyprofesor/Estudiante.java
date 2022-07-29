//clase Estudiante hereda de clase Persona2 para el ejercicio 3
package poo_practica_estudiantesyprofesor;

public class Estudiante extends Persona2{
    private int calificacion;
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    //metodo para verificar la calificacion sea en un rango de 0 y 10
    public boolean verificarCalificacion() {
        if (0 <= calificacion && calificacion <= 10) {
            System.out.println("la calification es valida");
            return true;
        } else {
            //System.out.println("La calificacion es invalida");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Estudiante{" +
                " nombre=" + getNombre() +
                " edad=" + getEdad() +
                " sexo=" + getSexo() +
                " calificacion=" + calificacion +
                '}';
    }


}

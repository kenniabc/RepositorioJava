//clase para el ejercicio 3
package poo_practica_estudiantesyprofesor;

public class Profesor extends Persona2{
    private String materia_profesor;
    private boolean diponible;

    public String getMateria_profesor() {
        return materia_profesor;
    }

    public void setMateria_profesor(String materia_profesor) {
        this.materia_profesor = materia_profesor;
    }

    //metodo para validar materia valida
    public boolean VerificarMateria(String materia) {
        if(materia == "Matematicas" || materia== "Filosofia" || materia == "Fisica") {
            System.out.println("La materia es valida");
            return true;
        }
        System.out.println("La materia es invalida");
        return false;
    }

    public boolean isDiponible() {
        return diponible;
    }

    public void setDiponible(boolean diponible) {
        this.diponible = diponible;
    }
}

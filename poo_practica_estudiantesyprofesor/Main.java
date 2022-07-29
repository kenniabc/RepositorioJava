package poo_practica_estudiantesyprofesor;

public class Main {
    public static void main(String args[]) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Juan");
        estudiante.setEdad(30);
        estudiante.setSexo('H');
        estudiante.setCalificacion(15);

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Jose");
        estudiante2.setEdad(20);
        estudiante2.setSexo('H');
        estudiante2.setCalificacion(10);

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Juana");
        estudiante3.setEdad(31);
        estudiante3.setSexo('M');
        estudiante3.setCalificacion(9);

        Estudiante estudiante4 = new Estudiante();
        estudiante4.setNombre("Julia");
        estudiante4.setEdad(40);
        estudiante4.setSexo('M');
        estudiante4.setCalificacion(1);

        Estudiante estudiante5 = new Estudiante();
        estudiante5.setNombre("Gina");
        estudiante5.setEdad(27);
        estudiante5.setSexo('M');
        estudiante5.setCalificacion(7);

        Profesor profesor = new Profesor();
        profesor.setNombre("Juliana");
        profesor.setEdad(50);
        profesor.setSexo('M');
        profesor.setMateria_profesor("Matematicas");
        profesor.setDiponible(true);


        Aula aula = new Aula();
        aula.setIdentificador(1);
        aula.setMaximo_estudiantes(5);
        aula.setMateria_de_aula("Matematicas");


        estudiante.verificarCalificacion();
        profesor.VerificarMateria(profesor.getMateria_profesor());

        //verificar si se puede dar clase
        if (profesor.getMateria_profesor() == aula.getMateria_de_aula()) {
            if (profesor.isDiponible() == true) {
                System.out.println("Se puede dar clase " + estudiante.toString() +  estudiante2.toString()+ estudiante3.toString()+
                estudiante4.toString() +  estudiante5.toString());

            } else
                System.out.println("No se puede dar clase");


        } else
            System.out.println("No se puede dar clase");

    }
}



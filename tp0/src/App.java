public class App {
    public static void main(String[] args) {
        //Creo la universidad y la carrera
        Universidad miUniversidad = new Universidad("UNViMe", "Los Poetas 1234");
        Carrera miCarrera = new Carrera("Programador Universitario de Sistemas", "PU", 3);
        //Agrego la carrera a la universidad
        miUniversidad.agregarCarrera(miCarrera);
        Estudiante[] alumnos = new Estudiante[3];
        //Creo al primer estudiante usando el constructor vacio y usando los setters
        alumnos[0] = new Estudiante();
        alumnos[0].setNombre("Lucas");
        alumnos[0].setApellido("Nuñez");
        alumnos[0].setEdad(20);
        alumnos[0].setCarrera("Programador Universitario de Sistemas");
        alumnos[0].setPromedio(8.5);
        //Agrego el primer estudiante a la carrera
        miCarrera.agregarEstudiante(alumnos[0]);
        //Los otros dos alumnos los creo usando el constructor con parametros
        alumnos[1] = new Estudiante("María", "González", 22, "Programador Universitario de Sistemas", 9.0);
        alumnos[2] = new Estudiante("Pedro", "López", 19, "Programador Universitario de Sistemas", 7.5);
        //Ahora los agrego a la carrera
        miCarrera.agregarEstudiante(alumnos[1]);
        miCarrera.agregarEstudiante(alumnos[2]);
        //Listo los estudiantes de la carrera
        miCarrera.listarEstudiantes();
    }
}

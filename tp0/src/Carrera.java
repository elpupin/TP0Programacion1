public class Carrera {
    private String nombre;
    private String codigo;
    private Universidad universidad;
    private int duracion;
    private Estudiante[] estudiantes;
    private int cantidadEstudiantes;
    private Materia[] materias;
    private int cantidadMaterias;

    //Constructor
    public Carrera(String nombre, String codigo, int duracion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.duracion = duracion;
    }
    
    public void agregarEstudiante(Estudiante estudiante) {
        if (cantidadMaterias < estudiantes.length) {
            this.estudiantes[cantidadEstudiantes] = estudiante;
            cantidadEstudiantes++;
        } else {
            System.out.println("No se pueden agregar más estudiantes.");
        }
    }

    public void listarEstudiantes() {
        System.out.println("Nombre del primer alumno: " + estudiantes[0].getNombre());
        
    }

    public void buscarEstudiante(String nombre) {
        
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }


}

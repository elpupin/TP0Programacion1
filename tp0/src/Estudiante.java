public class Estudiante {
    // Atributos privados
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private int cantidadMaterias;

    // Constructor con parámetros
    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    // Constructor sin parámetros
    public Estudiante() {
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido.");
        }
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("Apellido inválido.");
        }
    }

    public void setEdad(int edad) {
        if (edad > 16 && edad < 100) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida.");
        }
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 10.0) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido.");
        }
    }

    // GETTERS (después todos juntos)
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }

    public void agregarMateria(Materia materia) {
        cantidadMaterias++;
    }

    public void calcularPromedio() {
        
    }
}

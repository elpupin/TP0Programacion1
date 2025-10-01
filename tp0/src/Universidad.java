public class Universidad {
    private String nombre;
    private String direccion;
    private Carrera carrera;

    // Constructor
    public Universidad(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void agregarCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }


}
public class Prestamo {
    private String fechaDePrestamo;
    private String fechaDeDevolucion;
    private Persona persona;
    private Libro libro;

//constructor
    public Prestamo ( Persona persona, Libro libro, String fechaDePrestamo, String fechaDeDevolucion){
        this.persona = persona;
        this.libro = libro;
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getFechaDePrestamo() {
        return fechaDePrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "fechaDePrestamo='" + fechaDePrestamo + '\'' +
                ", fechaDeDevolucion='" + fechaDeDevolucion + '\'' +
                ", persona=" + persona +
                ", libro=" + libro +
                '}';
    }
}

public class Prestamo {
    private String fechaDePrestamo;
    public String fechaDeDevolucion;
    public Persona persona;
    public Libro libro;


    public Prestamo ( Persona persona, Libro libro, String fechaDePrestamo, String fechaDeDevolucion){
        this.persona = persona;
        this.libro = libro;
        this.fechaDePrestamo = fechaDePrestamo;
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public String getFechaDePrestamo() {
        return fechaDePrestamo;
    }
}

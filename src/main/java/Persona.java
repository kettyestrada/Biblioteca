public class Persona {
    private String nombre;
    private String direccion;
    private int telefono;


    public String getNombre() {
        return this.nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefonoParametro) {
        this.telefono = telefonoParametro;
    }

    public void setNombre(String nombreParametro) {
        this.nombre = nombreParametro;

    }

    public void setDireccion(String direccionParametro) {
        this.direccion = direccionParametro;
    }
}
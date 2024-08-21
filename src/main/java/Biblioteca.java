public class Biblioteca {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setNombre("ketty");
        persona1.setTelefono(625903328);
        persona1.setDireccion("calle ramon del cueto");

        Libro libro1 = new Libro();
        libro1.categoria = "Literatura juvenil";
        libro1.autor= "Lucas";
        libro1.nombreDeLibro = "Mi lobo de invierno";

        String fechaEntrega = "Marzo 30";
        String fechaDevolucion = "Abril 30";

        Prestamo dato1 = new Prestamo(persona1, libro1,fechaEntrega, fechaDevolucion);

        System.out.println(dato1.getFechaDePrestamo());
    }

}

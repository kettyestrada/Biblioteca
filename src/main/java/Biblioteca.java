public class Biblioteca {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Emily", " calle orilla mar ", 6528974);
        persona1.setNombre("ketty");
        persona1.setTelefono(625903328);
        persona1.setDireccion("calle ramon del cueto");

        Libro libro1 = new Libro("Mi lobo de invierno", "maicol", "Juvenil");

        String fechaEntrega = "Marzo 30";
        String fechaDevolucion = "Abril 30";

        Prestamo dato1 = new Prestamo(persona1, libro1,fechaEntrega, fechaDevolucion);


        System.out.println(dato1);


    }

}

import com.biblioteca.controller.LibroController;
import com.biblioteca.modelo.*;

public class BibliotecaMain {

    public static void main(String[] args) {
        LibroController libroController = new LibroController();

        Libro libro1 = libroController.crearLibro("Corrup", "maicol", "Juvenil", 2021);
        libro1.reNombrar("captiva");
        System.out.println(libro1.getAutor());
        libro1.reNombrar("el poder del ahora");
        System.out.println(libro1.getAutor());
        libro1.reNombrar("Habitos atómicos");
        System.out.println(libro1.getAutor());
        libro1.reNombrar("Habitos bonitos");

libro1.modificarFecha(2024);
        System.out.println(libro1);








        /*Persona persona1 = new Persona("Emily", " calle orilla mar ", 6528974);
        persona1.setNombre("ketty");
        persona1.setTelefono(625903328);
        persona1.setDireccion("calle ramon del cueto");*/

        //libroController.crearLibro("Mi lobo de invierno", "maicol", "Juvenil");
        //libroController.crearLibro("cuatro acuerdos", "Emily", "juvenil");

        //Libro l = libroController.obtenerLibroPorNombre("mi lobo de invierno");
        //System.out.println(l);

        //System.out.println(libroController.eliminarLibro("mi lobo de verano"));

        //System.out.println(libroController.obtenerLibros());

        //String fechaEntrega = "Marzo 30";
        //String fechaDevolucion = "Abril 30";

        //Prestamo dato1 = new Prestamo(persona1, libro1,fechaEntrega, fechaDevolucion);


        //System.out.println(dato1);
        //System.out.println(libroController.obtenerLibros());


    }

}

public class Libro {
    private String nombreDeLibro;
    private String autor;
    private String categoria;

    //constructor


    public Libro(String nombreDeLibro, String autor, String categoria) {
        this.nombreDeLibro = nombreDeLibro;
        this.autor = autor;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return
                "nombreDeLibro = " + nombreDeLibro +
                ", autor =" + autor +
                ", categoria = " + categoria;
    }
}

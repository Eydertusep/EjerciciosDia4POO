public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void LeerPagina(){
        System.out.println(" Hola, estas leyendo: " + titulo + " de " + autor + " y son " + paginas + " paginas ");
    }
}

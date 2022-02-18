
public class Libro {
   public String titulo;
   public String autor;
   public String resumen;
   public String isbn;
   public int numeroPaginas;

  public void abrir () {
      System.out.println("abrir");
  }

  public void cerrar() {
      System.out.println("Cerrar");
  }

  public void irPagina (int pagina) {
   System.out.println("Ir a pagina");
  }

}
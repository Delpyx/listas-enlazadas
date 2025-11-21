package Punto1;

public class LibrosEscritos implements Comparable<LibrosEscritos>{
    private String autor;
    private int cantidadLibros;

    LibrosEscritos(String autor, int cantidadLibros) {
        this.autor = autor;
        this.cantidadLibros = cantidadLibros;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(int cantidadLibros) {
        this.cantidadLibros = cantidadLibros;
    }

    @Override
    public int compareTo(LibrosEscritos librosEscritos){
        return Integer.compare(this.cantidadLibros, librosEscritos.cantidadLibros);
    }

    @Override
    public String toString(){
        return "AUTOR " + this.autor + " Cantidad de libros escritos: " + this.cantidadLibros;
    }
}

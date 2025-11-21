package Punto1;

public class Libro implements Comparable<Libro> {
    private String titulo;
    private String autor;
    private int año;
    private String genero;

    public Libro(String titulo, String autor, int año, String genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
        this.genero = genero;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public int compareTo(Libro libro) {
        return Integer.compare(this.año, libro.año);
    }

    @Override
    public String toString() {
        return "MANGA: " + this.getTitulo() + " AUTOR: " + this.getAutor() + " GENERO: " + this.getGenero() + " AÑO: " + this.getAño();
    }
}

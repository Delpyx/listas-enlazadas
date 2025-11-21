package Punto1;
import java.util.Scanner;
import Estructuras.DoubleLinkedList;


public class Main {
    public static void main(String[] args) {
        DoubleLinkedList<Libro> libros = new DoubleLinkedList<Libro>();
        Libro libro1 = new Libro("Naruto","Kishimoto",2000,"Shonnen");
        Libro libro2 = new Libro("Dragon Ball","Akira",1995,"Shonnen");
        Libro libro3 = new Libro("Bunny Girl","Kamoshida",2014,"Romantico");
        Libro libro4 = new Libro("Parasyte","Iwaaki",1990,"Seinen");
        libros.addFirst(libro1);
        libros.addFirst(libro2);
        libros.addFirst(libro3);
        libros.addFirst(libro4);
        System.out.println("Lista de libros:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
        Libro libroMasAntiguo = devolverLibroMasAntiguo(libros);
        System.out.println("Libro mas antiguo: ");
        System.out.println(libroMasAntiguo);

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el genero del libro: ");
        String genero = sc.nextLine();
        DoubleLinkedList<Libro> librosEspecificos =  titulosEspecificos(libros, genero);
        System.out.println("Lista de libros del genero especificado: ");
        for  (Libro libro : librosEspecificos) {
            System.out.println(libro);
        }
        DoubleLinkedList<LibrosEscritos> autores = new DoubleLinkedList<>();
        int opcion;
        do{
            System.out.println("1. Agregar autor y cantidad de libros");
            System.out.println("2. Mostrar Lista");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    agregarAutorEscrito(autores,sc);
                    break;
                case 2:
                    for(LibrosEscritos libro : autores) {
                        System.out.println(libro);
                    }
            }
        }
        while(opcion != 3);

    }
    public static void agregarAutorEscrito(DoubleLinkedList<LibrosEscritos> autores, Scanner sc){
        System.out.print("Ingresa el autor del libro: ");
        String autor = sc.next();
        System.out.print("Ingresa la cantidad de libros: ");
        int libros = sc.nextInt();
        LibrosEscritos libro = new LibrosEscritos(autor,libros);
        autores.agregarMenor(libro);
    }
    public static Libro devolverLibroMasAntiguo(DoubleLinkedList<Libro> libros){
        Libro libroMasAntiguo = libros.devolverMenor();
        return libroMasAntiguo;
    }
    public static DoubleLinkedList<Libro> titulosEspecificos(DoubleLinkedList<Libro> libros, String ingreso){
        DoubleLinkedList<Libro> titulosEspecificos = new DoubleLinkedList<Libro>();
        for(Libro libro : libros){
            if(libro.getGenero().equalsIgnoreCase(ingreso)){
                titulosEspecificos.addFirst(libro);
            }
        }
        return titulosEspecificos;
    }
    /*
    public static DoubleLinkedList<LibrosEscritos> crearListaAutores(DoubleLinkedList<Libro> libros){
        for(Libro libro : libros){
            String autor = libro.getAutor();
            int cantidad = 0;
            for(Libro libro2 : libros){
                if(libro2.getAutor().equalsIgnoreCase(autor)){
                    cantidad++;
                }
            }
            LibrosEscritos autorEscrito = new LibrosEscritos(autor,cantidad);

        }
    }

     */
}
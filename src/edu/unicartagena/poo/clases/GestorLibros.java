
package edu.unicartagena.poo.clases;



import java.util.HashSet;


/**
 *
 * @author Carlos
 */
  
public class GestorLibros {
    private final HashSet<Libro> listaLibros; 

    public GestorLibros() {
        this.listaLibros = new HashSet<>();
    }

    // Método para verificar si un libro ya existe en la lista
    public boolean existeLibro(Libro libro) {
        return listaLibros.contains(libro);
    }

    // Método para agregar un libro a la lista
    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    // Método para obtener la lista de libros
    public HashSet<Libro> getLibros() {
        return listaLibros;
    }

    public Libro buscarLibroPorTitulo(String tituloBuscado) {
       
    for (Libro libro : listaLibros) {
        if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
            return libro; // Retorna el libro si se encuentra
        }
    }
    return null; // Retorna null si no se encuentra el libro
}
    }

        
    


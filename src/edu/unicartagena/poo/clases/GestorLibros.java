
package edu.unicartagena.poo.clases;



import java.util.HashSet;

  
public class GestorLibros {
    private final HashSet<Libro> listaLibros; 

    public GestorLibros() {
        this.listaLibros = new HashSet<>();
    }

    public boolean existeLibro(Libro libro) {
        return listaLibros.contains(libro);
    }

    public void agregarLibro(Libro libro) {
        listaLibros.add(libro);
    }

    public HashSet<Libro> getLibros() {
        return listaLibros;
    }

    public Libro buscarLibroPorTitulo(String tituloBuscado) {
       
    for (Libro libro : listaLibros) {
        if (libro.getTitulo().equalsIgnoreCase(tituloBuscado)) {
            return libro; 
        }
    }
    return null; // Retorna null si no se encuentra el libro
}
    }

        
    


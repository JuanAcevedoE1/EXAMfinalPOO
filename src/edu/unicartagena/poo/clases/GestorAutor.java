
package edu.unicartagena.poo.clases;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author JuanEsteban
 */
public class GestorAutor {
    // Lista para almacenar autores (puede simular una base de datos)
    private final List<Autor> listaAutores;

    // Constructor
    public GestorAutor() {
        // Inicializar la lista de autores
        listaAutores = new ArrayList<>();
    }

    // Método para guardar un autor
    public void guardarAutor(String nombre, String paisOrigen, String fechaNacimiento) {
       
        Autor nuevoAutor = new Autor(nombre, paisOrigen, fechaNacimiento);

        // Agregar el autor a la lista
        listaAutores.add(nuevoAutor);

        // (Opcional) Mostrar en consola que se ha guardado correctamente
        System.out.println("Autor guardado: " + nuevoAutor);
    }

    // Método para verificar si un autor ya existe
    public boolean agregarAutor(Autor autor) {
    // Verificar si el autor ya existe en la lista
    for (Autor a : listaAutores) {
        if (a.getNombre().equalsIgnoreCase(autor.getNombre())) {
            return false; // El autor ya existe
        }
    }
    // Si no existe, agregar a la lista
    listaAutores.add(autor);
    return true;
}

    // Método para mostrar todos los autores guardados (opcional, para depuración)
    public void mostrarAutores() {
        System.out.println("Lista de autores:");
        for (Autor autor : listaAutores) {
            System.out.println(autor);
        }
    }
    
    public boolean eliminarAutor(String nombre) {
    for (Autor autor : listaAutores) {
        if (autor.getNombre().equalsIgnoreCase(nombre)) {
            listaAutores.remove(autor);
            return true; // Retorna true si se eliminó exitosamente
          
        }
    }
   
    return false; // Retorna false si no se encontró el autor
}
    public Autor buscarAutor(String nombre) {
    for (Autor autor : listaAutores) {
        if (autor.getNombre().equalsIgnoreCase(nombre)) {
            return autor; // Autor encontrado
        }
    }
    return null; // Autor no encontrado
}
    }

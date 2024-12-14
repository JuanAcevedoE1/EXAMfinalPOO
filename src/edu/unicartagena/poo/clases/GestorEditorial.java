
package edu.unicartagena.poo.clases;

import java.util.ArrayList;
import java.util.List;

public class GestorEditorial {
    private final List<Editorial> listaEditoriales;
    private static GestorEditorial instancia;

    
    private GestorEditorial() {
        listaEditoriales = new ArrayList<>();
    }

    // Método para obtener la instancia (Singleton)
    public static GestorEditorial getInstance() {
        if (instancia == null) {
            instancia = new GestorEditorial();
        }
        return instancia;
    }

    
    public void agregarEditorial(Editorial editorial) {
        listaEditoriales.add(editorial);
    }

    
    public Editorial buscarEditorialPorNombre(String nombre) {
        for (Editorial editorial : listaEditoriales) {
            if (editorial.getNombre().equalsIgnoreCase(nombre)) {
                return editorial; 
            }
        }
        return null; 
    }

    
    public boolean eliminarEditorial(String nombre) {
        Editorial editorial = buscarEditorialPorNombre(nombre);
        if (editorial != null) {
            listaEditoriales.remove(editorial);
            return true; 
        }
        return false; 
    }

    public List<Editorial> listarEditoriales() {
        return new ArrayList<>(listaEditoriales); 
    }
}
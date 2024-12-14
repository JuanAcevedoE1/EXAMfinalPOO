
package edu.unicartagena.poo.clases;

import java.util.Objects;

/**
 *
 * @author Carlos
 */
public class Autor {
   private final String nombre;
    private final String paisOrigen;
    private final String fechaNacimiento;

    // Constructor
    public Autor(String nombre, String paisOrigen, String fechaNacimiento) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Método toString para mostrar información del autor
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
    
}

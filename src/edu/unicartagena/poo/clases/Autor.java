
package edu.unicartagena.poo.clases;


public class Autor {
   private final String nombre;
    private final String paisOrigen;
    private final String fechaNacimiento;

    
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

    
    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
    
}

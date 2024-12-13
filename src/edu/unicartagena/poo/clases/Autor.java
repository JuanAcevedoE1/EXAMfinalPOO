
package edu.unicartagena.poo.clases;

import java.util.Objects;

/**
 *
 * @author Carlos
 */
public class Autor {
    private String nombre;
    private String paisOrigen;
    private String fechaNacimiento;

    public Autor(String nombre, String paisOrigen, String fechaNacimiento) {
        this.nombre = nombre;
        this.paisOrigen = paisOrigen;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Sobrescribir equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autor autor = (Autor) o;
        return Objects.equals(nombre, autor.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}

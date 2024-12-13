
package edu.unicartagena.poo.clases;

import java.util.Objects;

/**
 *
 * @author Carlos
 */
public class Editorial {
    private String nombre;
    private String pais;
    private int anioFundacion;

    public Editorial(String nombre, String pais, int anioFundacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.anioFundacion = anioFundacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    // Sobrescribir equals y hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Editorial editorial = (Editorial) o;
        return Objects.equals(nombre, editorial.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}

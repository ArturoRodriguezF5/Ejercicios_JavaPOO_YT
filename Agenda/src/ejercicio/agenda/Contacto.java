package ejercicio.agenda;

import java.util.Objects;

public class Contacto {

    private String nombre;
    private long numero;

    // Métodos constructores.
    public Contacto() {
    }

    public Contacto(String nombre, long numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    // Método toString para imprimir datos.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacto contacto = (Contacto) o;
        return Double.compare(contacto.numero, numero) == 0 && Objects.equals(nombre, contacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numero);
    }

    @Override
    public String toString() {
        return "Contacto: {" +
                "nombre= '" + nombre + '\'' +
                ", numero= " + numero +
                '}';
    }
}

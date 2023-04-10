package ejercicio.agenda;

public class Contacto {

    private String nombre;
    private double numero;

    // Métodos constructores.
    public Contacto() {
    }

    public Contacto(String nombre, double numero) {
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

    public void setNumero(double numero) {
        this.numero = numero;
    }

    // Método toString para imprimir datos.

    @Override
    public String toString() {
        return "Contacto: {" +
                "nombre= '" + nombre + '\'' +
                ", numero= " + numero +
                '}';
    }
}

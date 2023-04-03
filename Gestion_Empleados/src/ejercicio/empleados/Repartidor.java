package ejercicio.empleados;

public class Repartidor extends Empleado implements Mediator{

    private String zona;

    public Repartidor () {
    }

    public Repartidor(String nombre, int edad, double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public void plus() {
        double result;
        if (this.getEdad() <= 25 && this.zona.equals("zona 3")) {
            result = getSalario() + getPLUS();
            System.out.println("Empleado: " + getNombre() + " recibe el PLUS, nuevo salario: " + result);
        } else {
            System.out.println("Empleado: " + getNombre() + " no recibe PLUS.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Zona: " + this.zona + '}';
    }
}

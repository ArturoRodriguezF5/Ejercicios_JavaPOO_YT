package ejercicio.empleados;

public class Comercial extends Empleado implements Mediator{

    private double comision;

    public  Comercial () {
    }
    public Comercial(String nombre, int edad, double salario ,double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    @Override
    public void plus() {
        double result;
        if ( this.getEdad() > 30 && this.comision > 200) {
            result = getSalario() + getPLUS();
            System.out.println("Empleado: " + getNombre() + " recibe el PLUS, nuevo salario: " + result);
        } else  {
            System.out.println("Empleado: " + getNombre() + " no recibe el PLUS.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + " Comisión: " + this.comision + '}';
    }
}

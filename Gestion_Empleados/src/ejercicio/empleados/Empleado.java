package ejercicio.empleados;

public abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    private static final double PLUS = 300;

    public Empleado(){
    }

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static double getPLUS() {
        return PLUS;
    }

    public abstract void plus();

    @Override
    public String toString() {
        return "Empleado: {" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario;
    }
}

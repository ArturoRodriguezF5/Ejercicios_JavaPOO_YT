package ejercicio.productos;

public class Perecedero extends Producto {

    private int dias_Caducar;

    public Perecedero() {
    }

    public Perecedero(String nombre, double precio, int dias_Caducar) {
        super(nombre, precio);
        this.dias_Caducar = dias_Caducar;
    }

    public int getDias_Caducar() {
        return dias_Caducar;
    }

    public void setDias_Caducar(int dias_Caducar) {
        this.dias_Caducar = dias_Caducar;
    }

    @Override
    public double calcular(int cant) {
        double tot = super.calcular(cant);
        if (this.dias_Caducar == 1) {
            tot /= 4;
        } else if (this.dias_Caducar == 2) {
            tot /= 3;
        } else if (this.dias_Caducar == 3) {
            tot /= 2;
        }
        return tot;
    }

    @Override
    public String toString() {
        return super.toString() + " Dias a caducar: " + this.dias_Caducar + '}';
    }
}

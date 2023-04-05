package autos.completo;

import java.util.ArrayList;

public class Camion extends Automovil implements CocheCRUD{

    private double capacidadCarga;
    private String tipo;

    public Camion() {
    }

    public Camion(String marca, String modelo, int anio, double capacidadCarga, String tipo) {
        super(marca, modelo, anio);
        this.capacidadCarga = capacidadCarga;
        this.tipo = tipo;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    ArrayList<Automovil> camion = new ArrayList<Automovil>();
    @Override
    public ArrayList<Automovil> automovilesAdded(Automovil auto) {
        this.camion.add(auto);
        return camion;
    }


    @Override
    public void automovilesRemoved(int i) {
        this.camion.remove(i);
    }

    @Override
    public void automovilesMostrar(int i) {
        System.out.println(this.camion.get(i));
    }

    @Override
    public void automovilesLista() {
        for (Automovil auto : camion) {
            System.out.println(auto);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Camion{" +
                "capacidadCarga=" + capacidadCarga +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

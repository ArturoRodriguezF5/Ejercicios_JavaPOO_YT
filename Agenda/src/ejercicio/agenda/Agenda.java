package ejercicio.agenda;

import java.util.ArrayList;

public class Agenda implements AgendaCRUD{

    private Contacto contacto;
    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<Contacto>(10);
    }

    public Agenda(int capacity) {
        this.contactos = new ArrayList<>(capacity);
    }


    @Override
    public void aniadirContacto(Contacto c) {
        if (this.contactos.size() >0) {
            if (contactos.contains(c.getNombre())) {
                contactos.add(c);
            } else {
                System.out.println("El contacto: " + c.getNombre() + "ya existe, no se puede agregar.");
            }
        } else {
            System.out.println("No se puede agregar contacto por falta de espacio.");
        }
    }

    @Override
    public void existeConatacto(Contacto c) {
        if (contactos.contains(c)) {
            System.out.println("El contacto:" + c.getNombre() + "existe en la agenda.");
        } else {
            System.out.println("El contacto no existe en la agenda.");
        }
    }

    @Override
    public ArrayList<Contacto> listarContacto() {
        return contactos;
    }

    @Override
    public void buscaContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                System.out.println("El numero del contacto con nombre pasado es: " + contactos.get(i).getNumero());
            }
        }
    }

    @Override
    public void eliminarContacto(Contacto c) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(c.getNombre())) {
                contactos.remove(i);
            } else {
                System.out.println("No se encontró el elemento en la agenda, no se elimino nada.");
            }
        }
    }

    @Override
    public void agendaLlena() {
        if (contactos.size() == 1) {
            System.out.println("Lista Llena.");
        } else {
            System.out.println("Lista no llena.");
        }

    }

    @Override
    public int huecosLibres() {
        return contactos.size();
    }
}

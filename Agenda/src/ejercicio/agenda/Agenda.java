package ejercicio.agenda;

import java.util.ArrayList;
import java.util.Objects;

public class Agenda implements AgendaCRUD{

    private Contacto contacto;
    ArrayList<Contacto> contactos = new ArrayList<>();
    private int tam = 0;

    public Agenda() {
        this.tam = 10;
    }

    public Agenda(int capacity) {
        this.tam = capacity;
    }


    @Override
    public void aniadirContacto(Contacto c) {

            if (this.contactos.size() < this.tam) {
                if (this.contactos.isEmpty()) {
                contactos.add(c);
                System.out.println("Es el primer contacto, se agregó sin problema.");
            } else {
                    if(contactos.contains(c)) {
                        System.out.println("Error, el contacto: " + c.getNombre() + " ya existe en la agenda.");
                    } else {
                        contactos.add(c);
                        System.out.println("El contacto: " + c.getNombre() + " se agregó correctamente.");
                    }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Agenda agenda = (Agenda) o;
        return Objects.equals(contacto, agenda.contacto) && Objects.equals(contactos, agenda.contactos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacto, contactos);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

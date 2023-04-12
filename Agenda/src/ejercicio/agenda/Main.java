package ejercicio.agenda;

import java.util.ArrayList;

public class Main {
    static AgendaCRUD agendaCRUD = new Agenda();
    public static void main(String[] args) {

        // Creamos un ArrayList de tipo Contacto.
        ArrayList<Contacto> contacts;
        // Creamos 5 objetos de tipo Contacto.
        Contacto contacto1 = new Contacto("Arturo", 5580577045L);
        Contacto contacto2 = new Contacto("Yohana", 2238383823L);
        Contacto contacto3 = new Contacto("Arturo", 5580577045L);
        Contacto contacto4 = new Contacto("Carolina", 7865904523L);
        Contacto contacto5 = new Contacto("Ruby", 2156439821L);

        // Llamamos al método aniadirContacto para meter los contactos.
        agendaCRUD.aniadirContacto(contacto1);
        agendaCRUD.aniadirContacto(contacto2);
        agendaCRUD.aniadirContacto(contacto3);
        agendaCRUD.aniadirContacto(contacto4);
        agendaCRUD.aniadirContacto(contacto5);
        // Hacemos uso del método listarContacto, como devuelve un Array de contactos, lo guardamos en contacts.
        contacts = agendaCRUD.listarContacto();
        System.out.println(contacts);
        // Método para saber si existe un contacto pasado.
        agendaCRUD.existeConatacto(contacto3);
        // Método para buscar contacto pro su nombre.
        agendaCRUD.buscaContacto("Ruby");
        // Método para eliminar un contacto.
        agendaCRUD.eliminarContacto(contacto4);
        System.out.println(contacts);
        // Método para indicar si la agenda esta llena.
        agendaCRUD.agendaLlena();
        // Método para ver cuántos huecos hay libres.
        System.out.println(agendaCRUD.huecosLibres());


    }
}

package ejercicio.agenda;

import java.util.ArrayList;

public class Main {
    static AgendaCRUD agendaCRUD = new Agenda();
    public static void main(String[] args) {

        ArrayList<Contacto> contacts = new ArrayList<>();
        Contacto contacto1 = new Contacto("Arturo", 5580577045d);
        Contacto contacto2 = new Contacto("Yohana", 2238383823d);
        Contacto contacto3 = new Contacto("Arturo", 5580577045d);

        agendaCRUD.aniadirContacto(contacto1);
        agendaCRUD.aniadirContacto(contacto2);
        agendaCRUD.aniadirContacto(contacto3);
        contacts = agendaCRUD.listarContacto();
        System.out.println(contacts);

        System.out.println("Es igual?" + contacto1.equals(contacto3));

    }
}

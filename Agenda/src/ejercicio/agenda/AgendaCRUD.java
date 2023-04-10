package ejercicio.agenda;

import java.util.ArrayList;

public interface AgendaCRUD {

    void aniadirContacto(Contacto c);
    void existeConatacto(Contacto c);
    ArrayList<Contacto> listarContacto();
    void buscaContacto(String nombre);
    void eliminarContacto(Contacto c);
    void agendaLlena();
    int huecosLibres();
}

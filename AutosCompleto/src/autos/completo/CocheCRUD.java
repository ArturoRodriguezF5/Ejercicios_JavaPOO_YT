package autos.completo;

import java.util.ArrayList;

public interface CocheCRUD {

    ArrayList<Automovil> automovilesAdded(Automovil auto);

    void automovilesRemoved(int i);
    void automovilesMostrar(int i);
    ArrayList<Automovil> automovilesLista();

}

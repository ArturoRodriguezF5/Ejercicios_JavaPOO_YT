package autos.completo;

public class AutosCompleto {
    static CocheCRUD cocheCRUD = new Camion();
    public static void main(String[] args) {

        Automovil camion1 = new Camion("Volvo", "T2000", 2023, 18000d, "Volquete");
        Automovil camion2 = new Camion("Kenworth", "5000", 2023, 23000, "Caja Seca");

        camion2.setModelo("T880");

        cocheCRUD.automovilesAdded(camion1);
        cocheCRUD.automovilesAdded(camion2);

        // Mostrar lista de camiones
        cocheCRUD.automovilesLista();

        cocheCRUD.automovilesMostrar(1);
    }
}

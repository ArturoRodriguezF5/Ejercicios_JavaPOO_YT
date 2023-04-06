package autos.completo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

public class AutosCompleto {
    static CocheCRUD cocheCRUD = new Camion();
    public static void main(String[] args) {

        Automovil camion1 = new Camion("Volvo", "T2000", 2023, 18000d, "Volquete");
        Automovil camion2 = new Camion("Kenworth", "5000", 2023, 23000, "Caja Seca");

        ArrayList<Automovil> listaAutos = new ArrayList<>();

        cocheCRUD.automovilesAdded(camion1);
        cocheCRUD.automovilesAdded(camion2);

        // Mostrar lista de camiones
        listaAutos = cocheCRUD.automovilesLista();
        System.out.println("Lista autos: ." + listaAutos);
        // Mostrar un automovil a partir de un índice.
        cocheCRUD.automovilesMostrar(1);

        // Crear un archivo.txt para guardar los datos de la lista de autos.

        try {
            OutputStream listaCoches = new FileOutputStream("listaCoches.txt");
            try {
                for (Automovil listaAuto : listaAutos) {
                    listaCoches.write(listaAuto.toString().getBytes());
                }
                System.out.println("Fichero creado.");
            listaCoches.close();
            } catch (IOException a) {
                System.out.println("Error: " + a.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}

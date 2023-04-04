package ejercicio.productos;

public class Main {
    public static void main(String[] args) {

        // Array de productos.
        Producto[] productos = new Producto[3];

        productos[0] = new Perecedero("Carne de cerdo", 150d, 1);
        productos[1] = new Perecedero("Pechuga de pollo", 80d, 5);
        productos[2] = new NoPerecedero("Molida de res", 120d, "producto 5");

        // Recorremos el Array con un ForEach para imprimir los datos de los productos y para sumar su total.
        double total = 0;
        for (Producto producto : productos) {
            System.out.println(producto);
            total += producto.calcular(5);
        }
        System.out.println("El total es: " + total);
    }
}

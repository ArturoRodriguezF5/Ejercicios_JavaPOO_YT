package ejercicio.empleados;

public class Main {


    public static void main(String[] args) {


        // Creamos objetos de tipo Comercial mediante uso de la interfaz Mediator.

        Empleado em1 = new Comercial("Ivonne", 24, 1200d, 350d);
        Empleado em2 = new Comercial("Renata", 31, 1500d, 500);
        Empleado em3 = new Repartidor("Karina", 24, 1000d, "zona 3");
        Empleado em4 = new Repartidor("Azul", 32, 850d, "zona 4");

        // Imprimimos los datos de los objetos creados.

        System.out.println(em1);
        System.out.println(em2);
        System.out.println(em3);
        System.out.println(em4);

        // Mandamos a llamar el método plus de cada objeto empleo.

        em1.plus();
        em2.plus();
        em3.plus();
        em4.plus();



    }
}

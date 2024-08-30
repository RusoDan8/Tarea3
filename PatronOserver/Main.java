// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        TiendaOnline tienda = new TiendaOnline();

        Cliente cliente1 = new ClienteConcreto("Daniel");
        Cliente cliente2 = new ClienteConcreto("Ana");

        tienda.agregarCliente(cliente1);
        tienda.agregarCliente(cliente2);

        tienda.agregarProducto("Laptop Gaming");
        tienda.agregarProducto("Smartphone Último Modelo");
    }
}
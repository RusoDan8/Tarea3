import java.util.ArrayList;
import java.util.List;
public class TiendaOnline
{
    private List<Cliente> clientes = new ArrayList<>();
    private String productoNuevo;

    // subscribe customers
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Notifies costumers
    public void notificarClientes() {
        for (Cliente cliente : clientes) {
            cliente.actualizar(productoNuevo);
        }
    }

    // add new product and advises
    public void agregarProducto(String producto) {
        this.productoNuevo = producto;
        notificarClientes();
    }
}

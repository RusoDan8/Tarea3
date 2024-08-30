public class ClienteConcreto implements Cliente
{
    private String nombre;

    public ClienteConcreto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String producto) {
        System.out.println(nombre + ", nuevo producto disponible: " + producto);
    }
}

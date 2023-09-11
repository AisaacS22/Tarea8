package Pizza;

public class Topping {
    private String nombre;
    private double precioItem;

    public Topping(String nombre, double precioItem) {
        this.nombre = nombre;
        this.precioItem = precioItem;
    }

    public double getPrecioItem() {
        return precioItem;
    }

    public String getNombre() {
        return nombre;
    }
}

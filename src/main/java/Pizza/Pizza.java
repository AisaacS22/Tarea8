package Pizza;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
    public enum Tamaño { Pequeña, Mediana, Grande }

    private String nombre;
    private Tamaño tamaño;
    private List<Topping> ingredientes = new ArrayList<>();
    private double precioBase;

    public Pizza(String nombre, Tamaño tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        // Establecer el precio base dependiendo del tamaño
        switch (tamaño) {
            case Mediana:
                precioBase = 60.;
                break;
            case Grande:
                precioBase = 90.;
                break;
            default:
                precioBase = 40;
                break;
        }
    }

    public void agregarIngrediente(Topping ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public List<Topping> getIngredientes() {
        return Collections.unmodifiableList(new ArrayList<>(ingredientes));
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioPizza() {
        // Calcular el precio total sumando el precio base y los ingredientes
        double precioTotal = precioBase;
        for (Topping ingrediente : ingredientes) {
            precioTotal += ingrediente.getPrecioItem();
        }
        return precioTotal;
    }

    public void preparar() {
        System.out.println("Preparando " + nombre + " "+ tamaño.toString()+":" );
        System.out.println("Agregando ingredientes:");
        for (Topping ingrediente : ingredientes) {
            System.out.println("- " + ingrediente.getNombre());
            // Simular una pausa de 1 segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Preparando el horno...");
        System.out.println("Metiendola al horno...");
        System.out.println("¡TIIIN! ¡¡Su pizza esta lista!!");
    }
}

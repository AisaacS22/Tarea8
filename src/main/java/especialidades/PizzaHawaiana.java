package especialidades;

import Pizza.Pizza;

public class PizzaHawaiana extends Pizza {
    public PizzaHawaiana(String nombre, Tamaño tamaño) {
        super(nombre, tamaño);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando ingredientes hawaianos y pasos de preparación para Pizza Hawaiana.");
    }
}
package especialidades;

import Pizza.Pizza;

public class PizzaItaliana extends Pizza {
    public PizzaItaliana(String nombre, Tamaño tamaño) {
        super(nombre, tamaño);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando ingredientes italianos y pasos de preparación para Pizza Italiana.");
    }
}
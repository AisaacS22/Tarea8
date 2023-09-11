package especialidades;

import Pizza.Pizza;

public class PizzaEspecial extends Pizza {
    public PizzaEspecial(String nombre, Pizza.Tamaño tamaño) {
        super(nombre, tamaño);
    }

    @Override
    public void preparar() {
        super.preparar();
        System.out.println("Agregando ingredientes especiales y pasos de preparación para Pizza Especial.");
    }
}
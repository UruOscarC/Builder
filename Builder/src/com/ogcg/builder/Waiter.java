package com.ogcg.builder;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void buildPizza() {
        pizzaBuilder.createNewPizzaProduct()
        	.buildDough()
        	.buildSauce()
        	.buildTopping();
    }
}

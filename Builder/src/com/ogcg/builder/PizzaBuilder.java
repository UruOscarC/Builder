package com.ogcg.builder;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public PizzaBuilder createNewPizzaProduct() {
        pizza = new Pizza();
        return this;
    }

    public abstract PizzaBuilder buildDough();
    public abstract PizzaBuilder buildSauce();
    public abstract PizzaBuilder buildTopping();
}
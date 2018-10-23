package com.ogcg.builder;

public class SpicyPizzaBuilder extends PizzaBuilder {
    public PizzaBuilder buildDough() {
        pizza.setDough("pan baked");
        return this;
    }

    public PizzaBuilder buildSauce() {
        pizza.setSauce("hot");
        return this;
    }

    public PizzaBuilder buildTopping() {
        pizza.setTopping("pepperoni+salami");
        return this;
    }
}
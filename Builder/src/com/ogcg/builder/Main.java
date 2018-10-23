package com.ogcg.builder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzabuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder( hawaiianPizzabuilder );
        waiter.buildPizza();

        Pizza pizza = waiter.getPizza();
        System.out.println(pizza);
        
        waiter.setPizzaBuilder( spicyPizzaBuilder );
        waiter.buildPizza();

        pizza = waiter.getPizza();
        System.out.println(pizza);
        
	}

}

package com.ogcg.builder;

public class Pizza {

	private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }
    
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName() + ":" + this.dough + " " + this.sauce + " " +this.topping;
	}
}
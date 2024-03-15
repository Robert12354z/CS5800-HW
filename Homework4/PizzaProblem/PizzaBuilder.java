package Homework4.PizzaProblem;

import java.util.ArrayList;

public class PizzaBuilder {

    private String size;
    private ArrayList<String> toppings;


    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }
    public PizzaBuilder setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza createPizza(){
        return new Pizza(size, toppings);
    }
    


}

package Homework4.PizzaProblem;

import java.util.ArrayList;

public class PizzaChain {

    private String name; 
    private ArrayList<Pizza> pizzaList;

    public PizzaChain (String name, ArrayList<Pizza> pizzaList){

        this.pizzaList = pizzaList;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(ArrayList<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public void eat(){
        System.out.println("Pizza Chain: " + name + "\n" + "Pizzas: " + pizzaList);
    }

    
    
    
}

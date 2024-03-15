package Homework4.PizzaProblem;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<String> top1 = new ArrayList<String>(); 
        ArrayList<String> top2 = new ArrayList<String>();
        ArrayList<String> top3 = new ArrayList<String>();
        ArrayList<String> top4 = new ArrayList<String>();
        ArrayList<String> top5 = new ArrayList<String>();
        ArrayList<String> top6 = new ArrayList<String>();
        ArrayList<Pizza> chain1 = new ArrayList<Pizza>();
        ArrayList<Pizza> chain2 = new ArrayList<Pizza>();
        ArrayList<Pizza> chain3 = new ArrayList<Pizza>();


        top1.add("Pepperoni");
        top1.add("Chicken");
        top1.add("Spinach");
        top2.add("Sausage");
        top2.add("Beef");
        top3.add("Olives");
        top3.add("Ham");
        top3.add("Pesto");
        top3.add("Extra Cheese");
        top3.add("Peppers");
        top3.add("Bacon");
        top3.add("Mushrooms");
        top3.add("Spicy Pork");
        top4.add("Ham and Pineapple");
        top4.add("Olives");
        top4.add("Peppers");
        top4.add("Onions");
        top4.add("Bacon");
        top4.add("Sausage");
        top5.add("Sausage");
        top6.add("Pesto");
        top6.add("Spinach");
        top6.add("Beef");


        Pizza pizza1 = new PizzaBuilder().setSize("Large").setToppings(top1).createPizza(); 
        Pizza pizza2 = new PizzaBuilder().setSize("Small").setToppings(top2).createPizza();
        Pizza pizza3 = new PizzaBuilder().setSize("Medium").setToppings(top3).createPizza();
        Pizza pizza4 = new PizzaBuilder().setSize("Small").setToppings(top4).createPizza();
        Pizza pizza5 = new PizzaBuilder().setSize("Small").setToppings(top5).createPizza(); 
        Pizza pizza6 = new PizzaBuilder().setSize("Large").setToppings(top6).createPizza();

        chain1.add(pizza1);
        chain1.add(pizza2);
        chain2.add(pizza3);
        chain2.add(pizza4);
        chain3.add(pizza5);
        chain3.add(pizza6);

        PizzaChain pizzaHut = new PizzaChain("Pizza Hut", chain1);
        PizzaChain littleCaesars = new PizzaChain("Little Caesars", chain2);
        PizzaChain dominos = new PizzaChain("Dominos", chain3);
        
        pizzaHut.eat();
        littleCaesars.eat();
        dominos.eat();

        
    }

   
    
}

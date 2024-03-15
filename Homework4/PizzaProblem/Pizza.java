package Homework4.PizzaProblem;

import java.util.ArrayList;

public class Pizza {

    private String size;
    private ArrayList<String> toppings; 
    
    public Pizza(String size, ArrayList<String> toppings){

        this.size = size;
        this.toppings = toppings;

    }

    @Override
   public String toString() {
        return ("Pizza Size:"+this.size+
                " Toppings: "+ this.toppings+"\n");
   }

}

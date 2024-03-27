package Homework5.Decorator;

public class ConcreteFood implements Food {

    private double basePrice = 0.0;

   
    public ConcreteFood(double basePrice){
        this.basePrice = basePrice;
    }

    public double getPrice(){
        return basePrice;
    }
    
}

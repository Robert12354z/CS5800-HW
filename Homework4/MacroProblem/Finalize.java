package Homework4.MacroProblem;

public class Finalize {

    private Carbs carb;
    private Protein pro;
    private Fats fat;

    public Finalize(Carbs carb, Protein pro, Fats fat) {
        this.carb = carb;
        this.pro = pro;
        this.fat = fat;
    }

    public String toString(){
        return "Carb:" + carb.getString() + " Protein: " + pro.getString() + " Fat: "+ fat.getString(); 
    }
        
    
}

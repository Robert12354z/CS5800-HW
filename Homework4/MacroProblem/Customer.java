package Homework4.MacroProblem;

public class Customer {
    private String name; 
    private DietPlan dP;

    public Customer(String name, DietPlan dP){
        this.name = name;
        this.dP = dP;
    }

    public String getName(){
        return name; 
    }

    public Finalize finalizing(){
        MacroFactory fact = MacroAbstract.getInstance().getFactory(dP);
        Carbs carb = fact.generateCarbs();
        Protein pro = fact.generateProtein();
        Fats fat = fact.generateFats();
        return new Finalize(carb, pro, fat);
    }
    
}

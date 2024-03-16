package Homework4.MacroProblem;

public class MacroAbstract {

    private static MacroAbstract instance;

    private final MacroFactory NoRestrict;  
    private final MacroFactory Paleo;
    private final MacroFactory NutAllergy;
    private final MacroFactory Vegan;

    private MacroAbstract(){
        noRestrict = new NoRestrict();
        paleo = new Paleo();
        vegan = new Vegan();
        nutAll = new NutAllergy();
        
    }

    public static MacroAbstract getInstance() {
        if (instance == null) {
            instance = new MacroAbstract();
        }
        return instance;
    }

    public MacroFactory getFactory(DietPlan dietPlan){
        return switch (dietPlan){
            
        }
    }

}

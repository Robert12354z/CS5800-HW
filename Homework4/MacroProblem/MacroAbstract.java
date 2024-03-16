package Homework4.MacroProblem;

public class MacroAbstract {

    private static MacroAbstract instance;

    private final MacroFactory noRestrict;  
    private final MacroFactory paleo;
    private final MacroFactory nutAll;
    private final MacroFactory vegan;

    private MacroAbstract(){
        this.noRestrict = new NoRestrict();
        this.paleo = new Paleo();
        this.vegan = new Vegan();
        this.nutAll = new NutAllergy();
        
    }

    public static MacroAbstract getInstance() {
        if (instance == null) {
            instance = new MacroAbstract();
        }
        return instance;
    }

    public MacroFactory getFactory(DietPlan dietPlan){
        return switch (dietPlan){
            //NoRestrictions, Paleo, Vegan, NutAllergy
            case NORESTRICT -> noRestrict;
            case PALEO -> paleo;
            case VEGAN -> vegan;
            case NUTALL -> nutAll;
        };
    }

}

public class CruiseShip extends Ship {

    private int maxPassangers;

    public CruiseShip(String name, String year, int maxPassangers) {
        super(name, year);
        this.maxPassangers = maxPassangers;
    }

    public int getMaxPassangers() {
        return maxPassangers;
    }

    public void setMaxPassangers(int maxPassangers) {
        this.maxPassangers = maxPassangers;
    }

    @Override
    public String toString() {
        return "CruiseShip [maxPassangers=" + maxPassangers + "]";
    }

    

    
    

    

    
    
}

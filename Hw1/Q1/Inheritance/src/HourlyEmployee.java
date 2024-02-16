public class HourlyEmployee extends Employee {
    
    private int wage;
    private int hoursWorked; 

    public HourlyEmployee(String firstName, String lastName, String socialNum, int wage, int hoursWorked) {
        super(firstName, lastName, socialNum);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }


    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    public int getWage() {
        return wage;
    }


    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "HourlyEmployee [wage=" + wage + ", hoursWorked=" + hoursWorked + "]";
    }


    


  
    
    
}

public class SalariedEmployee extends Employee {
   
    private int weeklySalary;
    

    public SalariedEmployee(String firstName, String lastName, String socialNum, int weeklySalary) {
        super(firstName, lastName, socialNum);
        this.weeklySalary = weeklySalary;
        
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee [" + super.toString() + " Weekly Salary: " + weeklySalary + "]";
    }
}

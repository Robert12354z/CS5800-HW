public class BaseEmployee extends Employee {

    private int baseSalary; 
    public BaseEmployee(String firstName, String lastName, String socialNum, int baseSalary) {
        super(firstName, lastName, socialNum);
        this.baseSalary = baseSalary;
        
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "BaseEmployee [baseSalary=" + baseSalary + "]";
    }

   

    
}

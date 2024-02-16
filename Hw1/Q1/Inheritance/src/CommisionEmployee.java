public class CommisionEmployee extends Employee{

    private int commissionRate;
    private int grossSalary; 
    
    public CommisionEmployee(String firstName, String lastName, String socialNum, int commissionRate, int grossSalary) {
        super(firstName, lastName, socialNum);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary;

    }
    public int getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(int commissionRate) {
        this.commissionRate = commissionRate;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(int grossSalary) {
        this.grossSalary = grossSalary;
    }
    @Override
    public String toString() {
        return "CommisionEmployee [commissionRate=" + commissionRate + ", grossSalary=" + grossSalary + "]";
    }

    

    
    
}

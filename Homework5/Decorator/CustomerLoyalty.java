package Homework5.Decorator;

public class CustomerLoyalty {
    private double discount = 0.15;
    private Boolean loyal = false;

    public CustomerLoyalty(double discount, Boolean loyal) {
        this.loyal = loyal;

        if(loyal){
            this.discount = discount;
        }else{
            this.discount = 0.0;
        }
        
    }

    public double getDiscount() {
        return discount;
    }

    public Boolean getLoyal() {
        return loyal;
    }

    public void setLoyal(Boolean loyal) {
        this.loyal = loyal;
    }

}

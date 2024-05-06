package Homework8;

public class VendingMachine {

    private StateOfVendingMachine state;
    private double money;
    private Snack snack;

    public VendingMachine() {
        state = null;
    }

    public void setState(StateOfVendingMachine state) {
        this.state = state;
    }

    public StateOfVendingMachine getState() {
        return state;
    }

    public void selectSnack(String snackName) {
        state.selectSnack(snackName);
    }

    public void insertMoney(double money) {
        state.insertMoney(money);
    }

    public void dispenseSnack() {
        state.dispenseSnack();
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }

    public Snack getSnack() {
        return snack;
    }
    
}

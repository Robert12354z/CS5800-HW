package Homework8;

public class WaitingForMoneyState implements StateOfVendingMachine {
    
    private VendingMachine vendingMachine;
    
    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Please insert money or cancel.");
    }

    @Override
    public void insertMoney(double money) {
        Snack snack = vendingMachine.getSelectedSnack();
        if(snack.getPrice() <= money){
            vendingMachine.setMoneyInserted(money);
            vendingMachine.setCurrentState(vendingMachine.getDispenseSnackState());
        } else {
            System.out.println("Please insert more money.");
        }
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please insert money first.");
    }

    @Override
    public String toString() {
        return "WaitingForMoneyState";
    }


}

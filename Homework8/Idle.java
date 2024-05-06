package Homework8;

public class Idle implements StateOfVendingMachine {

    private VendingMachine vendingMachine;

    public Idle(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Snack selected: " + snackName);
        vendingMachine.setSelectedSnack(snackName);
        vendingMachine.setCurrentState(vendingMachine.getWaitingForMoneyState());

    }

    @Override
    public void insertMoney(double money) {
        System.out.println("Please select a snack first.");
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please select a snack first.");
    }
}

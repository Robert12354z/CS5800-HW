package Homework8;

public class DispenseSnackState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public DispenseSnackState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snackName) {
        System.out.println("Please wait for your snack.");
    }

    @Override
    public void insertMoney(double money) {
        System.out.println("Please wait for your snack.");
    }

    @Override
    public void dispenseSnack(){
        Snack snack = vendingMachine.getSelectedSnack();

        if(snack.getQuantity() > 0){
            System.out.println("Dispensing " + snack.getName());
            snack.setQuantity(snack.getQuantity() - 1);
            double change = vendingMachine.getMoneyInserted() - snack.getPrice();
            if(change > 0){
                System.out.println("Change: " + change);
            }
            vendingMachine.setCurrentState(vendingMachine.getIdleState());

        } else {
            System.out.println("Sorry, " + snack.getName() + " is out of stock.");
            vendingMachine.setCurrentState(vendingMachine.getIdleState());
        }
        
        
    }


}

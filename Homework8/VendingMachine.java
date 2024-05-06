package Homework8;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private StateOfVendingMachine idleState;
    private StateOfVendingMachine waitingForMoneyState;
    private StateOfVendingMachine dispenseSnackState;
    private StateOfVendingMachine currentState;

    private Map<String, Snack> snacks;

    private String selectedSnack;
    private double moneyInserted;

    public VendingMachine(){
        idleState = new Idle(this);
        waitingForMoneyState = new WaitingForMoneyState(this);
        dispenseSnackState = new DispenseSnackState(this);
        currentState = idleState;
        snacks = new HashMap<>();
        intializeSnacks();
    }

    public void intializeSnacks(){
        snacks.put("coke", new Snack("Coke", 1.5, 5));
        snacks.put("pepsi", new Snack("Pepsi", 1.75, 7));
        snacks.put("doritos", new Snack("Doritos", 1.25, 4));
        snacks.put("cheetos", new Snack("Cheetos", 1.00, 3));
        snacks.put("snickers", new Snack("Snickers", 1.50, 6));
        snacks.put("kitkat", new Snack("KitKat", 1.25, 0));
    }   

    public void insertMoney(double money){
        currentState.insertMoney(money);
        System.out.println("Money inserted: " + money);
    }

    public void cancel(){
        currentState = idleState;
        System.out.println("Transaction cancelled.");
    }

    public void selectSnack(String snack){
        String snack1 = snack.toLowerCase();
        currentState.selectSnack(snack1);
      
    }

    public void dispenseSnack(){
        currentState.dispenseSnack();
    }

    public void setCurrentState(StateOfVendingMachine state){
        this.currentState = state;
    }

    public StateOfVendingMachine getIdleState(){
        return idleState;
    }

    public StateOfVendingMachine getWaitingForMoneyState(){
        return waitingForMoneyState;
    }

    public StateOfVendingMachine getDispenseSnackState(){
        return dispenseSnackState;
    }

    public double getMoneyInserted(){
        return moneyInserted;
    }

    public void setMoneyInserted(double moneyInserted){
        this.moneyInserted = moneyInserted;
    }

    public Snack getSelectedSnack(){
        return snacks.get(selectedSnack);
    }

    public void setSelectedSnack(String selectedSnack){
        this.selectedSnack = selectedSnack;
    }

    public StateOfVendingMachine getCurrentState(){
        return this.currentState;
    }


}

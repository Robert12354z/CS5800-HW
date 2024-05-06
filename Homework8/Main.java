package Homework8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    VendingMachine vendingMachine = new VendingMachine();

    SnackDispenseHandler cheetosHandler = new CheetosHandler();
    SnackDispenseHandler pepsiHandler = new PepsiHandler();
    SnackDispenseHandler cokeHandler = new CokeHandler();
    SnackDispenseHandler doritosHandler = new DoritosHandler();
    SnackDispenseHandler kitkatHandler = new KitKatHandler();
    SnackDispenseHandler snickersHandler = new SnickersHandler();

    cokeHandler.setNextHandler(pepsiHandler);
    pepsiHandler.setNextHandler(cheetosHandler);
    cheetosHandler.setNextHandler(doritosHandler);
    doritosHandler.setNextHandler(kitkatHandler);
    kitkatHandler.setNextHandler(snickersHandler);
    
   System.out.println("Welcome to the Vending Machine!");
    while(true){
        System.out.println("Available Snacks: Coke, Pepsi, Cheetos, Doritos, KitKat, Snickers");
        System.out.println("Please enter the name of the snack you would like to purchase: ");
        String snackName = scanner.next();
        vendingMachine.selectSnack(snackName);

        System.out.println("Selected Snack: " + vendingMachine.getSelectedSnack().getName() + " Price: " + vendingMachine.getSelectedSnack().getPrice());

        boolean enteredMoney = false;
        String prompt = "";
        double money = 0;

        while(!enteredMoney){
            System.out.println("Please enter money: ");
            prompt = scanner.next();
            prompt = prompt.toLowerCase();
            if(prompt.equals("cancel")){
                vendingMachine.setCurrentState(vendingMachine.getIdleState());
                break;
            }
            else{
                money = Double.parseDouble(prompt);
                }

            vendingMachine.insertMoney(money);
            if(money< vendingMachine.getSelectedSnack().getPrice()){
                System.out.println("Money is returned. Try again or Enter Cancel to cancel the transaction.");
            }
            else{
                enteredMoney = true;
            }
        }
        vendingMachine.dispenseSnack();

        System.out.println("Would you like to purchase another snack? (yes/no)");
        String response = scanner.next();
        if(response.equals("no")){
            System.out.println("Thank you for using the Vending Machine!");
            break;
        }
    }
}
}

    



    

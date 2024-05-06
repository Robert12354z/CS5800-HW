package Homework8;

public class Main {
    public static void main(String[] args){
    VendingMachine vendingMachine = new VendingMachine();

    SnackDispenseHandler cheetosHandler = new CheetosHandler();
    SnackDispenseHandler pepsiHandler = new PepsiHandler();
    SnackDispenseHandler cokeHandler = new CokeHandler();
    SnackDispenseHandler doritosHandler = new DoritosHandler();
    SnackDispenseHandler kitkatHandler = new KitKatHandler();
    SnackDispenseHandler snickersHandler = new SnickersHandler();

    cheetosHandler.setNextHandler(pepsiHandler);
    pepsiHandler.setNextHandler(cokeHandler);
    cokeHandler.setNextHandler(doritosHandler);
    doritosHandler.setNextHandler(kitkatHandler);
    kitkatHandler.setNextHandler(snickersHandler);
    
    vendingMachine.selectSnack("Coke");
    vendingMachine.insertMoney(1.50);
    vendingMachine.dispenseSnack();

    vendingMachine.selectSnack("KitKat");
    vendingMachine.insertMoney(1.50);
    vendingMachine.dispenseSnack();
    


    }
}

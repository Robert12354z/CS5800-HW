package Homework8.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Homework8.*;

public class VendingMachineTest {

    @Test
    public void selectSnack() {
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

        vendingMachine.selectSnack("coke");

        assertEquals("Coke", vendingMachine.getSelectedSnack().getName());
    }

    @Test
    public void insertMoney(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectSnack("coke");
        vendingMachine.insertMoney(1.50);
        assertEquals(1.50, vendingMachine.getMoneyInserted());
    }

    @Test
    public void dispenseSnack(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectSnack("coke");
        vendingMachine.insertMoney(1.50);
        vendingMachine.dispenseSnack();
        assertEquals(4, vendingMachine.getSelectedSnack().getQuantity());
    }

    @Test
    public void cancel(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectSnack("coke");
        vendingMachine.insertMoney(1.50);
        vendingMachine.cancel();
        assertEquals("Idle", vendingMachine.getCurrentState().toString());
    }

    @Test
    public void outOfStock(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectSnack("kitkat");
        vendingMachine.insertMoney(1.25);
        vendingMachine.dispenseSnack();
        assertEquals(0, vendingMachine.getSelectedSnack().getQuantity());
    }

}

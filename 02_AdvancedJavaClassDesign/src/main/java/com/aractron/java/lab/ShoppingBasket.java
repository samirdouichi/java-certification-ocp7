package com.aractron.java.lab;

/**
 * Created by user on 21/02/2017.
 */
public class ShoppingBasket {

    private InventoryItem inventoryItem;

    public ShoppingBasket() {
    }

    public ShoppingBasket(InventoryItem inventoryItem) {
        this.inventoryItem = inventoryItem;
    }

    void addItem(InventoryItem item) {
        // this method is called each time
        // the clerk scans in a new item

        if (item instanceof Vcr) {
            float deposit = ((Vcr) item).calcDeposit();
        }
        if (item instanceof Movie) {
            float deposit = ((Movie) item).calcDeposit();
        }
        if (item instanceof Game) {
            float deposit = ((Game) item).calcDeposit();
        }
    }

}

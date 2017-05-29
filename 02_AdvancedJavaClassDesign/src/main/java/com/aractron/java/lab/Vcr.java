package com.aractron.java.lab;

/**
 * Created by user on 21/02/2017.
 */
public class Vcr extends InventoryItem {
    // Additional methods and attributes, to distinguish a
    // Movie from other types of InventoryItem
    private int idt;
    private float itemDeposit;

    public float calcDeposit(int custId) {
        if (idt != 0) {
            return itemDeposit;
        }
        return 0;
    }

}

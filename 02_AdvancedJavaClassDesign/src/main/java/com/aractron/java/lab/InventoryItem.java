package com.aractron.java.lab;

/**
 * Created by user on 21/02/2017.
 */

// Definition of the InventoryItem class
public class InventoryItem {

    private float price;
    private String condition;

    public InventoryItem() {
    }

    public InventoryItem(float price, String condition) {
        this.price = price;
        this.condition = condition;
    }

    public float getPrice() {
        return price;
    }

    public String getCondition() {
        return condition;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
    //The superclass defines methods for all types of InventoryItem.

    public float calcDeposit(){return price;}
    public String calcDateDue(){return condition;}
}

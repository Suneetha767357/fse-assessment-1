package com.fseassessment1.shoppingCartDemo.model;

public class Item {

    Object	items;
    int		quantity;

    public Item(Object items2) {
        items = items2;
        quantity = 1;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public void decrementQuantity() {
        quantity--;
    }

    public Object getItems() {
        return items;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}

package com.fseassessment1.shoppingCartDemo.model;

import javax.persistence.Entity;
import java.util.HashMap;

@Entity
public class Cart {

    private HashMap<String , Item> items = new HashMap<>();
    int noofitems = 0;

    public Cart() {
        items = new HashMap<String, Item>();
    }

    public void add(String itemID) {


    }


}




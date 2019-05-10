package com.fseassessment1.shoppingCartDemo.service;

import com.fseassessment1.shoppingCartDemo.model.Cart;
import com.fseassessment1.shoppingCartDemo.model.Item;
import com.fseassessment1.shoppingCartDemo.model.Product;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    private Cart cart;
    private Item item;
    private Product product;

    public  CartService(Cart cart  , Item item , Product product) {
        this.cart =cart;
        this.item = item;
        this.product = product;

    }

    public String emptyCart(){

        cart = new Cart();
        if(emptyCart().equals(cart)){
            return "cart is empty";

        }
        return null;
    }
    public void addProduct(){

    }

}

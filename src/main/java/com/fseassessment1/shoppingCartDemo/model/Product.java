package com.fseassessment1.shoppingCartDemo.model;

import javax.persistence.*;

@Entity
public class Product {

        @Id
        //@GeneratedValue
        private int Id;
        private String name;
        private String imageURL;
        private String size;
        private double price;

        public Product() {
        }

        public Product(int id, String name, String imageURL, String size, double price) {
            Id = id;
            this.name = name;
            this.imageURL = imageURL;
            this.size = size;
            this.price = price;
        }

        public int getId() {
            return Id;
        }

        public void setId(int id) {
            Id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getImageURL() {
            return imageURL;
        }

        public void setImageURL(String imageURL) {
            this.imageURL = imageURL;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

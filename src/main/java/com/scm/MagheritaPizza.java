package com.scm;

public class MagheritaPizza implements BasePizza {
    private final int price;
    MagheritaPizza(int price){
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public void display(){
        System.out.println(this.price);
    }
}

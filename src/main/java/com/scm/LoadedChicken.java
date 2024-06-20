package com.scm;

public class LoadedChicken extends ToppingDecorator{

    LoadedChicken(BasePizza basePizza){
        super(basePizza);
    }
    @Override
    public int getPrice() {
        return basePizza.getPrice()+50;
    }

    @Override
    public void display() {
        System.out.println("Total price "+this.getPrice());
    }
}

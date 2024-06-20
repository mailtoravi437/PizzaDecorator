package com.scm;

public class ExtraCheeseToppingPizza extends ToppingDecorator{

    ExtraCheeseToppingPizza(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int getPrice() {
        return this.getCost()+10;
    }

    @Override
    public void display() {
        System.out.println("Total cost "+this.getPrice());
    }
}

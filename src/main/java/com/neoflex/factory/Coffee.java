package com.neoflex.factory;

public class Coffee {
    private Water water;
    private final CoffeeBeans coffeeBeans;

    public Coffee(Water water, CoffeeBeans coffeeBeans) {
        this.water = water;
        this.coffeeBeans = coffeeBeans;
    }

    public String checkDescription() {
        String description;
        if(water.isHeated()){
            description =  "hot and ";
        }
        else {
            description =  "cold and ";
        }
        return description + coffeeBeans.getTitle();
    }
}

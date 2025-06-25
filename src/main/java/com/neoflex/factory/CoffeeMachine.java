package com.neoflex.factory;

public class CoffeeMachine {
    private Water water;

    public void setWater(Water water) {
        this.water = water;
    }

    public CoffeeCup makeCoffee(CoffeeType coffeeType) {
        CoffeeBeans coffeeBeans = CoffeeFactory.createCoffeeBeans(coffeeType);
        CoffeeCup coffeeCup = new CoffeeCup();
        heatWater(water);
        groundBeans(coffeeBeans);
        Coffee coffee = mixWaterAndCoffee(water, coffeeBeans);
        coffeeCup.pourCoffee(coffee);
        return coffeeCup;
    }

    private void heatWater(Water water) {
        System.out.println("Water is heating");
        water.setHeated(true);
    }

    private void groundBeans(CoffeeBeans coffeeBeans) {
        System.out.println("Coffee beans are being ground");
        coffeeBeans.setGround(true);
    }

    private Coffee mixWaterAndCoffee(Water water, CoffeeBeans coffeeBeans) {
        System.out.println("Water is being mixed with coffee");
        return new Coffee(water, coffeeBeans);
    }
}

package main.java.com.neoflex.factory;

public class CoffeeMachine {

    public CoffeeCup makeCoffee(CoffeeType coffeeType) {
        Coffee coffee = CoffeeFactory.getCoffee(coffeeType);
        CoffeeCup coffeeCup = new CoffeeCup();
        coffeeCup.pourCoffee(coffee);
        heatWater();
        filterWater();
        return coffeeCup;
    }

    private void heatWater() {
        System.out.println("Water is heating");
    }

    private void filterWater(){
        System.out.println("Water is being filtered");
    }
}

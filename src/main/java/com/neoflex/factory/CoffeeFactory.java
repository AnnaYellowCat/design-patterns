package main.java.com.neoflex.factory;

public class CoffeeFactory {
    public static CoffeeBeans createCoffeeBeans(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case ESPRESSO -> new EspressoBeans();
            case AMERICANO -> new AmericanoBeans();
        };
    }
}

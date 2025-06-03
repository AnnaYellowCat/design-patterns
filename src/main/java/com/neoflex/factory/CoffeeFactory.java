package main.java.com.neoflex.factory;

public class CoffeeFactory {
    public static Coffee getCoffee(CoffeeType coffeeType) {
        return switch (coffeeType) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
        };
    }
}

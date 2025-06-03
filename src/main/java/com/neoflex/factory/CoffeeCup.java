package main.java.com.neoflex.factory;

public class CoffeeCup {

    private Coffee coffee;

    public void pourCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public void takeSip(){
        if (coffee != null) {
            System.out.println("Mmm, " + coffee.getTitle() + "!");
        }
        else {
            System.out.println("Cup is empty :(");
        }
    }
}

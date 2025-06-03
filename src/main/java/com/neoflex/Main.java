package main.java.com.neoflex;

import main.java.com.neoflex.adapter.Computer;
import main.java.com.neoflex.adapter.MemoryCardImpl;
import main.java.com.neoflex.adapter.USBAdapter;
import main.java.com.neoflex.factory.CoffeeCup;
import main.java.com.neoflex.factory.CoffeeMachine;
import main.java.com.neoflex.proxy.BDImpl;
import main.java.com.neoflex.proxy.BDProxy;
import main.java.com.neoflex.singleton.LoggClass;
import main.java.com.neoflex.singleton.TestClass;

import java.time.LocalDateTime;

import static main.java.com.neoflex.factory.CoffeeType.*;

public class Main {
    public static void main(String[] args) {
        //singleton
        TestClass testClass = new TestClass();
        LoggClass loggClass = LoggClass.getInstance();
        loggClass.classLog(testClass, LocalDateTime.now().toString());

        //factory
        System.out.println();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeCup coffeeCup = coffeeMachine.makeCoffee(ESPRESSO);
        coffeeCup.takeSip();

        //adapter
        System.out.println();
        Computer computer = new Computer();
        MemoryCardImpl memoryCard = new MemoryCardImpl();
        memoryCard.writeInfo("Java is the best programming language");

        USBAdapter usbAdapter  = new USBAdapter();
        usbAdapter.connect(memoryCard);

        computer.readInfo(usbAdapter);

        //proxy
        System.out.println();
        BDImpl bd = new BDImpl("postgres");
        BDProxy bdProxy = new BDProxy(bd);
        bdProxy.connect("localhost:5432");
    }
}

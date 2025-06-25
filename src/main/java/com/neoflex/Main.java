package com.neoflex;

import com.neoflex.adapter.Computer;
import com.neoflex.adapter.MemoryCardImpl;
import com.neoflex.adapter.USBAdapter;
import com.neoflex.factory.CoffeeCup;
import com.neoflex.factory.CoffeeMachine;
import com.neoflex.factory.Water;
import com.neoflex.proxy.BD;
import com.neoflex.proxy.BDImpl;
import com.neoflex.proxy.BDProxy;
import com.neoflex.singleton.LoggClass;
import com.neoflex.singleton.TestClass;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.neoflex.factory.CoffeeType.*;

public class Main {
    public static void main(String[] args) {
        //singleton
        TestClass testClass = new TestClass();
        LoggClass loggClass = LoggClass.getInstance();
        loggClass.classLogg(testClass, LocalDate.now().format(DateTimeFormatter.ofPattern("yy.MM.dd")));

        //factory
        System.out.println();
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.setWater(new Water());
        CoffeeCup coffeeCup = coffeeMachine.makeCoffee(ESPRESSO);
        coffeeCup.takeSip();

        //adapter
        System.out.println();
        Computer computer = new Computer();
        MemoryCardImpl memoryCard = new MemoryCardImpl();
        USBAdapter usbAdapter  = new USBAdapter();
        usbAdapter.connect(memoryCard);
        computer.writeInfo(usbAdapter, "Java is the best programming language");
        computer.readInfo(usbAdapter);

        //proxy
        System.out.println();
        BD bd = new BDImpl("postgres");
        BDProxy bdProxy = new BDProxy(bd);
        bdProxy.connect("localhost:5432");
    }
}

package main.java.com.neoflex.adapter;

public class Computer {
    public void readInfo(USB usb){
        System.out.println("USB connected to computer");
        usb.readInfo();
    }
}

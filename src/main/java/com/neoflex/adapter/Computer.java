package com.neoflex.adapter;

public class Computer {
    public void readInfo(USB usb){
        System.out.println("USB connected to computer");
        usb.readInfo();
    }

    public void writeInfo(USB usb, String info){
        System.out.println("USB connected to computer");
        usb.writeInfo(info);
        System.out.println("Information is written");
    }
}

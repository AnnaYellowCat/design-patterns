package com.neoflex.adapter;

public class USBAdapter implements USB{
    private MemoryCard memoryCard;
    public void connect(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
        System.out.println("Memory card connected to adapter");
    }

    @Override
    public void readInfo() {
        memoryCard.readInfo();
    }

    @Override
    public void writeInfo(String info) {
        memoryCard.writeInfo(info);
    }
}

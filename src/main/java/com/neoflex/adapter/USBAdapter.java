package main.java.com.neoflex.adapter;

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
}

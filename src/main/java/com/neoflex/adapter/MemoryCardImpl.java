package main.java.com.neoflex.adapter;

public class MemoryCardImpl implements MemoryCard {
    private String info;

    @Override
    public void readInfo() {
        System.out.println("Info from memory card: " + info);
    }

    @Override
    public void writeInfo(String info) {
        this.info = info;
    };
}

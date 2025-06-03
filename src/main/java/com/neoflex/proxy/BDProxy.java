package main.java.com.neoflex.proxy;

public class BDProxy {
    private final BDImpl bd;

    public BDProxy(BDImpl bd) {
        this.bd = bd;
    }

    public void connect(String url){
        bd.connect(url + "/" + bd.getBdTitle());
    }
}

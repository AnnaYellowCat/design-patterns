package main.java.com.neoflex.proxy;

public class BDProxy {
    private final BD bd;

    public BDProxy(BD bd) {
        this.bd = bd;
    }

    public void connect(String url){
        bd.connect(url + "/" + bd.getBdTitle());
    }
}

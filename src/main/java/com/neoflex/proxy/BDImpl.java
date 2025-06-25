package com.neoflex.proxy;

public class BDImpl implements BD {
    private final String bdTitle;

    public BDImpl(String bdTitle) {
        this.bdTitle = bdTitle;
    }

    public void connect(String url){
        System.out.println("подключено " + url);
    }

    public String getBdTitle() {
        return bdTitle;
    }
}

package com.neoflex.factory;

public abstract class CoffeeBeans {
    private boolean ground;  // Добавляем поле в базовый класс

    public boolean isGround() {
        return ground;
    }

    public void setGround(boolean ground) {
        this.ground = ground;
    }

    public abstract String getTitle();
}

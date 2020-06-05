package com.revature.models;

import java.io.Serializable;

public class Hero implements Serializable {
    private String heroName;
    private String superPower;

    public Hero(){}
    public Hero(String heroName, String superPower) {
        this.heroName = heroName;
        this.superPower = superPower;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "heroName='" + heroName + '\'' +
                ", superPower='" + superPower + '\'' +
                '}';
    }
}

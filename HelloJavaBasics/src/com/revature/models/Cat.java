package com.revature.models;

public class Cat extends Animal{
    private String name;
    public Cat(String name){
        this.name = name;
    }
    public String meow(){
        return "meow";
    }

    @Override
    public void move() {
        System.out.println("mewving");
    }

    @Override
    public String toString() {
        return "Cat" +
                "[" +
                "name='" + name + '\'' +
                ']';
    }
}

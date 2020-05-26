package com.revature.models;
//this class is a public class, meaning it can be accessed by anyone
//This class belongs to a package, we create packages to organize our code
// note that according to the package name we have a model
// personally i like to have a models package that would hold my
public class Animal {
    //move method
    //POJO plain old java object
    private String name;
    private String species;
    private int limbs;
    private String kingdom;

    public Animal(String name, String species, int limbs, String kingdom) {
        this(name, species);
        this.limbs = limbs;
        this.kingdom = kingdom;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Animal() {
     //super();
        //this();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }
    public void move(){
        System.out.println("mooooooving");
    }
}

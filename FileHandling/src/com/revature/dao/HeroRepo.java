package com.revature.dao;

import com.revature.models.Hero;
import com.revature.utils.AppendingObjectOutputStream;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HeroRepo {
    private String fileName = "src/resources/Hero.txt";
    public boolean addHero(Hero hero){
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream(fileName,true));
            objectOutputStream.writeObject(hero);
            objectOutputStream.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }
    public List<Hero> getAllHeros(){
        List<Hero> retrievedHeros = new ArrayList<Hero>();
        try {
            FileInputStream file = new FileInputStream(fileName);
            ObjectInputStream input = new ObjectInputStream(file);
            Hero newHero;
            do{
                newHero = (Hero) input.readObject();
                retrievedHeros.add(newHero);
            } while (file.available() > 0);
            input.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return retrievedHeros;
    }
}

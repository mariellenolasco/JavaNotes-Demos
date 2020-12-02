package com.revature;

import com.revature.dao.HeroRepo;
import com.revature.models.Hero;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("mars");
        hashSet.add("jupiter");
        hashSet.add("venus");

        Iterator<String> hashIterator = hashSet.iterator();
        while (hashIterator.hasNext()){
            System.out.println(hashIterator.next());
        }
        for (String planet:
             hashSet) {
            System.out.println(planet);
        }
    }
}

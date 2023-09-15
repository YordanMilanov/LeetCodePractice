package org.example;

import java.util.*;

class RandomizedSet {

    Set<Integer> numbersSet;

    public RandomizedSet() {
        this.numbersSet = new HashSet<>();
    }

    public boolean insert(int val) {
        if(numbersSet.contains(val)) return false;
        numbersSet.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(numbersSet.contains(val)) {
            numbersSet.remove(val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        List<Integer> list = new ArrayList<Integer>(numbersSet);
        int r = (int)(Math.random() * numbersSet.size());
        return list.get(r);
    }
}

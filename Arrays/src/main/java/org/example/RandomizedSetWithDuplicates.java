package org.example;

import java.util.*;

import static java.lang.Math.random;

public class RandomizedSetWithDuplicates {
    List<Integer> numbersSet;

    public RandomizedSetWithDuplicates() {
        this.numbersSet = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(numbersSet.contains(val)){
            numbersSet.add(val);
            return false;
        }
        numbersSet.add(val);
        return true;
    }

    public boolean remove(int val) {
        int index = numbersSet.indexOf(val);
        if(numbersSet.contains(val)) {
            numbersSet.sort(Integer::compareTo);
            if(index >= numbersSet.size() - 1) {
                numbersSet.remove(index);
                return true;
            }
            if(numbersSet.get(index) == numbersSet.get(index + 1)) {
                numbersSet.remove(val);
                return false;
            }
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

    public static void main(String[] args) {
        RandomizedSetWithDuplicates numbers = new RandomizedSetWithDuplicates();
        System.out.println(numbers.insert(1));
        System.out.println(numbers.remove(1));
        System.out.println(numbers.insert(1));
    }
}


package org.example;

import java.util.*;

public class RotateArray {
    public static void main(String[] args) {
        int[] test = new int[7];
        test[0] = 1;
        test[1] = 2;
        test[2] = 3;
        test[3] = 4;
        test[4] = 5;
        test[5] = 6;
        test[6] = 7;

        int[] test2 = new int[1];
        test2[0] = 1;


        rotate(test, 3);
        System.out.println();
        rotate(test2, 3);



        int[] test3 = new int[4];
        test3[0] = -1;
        test3[1] = -100;
        test3[2] = 3;
        test3[3] = 99;

        System.out.println();
        rotate(test3, 2);

        int[] test4 = new int[2];
        test4[0] = 1;
        test4[1] = 2;
        System.out.println();
        rotate(test4, 2);

        int num = 3 % 7 ;
        System.out.println(num + "num");
    }

    public static void rotate(int[] nums, int k) {

        if(nums.length == 1) {
            return;
        }

        int startIndex = nums.length - k;
        List<Integer> result = new ArrayList<>();
        for (int i = startIndex; i < nums.length; i++) {
            result.add(nums[i]);
        }
        for (int i = 0; i < startIndex; i++) {
            result.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = result.get(i);
        }

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}

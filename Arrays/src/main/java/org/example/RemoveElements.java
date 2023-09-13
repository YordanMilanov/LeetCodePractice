package org.example;

public class RemoveElements {
    public static void main(String[] args) {
        int[] test =new int[5];
        test[0] = 1;
        test[1] = 2;
        test[2] = 2;
        test[3] = 3;
        test[4] = 3;
        System.out.println(removeElement(test, 2));
    }

    //returns the length of the array after the elements are removed
    public static int removeElement(int[] nums, int val) {
        int occur = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[occur++] = nums[i];
            }
        }
        return occur;
    }
}

package org.example;

public class MajorityElement {
    public static void main(String[] args) {
        int[] test =new int[3];
        test[0] = 6;
        test[1] = 5;
        test[2] = 5;
        System.out.println(majorityElement(test));
    }

    public static int majorityElement(int[] nums) {

        int currentOccur = 0;
        int currentElement = 0;

        for (int i = 0; i < nums.length; i++) {
            currentElement = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (currentElement == nums[j]) {
                    currentOccur++;
                }
            }
            if(Math.round(nums.length * 1.0 / 2) <= currentOccur) {
                break;
            }
            currentOccur = 0;
        }

        return currentElement;
    }
}

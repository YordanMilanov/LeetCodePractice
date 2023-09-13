package org.example;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int lengthOfTheUpdatedArray = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[lengthOfTheUpdatedArray] = nums[i];
            lengthOfTheUpdatedArray++;
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        return lengthOfTheUpdatedArray++;
    }

    public static void main(String[] args) {
        int[] test =new int[5];
        test[0] = 1;
        test[1] = 2;
        test[2] = 2;
        test[3] = 3;
        test[4] = 3;

        System.out.println("\nLength of the updated array: " + removeDuplicates(test));
    }
}


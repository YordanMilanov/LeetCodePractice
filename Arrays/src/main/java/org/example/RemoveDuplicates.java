package org.example;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int lengthOfTheUpdatedArray = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            nums[lengthOfTheUpdatedArray] = nums[i];
            lengthOfTheUpdatedArray++;
        }

        return lengthOfTheUpdatedArray++;
    }
}

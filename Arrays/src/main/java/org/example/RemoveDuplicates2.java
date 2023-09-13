package org.example;

public class RemoveDuplicates2 {


    public static void main(String[] args) {
        int[] test = new int[10];
        test[0] = 1;
        test[1] = 1;
        test[2] = 1;
        test[3] = 1;
        test[4] = 2;
        test[5] = 2;
        test[6] = 2;
        test[7] = 3;
        test[8] = 3;
        test[9] = 3;

        System.out.println("\nLength of the updated array: " + removeDuplicates2(test));
    }

    public static int removeDuplicates2(int[] nums) {

        if(nums.length==0){
            return 0;
        }
        int x=1,index=0;
        for(int i=0;i<nums.length-1;i++){

            //check if the number already appeared if it is x > 1
            if(nums[i]==nums[i+1] && x==1){
                x++;
                nums[index++]=nums[i];
            }

            else if(nums[i]!=nums[i+1]){
                x=1;
                nums[index++]=nums[i];
            }
        }
        nums[index++]=nums[nums.length-1];
        return index;
    }
}

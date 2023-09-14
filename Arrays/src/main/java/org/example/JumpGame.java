package org.example;

public class JumpGame {
    public static void main(String[] args) {
        int[] test =new int[5];
        test[0] = 0;
        test[1] = 3;
        test[2] = 1;
        test[3] = 1;
        test[4] = 4;
        System.out.println(canJump(test));
    }

    public static boolean canJump(int[] nums) {

//        Input: nums = [2,3,1,1,4]
//        Output: true
//        Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
            int target = 0;
            for(int i = 0;i<=target;i++){
                target = Math.max(target,i+nums[i]);
                if(target >=nums.length-1)
                    return true;
            }
            return false;
        }
    }

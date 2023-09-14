package org.example;

public class JumpGame2 {
    public static void main(String[] args) {
        int[] test = new int[5];
        test[0] = 2;
        test[1] = 3;
        test[2] = 1;
        test[3] = 1;
        test[4] = 4;
        System.out.println(canJump(test));
    }

    public static int canJump(int[] nums) {
        int jumps = 0, currEnd = 0, currFarthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currFarthest = Math.max(currFarthest, i + nums[i]);
            if (i == currEnd) {
                currEnd = currFarthest;
                jumps++;
            }
        }
        return jumps;
    }
}

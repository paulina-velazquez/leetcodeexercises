package com.paulinavelazquez.easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 15, 20, 15};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == (target - nums[j])) {
                    System.out.println("Answer: "+i+j);
                }
            }
        }
    }
}

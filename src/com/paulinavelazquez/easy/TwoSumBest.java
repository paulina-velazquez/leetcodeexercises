package com.paulinavelazquez.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumBest {
    public static void main(String[] args) {
        int[] nums = {2, 7, 15, 20, 15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int[] answer = { map.get(complement), i };
                System.out.println(Arrays.toString(answer));
            }
            map.put(nums[i], i);
        }
    }
}

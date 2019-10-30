package com.example.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoNums {

    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 11, 15};
        int target = 9;
        int[] ints = twoSum1(nums, target);
        System.out.println(ints[0] + " , " + ints[1]);

    }

    private static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int balance = target - nums[i];
            if (map.containsKey(balance)) {
                return new int[]{map.get(balance), i};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("Wrong credentials");
    }

}

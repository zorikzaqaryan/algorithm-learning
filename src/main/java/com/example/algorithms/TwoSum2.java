package com.example.algorithms;

/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
 * <p>
 * Note:
 * <p>
 * Your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Example:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 */
public class TwoSum2 {

    public static void main(String[] args) {
//        int[] nums = {3,24,50,79,88,150,345};
//        int target =  200;
//
        int[] nums = {2, 7, 11, 15};
        int target = 9;

//        int[] nums = {1,2,3,4,4,9,56,90};
//        int target = 8;

        int[] ints = twoSum(nums, target);
        System.out.println(ints[0] + " , " + ints[1]);
    }


    private static int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int sum;
        while (high != low) {
            sum = numbers[low] + numbers[high];
            if (sum == target) {
                return new int[]{low + 1, high + 1};
            }
            if (sum > target)
                high = binarySearch(numbers, low + 1, high - 1, target - numbers[low]);
            else if (sum < target)
                low = binarySearch(numbers, low + 1, high - 1, target - numbers[high]);
        }
        return new int[]{-1, -1};
    }

    private static int binarySearch(int[] numbers, int low, int high, int target) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (target == numbers[mid]) {
                return mid;
            } else if (target < numbers[mid]) {
                high = mid ;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }


}

package com.example.algorithms;

/**
 * https://www.youtube.com/watch?v=P3YID7liBug
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {2, 7, 9, 11, 15, 23};
        System.out.println(binarySearchRecursive(nums, 0, nums.length - 1, 9));
    }


    static int binarySearchRecursive(int[] array, int left, int right, int el) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (array[mid] == el) {
            return el;
        }
        if (array[mid] < el) {
            binarySearchRecursive(array, mid - 1, right, el);
        }
        if (array[mid] > el) {
            binarySearchRecursive(array, left, mid - 1, el);
        }
        return -1;
    }
}

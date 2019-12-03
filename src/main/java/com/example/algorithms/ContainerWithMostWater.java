package com.example.algorithms;

/**
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
 * which together with x-axis forms a container, such that the container contains the most water.
 * Note: You may not slant the container and n is at least 2.
 * Input: [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Find image in resources ContainerWithWater.PNG
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};// 49
        int[] arr1 = {1, 1};// 1
        int[] arr2 = {1, 2, 1};// 2
        System.out.println(maxArea(arr));
        System.out.println(maxArea(arr1));
        System.out.println(maxArea(arr2));
    }

    public static int maxArea(int[] elements) {
        int l = 0;
        int r = elements.length - 1;
        int result = 0;
        while (l < r) {
            result = Math.max(result, Math.min(elements[l], elements[r]) * (r - l));
            if (elements[l] < elements[r]) {
                l++;
            } else {
                r--;
            }
        }
        return result;
    }

}

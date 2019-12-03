package com.example.algorithms;

/**
 *
 */
public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1012));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(100));
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(9));
    }

    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x >= 0 && x <= 9) {
            return true;
        }

        int number = x;
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        return x == reversedNumber;
    }

}

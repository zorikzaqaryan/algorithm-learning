package com.example.algorithms;

public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(reverse(120));
        System.out.println(reverse(-123));

        System.out.println(reverse(1534236469));// 2147483648
        System.out.println(reverse(-2147483412));//2147483648   >>>>> -2147483412
        System.out.println(reverse(2147483647));
    }

    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;

            if (res < Integer.MIN_VALUE|| res > Integer.MAX_VALUE) {
                return 0;
            }
        }
        return (int)res;
    }
}

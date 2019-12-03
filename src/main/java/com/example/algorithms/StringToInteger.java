package com.example.algorithms;

/**
 * Implement atoi which converts a string to an integer.
 * <p>
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * <p>
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * <p>
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * <p>
 * If no valid conversion could be performed, a zero value is returned.
 * <p>
 * Note:
 * <p>
 * Only the space character ' ' is considered as whitespace character.
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
 */
public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("-42"));
        System.out.println(myAtoi("  -42"));
        System.out.println(myAtoi("sadasd  -42"));
        System.out.println(myAtoi("4193 with words"));
        System.out.println(myAtoi("-91283472332")); // -2147483648
        System.out.println(myAtoi("+1")); // -2147483648
        System.out.println(myAtoi("-+1")); // -2147483648
        System.out.println(myAtoi("+-1")); // -2147483648
        System.out.println(myAtoi("  -0012a42")); // -2147483648
        System.out.println(myAtoi("   +0 123")); // -2147483648
        System.out.println(myAtoi("2147483648")); // -2147483648
        System.out.println(myAtoi("2147483646"  )); // 2147483646
    }

    public static int myAtoi(String str) {
        long res = 0;

        boolean isMinus = false;
        int signCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char el = str.charAt(i);
            if (signCount > 1) {
                return 0;
            }
            if (el == 43 || el == 45) {
                ++signCount;
            }
            if (signCount>0 && el == 32){
                return 0;
            }

            if (isMinus ? (res * -1) >= Integer.MAX_VALUE : res >= Integer.MAX_VALUE/10) {
                return Integer.MAX_VALUE;
            }
            if (isMinus && ((-1 * res) <= Integer.MIN_VALUE)) {
                return Integer.MIN_VALUE;
            }
            // minus sign
            if (el > 57 || (el < 48 && el != 45 && el != 32 && el != 43)) {
                return  isMinus  ? (int)res * -1 : (int)res;
            }

            if (el == 45) {
                isMinus = true;
            }
            // ignore spaces
            if (el == 32) {
                continue;
            }

            if (el <= 57 && el >= 48) {
                res = res * 10 + (int) el - '0';
            }

        }
        return (int) (isMinus ? res * -1 : res);
    }

}

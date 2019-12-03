package com.example.algorithms;

public class ConvertToTitle {
    public static void main(String[] args) {
//        System.out.println(convertToTitle(1));//A
//        System.out.println(convertToTitle(26));//Z
        System.out.println(convertToTitle(52));//AZ
//        printString(52);//AZ
//        System.out.println(convertToTitle(27)); // AA
//        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            int rem = n % 26;
            if (rem == 0) {
                res.append('Z');
                n = n / 26 - 1;
            } else {
                res.append((char) (rem - 1 + 'A'));
                n = n / 26;
            }
        }
        return res.reverse().toString();
    }
}

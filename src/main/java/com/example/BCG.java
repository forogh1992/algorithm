package com.example;

public class BCG {
    public static void main(String[] args) {

        System.out.println(gcdOfStrings("helhel", "hello"));
//        System.out.println(gcdOfStrings("helhel","hel"));
    }

    public static String gcdOfStrings(String s1, String s2) {

        if (!(s1 + s2).equals(s2 + s1)) {
            return "";
        }
        int g = gcd(s1.length(), s2.length());
        return s1.substring(0, g);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}

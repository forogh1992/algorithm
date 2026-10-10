package com.example;

public class ReverseVowels {

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {

            while (left < right && !isVowel(chars[left])) {
                left++;
            }

            while (left < right && !isVowel(chars[right])) {
                right--;
            }

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' ||
               ch == 'i' || ch == 'o' ||
               ch == 'u' || ch == 'A' ||
               ch == 'E' || ch == 'I' ||
               ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        String s = "hello";
        String result = reverseVowels(s);
        System.out.println(result);
    }
}
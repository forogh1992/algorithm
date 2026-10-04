package com.example;

public class PlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            boolean currentIsEmpty = flowerbed[i] == 0;
            boolean leftIsEmpty = i == 0 || flowerbed[i - 1] == 0;
            boolean rightIsEmpty = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;

            if (currentIsEmpty && leftIsEmpty && rightIsEmpty) {
                flowerbed[i] = 1;
                n--;

                if (n == 0) {
                    return true;
                }
            }
        }

        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;// n=1-->true, n=2-->false

        boolean result = canPlaceFlowers(flowerbed, n);
        System.out.println(result);
    }
}

package ua.usmonov.hw4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] originalArray = generateRandomArray(400);
        System.out.println("Среднее арифметическое: " + arifmitic(originalArray));
        System.out.println("Среднее геометрическое: " + geometriya(originalArray));
    }
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10) + 1;
        }
        return array;
    }
    public static double arifmitic(int[] originalArray) {
        int sum = 0;
        for (int value : originalArray) {
            sum += value;
        }
        return (double) sum / originalArray.length;
    }
    public static double geometriya(int[] originalArray) {
        double product = 1.0;
        for (int value : originalArray) {
            product *= value;
        }
        return Math.pow(product, 1.0 / originalArray.length);
    }
}
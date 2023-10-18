package ua.usmonov.hw3;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        String sentence;

        System.out.print("Напишите любое предложение: ");
        sentence = sss.nextLine();

        System.out.println(length(sentence));
    }
    public static String[] splitt(String sentence){
        String[]  words = sentence.split(" ");
        return words;
    }
    public static int length(String sentence) {
        String[] spaceLessText = splitt(sentence);
        int length = spaceLessText.length;
        return spaceLessText.length;
    }
}

package ua.usmonov.hw2;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int a;
        System.out.println("Введите число: ");

        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        System.out.println(isEven(a));
    }

    public static int isEven(int a) {
        if ( a % 2 == 0 ) {
            System.out.println("Число " + a + " - четное");
        }
        else {
            System.out.println("Число " + a + " - нечетное");
        }
        return a;
    }
}

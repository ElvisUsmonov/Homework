import java.util.Scanner;
public class Task2 {
    public static void main(String[] args ) {
        Scanner in = new Scanner(System.in);
        String text;

        System.out.print("Введите фразу с маленькой буквы: ");
        text = in.nextLine();

        System.out.println(replaceAll(text));
        System.out.println(isPalindrome(text) ? "Это палиндром" : "Это не палиндром");
    }

    public static String replaceAll(String text) {
        String spacelessText  = text.replaceAll(" ", "");
        return spacelessText;
    }

    public static boolean isPalindrome(String spacelessText) {
        StringBuilder plain = new StringBuilder(spacelessText);
        StringBuilder reverse = plain.reverse();

        return (reverse.toString().equals(spacelessText));
    }
}

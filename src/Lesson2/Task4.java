import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        theSmallest();
    }

    public static void theSmallest() {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double a = input.nextFloat();

        System.out.print("Введите второе число: ");
        double b = input.nextFloat();

        System.out.print("Введите третье число: ");
        double c = input.nextFloat();

        String theSmallest = Math.abs(a) < Math.abs(b) ?
                Math.abs(a) < Math.abs(c) ? "Число " + a + " меньшее":
                        "Число " + c + " меньшее" : Math.abs(b) < Math.abs(c) ?
                "Число " + b + " меньшее" : "Число " + c + " меньшее";
        System.out.println(theSmallest);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("The even numbers between " + num1 + " and " + num2 + " are:");
        for (int i = num1 + 1; i < num2; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

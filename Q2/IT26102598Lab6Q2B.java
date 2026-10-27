
import java.util.Scanner;
public class IT26102598Lab6Q2B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nThe numbers you entered are:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}

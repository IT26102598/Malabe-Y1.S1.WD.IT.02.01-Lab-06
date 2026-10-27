
import java.util.Scanner;

public class IT26102598Lab6Q2C {

    static Scanner input = new Scanner(System.in);
    static int[] numbers = new int[10];

    static void getNumbers(int n) {
        if (n < 10) {
            System.out.print("Enter number " + (n + 1) + ": ");
            numbers[n] = input.nextInt();
            getNumbers(n + 1);
        }
    }

    static void displayNumbers(int n) {
        if (n < 10) {
            System.out.print(numbers[n] + " ");
            displayNumbers(n + 1);
        }
    }

    static int calculateSum(int n) {
        if (n == 10) {
            return 0;
        }
        return numbers[n] + calculateSum(n + 1);
    }

    public static void main(String[] args) {

        System.out.println("Please enter 10 numbers:");
        getNumbers(0);

        System.out.println("\nThe numbers you entered are:");
        displayNumbers(0);

        int sum = calculateSum(0);
        double average = sum / 10.0;

        System.out.println("\n\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);
    }
}

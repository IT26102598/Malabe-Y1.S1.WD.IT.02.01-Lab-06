import java.util.Scanner;
public class IT26102598Lab6Q1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int number;
		System.out.println("Enter number");
		number=input.nextInt();
		
		int square;
		double squareroot;
		
		square=number*number;
		squareroot=Math.sqrt(number);
		
		System.out.println("Square value of "+ number +" is "+square);
		System.out.println("Squareroot value of"+ number +"is "+squareroot);
		
	}
}
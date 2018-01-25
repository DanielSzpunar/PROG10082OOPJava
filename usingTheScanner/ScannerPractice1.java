import java.util.Scanner;
public class ScannerPractice1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name please:");
		String firstName = input.nextLine();
		System.out.println("Enter your last name please: ");
		String lastName = input.nextLine();
		System.out.println("Welcome " + firstName + " " + lastName);
		
		System.out.println("Let's add numbers: ");
		System.out.println("Give me the first number: ");
		int number1 = input.nextInt();
		System.out.println("Now the second number: ");
		int number2 = input.nextInt();
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
	}
}
import java.util.Scanner;
public class ScannerPractice1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first name please:");
		String firstName = input.nextLine();
		System.out.println("Enter your last name please: ");
		String lastName = input.nextLine();
		System.out.println("Welcome " + firstName + " " + lastName);
	}
}
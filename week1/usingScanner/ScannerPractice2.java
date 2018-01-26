import java.util.Scanner;

public class ScannerPractice2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if(input.hasNextLine()) {
            input.nextLine();
        }
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("\nName: " + name + "\nAge: " + age);
        /**
         * The if statement is used to check if there is a carriage.  If so it runs an input.nextLine();
         * before continuing with the program.
         */
	}
}
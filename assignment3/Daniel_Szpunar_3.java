/*
 * Assignment: Assignment #3
 * Submitted by: Daniel Szpunar
 * Program: Computer Programmer
 * File name: Daniel_Szpunar_3.java
 * Description: This simple program gives the user two options to choose from to enter his grade (letter and numeric grade) and an option
 * when completed to calculate the average of his GPA.  For letter grades a switch statement is executed.  For numeric grades a
 *
 */
import java.util.Scanner;

public class Daniel_Szpunar_3 {

    public static void main(String[] args) {
        //Scanner input allows the user to input through keyboard.
        Scanner input = new Scanner(System.in);

        //These two integers keep track of the users total amount of grades entered and the total of the gpa grades they got.
        int amountOfGradesEntered = 0;
        int totalGpaGrades = 0;

        //This infinite while loop gives the user the option to enter a letter, number, or exit the while loop to display the results.
        while(true) {
            System.out.println("What type of grade do you wish to enter?\n1 - Letter (A, C, etc.)\n2 - Numeric (89, 68, etc.)\n0 - End program");

            //input from user decides which condition to choose.
            int usersChoice = Integer.parseInt(input.nextLine());

            /*I am well aware the case is rather cumbersome. However, I had no choice since I don't know exception handling.
             *If I added to the amountOfGradesEntered and totalGpaGrades after the switch statement and the user entered an incorrect letter
             *triggering the default then both variables would be incorrect. Therefore I had to alter the variables in the case as opposed
             * to right after exiting it. Exception handling is out of my scope at this point...
             */
            if (usersChoice == 1) {
                System.out.print("Please enter a letter grade: ");
                //gradeAsString takes the input as a String converts it to uppercase in case user entered lowercase and then I created a char
                //storing the 1st char in the string.
                String gradeAsString = input.nextLine();
                char gradeAsLetter = gradeAsString.toUpperCase().charAt(0);

                //gradeAsNumber is a gradeAsLetter casted to an int to avoid problems making calculations.
                int gradeAsNumber;

                //Each switch case takes the char, converts it to an int, increments amountOfGrades entered by 1 and += the grade to
                //totalGpaGrades.
                switch (gradeAsLetter) {
                    case 'A': gradeAsLetter = 4;
                        gradeAsNumber = (int) gradeAsLetter;
                        totalGpaGrades += gradeAsNumber;
                        amountOfGradesEntered++;
                        System.out.println("The corresponding GPA is " + gradeAsNumber + "\n");
                        break;
                    case 'B': gradeAsLetter = 3;
                        gradeAsNumber = (int) gradeAsLetter;
                        totalGpaGrades += gradeAsNumber;
                        amountOfGradesEntered++;
                        System.out.println("The corresponding GPA is " + gradeAsNumber + "\n");
                        break;
                    case 'C': gradeAsLetter = 2;
                        gradeAsNumber = (int) gradeAsLetter;
                        totalGpaGrades += gradeAsNumber;
                        amountOfGradesEntered++;
                        System.out.println("The corresponding GPA is " + gradeAsNumber + "\n");
                        break;
                    case 'D': gradeAsLetter = 1;
                        gradeAsNumber = (int) gradeAsLetter;
                        totalGpaGrades += gradeAsNumber;
                        amountOfGradesEntered++;
                        System.out.println("The corresponding GPA is " + gradeAsNumber + "\n");
                        break;
                    case 'F': gradeAsLetter = 0;
                        gradeAsNumber = (int) gradeAsLetter;
                        totalGpaGrades += gradeAsNumber;
                        amountOfGradesEntered++;
                        System.out.println("The corresponding GPA is " + gradeAsNumber + "\n");
                        break;
                        //If the user enters an incorrect letter it has no effect on the two important global variables(amountOfGradesEntered
                        // and totalGpaGrades).
                    default: System.out.println("Sorry you can only enter A, B, C, D, and F. Please try again.");
                        break;
                }
            }
            //Multi-conditional else-if statement is used for the numeric grade input.  the grade entered is assigned a value based on the
            //corresponding letter and added to the totalGpaGrades(+=) while also incrementing the amountOfGradesEntered.

            else if (usersChoice == 2) {
                System.out.print("Please enter a numeric grade: ");
                int numericGrade = Integer.parseInt(input.nextLine());
                if (numericGrade >= 80) {
                    numericGrade = 4;
                    totalGpaGrades += 4;
                    amountOfGradesEntered++;
                }
                else if (numericGrade >= 70) {
                    numericGrade = 3;
                    totalGpaGrades += 3;
                    amountOfGradesEntered++;
                }
                else if (numericGrade >= 60) {
                    numericGrade = 2;
                    totalGpaGrades += 2;
                    amountOfGradesEntered++;
                }
                else if (numericGrade >= 50){
                    numericGrade = 1;
                    totalGpaGrades += 1;
                    amountOfGradesEntered++;
                }
                else {
                    numericGrade = 0;
                    totalGpaGrades +=0;
                    amountOfGradesEntered++;
                }
                System.out.println("The corresponding GPA is " + numericGrade);
            }
            //The only way to break from this infinite while loop
            else if (usersChoice == 0) {
                break;
            }
            else {
                System.out.println("You have entered an incorrect number. Please try again.");
            }
        }
        //the simple equation to calculate the final GPA
        double GpaFinal = (double) totalGpaGrades / (double) amountOfGradesEntered;

        //The final output to the user before ending the program which displays the total amount of grades entered
        //and what his GPA is, rounded to one decimal.
        String GpaSummary = "You have entered %d grades with a GPA of %.1f";
        System.out.printf(GpaSummary, amountOfGradesEntered, GpaFinal);
    }
}
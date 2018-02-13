/*
* Honour: I have completed the assignment on my own.
*
* In researching my assignment I got ideas from no one.  However, after the
* original assignment is a little extra.  I got ideas from:
* https://docs.oracle.com/javase/6/docs/api/java/text/SimpleDateFormat.html for
* time and date formats.
*
* Description: A simple program that allows a sales representative to input his
* daily sales and determine his commission. The commission is determined by
* using a conditional statement to determine which percentage bracket he qualifies
* for.
*
* @author Daniel Szpunar ID#991502498
*/

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Daniel_Szpunar_2 {

    public static void main(String[] args) {

        //Required to allow the user to interact with the program through the
        //console/terminal.
        Scanner input = new Scanner(System.in);

        //Constant doubles below are the possible commission percentages.
        final double TWO_PERCENT = 0.02;
        final double FOUR_PERCENT = 0.04;
        final double SIX_POINT_FIVE_PERCENT = 0.065;
        final double SEVEN_POINT_FIVE_PERCENT = 0.075;

        //Asks the user in console to enter their total sales.
        System.out.print("Enter your sales for today: ");

        //This variable stores the sales amount of the user.  The input must be a number.
        //Note: Entering letters will crash the program.
        double usersSalesAmount = input.nextDouble();

        //userCommissionOutput is the text that will be printed out to the
        //user after calculating his commission.
        String usersCommissionOutput = "";

        //Conditional statement below determines users comission percentage based
        // on daily sales. 4 brackets in total (2%, 4%, 6.5%, and 7.5%)
        //The System.out.printf displays the text to the console.
        if (usersSalesAmount > 10000 ) {
            usersCommissionOutput = "Your commission rate is %.1f%% and total commissions are $%.2f";
            System.out.printf(usersCommissionOutput, (SEVEN_POINT_FIVE_PERCENT * 100), (usersSalesAmount * SEVEN_POINT_FIVE_PERCENT));
        }
        else if (usersSalesAmount <= 10000 && usersSalesAmount > 5000) {
            usersCommissionOutput = "Your commission rate is %.1f%% and total commissions are $%.2f";
            System.out.printf(usersCommissionOutput, (SIX_POINT_FIVE_PERCENT * 100), (usersSalesAmount * SIX_POINT_FIVE_PERCENT));
        }
        else if (usersSalesAmount <= 5000 && usersSalesAmount > 1000) {
            usersCommissionOutput = "Your commission rate is %.0f%% and total commissions are $%.2f";
            System.out.printf(usersCommissionOutput, (FOUR_PERCENT * 100), (usersSalesAmount * FOUR_PERCENT));
        }
        else {
            usersCommissionOutput = "Your commission rate is %.0f%% and total commissions are $%.2f";
            System.out.printf(usersCommissionOutput, (TWO_PERCENT * 100), (usersSalesAmount * TWO_PERCENT));
        }


        /*
        The below program does the same as the original assignment plus prints the current date and
        displays the amount of sales required by the user to progress to the next sales bracket.


        //Required to allow the user to interact with the program through the
        //console/terminal.
        Scanner input = new Scanner(System.in);

        //Creates a Date class to display the current date.
        Date date = new Date();

        //SimpleDateFormat is used to format the date into a user-friendly format.
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        String currentDate = sdf.format(date);

        //Constant doubles below are the possible commission percentages.
        final double TWO_PERCENT = 0.02;
        final double FOUR_PERCENT = 0.04;
        final double SIX_POINT_FIVE_PERCENT = 0.065;
        final double SEVEN_POINT_FIVE_PERCENT = 0.075;

        //Ask the user to enter his name.
        System.out.print("Enter your name: ");

        //Store his name in a String variable.
        String userName = input.nextLine();

        //String to display users name, current date, collect his sales figures.
        String enterSalesString = "Welcome %s, please enter the sales for %s:";
        //Asks the user in console to enter their total sales.
        System.out.printf(enterSalesString, userName, currentDate);

        //This variable stores the sales amount of the user.  The input must be a number.
        //Note: Entering letters will crash the program.
        double usersSalesAmount = input.nextDouble();

        //String used to display users rate and commission after calculating
        //userSalesAmount * commission percentage. String is empty until calculation
        //completed.
        String usersCommissionOutput = "";

        //Conditional statement below determines users comission percentage based
        // on daily sales. 4 brackets in total (2%, 4%, 6.5%, and 7.5%)
        if (usersSalesAmount > 10000 ) {
            double usersExceededBy = usersSalesAmount - 10001;
            usersCommissionOutput = "Commission Rate: %.1f%%\nCommission: $%.2f\nGood job %s, your sales exceeded the top commission sales amount by $%.2f";
            System.out.printf(usersCommissionOutput, (SEVEN_POINT_FIVE_PERCENT * 100), (usersSalesAmount * SEVEN_POINT_FIVE_PERCENT) , userName, usersExceededBy);
        }
        else if (usersSalesAmount <= 10000 && usersSalesAmount > 5000) {
            double increaseAmount = 10001- usersSalesAmount;
            usersCommissionOutput = "Commission Rate: %.1f%%\nCommission: $%.2f\nGood job %s, but if you sold $%.2f more, you would qualify for the %.1f%% commission rate";
            System.out.printf(usersCommissionOutput, (SIX_POINT_FIVE_PERCENT * 100), (usersSalesAmount * SIX_POINT_FIVE_PERCENT), userName, increaseAmount, (SEVEN_POINT_FIVE_PERCENT * 100));

        }
        else if (usersSalesAmount <= 5000 && usersSalesAmount > 1000) {
            double increaseAmount = 5001 - usersSalesAmount;
            usersCommissionOutput = "Commission Rate: %.0f%%\nCommission: $%.2f\nGood job %s, but if you sold $%.2f more, you would qualify for the %.1f%% commission rate";
            System.out.printf(usersCommissionOutput, (FOUR_PERCENT * 100), (usersSalesAmount * FOUR_PERCENT), userName, increaseAmount, (SIX_POINT_FIVE_PERCENT * 100));
        }
        else {
            double increaseAmount = 1001 - usersSalesAmount;
        usersCommissionOutput = "Commission Rate: %.0f%%\nCommission: $%.2f\nGood job %s, but if you sold $%.2f more, you would qualify for the %.0f%% commission rate";
            System.out.printf(usersCommissionOutput, (TWO_PERCENT * 100), (usersSalesAmount * TWO_PERCENT), userName, increaseAmount, (FOUR_PERCENT * 100));
        }
        */
    }
}

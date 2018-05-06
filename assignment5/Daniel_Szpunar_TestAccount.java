/*Assignment: Assignment #5
 * Submitted by: Daniel Szpunar
 * Student ID: 991502498
 * Program: Computer Programmer
 * Description: This is a simple program that has a main class and an account class.
 * The account class has various data fields to simulate a bank account.  The class has 
 * several methods that allow the user to make deposits, withdrawals, check monthly 
 * interest, etc...
 */
public class Daniel_Szpunar_TestAccount {

   public static void main(String[] args) {
      //Create new Account instance.
      Daniel_Szpunar_Account danAccount = new Daniel_Szpunar_Account(1122, 20000);
      //Set the annual interest rate to 4.5%.
      danAccount.setAnnualInterestRate(4.5);
      //withdraw 2.5k from account.
      danAccount.withdraw(2500);
      //deposit 3k to account.
      danAccount.deposit(3000);
      //print out the toString method to display account info to console.
      System.out.println(danAccount);
      
   }
}
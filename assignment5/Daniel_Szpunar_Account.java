/*Assignment: Assignment #5
 * Submitted by: Daniel Szpunar
 * Student ID: 991502498
 * Program: Computer Programmer
 * Description: This is a simple program that has a main class and an account class.
 * The account class has various data fields to simulate a bank account.  The class has 
 * several methods that allow the user to make deposits, withdrawals, check monthly 
 * interest, etc...
 */
import java.util.Date;

public class Daniel_Szpunar_Account {
   //Required data fields for the Account class.
   private int id;
   private double balance;
   private double annualInterestRate;
   private final Date dateCreated = new Date();
   private static String bank = "TD";
   //Empty constructor
   public Daniel_Szpunar_Account() {
   }
   //Constructor that requires id and balance.
   public Daniel_Szpunar_Account(int id, double balance) {
      this.id = id;
      this.balance = balance;   
   }
   //id setter method.
   public void setId(int id) {
      this.id = id;
   }
   //id getter method.
   public int getId() {
      return this.id;
   }
   //balance setter method.
   public void setBalance(double balance) {
      this.balance = balance;
   }
   //balance getter method.
   public double getBalance() {
      return this.balance;
   }
   //annualInterestRate setter method. Divided by 100 to create decimal.
   public void setAnnualInterestRate(double annualInterestRate) {
      this.annualInterestRate = annualInterestRate / 100;
   }
   //annualInterestRate getter method.
   public double getAnnualInterestRate() {
      return this.annualInterestRate;
   }
   //dateCreated getter method.
   public Date getDateCreated() {
      return this.dateCreated;
   }
   //Setter for static bank method.
   public void setBank(String bank) {
      this.bank = bank;
   }
   //bank getter method.
   public String getBank() {
      return this.bank;
   }
   //monthly interest rate getter method (annualInterestRate divided by 12 months in a year.) 
   public double getMonthlyInterestRate() {
      return this.annualInterestRate / 12;
   }
   //Monthly interest getter method (balance multiplied by monthly interest rate.)
   public double getMonthlyInterest() {
      return this.balance * this.getMonthlyInterestRate();
   }
   //Withdraw method.  Protected from withdrawing more than client has in balance.
   public void withdraw(double amountToWithdrawal) {
      if (amountToWithdrawal < this.balance) {
         this.setBalance(this.balance - amountToWithdrawal);
      } else System.out.println("Transaction incomplete. Insufficient funds.");
   }
   //Account deposit method.
   public void deposit(double amountToDeposit) {
      this.setBalance(this.balance + amountToDeposit);
   }
   //ToString method.  the balance and interest rate are formatted to two decimal places.
   public String toString() {
      String balance = String.format("%.2f", this.balance);
      String annualInterestRate = String.format("%.2f", this.annualInterestRate * 100);
      return "Account Bank=" + this.getBank() + ", ID=" + this.getId() + ", Balance=$" + balance + ",Rate=" + annualInterestRate + "%, Date Created=" + this.getDateCreated();   
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
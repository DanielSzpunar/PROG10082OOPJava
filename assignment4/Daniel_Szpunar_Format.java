/**
* Assignment: Assignment #4
* Submitted by: Daniel Szpunar
* Student ID: 991502498
* Program: Computer Programmer
* File name: Daniel_Szpunar_Format.java
* Description: This is a simple program that asks the user for
* two integers. The first is the number will be displayed on the
* screen the second number we add will add that amount of zero's to 
* the first integer.
*/
import java.util.Scanner;

public class Daniel_Szpunar_Format {

   public static void main(String[] args) {
      //Allow user to give input.
      Scanner input = new Scanner(System.in);
      //Ask the user for an integer.
      System.out.print("Enter an integer: ");
      int num = Integer.parseInt(input.nextLine());
      
      //Ask the user for the width of the number.
      System.out.print("Enter the width: ");
      int width = Integer.parseInt(input.nextLine());
      System.out.print(format(num, width));
   }
   public static String format(int number, int width) {
      //convert the int number into a String type.
      String stringNumber = Integer.toString(number);
      //If the string length is greater than the width we need not alter it.
      //If it is we run String.format()
      if (stringNumber.length() >= width) {
         return stringNumber;
      } else {
         return String.format("%0" + (width - stringNumber.length()) + "d%s",0,stringNumber);
      }
   }
}   
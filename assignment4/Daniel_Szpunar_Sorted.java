/**
* Assignment: Assignment #4
* Submitted by: Daniel Szpunar
* Student ID: 991502498
* Program: Computer Programmer
* File name: Daniel_Szpunar_sorted.java
* Description: The program asks the user to input the length of an array,
* then populates the array with the integers of his choosing. The boolean method
* isSorted determines if the users array is in ascending order which will
* return true if so.
*/
import java.util.Scanner;

public class Daniel_Szpunar_Sorted {

   public static void main(String[] args) {
      //Scanner for user input.
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter list: ");
      //Allow user to determine length of array.
      int arrayLength = Integer.parseInt(input.nextLine());
      //create an array with length determined by user.
      int[] list = new int[arrayLength];
      
      //Allow user to populate list with input.
      for (int i = 0; i < list.length; i++) {
         list[i] = input.nextInt();
      }
      //Prints desired output depending on true or false from isSorted();
      if (isSorted(list)) {
         System.out.println("The list is already sorted.");
      }
      else System.out.println("The list is not sorted.");
   }
   //Method to return boolean true if the array is in ascending order.
   public static boolean isSorted(int[] list) {
      for (int i = 0; i < list.length - 1; i++) {
         if (list[i] > list[i + 1]) {
            return false;
         } 
      } return true;
   }
} 
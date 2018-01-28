/*
* Assignment: Assignment #1.1
* Submitted by: Daniel Szpunar / Sheridan ID#991502498
* Program: Computer Programming
* File name: Pattern.java
* 
* Description: This is a simple java program that prints the
* word "java" in uppercase to the console. To execute this
* program you must have the JRE installed on your computer. Go
* to the directory in your terminal where you have saved this 
* file, type: "javac Pattern.java" in your terminal to create a 
* Pattern.class file. Next, type: "java Pattern" to excute the
* program and display the output in your terminal.  
*/

public class Pattern {
   public static void main(String[] args) {
      
/*
* The System class using the println method will execute 
* four times, one after the other outputing "JAVA" in
* your console/terminal.
*/
      
      System.out.println("    J     A     V     V     A");
      System.out.println("    J    A A     V   V     A A");
      System.out.println("J   J   AAAAA     V V     AAAAA");
      System.out.println(" J J   A     A     V     A     A");
      
/*
 * Below is a variation of the original assignment which
 * uses the System class once instead of four times. We can achieve this by using
 * the "\n" which creates a new line and concatenation. It remains commented out 
 * since it was not part of the original assignment.  Remove comments to 
 * execute the code.
*/    
      /*
      System.out.println("    J     A     V     V     A\n" + 
                         "    J    A A     V   V     A A\n" + 
                         "J   J   AAAAA     V V     AAAAA\n" + 
                         " J J   A     A     V     A     A");
      */                   
   }
}
 /**
 * File: Lab2.java
 * Author: Tiffany Pan
 * Description: Perform calculations in Java based on user input.
 **/
 // Performing calculations.
package lab2;

import java.util.Scanner;

public class Lab2 {
    public static void main( String args[] ) {
       Scanner input = new Scanner( System.in );

       int number1; // first number
       int number2; // second number
       int number3; // third number
       int largest; // largest value
       int smallest; // smallest value
       int sum; // sum of numbers
       int product; // product of numbers
       int average; // average of numbers

       /* write a series of statements to read in three numbers and assign them
       to number1, number2, and number3 */
       System.out.print("Enter first integer: ");
       number1 = input.nextInt();
       System.out.print("Enter second integer: ");
       number2 = input.nextInt();
       System.out.print("Enter third integer: ");
       number3 = input.nextInt();
       
       largest = number1; // assume number1 is the largest
       smallest = number1; // assume number1 is the smallest
       if(largest<number2)
           largest = number2;
       if(largest<number3)
           largest = number3;
       if(smallest>number2)
           smallest = number2;
       if(smallest>number3)
           smallest = number3;
       
       /* 27 */
       sum = number1 + number2 + number3;
       /* write statements to calculate the product and the average */
       product = number1 * number2 * number3;
       average = sum/3;
       /* write statements that display the results */
       System.out.printf("For the numbers %d, %d, and %d%n" + 
               "Largest is %d%n" +
               "Smallest is %d%n" +
               "Sum is %d%n" +
               "Product is %d%n" +
               "Average is %d%n",
               number1, number2, number3,
               largest, smallest, sum, product, average);
               
    } // end main
 } // end class Lab2
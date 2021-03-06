/*
 * File: prob6_10.cpp
 * Author: Tiffany Pan
 */
package prob6_10;

import java.util.Scanner;

/**
 * Rounding numbers in terms of integers, tenths, hundredths, and thousands
 * places 
 */
public class Rounding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        float num = (float)input.nextFloat();
        roundToInteger(num);
        roundToTenths(num);
        roundToHundredths(num);
        roundToThousandths(num);       
    }
    
    public static void roundToInteger(float number){
        int y = (int)number;
        System.out.println("Rounded to nearest integer: " + y);
    }
    public static void roundToTenths(float number){
        float y = (float)(Math.floor(number*10 + 0.5)/10);
        System.out.printf("Rounded to nearest tenths place: %.1f%n", y);   
    }
    public static void roundToHundredths(float number){
        float y = (float)(Math.floor(number*100 + 0.5)/100);
        System.out.printf("Rounded to nearest hundredths place: %.2f%n", y);  
    }
    public static void roundToThousandths(float number){
        float y = (float)(Math.floor(number*1000 + 0.5)/1000);
        System.out.printf("Rounded to nearest thousandths place: %.3f%n", y);
    }
}

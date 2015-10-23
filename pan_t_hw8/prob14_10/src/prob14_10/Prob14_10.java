/*
 * Author: Tiffany Pan
 * HW 14.10 Displaying Strings in uppercase and lowercase
 */

package prob14_10;

import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class Prob14_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); //creates scanner
        System.out.println("Enter a string:");
        String s1 = scanner.nextLine(); //gets string input
        
        System.out.println("The string in all uppercase: " + s1.toUpperCase());
        System.out.println("The string in all lowercase: " + s1.toLowerCase());
    }
    
}

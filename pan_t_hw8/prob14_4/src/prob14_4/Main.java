/*
 * Author: Tiffany Pan
 * HW: Prob 14.4 Comparing poritions of strings
 */

package prob14_4;

import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); //creates scanner
        System.out.println("Enter a string:");
        String s1 = scanner.nextLine(); //gets string input
        System.out.println("Enter another string:");
        String s2 = scanner.nextLine();     
     
        System.out.println("How many characters will be compared?");
        int nChar = scanner.nextInt();
        
        System.out.println("What is the starting index?");
        int start = scanner.nextInt();
        
        if(s1.regionMatches(true, start, s2, start, nChar))
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");
    }
    
}

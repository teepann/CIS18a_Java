/*
 * Author: Tiffany Pan
 * HW: 14.3 Compare strings
 */

package prob14_3;

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
        if(s1.compareTo(s2) == 0)
            System.out.println("1st string is equal to 2nd");
        else if (s1.compareTo(s2) < 0)
            System.out.println("1st string is less than the 2nd");
        else if (s1.compareTo(s2) > 0)
            System.out.println("1st string is greater than the 2nd");
    }
    
}

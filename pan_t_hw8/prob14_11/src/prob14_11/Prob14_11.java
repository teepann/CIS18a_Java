/*
 * Author: Tiffany Pan
 * HW: 14.11 Searching strings
 */

package prob14_11;

import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class Prob14_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); //creates scanner
        System.out.println("Enter a string:");
        String s1 = scanner.nextLine(); //gets string input
        
        int count = 0;
        System.out.println("Enter a character to search for:");
        char key = scanner.next().charAt(0); //gets string input
        for (int i = 0; i < s1.length(); i++){
            if (s1.charAt(i) == key)
                count++;
        }
        System.out.println(key + " occurs " + count + " times.");
    }
    
}

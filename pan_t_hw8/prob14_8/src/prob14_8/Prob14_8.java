/*
 * Author: Tiffany Pan 
 * HW: 14.8 tokenizing telephone numbers
 */

package prob14_8;

import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class Prob14_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a phone number in the form (555) 555-5555:");
        String phone = scanner.nextLine();
        
        phone = phone.replaceAll("\\(", "");
        phone = phone.replaceAll("\\)", "");
        phone = phone.replaceAll("\\ ", "");
        phone = phone.replaceAll("\\-", "");
        System.out.println(phone);
    }
    
}

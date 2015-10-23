/**
 * File: Lab3.java
 * Author: Tiffany Pan
 * Date: 09/17/2015
 * Description: ATM
**/

package atm;

import javax.swing.JOptionPane;

public class ATM {
    
    public static void main(String args[]) {               
        
        System.out.println("Enter your information:");        
        String firstName = JOptionPane.showInputDialog("Enter your first name:");
        String lastName = JOptionPane.showInputDialog("Enter your last name:");
        String accountNum = JOptionPane.showInputDialog("Enter your account number:");
        String pwd = JOptionPane.showInputDialog("Create a password: ");
        int pin = Integer.parseInt(JOptionPane.showInputDialog("Set a four digit pin number: "));
        String question = JOptionPane.showInputDialog("Write a security question: ");
        String answer = JOptionPane.showInputDialog("Answer your question: ");
        int balance = Integer.parseInt(JOptionPane.showInputDialog("Enter your account balance: "));
                
        Account acc1 = new Account(firstName, lastName, accountNum, pwd, pin, question, answer, balance);
        acc1.printInfo();
        
    }
}
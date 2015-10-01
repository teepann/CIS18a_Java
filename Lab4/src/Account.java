package atm;

import javax.swing.JOptionPane;

/**
 *
 * @author Tiffany Pan
 */
public class Account {
    public static final String BANK = "BofA";
    private String firstName, lastName;
    private String accountNumber;
    private double accountBalance;    
    private String password;
    private int pin;
    
    //default constructor
    public Account() {
        firstName = "Tiffany";
        lastName = "Pan";
        accountNumber = "123456789";
        accountBalance = 12345.67;   
        password = "tiffany1234";
        pin = 4321;
    }
    public Account(String firstName, String lastName, String accountNumber,
            double accountBalance, String password, int pin) {
        setFirstName(firstName);
        setLastName(lastName);
        setAccountNumber(accountNumber);
        setAccountBalance(accountBalance);
        setPassword(password);
        setPin(pin);
    }
    
    public void printInfo(){
        String formattedMessage = String.format("Name: %s %s%n" + 
                "Account Number: %s%n" + "Account Balance: %s%n", 
                firstName, lastName, accountNumber, accountBalance);
        JOptionPane.showMessageDialog(null, formattedMessage);
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String fn){
        firstName = fn;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String ln){
        lastName = ln;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accNumber) {
        accountNumber = accNumber;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public void setAccountBalance(double someOtherBalance) {
        accountBalance = someOtherBalance;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String pwd){
        password = pwd;
    }
    
    public int getPin(){
        return pin;
    }
    
    public void setPin(int num){
        pin = num;
    }
}

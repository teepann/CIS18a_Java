package atm;
import java.math.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Tiffany Pan
 */
public class Account {
    public static final String BANK = "BofA";    
    private int accountBalance;   
    private String accountNumber;
    String firstName;
    String lastName;
    private String password;
    int failedPasswordAttempts;
    String securityQuestion, securityAnswer;
    private int pin;
    
    //default account object created
    public Account() {
        System.out.println("A new account was created");
        accountNumber = "000000000";
        password = "nada";
        firstName = "Jane";
        lastName = "Doh!";
    }
    
    //pass parameters into constructor
    public Account(String firstName, String lastName, String accountNum, String pwd, int pin, String question, String answer, int balance) {
        setFirstName(firstName);
        setLastName(lastName);
        setAccountNumber(accountNum);
        setPassword(pwd);
        setPin(pin);
        setSecurityQuestion(question);
        setAnswer(answer);
        setAccountBalance(balance);
        
    }
    
    public void printInfo(){
        String formattedMessage = String.format("Name: %s %s%n" + "Account Number: %s%n" + "Account Balance: %s%n", firstName, lastName, accountNumber, accountBalance);
        JOptionPane.showMessageDialog(null, formattedMessage);
    }
    
    public int getAccountBalance() {
        return accountBalance;
    }
    
    public void setAccountBalance(int someOtherBalance) {
        accountBalance = someOtherBalance;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accNumber) {
        accountNumber = accNumber;
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
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String pwd){
        password = pwd;
    }
    
    public int getFailedPasswordAttempts(){
        return failedPasswordAttempts;
    }
    
    public void setFailedPasswordAttempts(int fails){
        failedPasswordAttempts = fails;
    }
    
    public String getSecurityQuestion(){
        return securityQuestion;
    }
    
    public void setSecurityQuestion(String question){
        securityQuestion = question;
    }
    
    public String getAnswer(){
        return securityAnswer;
    }
    
    public void setAnswer(String answer){
        securityAnswer = answer;
    }
    
    public int getPin(){
        return pin;
    }
    
    public void setPin(int num){
        pin = num;
    }
}
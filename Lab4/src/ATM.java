/**
 * File: Lab4.java
 * Author: Tiffany Pan
 * Date: 09/24/2015
 * Description: ATM
**/

package atm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @author Tiffany Pan
 */
public class ATM extends JPanel implements ActionListener {
    protected JButton bDeposit, bWithdraw, bAccountInfo, bQuit;
    Account myAccount = new Account();
    
    public ATM(){    
            //displays a menu of four buttons that prompt user to make a choice
            bDeposit = new JButton("Deposit");
            bDeposit.setVerticalTextPosition(AbstractButton.CENTER);
            bDeposit.setHorizontalTextPosition(AbstractButton.LEADING); //leading = left
            bDeposit.setMnemonic(KeyEvent.VK_D);
            bDeposit.setActionCommand("Deposit");
            
            bWithdraw = new JButton("Withdraw");
            bWithdraw.setVerticalTextPosition(AbstractButton.BOTTOM);
            bWithdraw.setHorizontalTextPosition(AbstractButton.CENTER);
            bWithdraw.setMnemonic(KeyEvent.VK_W);
            bWithdraw.setActionCommand("Withdraw");
            
            bAccountInfo = new JButton("Account Info");
            //uses default text position of CENTER, TRAILING (RIGHT).
            bAccountInfo.setMnemonic(KeyEvent.VK_A);
            bAccountInfo.setActionCommand("Account Info");
            
            bQuit = new JButton("Quit");
            bQuit.setMnemonic(KeyEvent.VK_Q);
            
            //listen for actions on buttons
            bDeposit.addActionListener(this);
            bWithdraw.addActionListener(this);
            bAccountInfo.addActionListener(this);
            bQuit.addActionListener(this);
            
            //add components to this continer using the default FlowLayout
            add(bDeposit);
            add(bWithdraw);
            add(bAccountInfo);
            add(bQuit);
        }
        
        public void actionPerformed(ActionEvent e){
            //if user chooses deposit option, prompts for amount, displays amount
            if("Deposit".equals(e.getActionCommand())){
                deposit();
            }
            //if user chooses withdraw option, prompts for amount, displays amount withdrawn
            else if("Withdraw".equals(e.getActionCommand())){
                withdraw();
            }
            //if user chooses account info, displays account information
            else if("Account Info".equals(e.getActionCommand())){
                accountInfo();
            }
            //if user chooses quit, exit program
            else if("Quit".equals(e.getActionCommand())){
                System.exit(0);
            }
        }
        
        public static void gui(){
            //create and set up window
            JFrame frame = new JFrame("ATM Machine");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            
            //Create and set up content pane.
            ATM machine = new ATM();
            machine.setOpaque(true);//content panes must be opaque
            frame.setContentPane(machine);
            
            //display window
            frame.pack();
            frame.setVisible(true);
        }
    
    public void deposit(){
        double depositAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter deposit amount: "));
        DecimalFormat decim = new DecimalFormat("#.00");
        myAccount.setAccountBalance(depositAmount+myAccount.getAccountBalance());
        JOptionPane.showMessageDialog(null, decim.format(depositAmount) + " has been deposited");
    }
    public void withdraw(){
        double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter amount to withdraw: "));
        DecimalFormat decim = new DecimalFormat("#.00");
        myAccount.setAccountBalance(myAccount.getAccountBalance()-withdrawAmount);
        JOptionPane.showMessageDialog(null, decim.format(withdrawAmount) + " has been withdrawn");
    }
    public void accountInfo(){
        DecimalFormat decim = new DecimalFormat("#.00");
        JOptionPane.showMessageDialog(null, myAccount.getFirstName()+" "+myAccount.getLastName()+"'s "
                + "account\n"+ "Balance: "+ decim.format(myAccount.getAccountBalance())
                + "\nAccount Number: "+ myAccount.getAccountNumber());
    }
     
    public static void main(String[] args) {
        //Application runs until user exits
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                gui();
            }
        });
    }
}
    
        
              
        
    
    


/*
 * file: prob6_29.cpp
 * name: Tiffany Pan
 */
package prob6_29;

import java.security.SecureRandom;
import java.util.Scanner;

/**
 * Coin toss simulation
 */
public class CoinToss {
    private enum Coin {HEADS, TAILS};
    private static final int HEAD = 0;
    private static final int TAILS = 0;
    
    public static void main(String[] args) {
        
        int choice;
        int heads = 0, tails=0;
        
        Coin gameStatus;
        
        Scanner input = new Scanner(System.in);
        
        do {
            //Menu options "Toss Coin" and "Display"
            System.out.println("Choose an option: \n" + "1. Toss Coin\n" + "2. Display\n"); 
            
            choice = input.nextInt();

            if (choice == 1){
                Coin coinTossed = flip();
                if(coinTossed == Coin.TAILS){
                    gameStatus = Coin.TAILS;
                    tails++;
                }
                else{ //if(coinTossed == Coin.HEADS){
                    heads++;
                    gameStatus = Coin.HEADS;
                }
                
            }
            else if (choice == 2){
                System.out.printf("Number of heads: %d%n" + "Number of tails: %d%n", heads, tails);
            }
            else {
                System.out.println("Please enter a valid option");
            }
        }while(choice == 1 && choice!=2);
        //keeps track number of times each side of coin appears
    }
    
    //method flip() takes no args
    //it returns a value from a Coin enum (HEADS and TAILS)
    public static Coin flip(){
        SecureRandom randomNumber = new SecureRandom();
        int randomValue = randomNumber.nextInt(2);
        if(randomValue == 0){ //heads
            System.out.println("HEADS!");
            return Coin.HEADS;
        }
        else{ //tails
            System.out.println("TAILS!");
            return Coin.TAILS;
        }   
    }    
}

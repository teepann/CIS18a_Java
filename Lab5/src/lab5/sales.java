/*
 * file: lab5.cpp
 * author: Tiffany Pan
 * purpose: using switch statements, validating input from user, extending an existing program
 */

package lab5;

import java.util.Scanner;

public class Sales {
//calculates sales for 5 products
    //Retail prices for each of the five products
    static double[] productPrices = {2.98, 4.50, 9.98, 4.49, 6.87};    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] productTotals = {0.0,0.0,0.0,0.0,0.0};
        int productNum = -1;        

        /* As the user to enter a product number */
        
        /* Create while statement that loops until sentinel is entered */
        while(productNum!=0){
            /* Determine whether users' product number is in 1-5 */          
            do { 
                System.out.print("Enter product number (1-5) (0 to stop): ");        
                productNum = input.nextInt();
                if(!(productNum>=0 && productNum <=5)) System.out.println("Invalid product number");
            /* If product number is not 1-5, test if product number is not 0 */
            } while (!(productNum>=0 && productNum <=5));
            if(productNum==0) break;
            /* If so, ask user to input the quantity sold */
            /* Ask the user to enter another product number. */
            System.out.print("Enter quantity sold: ");
            int quantity = input.nextInt();
            /* Write a switch statement here that will compute the total for that product */
            switch(productNum){
                case 1: 
                    productTotals[productNum-1]=productPrices[productNum-1]*quantity;
                    break;
                case 2: 
                    productTotals[productNum-1]=productPrices[productNum-1]*quantity;
                    break;
                case 3: 
                    productTotals[productNum-1]=productPrices[productNum-1]*quantity;
                    break;
                case 4: 
                    productTotals[productNum-1]=productPrices[productNum-1]*quantity;
                    break;
                case 5: 
                    productTotals[productNum-1]=productPrices[productNum-1]*quantity;
                    break;
                default:
                    break;                    
            }
        }   
        /* end while loop */

        // print summary
        for(int i=0; i<5; i++){
            System.out.println();
            System.out.printf("Product %d: $%.2f", i+1, productTotals[i]);
        }        
//        do{
//            do { 
//                System.out.print("Enter product number (1-5) (0 to stop): ");        
//                productNum = input.nextInt();                 
//            } while (!(productNum>=0 && productNum <=5));
//            if(productNum == 0) break;
//            System.out.print("Enter quantity sold: ");
//            int quantity = input.nextInt();
//            productTotals[productNum-1]+= productPrices[productNum-1]*quantity;
//        } while (productNum != 0);
    }
    
}



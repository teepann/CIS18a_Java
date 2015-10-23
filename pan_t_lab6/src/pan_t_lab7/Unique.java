package pan_t_lab7;

// Lab 6: Unique.java
// Reads in 5 unique numbers.
import java.util.Scanner;

public class Unique
{
   // gets 5 unique numbers from the user
   public void getNumbers()
   {
      Scanner input = new Scanner( System.in );

        /* Create an array of five elements*/ 
      int[] numbers = new int[5];
      int count = 0; // number of uniques read
      int entered = 0; // number of entered numbers
      
      while( entered < numbers.length )
      {
         System.out.print( "Enter number: " );
         /* Write code here to retrieve the input from the user */ 
         int num = input.nextInt();
         // validate the input
         /* Write an if statement that validates the input */  
         if (!(num<10 || num>100))
         {
            // flags whether this number already exists
            boolean containsNumber = false;

            // increment number of entered numbers
            entered++;  
            
            /* Compare the user input to the unique numbers in the array using a for 
               statement. If the number is unique, store new number */
            for (int a: numbers){
                if(a == num)
                    containsNumber = true;      
            }
            /* add the user input to the array only if the number is not already 
               in the array */
            if ( !containsNumber )
            {
               /* Write code to add the number to the array and increment 
                  unique items input */
                numbers[count] = num;
                count++;
                              
            } // end if
            else 
               System.out.printf( "%d has already been entered\n", num );
         } // end if
         else
            System.out.println( "number must be between 10 and 100" );         
         
      } // end while      
      // print the list of unique values
      System.out.println("The list of unique values are: ");
      /* Write code to output the contents of the array */
      for(int a: numbers)
        if (a != 0)
           System.out.print(a + " ");
   } // end method getNumbers
} // end class Unique
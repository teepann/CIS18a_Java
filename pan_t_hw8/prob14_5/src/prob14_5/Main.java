/*
 * Author: Tiffany Pan
 * HW: 14.5 Random sentences
 */

package prob14_5;

import java.util.Random;

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
        String article[] = {"the", "a", "one", "some","any"};
        String noun[] = {"boy", "girl", "dog", "town", "car"};
        String verb[] = {"drove", "jumped", "ran", "walked", "skipped"};
        String preposition[] = {"to", "from", "over", "under", "on"};
        
        Random rand = new Random();        
        
        for (int i = 0; i < 20; i++){
            StringBuilder buffer = new StringBuilder();
            buffer.append(article[rand.nextInt(4)])
                    .append(" ")
                    .append(noun[rand.nextInt(4)])
                    .append(" ")
                    .append(verb[rand.nextInt(4)])
                    .append(" ")
                    .append(preposition[rand.nextInt(4)])
                    .append(" ")
                    .append(article[rand.nextInt(4)])
                    .append(" ")
                    .append(noun[rand.nextInt(4)])
                    .append(".");
            String s = buffer.toString();            
            System.out.println(s.substring(0,1).toUpperCase() + s.substring(1));
        }
        
    }
    
}

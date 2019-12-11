/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingpractice;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author michael.butter
 */
public class ForLoopIntro {
    public static void main(String[] args) {
        // declare variable for controlling number of loops
        int loopControl;
        
        // create a scanner and store it in a variable of our choice
        Scanner userScanner = new Scanner(System.in);
        
        //prompt user and get an int from them
        System.out.println("How many loops shall I print with for()?");
        // grab an int from the user and store in loopControl
        loopControl = userScanner.nextInt();
        
        // create a for() loop that initializes numLoops to zero,
        //has the same true/false testas the while(), and adds 1 to our
        // numLoops variable after each pass through the loop
        for(int numLoops = 0; numLoops <= loopControl; numLoops = numLoops +1){
            // same contents of our loop body
            System.out.println("The value of numLoops: " + numLoops);
            try {
                //but the for() loop helps us by incrementingf numLoops in its
                // own declaratiom
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ForLoopIntro.class.getName()).log(Level.SEVERE, null, ex);
            }
        } // close for loop
    }// close main method
} // close class

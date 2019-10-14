/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingpractice;

import java.util.Scanner;

/**
 *
 * @author michael.butter
 */
public class WhileWithScanner {
    public static void main(String[] arg) {
        int numLoops = 5;
        int loopControl = 5;
        // build a scanner object
        Scanner scanner = new Scanner(System.in);
        // prompt user and get an int from them
        System.out.println("How many loops shall I print?");
        // loop as long as numLoops is less than or equal to our loopControl
        // which we gathered from the user 
        while(numLoops <= loopControl){
            System.out.println("The value of numLoops: " + numLoops);
        loopControl = scanner.nextInt();
            // add one to numLoops each time we cycle so we only
            // loop the number of times the user inputed
            numLoops = numLoops + 1;
        } // close while
        
        System.out.println("...After the while loop");
        
    } // close main
    
} // close class

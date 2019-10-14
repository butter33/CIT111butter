/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingpractice;

import java.util.Scanner
/**
 *
 * @author michael.butter
 */
public class RetirementAge {
    
    public static void main(String[] args){
        int age;
        // make a Scanner object and store in a variable whose name we can choose
        Scanner inputScanner = new Scanner(System.in);
        
        // the test condition for this while statement is always true,
        // so the looping will occur until the user issues a command to the compiler
        // to stop execution
        while(true){
            //prompt the user for age
            System.out.println("Enter your age to see if you can retire:");
            // read age from the console and store in variable
            age = inputScanner.nextInt();
            // implement basic if() logic--if they're over 65
            if (age > 65){
                // if true
                System.out.println("Wahoo! Grab the newspaper and a martini!");
            } else {
                // if false
                System.out.println("Sorry, Keep working...");
            }    
            }
        }
    } // closeclass
}

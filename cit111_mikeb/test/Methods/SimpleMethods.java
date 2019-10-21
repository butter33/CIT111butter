/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;
import java.math.BigInteger;
import java.util.Random;
/**
 * Demonstration class for the concept of a method in its most basic form
 * @author michael.butter
 */
public class SimpleMethods {
    
    public static void main (String[] calledwhateverwewant){
        System.out.println("This code is inside method: main");
        // method call to printStatement; execution transfers
        printStatement();
    } // close method: main 
    
    // second method: stacked, not nested, after main
    public static void printStatement(){
        System.out.println("Where There's a will, there's a way");
    } // close method: main
    
    // create method called generateBigNumber()
    public static void generateBigNumber(){
        System.out.println("**********INSIDE printStatement*********");
        // create a friendly random number generator
        Random r = new Random();
        // create an object to do math with huge numbers
        BigInteger bigInt = new BigInteger(150, r);
        // display the randomly generated huge number
        System.out.println(bigInt);
        System.out.println("**********************************************");
    } // close method generateBigNumber
} // close class

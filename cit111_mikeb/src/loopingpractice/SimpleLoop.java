/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopingpractice;

/**
 * Demo of while loop
 * @author michael.butter
 */
public class SimpleLoop {
    public static void main (String[] whateverNameWeWant){
        int count = 0;
        int numLoops = 2000;
        long startTime = System.currentTimeMillis();
        long endTime; // convention is to declare al vars at top of method
        System.out.println("Start Looping at " + startTime);
        
        // as long as count < numLoops,
        // execute my block { ... }
        while(count < numLoops){
      System.out.println("Change oil");
      System.out.println("Val of count: " + count);
      count = count + 1;
    } // close while
    endTime = System.currentTimeMillis();
    System.out.println("Stoped looping at " + endTime);
    // compute endTime - startTime and display to user
    long totalTime = (endTime -startTime) / 1000;
    System.out.println("Total time is" + totalTime);
    }
    

}
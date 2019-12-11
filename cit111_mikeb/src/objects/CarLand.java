/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *Client class to c\Car
 * Contain the main method
 * @author michael.butter
 */
public class CarLand {
    public static void main(String[] wajamafuna){
        // create a variable of our costom type Car
        Car firstCar;
        // Use new to instantiate our Car class
        // and store a reference in firstCar
        firstCar = new Car();
        // assigning values to member variables on ONE instance of Car
        firstCar.make = "Honda";
        firstCar.model = "Accord";
        firstCar.year = 1996;
        displayCarStats(firstCar);
        System.out.println("My firstCar object engine status: " + firstCar.checkEngineStatus);
        firstCar.startEngine();
        System.out.println("My firstCar model is" + firstCar.model);
        
        Car toyCar = new Car();
    }// close main    
    public static void displayCarStats(Car anyCarObject){
        System.out.println("****STATS***");
        System.out.println(anyCarObject.year + "" + anyCarObject.make + anyCarObject.model);
        
    }  
}

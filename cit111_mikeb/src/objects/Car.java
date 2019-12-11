/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author michael.butter
 */
public class Car {
    public String make;
    public String model;
    public int year;
    public double mpg;
    public String color;
    private boolean engineOn;
    private double speed;
    
    public void startEngine() {
        engineOn = true;
        System.out.println("...twatatata...shhhvrooom");
        
    }
    public void stopEngine() {
        engineOn = false;
        System.out.println("...dubdubdub....bdoom...");
    }
    public boolean checkEngineStatus(){
        return engineOn;
        
    }
    public double getCurrentSpeed(){
        return speed;
        
    }
    public double accelerate(int mphIncrease){
        speed = speed + mphIncrease;
        return speed;
        
    }
    public double decelerate(int mphDecrease){
        speed = speed - mphDecrease;
        return speed;
        
    }
}


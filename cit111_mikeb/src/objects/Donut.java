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
public class Donut {
    public String flavor;
    public double radius_mm;
    public int calories;
    public int percRemaining;
    public String name;
    public int appearanceRating;
    
    public void eatDonut(int biteSizePerc) {
        
    } // close eatDonut   

    public void displayDonutStatus(){
        System.out.println("Donut stats");
        System.out.println("Name: " + this.name);
        System.out.println("Flavor: " + this.flavor);
        System.out.println("Calories: " + this.calories);
        System.out.println("Radius: " + this.radius_mm);
        System.out.println("Appearance Rating: " + this.appearanceRating);
        
    } // close displayDonutStatus

    
} // close Donut

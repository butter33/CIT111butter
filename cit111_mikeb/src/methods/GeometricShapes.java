/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;
        
/**
 *
 * @author michael.butter
 */100
public class GeometricShapes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side length of the cube to calculate its volume:");
        double userSideLength = scan.nextDouble();
        
        double returnedVolume = calcVolumeOfCube(userSideLength);
        
        System.out.println("The volume of a cube with side length " + userSideLength + " is " + returnedVolume);
        
        System.out.println("-----------------------------------------------");
        System.out.println("Enter the cylinder radius: ");
        double userRadius = scan.nextDouble();
        System.out.println("Enter the cylinder height:");
        double userHeight = scan.nextDouble();
        
        double returnedCylVolume = calcVolumeOfCylinder(userRadius, userHeight);
        System.out.println("The volume of a cylinder with side length " + userRadius + " \nand height of " + userHeight + returnedCylVolume);
        System.out.println("-----------------------------------------------");
        
        System.out.println("Enter length to find area of pentagon");
        double a = scan.nextDouble();
        double pentArea = calcAreaOfPentagon(a);
        System.out.println("The area of a pent5agon is" + pentArea);

    }
    public static double calcVolumeOfCube(double sideLength){
        double cubeVolume = Math.pow(sideLength, 3);
        return cubeVolume;
    }
    public static double calcVolumeOfCylinder(double radius, double height){
        final double PI = 3.1416;
        double cylVol = PI * (radius * radius) * height;
        return cylVol;
        
    }
    public static double calcAreaOfPentagon (double a){
        double pentArea = (.25) * Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(a, 2);
        return pentArea;
    }
}

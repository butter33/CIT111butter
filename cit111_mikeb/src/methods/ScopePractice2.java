/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;



/**
 *
 * @author michael.butter
 */
public class ScopePractice2 {
        // member variables (aka fields, class members)
    private static String hatType = "Baker's hat";
    private static boolean davidInSubstrate = false;
    private String alarm = "System alert!";
    
    public static void main(String[] args) {
        System.out.println("[begin execution in main]");
        locateDanceStudio();
        System.out.println("[end execution in main]");
    } // close main
    
    public static void locateDanceStudio(){
        System.out.println("Elise!");
        System.out.println("Knocking off " + hatType);
        toggleDavidCondition();
    } // close method locateDanceStudio
    
    public static void turnKnobLeft(){
        knockOffHat();
        toggleDavidCondition();
        String bigBoss = "chairman";
        System.out.println("Visit the " + bigBoss);
        
    } // close method turnKnobLeft
    
    public static void knockOffHat(){
        System.out.println("Knocking off " + hatType);
        System.out.println("System alert!");
        
    } // close method knockOffHat
    
    public static void accessPumpingStation(){
        String alarm = "Unauthorized entry!";
        System.out.println(alarm);
        
    } // close access pumping station
    
    private static void toggleDavidCondition(){
        davidInSubstrate = !davidInSubstrate;
        System.out.println("[toggled davidInsubstrate to " 
                + davidInSubstrate + "]");
    } // close toggleDavidCondition method
}

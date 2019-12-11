/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import loopingpractice.ForLoopIntro;
/**
 *
 * @author michael.butter
 */
public class AutoMeterTach {
    public int enRPM;
    public double o2Ex;
    public int oilPres;
    public int h2OTemp;
    public int driveShaftRPM;
    public double voltage;
    public boolean tachOn;
    
    public void startRun(){
        tachOn = true;    
        System.out.println("Start Race!");
     int loopControl;
        
        Scanner racerScanner = new Scanner(System.in);
        
        loopControl = racerScanner.nextInt();
        
        for(int numLoops = 0; numLoops <= loopControl; numLoops = numLoops +1){
            engineRPMIncrease();
            o2Decrease();
            oilPressureIncrease();
            h2OTempIncrease();
            driveShaftRPMIncrease();
            batteryVoltageIncrease();
            displayRaceStatus();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ForLoopIntro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }
    public void stopRun(){
        tachOn = false;
        System.out.println("Tach Off");
        
        
    }
    
    public void engineRPMIncrease(){
        enRPM = enRPM + 400;
         
    }
    public double o2Decrease(){
        o2Ex = o2Ex - 0.5;
        return o2Ex;
    }
    public int oilPressureIncrease(){
        oilPres = oilPres + 2;
        return oilPres;
    }
    public int h2OTempIncrease(){
        h2OTemp = h2OTemp + 2;
        return h2OTemp;
               
    }
    public int driveShaftRPMIncrease(){
        driveShaftRPM = driveShaftRPM + 40;
        return driveShaftRPM;
        
    }
    public double batteryVoltageIncrease(){
        voltage = voltage + 0.06;
        return voltage;
    }
 public void displayRaceStatus(){
     
     System.out.println("********Begin Data*********");
     System.out.println("enRPM is: " + enRPM);
     System.out.println("o2Exaust is: " + o2Ex);
     System.out.println("Oil Pressure is: " + oilPres);
     System.out.println("H2O Temperature is: " + h2OTemp);
     System.out.println("Drive Shaft RPM is: " + driveShaftRPM);
     System.out.printf("Battery Voltage is: '%5.2f'%n", + voltage);
     System.out.println("*********Data Complete*********** ");
     
 }   
            
        
    
}

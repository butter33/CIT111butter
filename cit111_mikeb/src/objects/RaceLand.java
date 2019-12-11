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
public class RaceLand {
    public static void main (String[] race){
        AutoMeterTach race_1;
        race_1 = new AutoMeterTach();
        race_1.enRPM = 2800;
        race_1.o2Ex = 20;
        race_1.oilPres = 40;
        race_1.h2OTemp = 160;
        race_1.driveShaftRPM = 0;
        race_1.voltage = 12;
        race_1.startRun();
       
    }
}

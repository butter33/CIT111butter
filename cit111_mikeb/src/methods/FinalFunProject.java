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
 */
public class FinalFunProject {
    public static void main (String[] kdr){
        Scanner killscanner = new Scanner(System.in);
        double playerkills;
        Scanner deathscanner = new Scanner(System.in);
        double playerdeaths;
        double xp = 0;
        
        System.out.println("Kill Death Ratio Calculator");
        
        System.out.println("Enter amount of Kills:");
        playerkills = killscanner.nextDouble();
        
        System.out.println("Enter amount of Deaths:");
        playerdeaths = deathscanner.nextDouble();
        
        computedKillDeathRatio(playerkills,playerdeaths,xp);

    }
    public static int computedKillDeathRatio(double numKills, double numDeaths, double numxp){
        double killDeathRatio = (numKills/numDeaths);
        System.out.printf("Your KDR is '%5.2f'%n", killDeathRatio);
        return (int) killDeathRatio; 
    }
}


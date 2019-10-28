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
public class ReturnedSandBox {
    public static void main(String[] triumvariate){
        String chopMe = "The atomic number of zinc is 30";
        String output = chopCharactersFromString(chopMe);
        int len = chopMe.length();
        System.out.println("Test chopped is: " + coutput);
    }
    public static String chopCharactersFromString(String strToChop){
        String chopped;
        int inputStringLength = strToChop.length();
        if (inputStringLength < 4){
            return "Hark! Too Short!";
        }
        
        chopped = strToChop.substring(2, inputStringLenght);
        return chopped;
    }
}

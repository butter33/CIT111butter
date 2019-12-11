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
public class Books {
    public static void main(String[] dadum){
    String book1 = "Pearl Cookbook";
    String book2 = "PHP Cookbook";
    String book3 = "Python in a Nutshell";
    String book4 = "Javascript: The Difinitive Guide";
    String book5 = "Java in a Nutshell";
    
    System.out.println("Title of book 1: " + book1);
    
    String[] books = new String[5];
    books[0] = "Pearl Cookbook";
    books[1] = "PHP Cookbook";
    books[2] = "Python in a Nutshell";
    books[3] = "Javascript: The Difinitive Guide";
    books[4] = "Java in a Nutshell";
    
    printArrayContents(books);
    forLoopPrintArrayContents(books);
}

    public static void printArrayContents(String[] arr){
    System.out.println("Value of book 1: " + arr[0]);
    System.out.println("Value of book 2: " + arr[1]);
    System.out.println("Value of book 3: " + arr[2]);
    System.out.println("Value of book 4: " + arr[3]);
    System.out.println("Value of book 5: " + arr[4]);
    }
    
public static void loopPrintArrayContents(String[] arr){
        int arraySize = arr.length;
        int counter = 0;
        while(counter < arraySize){
            System.out.println("Value of array index " + counter + " is " + arr[counter]);
            counter = counter + 1;
        }
}

public static void forLoopPrintArrayContents(String[] arr){
    for (int counter = 0; counter < arr.length ; counter++){
            System.out.println("Value of array index " + counter + " is " + arr[counter]);
        
    }//close forLoopPrintArrayContents
}// close method
}
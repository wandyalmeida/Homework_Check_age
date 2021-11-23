/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4checkage;

import java.util.Scanner;

/**
 *
 * @lecturer Ken Healy
 * @module Programming: Object-Oriented Approach.
 * @author Wandwilson Almeida Da Silva
 * @Student Number: 2021230
 * @Assessment: Homework 4
 * 
 */
public class HW4checkage {

    /**
     * @param args the command line arguments
     * 
     * Strategy
     * 
     * 1) create variables.
     * 2) start the looping using do while,
     * 3) Use Try and Catch to prevent if the user type a letter.
     * 4) check the age from the user and show the answer.
     * 5) if the user type letter instead the number the code will ask again the question for the user.
     * 
     */
    public static void main(String[] args) {
        
        // create all variable that will be using in this code.
        int age;
        boolean valid;
        Scanner myKB = new Scanner(System.in);
        
        // Start the looping and ask a question to user.
        do{
            System.out.println("How old are you? Please enter a number. ");
            
            try{ // Using the try code to prevent if the user enter a letter instead a number.
            
                age = myKB.nextInt();  // if the user enter a number the code starts checking which answer will be. 
                if (age < 18){
                    System.out.println("Sorry you are too young to vote.");
                }else if (age >= 18 && age <= 66){
                    System.out.println("Working hard?");
                }else if(age > 66){
                    System.out.println("Enjoy Retirement.");
                }  
               valid = true; // if everything is correct the code will be stopped. 
               
            }catch (Exception e){ //if the user enter a letter the code will show a error and start the code again.
                myKB.nextLine();
                System.out.println("Sorry. But you must enter number only..");
                valid = false;
            }
             
            }while(!valid); //if everything is correct the code will be stopped. 
            
               
            
            
    }
    
}

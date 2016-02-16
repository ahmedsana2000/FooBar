/**
 * @author Sana Ahmed
 * 
 */
package com.foobar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FooBar {

	/**
	 * @param args
	 * 
	 * This method gets an integer input from the user.
	 * It validates to ensure number in an integer.
	 * It then calls calculateFooBar to calculate the fooBar message.
	 * 
	 */
	 
	public static void main(String[] args) {
		
		FooBar fooBar = new FooBar();
	       
		Scanner inputScanner = new Scanner(System.in);
		int userInput;
		        
        try{
            System.out.println("Enter an integer number:");
            userInput = inputScanner.nextInt();
            
            System.out.println(fooBar.calculateFooBar(userInput));
   
        }
        catch(InputMismatchException e){
        	System.out.println("Invalid input. Number must an integer.");
        }
        
        inputScanner.close();
		
		
         
	}
	
	/**
	 * @param userInput
	 * 
	 * This method gets an integer number input.
	 * It checks if the number is dividable by 3, then with 5 and then with 15, and sets appropriate message where the condition is met.
	 * Program Logic only sets the first dividable condition that is true. If a given number meets more than 1 dividable criteria, only first one is set.
	 * 
	 */
	
	public String calculateFooBar(int userInput){
	
		//Define constants for all numbers constants
		final int CONST_0 = 0;
		final int CONST_3 = 3;
		final int CONST_5 = 5;
		final int CONST_15 = 15;
		
		String outputMessage = "No requirement met for: " + userInput;
            
        if (userInput % CONST_3 == CONST_0){
        	outputMessage = "foo";
        }else if (userInput % CONST_5 == CONST_0){
        	outputMessage = "bar";
        }else if (userInput % CONST_15 == CONST_0){
        	outputMessage = "foobar";
        }
   
   
        return outputMessage;
        
	}
	

}

/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * Puts something onto the stack and pops it back.
 *
 ****************************************************************************/

import java.io.IOException;

import java.util.*;
import java.lang.*;
public class Main{

	public static Boolean decisionYes( String userInput, String yes, Boolean trueOrFalse ){
		//when you ask a question this checks if they said yes.
		//if they say yes it will return a boolean of your choice.
		//if they say no it will return the opposite boolean.
		
		if(yes.equals(userInput)){
			return trueOrFalse;
			
		}
		    return !trueOrFalse;
	}
	
    public static void main(String[] args) throws IOException { 
    	
    	Scanner reader = new Scanner(System.in);
    	Boolean done = false; 
    	String userInput;
    	
    	MrCoxallStack stackOfStrings = new MrCoxallStack();
    	
    	
    		//Loop through whether or not the user wants to 
    		//add to the stack.
    	
    	while(done == false){
    		System.out.println("What would you like to add to the stack?");
    		userInput = reader.nextLine();
    		stackOfStrings.pushItem(userInput);
    		
    		System.out.println("Would you like to add something else? y/n");
    		userInput = reader.nextLine();
    		done = decisionYes(userInput,"y",false);
    	}
    
    		//Loop through whether or not the user wants to 
    		//
    	System.out.println("Would you like to pop from the stack? y/n");
    	userInput = reader.nextLine();
		done = decisionYes(userInput,"y",false);
    
	
		while(done == false){
		    try {
				stackOfStrings.popItem();
			} catch (EmptyStackException e) {
				// TODO Auto-generated catch block
				System.err.println("Error. Stack is empty");
			}
		    
			System.out.println("Would you like to remove something else? y/n");
    		userInput = reader.nextLine();
    		done = decisionYes("y",userInput,false);
		}
    }
}

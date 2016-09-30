/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * Puts something onto the stack.
 *
 ****************************************************************************/

import java.io.IOException;
import java.util.*;

public class Main {
	
    public static void main(String[] args) throws IOException { 
    	
    	Scanner reader = new Scanner(System.in);
    	
    	System.out.println("What would you like to add to the stack?");
    	String userInput = reader.nextLine();
    	
    	
    	MrCoxallStack stackOfStrings = new MrCoxallStack();
    	stackOfStrings.pushItem(userInput);
    	System.out.println("Burning...");
    	String item = stackOfStrings.popItem();
    }
	

}

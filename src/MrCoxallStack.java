/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * Stack of items class.
 *
 ****************************************************************************/
import java.util.*;
import java.lang.*;
import java.io.IOException;
import java.util.EmptyStackException;

public class MrCoxallStack<Item> {
	//Home made stack 
	
	private ArrayList<Item> _list = new ArrayList<Item>();
	
	public MrCoxallStack(){
	}
	
	public void pushItem(Item obj){
		//adds item to top of stack 
		_list.add(obj);
		System.out.println("Added '"+obj+"' to stack.");
	}
	
	public Item popItem() throws EmptyStackException {
		//returns top item from stack 
		
		Item poppedElement = null;
		
		if(_list.size() > 0){
			
			poppedElement = _list.get(_list.size() - 1);
			_list.remove(_list.size() - 1);
			System.out.println("Removed '"+poppedElement+"' from the stack.");
		
		}
		else{
			//throw new StackUnderflowException("Empty Stack");
			throw new EmptyStackException();
		}	

		System.out.println("LOL");
		
		return poppedElement;
	}
}

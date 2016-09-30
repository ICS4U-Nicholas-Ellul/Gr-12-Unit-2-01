/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * Stack of items class.
 *
 ****************************************************************************/
import java.util.*;

public class MrCoxallStack {
	//Home made stack 
	
	private ArrayList<String> list = new ArrayList<String>();
	
	public MrCoxallStack(){
	}
	
	public void pushItem(String item){
		//adds item to top of stack 
		
		list.add(item);
		System.out.println("Added "+item+" to stack.");
	}
	
	public String popItem(){
		//returns top item from stack 
		
		String poppedElement = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		System.out.println("Removed "+poppedElement+" from the stack.");
		
		return poppedElement;
	}
}

/****************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * Stack of items class.
 *
 ****************************************************************************/
import java.util.*;

public class MrCoxallStack {
	
	private Stack trayHolder = new Stack();
	
	public MrCoxallStack(){
	}
	
	public void PushItem(String item){
		trayHolder.push(item);
		System.out.println("Added "+item+" to stack.");
	}
}

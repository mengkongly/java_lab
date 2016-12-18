package collection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionReverse {
	public static void main(String[] args){
		ArrayList<String> objStr	=	new ArrayList<String>();

		objStr.add("A");
		objStr.add("B");
		objStr.add("C");
		objStr.add("D");
		objStr.add("E");
		objStr.add("F");
		objStr.add("G");
		
		System.out.println("Before Reverse");
		System.out.println(objStr);
		
		
		//------- reverse object
		Collections.reverse(objStr);
		System.out.println("After Reverse");
		System.out.println(objStr);
		
	}
}

package collection;

import java.util.LinkedList;
import java.util.List;

public class MyTestLinkedList {
	public static void main(String[] args){
		List<String> obj	=	new LinkedList<String>();
		obj.add("A");
		obj.add("B");
		obj.add("C");
		obj.add("D");
		System.out.println(obj);
		
		obj.remove(obj.indexOf("C"));
		
		System.out.println(obj);
	}
}

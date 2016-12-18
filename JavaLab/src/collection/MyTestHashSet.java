package collection;

import java.util.HashSet;

public class MyTestHashSet {
	public static void main(String[] args){
		HashSet<String> obj	=	new HashSet<String>();
		obj.add("Java");
		obj.add("PHP");
		System.out.println(obj);
		System.out.println("Size of array:"+ obj.size());
		
	}
}

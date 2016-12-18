package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyHashset {
	
	public static void main(String[] args){
		String[] countries = {
				"Cambodia",
				"VietNam",
				"Thailand",
				"USA",
				"Cambodia",
				"France",
				"England",
				"VietNam",
				"Cambodia"
				};
		//1 - Find duplicate country  and display all unique countries name using HashSet  ( method add , size )
		HashSet<String> hashset	=	new HashSet<>();
		HashSet<String> duplicate_hash	=	new HashSet<>();
		for(String count: countries){
			if(hashset.contains(count)){
				duplicate_hash.add(count);
			}else{
				hashset.add(count);
			}
		}
		System.out.println("1 - Find duplicate country  and display all unique countries name using HashSet  ( method add , size )");
		System.out.println("Duplicate country name:");
		for(String dup:duplicate_hash){
			System.out.println(dup);
		}
		System.out.println("There are "+hashset.size()+" countries: "+hashset);
		
		
		//2 - Find duplicate country and display all unique countries name in alphabetical order
		TreeSet<String> treeset	=	new TreeSet<>();
		TreeSet<String> duplicate_tree	=	new TreeSet<>();
		treeset.addAll(hashset);
		duplicate_tree.addAll(duplicate_hash);
		System.out.println("\n2 - Find duplicate country and display all unique countries name in alphabetical order");
		System.out.println("Duplicate country name:");
		for(String dup:duplicate_tree){
			System.out.println(dup);
		}
		System.out.println("There are "+treeset.size()+" countries: "+treeset);
		
		
		//3 - convert array above into LinkedHashSet Object and write a method named as isCountryExist(Set,countryName) return as boolean this method to check countryName existed or not
		System.out.println("\n3 - convert array above into LinkedHashSet Object and write a method named as isCountryExist(Set,countryName) return as boolean this method to check countryName existed or not");
		LinkedHashSet<String> linkedHash	=	new LinkedHashSet<>(Arrays.asList(countries));
		MyHashset obj	=	new MyHashset();
		String count_name	=	"Cambodia";
		boolean isExist	=	obj.isCountryExist(linkedHash, count_name);
		if(isExist){
			System.out.println("Country name: "+count_name+" is found in the object.");
		}else{
			System.out.println("Country name: "+count_name+" is not found in the object.");
		}
		String count_name2	=	"Canada";
		boolean isExist2	=	obj.isCountryExist(linkedHash, count_name2);
		if(isExist2){
			System.out.println("Country name: "+count_name2+" is found in the object.");
		}else{
			System.out.println("Country name: "+count_name2+" is not found in the object.");
		}
	
		
		//5 : convert array above into ArrayList, LinkedList and display total size all items using Iterator and for-loop.
		ArrayList<String> arrayList	=	new ArrayList<>();	
		for(String list: countries){
			arrayList.add(list);
		}
		System.out.println("\n5 : convert array above into ArrayList, LinkedList and display total size all items using Iterator and for-loop.");
		System.out.println("List type: "+arrayList.getClass().getName().substring(10)+" Total size: "+arrayList.size());
		System.out.println("Elements:\n"+arrayList);
		
		
		LinkedList<String> linkedList	=	new LinkedList<>();		
		Iterator<String> iterator	=	Arrays.asList(countries).iterator();
		while(iterator.hasNext()){
			linkedList.add(iterator.next());
		}
		System.out.println("\nList type: "+linkedList.getClass().getName().substring(10)+" Total size: "+linkedList.size());
		System.out.println("Elements:\n"+linkedList);
		
		
		//6 : Convert array above into Map (HashMap, TreeMap) by key is countryName, value is number of times that countryName found and display all elements using entrySet() methods
		//ex : key Cambodia found 3 times, the value to store is 3 for key Cambodia,  Key USA found 1 time, value is 1.
		System.out.println("\n6 : Convert array above into Map (HashMap, TreeMap) by key is countryName, value is number of times that countryName found and display all elements using entrySet() methods");
		HashMap<String, Integer> hashMap	=	new HashMap<>();
		for(String item: countries){
			if(hashMap.containsKey(item)){
				hashMap.put(item, (int)hashMap.get(item)+1);
			}else{
				hashMap.put(item,1);
			}
		}
		System.out.println("HashMap Example:");
		Iterator<Map.Entry<String, Integer>> iterator1	=	hashMap.entrySet().iterator();
		while(iterator1.hasNext()){
			String key	=	iterator1.next().getKey();
			int time	=	hashMap.get(key);
			System.out.println("Key "+key+" found "+time+" time"+(time>1?"s":"")+", the value to store is "+time+" for key "+key+".");
		}
		
		TreeMap<String, Integer> treeMap	=	new TreeMap<>();
		for(String item: countries){
			if(treeMap.containsKey(item)){
				treeMap.put(item, (int)treeMap.get(item)+1);
			}else{
				treeMap.put(item, 1);
			}
		}
		System.out.println("\nTreeMap Example:");
		Iterator<Map.Entry<String, Integer>> iterator2	=	treeMap.entrySet().iterator();
		while(iterator2.hasNext()){
			String key	=	iterator2.next().getKey();
			int time	=	treeMap.get(key);
			System.out.println("Key "+key+" found "+time+" time"+(time>1?"s":"")+", the value to store is "+time+" for key "+key+".");
		}

		
	}
	public boolean isCountryExist(Set<String> set,String countryName){		
		return set.contains(countryName);
	}
	
	
	
}

package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassifyCountries {
	public static void main(String[] args){
		CountriesList objCount	=	new CountriesList();
		List<String> objCounts	=	(List<String>) objCount.getAllCountries();
		
		//Collections.sort(objCounts);
			
		String first_letter	=	"";
		List<String> objTemp	=	new ArrayList<String>();
		Map<String, List<String>> objMap	=	new HashMap<>();
		for(int i=0;i<objCounts.size();i++){
			if(String.valueOf(objCounts.get(i).charAt(0)).equals(first_letter)){
				objTemp.add(objCounts.get(i).toString());
				if(i==objCounts.size()-1){
					objMap.put(first_letter, objTemp);
				}
			}else{
				if(!first_letter.isEmpty()){
					objMap.put(first_letter, objTemp);
					//objTemp.clear();
					objTemp	=	new ArrayList<String>();
				}
				objTemp.add(objCounts.get(i).toString());
				first_letter	=	String.valueOf(objCounts.get(i).charAt(0));
				
			}
			//System.out.println(objCounts.get(i)+ " " + String.valueOf(objCounts.get(i).charAt(0)));
			
		}
		//System.out.println(objCounts);
		//System.out.println(objCounts.size());
		
		//System.out.println(objMap);
		System.out.println("Size of Map:" + objMap.size() +"\n");
		System.out.println("Countries with A letter have "+objMap.get("A").size()+" countries:\n"+ objMap.get("A")+"\n");
		System.out.println("Countries with B letter have "+objMap.get("B").size()+" countries:\n"+ objMap.get("B")+"\n");
		System.out.println("Countries with C letter have "+objMap.get("C").size()+" countries:\n"+ objMap.get("C")+"\n");
		System.out.println("Countries with D letter have "+objMap.get("D").size()+" countries:\n"+ objMap.get("D")+"\n");
		System.out.println("Countries with E letter have "+objMap.get("E").size()+" countries:\n"+ objMap.get("E")+"\n");
		System.out.println("Countries with F letter have "+objMap.get("F").size()+" countries:\n"+ objMap.get("F")+"\n");
	}
}

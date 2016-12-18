package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyUtils {
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
		MyUtils myUtils	=	new MyUtils();
		//4 : write Own class : MyUtils with one static method as below
		System.out.println("4 : write Own class : MyUtils with one static method as below");
		myUtils.checkDuplicate(new HashSet<>(), countries);
		myUtils.checkDuplicate(new TreeSet<>(), countries);
		myUtils.checkDuplicate(new LinkedHashSet<>(), countries);
	}
	public static void checkDuplicate(Set<String> sets,String[] countries){
		if("java.util.HashSet".equals(sets.getClass().getName())){
			sets.addAll(Arrays.asList(countries));
			System.out.println("Set type= "+sets.getClass().getName()+" "+sets);
		}
		if("java.util.TreeSet".equals(sets.getClass().getName())){
			sets.addAll(Arrays.asList(countries));
			System.out.println("Set type= "+sets.getClass().getName()+" "+sets);
		}
		if("java.util.LinkedHashSet".equals(sets.getClass().getName())){
			sets.addAll(Arrays.asList(countries));
			System.out.println("Set type= "+sets.getClass().getName()+" "+sets);
		}
	}
}

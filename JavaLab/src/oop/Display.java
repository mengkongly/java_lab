package oop;

import java.util.ArrayList;

public class Display {
	public static void main(String[] args){
		Employee emp	=	new Employee();
		emp.setFirstName("Ly");
		emp.setLastName("Mengkong");
		emp.setBirthDate("2000-01-01");
		emp.setHoliday(18);
		emp.setYears(4);
		emp.setSalary(100);
		
		//System.out.println(emp.getDataView());
		
		
		Developer dev	=	new Developer();
		dev.setFirstName("Preb");
		dev.setLastName("Sovat");
		dev.setSalary(1200);
		dev.setComment("My comment about him");
		
		//System.out.println(dev.getComment());
		
		
		TeamLeader team	=	new TeamLeader();
		team.setFirstName("Long");
		team.setLastName("Sopheak");
		team.setProjectNum(1002);
		
		//System.out.println(team.getDataView());
		
		ArrayList<Employee> emps	=	new ArrayList<>();
		emps.add(emp);
		emps.add(dev);
		emps.add(team);
		
		for(Employee emp_for: emps){
			System.out.println("\nDisplay result of object by the class "+ emp_for.getClass().getName().substring(4));
			System.out.println(emp_for.getDataView());
		}
		
	}
}

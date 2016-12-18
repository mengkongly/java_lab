package oop;

public class Employee implements View{
	private int salary;
	private int holiday;
	private int years;
	private String firstName;
	private String lastName;
	private String birthDate;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getHoliday() {
		return holiday;
	}
	public void setHoliday(int holiday) {
		this.holiday = holiday;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getDataView(){
		String str	=	"Name:"+this.firstName+" "+this.lastName+"\nDOB:"+this.birthDate+
				"\nYears:"+this.years+"\nHoliday:"+this.holiday+"\nSalary:"+this.salary;
		return str;
	}
}

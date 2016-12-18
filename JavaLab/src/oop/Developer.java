package oop;

public class Developer extends Employee implements View {
	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	// Create constructor
	public Developer(String comment){
		this.comment	=	comment;
	}	
	public Developer(){
		
	}
	
	//implement to view to display data
	public String getDataView(){
		String str	=	"Full name:"+super.getFirstName()+" "+super.getLastName()+"\n"+
						"Comment:"+this.comment+"\nSalary:"+super.getSalary();
		return str;
	}
}

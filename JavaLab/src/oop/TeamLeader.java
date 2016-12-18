package oop;

public class TeamLeader extends Employee implements View{
	private int projectNum;

	public int getProjectNum() {
		return projectNum;
	}

	public void setProjectNum(int projectNum) {
		this.projectNum = projectNum;
	}
	public String getDataView(){
		String str	=	"Full name: "+super.getFirstName().toUpperCase()+" "+super.getLastName().toUpperCase()+"\nProject number: "+this.getProjectNum();
		return str;
	}
}

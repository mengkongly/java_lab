package polymorphism;

public class Begger extends Person {
	// For overriding method
	public void eat(){
		System.out.println("Eating in the street.");
	}
	
	public static void main(String[] args){
		Person p	=	null;
		p	=	new Begger();
		p.eat();
	}
	
}

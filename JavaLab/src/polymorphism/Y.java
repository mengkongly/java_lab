package polymorphism;

public class Y {
	public static void main(String[] args){
		X obj	=	new X();
		double result;
		obj.methodA(20);
		obj.methodA(20, 30);
		result	=	obj.methodA(5.5);
		System.out.println("Answer is:"+ result);
	}
}

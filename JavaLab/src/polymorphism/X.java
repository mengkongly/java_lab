package polymorphism;

public class X {
	// this are overloading method
	public void methodA(int num){
		System.out.println("MethodA:"+ num);
	}
	public void methodA(int num1,int num2){
		System.out.println("MethodA:"+num1+","+num2);
	}
	public double methodA(double num){
		System.out.println("MethodA:"+num);
		return num;
	}
	
}

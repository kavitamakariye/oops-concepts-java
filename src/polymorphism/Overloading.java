package polymorphism;

public class Overloading {

	int c;
	public void additin() {
		int a = 10;
		int b = 20;
		System.out.println("Sum of a and b: "+(a+b));
	}
	
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	public void addition(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	/*public int addition(int a,int b) { //Signature of two methods cannot be same in method overloading, even though they have different return type.
		return a+b;
	}*/
}

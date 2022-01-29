package Examveda.ConstructorsAndMethods;

class MyClass {
	MyClass() {
		System.out.print("one");
	}

	public void myMethod() {
//		this();
		// A method can't have constructor call.
		System.out.print("two");
	}
}

public class test21 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.myMethod();
	}

}

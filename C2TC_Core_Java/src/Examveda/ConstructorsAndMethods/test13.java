package Examveda.ConstructorsAndMethods;

class A {
	public static void method(int i) {
		System.out.println("Method 1");
	}

	public static void method(String str) {
		System.out.println("Method 2");
	}

}

public class test13 {

	public static void main(String[] args) {
		A.method(5);
	}

}

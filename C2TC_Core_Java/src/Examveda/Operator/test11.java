package Examveda.Operator;

class A {
	public void printValue() {
		System.out.println("A");
	}
}

class B extends A {
	public void printValue() {
		System.out.println("B");
	}
}

public class test11 {
	public static void main(String[] args) {
		A b = new B();
		newValue(b);
	}

	public static void newValue(A a) {
		if (a instanceof B)
			((B) a).printValue();
		;
	}
}

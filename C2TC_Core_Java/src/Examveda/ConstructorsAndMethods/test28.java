package Examveda.ConstructorsAndMethods;

class A3 {
	A3(String s) {
	}

	A3() {
	}
}

class B extends A3 {
	B() {

	}

	B(String s) {
		super(s);
	}

	void test() {
		A3 a = new B();
//		A3 a = new B(5);
//		A3 a = new A(String s);
	}
}

public class test28 {

}

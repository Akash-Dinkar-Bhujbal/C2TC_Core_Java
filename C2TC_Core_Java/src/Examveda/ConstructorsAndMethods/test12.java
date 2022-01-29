package Examveda.ConstructorsAndMethods;

class Num {
	Num(double x) {
		System.out.println(x);
	}
}

public class test12 extends Num {

	test12(double x) {
		super(x);
		// Here we need to create this constructor
		// as like super class
		// And also need to call super keyword
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Num t = new Num(2);
	}

}

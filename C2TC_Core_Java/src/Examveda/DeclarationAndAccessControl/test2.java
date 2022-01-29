package Examveda.DeclarationAndAccessControl;

class Base {
	public Base() {
		System.out.print("Base ");
	}
//	private Base() {
//		System.out.print("Base ");
//	}
//	Compile time error!!!
//	If Constructor is private
}

public class test2 extends Base {
	public test2() {
		System.out.println("Derived ");
	}

	public static void main(String[] args) {
		new test2();
		// Compilation Error ?
	}

}

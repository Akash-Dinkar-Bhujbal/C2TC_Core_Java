package Examveda.DeclarationAndAccessControl;

public class test3 {
	static int x = 4;

	@SuppressWarnings("static-access")
	public test3() {
		System.out.print(this.x);
//		test3();
	}

//	public static void test3() {
//		System.out.println(x);
////		System.out.print(this.x);
////		Compile error :(static methods can't invoke this)
//	}

	public static void main(String[] args) {
		new test3();
	}

}

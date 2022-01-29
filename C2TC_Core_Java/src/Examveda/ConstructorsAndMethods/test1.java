package Examveda.ConstructorsAndMethods;

public class test1 {

	private test1(int i) {
		System.out.print(i);
	}

//	public static test1() {
//		System.out.print(10);
//	}
//	constructor cannot be static
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		test1 obj = new test1(50);
	}

}

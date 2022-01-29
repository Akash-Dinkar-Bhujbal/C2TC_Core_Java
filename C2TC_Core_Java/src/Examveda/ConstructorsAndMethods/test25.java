package Examveda.ConstructorsAndMethods;

class A1 {
	static int add(int i, int j) {// static method is required
		return i + j;
	}
}

public class test25 extends A1 {

	public static void main(String[] args) {
		short s = 9;
		System.out.println(add(s, 6));
	}

//	private static int add(int i, int j) {
//		return i + j;
//	}

}

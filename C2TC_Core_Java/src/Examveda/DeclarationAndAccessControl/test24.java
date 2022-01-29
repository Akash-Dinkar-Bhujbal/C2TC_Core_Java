package Examveda.DeclarationAndAccessControl;

public class test24 {

	public static void main(String[] args) {
		int x = 10;
		x = myMethod(x--);
		System.out.println(x);
	}

	static int myMethod(final int x) {
//		return x--;//x can not change
		return x;
	}

}

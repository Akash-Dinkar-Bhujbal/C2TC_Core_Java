package Examveda.DeclarationAndAccessControl;

public class test23 {
	static int a;

	public static void main(String[] args) {
		System.out.print("one ");
		call(1);
	}

	static void call(int a) {
//	this.a = 10;
		System.out.print("two " + a);

	}
}

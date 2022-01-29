package Examveda.DeclarationAndAccessControl;

public class test8 {
	static int i = demo();
	static {
		System.out.print(i);
	}

	public test8() {
		System.out.print("Hello1");
	}

	static int demo() {
		System.out.print("InsideDemo");
		return 10;
	}

	public static void main(String[] args) {
		System.out.print("Hello2");
	}

}

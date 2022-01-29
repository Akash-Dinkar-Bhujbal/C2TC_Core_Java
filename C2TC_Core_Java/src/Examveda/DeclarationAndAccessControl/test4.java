package Examveda.DeclarationAndAccessControl;

public class test4 {
	static int x = 4;
	int y = 9;

	@SuppressWarnings("static-access")
	public test4() {
		System.out.println(this.x);
		printVariables();
	}

	public static void printVariables() {
		System.out.println(x);
//		System.out.println(y);
	}

	public static void main(String[] args) {
		new test4();
	}

}

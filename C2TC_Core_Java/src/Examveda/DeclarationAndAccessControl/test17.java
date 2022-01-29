package Examveda.DeclarationAndAccessControl;

public class test17 {
	static {
		System.out.println("static");
	}
	{
		System.out.println("block");
	}

	public test17() {
		System.out.println("Test");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		test17 t = new test17();
	}

}

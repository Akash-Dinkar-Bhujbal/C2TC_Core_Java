package Examveda.DeclarationAndAccessControl;

@SuppressWarnings("unused")
public class test15 {
	static {
		int a = 5;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		new test15().call();
	}

	static void call() {
//		static method main sathi lagel
//		but static kel tar this use nahi karta yenar
//		this.a++;
//		System.out.println(this.a);
	}

}

package day22;

public class Exp {
	static void m() {
		m1();
	}

	static void m1() {
		System.out.println(10 / 0);
	}

	public static void main(String[] args) {
		m();// JVM handovers the object to Default Exception Handler
		System.out.println("Hii");
	}

}

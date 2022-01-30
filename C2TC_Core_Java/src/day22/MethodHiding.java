package day22;

class P {
	static void m1() {
		System.out.println("Oerriding using static method");
	}

	void m2() {
		System.out.println("M2 from P");
	}
}

class C extends P {
//	void m1() {
////		This static method cannot hide the instance method from P
//	}
//	static void m2() {
////		This static method cannot hide the instance method from P
//	}
}

public class MethodHiding {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		C obj = new C();
		obj.m1();
		obj.m2();
	}

}

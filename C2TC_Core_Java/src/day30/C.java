package day30;

// Created class C for package lesson day 31
public class C {

	void m1() {
		System.out.println("C: Default method");
	}

	public void m2() {
		System.out.println("B: Public method");
	}

	public static void main(String[] args) {
		C c = new C();
		c.m1();
		c.m2();
	}

}

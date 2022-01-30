package day30;

// Created class B for package lesson day 31
public class B {
	public B() {
		System.out.println("Contructor B");
	}

	void m1() {
		System.out.println("Class B Default method");
	}

	public void m2() {
		System.out.println("Class B Public method");
	}

	public static void main(String[] args) {
		B b = new B();
		b.m1();
		b.m2();
	}

}

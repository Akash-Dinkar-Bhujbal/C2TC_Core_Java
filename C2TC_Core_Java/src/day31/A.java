package day31;

import day30.B;

public class A {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
//		System.out.println("Package Demo Program");
		B b = new B();
//		b.m1();// default method can't access
		b.m2();
		System.out.println("********************");
		B.main(args);
		System.out.println("*********************");
		day30.C obj = new day30.C();
		obj.main(args);
	}

}

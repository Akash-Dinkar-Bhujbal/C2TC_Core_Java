package Examveda.DeclarationAndAccessControl;

class A {
	{
		System.out.print("b1 ");
	}

	public A() {
		System.out.print("b2 ");
	}
}

class B extends A {
	static {
		System.out.print("r1 ");
	}

	public B() {
		System.out.print("r2 ");
	}

	{
		System.out.print("r3 ");
	}
	static {
		System.out.print("r4 ");
	}
}

public class test21 extends B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Pre ");
		new test21();
		System.out.print("Post ");
	}

}

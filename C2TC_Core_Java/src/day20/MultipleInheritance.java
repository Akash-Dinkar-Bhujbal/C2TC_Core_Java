package day20;

interface A {
	void display();

	void am();
}

interface B {
	void display();

	void bm();
}

class MIE implements A, B {

	@Override
	public void display() {
		System.out.println("Override from A and B");
	}

	@Override
	public void bm() {
		System.out.println("I am B");
	}

	@Override
	public void am() {
		System.out.println("I am A");
	}

}

public class MultipleInheritance {

	public static void main(String[] args) {
		MIE obj = new MIE();
		obj.am();
		obj.bm();
		obj.display();
	}
}

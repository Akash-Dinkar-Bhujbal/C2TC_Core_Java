package day05;

class A {
	int i;
	char c = 'C';
	float f;

	A() // Constructor
	{
		f = 5.55f;
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		A obj = new A();
		System.out.println(obj.i);
	}

}

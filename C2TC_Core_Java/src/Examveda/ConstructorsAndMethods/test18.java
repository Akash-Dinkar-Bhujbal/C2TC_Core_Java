package Examveda.ConstructorsAndMethods;

class Person {
	public int number;
}

public class test18 {
	public void doIt(int i, Person p) {
		i = 5;
		p.number = 8;
	}

	public static void main(String[] args) {
		int x = 0;
		Person p = new Person();
		new test18().doIt(x, p);
		System.out.println(x + " " + p.number);
	}

}

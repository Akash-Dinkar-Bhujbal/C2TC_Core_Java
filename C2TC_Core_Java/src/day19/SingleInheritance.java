package day19;

class Animal1 {
	void eat() {
		System.out.println("eating...");
	}
}

class Dog1 extends Animal1 {
	void bark() {
		System.out.println("barking...");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		Dog1 Pug = new Dog1();
		Pug.eat();
		Pug.bark();
	}

}

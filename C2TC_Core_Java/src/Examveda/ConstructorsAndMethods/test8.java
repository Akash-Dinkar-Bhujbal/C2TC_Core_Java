package Examveda.ConstructorsAndMethods;

class Animal {
	Animal() {
		System.out.println("Animal");
	}
}

class Wild extends Animal {
	Wild() {
		super();
		System.out.println("Wild");
		//super() call must be the first statement in a constructor.
	}
}

public class test8 {

	public static void main(String[] args) {
		Wild wild = new Wild();
	}

}

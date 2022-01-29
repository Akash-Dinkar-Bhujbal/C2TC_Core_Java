package day16;

public class FinalDemo {

	final float pi = (float) 3.14;

	public static void main(String[] args) {
		C c = new C();
		c.marry();
	}

}

class P {
	void property() {
		System.out.println("House...Jwellery...Car...Cash...Plots");
	}

	void marry() {
		System.out.println("Luxmilata");
	}

}

final class C extends P {
	void marry() {
		System.out.println("Katrina");
	}
//	Can not override final method of ParentClass
}

//class random extends C {
//Can not create child class
//}

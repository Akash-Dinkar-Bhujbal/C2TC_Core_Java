package day16;

public class AbstractDemo {

	public static void main(String[] args) {
//		Test t = new Test();// Can not create object of Abstract class
		ScootyDemo s = new ScootyDemo();
		s.NoOfWheels();
	}

}

abstract class Vehical {
	public abstract void NoOfWheels();

	public abstract void m2();
}

abstract class Scooty extends Vehical {

	@Override
	public void NoOfWheels() {
		System.out.println(2);
	}

}

class ScootyDemo extends Scooty {

//	@Override
//	public void NoOfWheels() {
//		System.out.println(2);
//	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

}

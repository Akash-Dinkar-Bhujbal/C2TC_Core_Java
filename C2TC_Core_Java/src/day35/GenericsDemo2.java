package day35;

public class GenericsDemo2 {
//	class Test<T extends Number>{
//		
//	}
	
//	class Test<T implements Runnable>{
//	class Test<T extends Runnable> {// right
	class Test<T extends Number & Runnable> {// right
//	class Test<T extends Runnable & Number> {// wrong
//	class Test<T extends Thread, Number> {// ?

	}

	public static void main(String[] args) {

	}

}

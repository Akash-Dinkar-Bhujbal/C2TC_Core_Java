package day35;

class Test1<T> {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test1<Integer> t1 = new Test1<>();
		Test1<String> t2 = new Test1<>();

	}
}

public class Test<T extends Number> {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Test<Float> t1 = new Test<Float>();
//		Test<String> t2 = new Test<String>();// Bound mismatch

	}
}

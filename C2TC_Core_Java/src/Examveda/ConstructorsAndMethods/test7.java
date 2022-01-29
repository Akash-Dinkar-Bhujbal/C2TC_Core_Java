package Examveda.ConstructorsAndMethods;

public class test7 {

	private test7(int i) {
		System.out.println(i);
	}
//	public final  test7() {//invalid modifier
//		System.out.println(10);
//	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		test7 t = new test7(50);
	}

}

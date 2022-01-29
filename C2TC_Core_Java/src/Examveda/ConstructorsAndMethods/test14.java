package Examveda.ConstructorsAndMethods;

public class test14 {

	public static void main(String[] args) {
		test14 t = new test14();
		System.out.println(t.display(4, 5));
	}

	public int display(int x, int y) {
//		return ("The sum of x and y is " + x + y);
		System.out.print("The sum of x and y is ");
		return (x + y);

	}

}

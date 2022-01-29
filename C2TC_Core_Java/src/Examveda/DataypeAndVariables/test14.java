package Examveda.DataypeAndVariables;

public class test14 {
	static int x = 10;// static variable
	int y = 20;// instance variable

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		test14 t1 = new test14();
		test14 t2 = new test14();

		t1.x = t1.x + 1;// x=11
		System.out.println(t1.x + t2.x);// 11+11

		t1.y += 1;
		System.out.println(t1.y + t2.y);// 21+20
	}

}

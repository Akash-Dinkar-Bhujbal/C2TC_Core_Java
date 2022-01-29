package Examveda.Array;

public class test3 {

	public static void main(String[] args) {
		int[] a = new int[0];
		System.out.println(a.length);
//		a[0] = 1;//Runtime error: IndexOutOfBound
		for (int i : a) {
			System.out.print(i);
		}
	}

}

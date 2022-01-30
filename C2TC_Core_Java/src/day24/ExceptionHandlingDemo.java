package day24;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2 / 0);
			System.out.println(3);
		} catch (NullPointerException e1) {
			System.out.println(4 / 0);
		} catch (Exception e2) {
			System.out.println(4);
		}

		finally {
			System.out.println(5 / 0);
		}
		System.out.println(6);
	}
}

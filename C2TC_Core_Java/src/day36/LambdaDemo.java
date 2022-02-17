package day36;

interface Anonymous {
	void show();
}

public class LambdaDemo {

	public static void main(String[] args) {
//		Anonymous l = () -> {
//			System.out.println("Lambda Demo");
//		};

		Anonymous l = () -> System.out.println("Lambda Demo");

		l.show();
	}

}

package day35;

public class GenericDemo {
	public static void main(String[] args) {
		Container<Integer> obj = new Container<>();
		obj.value = 1;
		obj.show();
	}
}

class Container<T> {
	T value;

	public void show() {
		System.out.println(value.getClass().getName());
	}
}
package Examveda.ConstructorsAndMethods;

public class test22 {

	public static void main(String[] args) {
		MyClass1 obj = new MyClass1();
		obj.val = 1;
		obj.call(obj);
		System.out.println(obj.val);
	}

}

class MyClass1 {
	public int val;

	public void call(MyClass1 ref) {
		ref.val++;
	}
}

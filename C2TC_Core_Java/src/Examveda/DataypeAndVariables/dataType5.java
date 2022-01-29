package Examveda.DataypeAndVariables;

class A {
	int k;
	boolean istrue;
	static int p;

	public void printValue() {
		System.out.print(k);
		System.out.print(istrue);
		System.out.print(p);
	}
}

public class dataType5 {
	int _$;
	int $7;
//	int do;// Compile error - do is not valid identifier.

	int i = 8;
	int j = 9;

	public static void main(String[] args) {
//		A a = new A();
//		a.printValue();

		dataType5 d = new dataType5();
		d.$7 = 7;
		System.out.println(d.$7);
//		System.out.println(d.do);
		System.out.println(d._$);

//		int i = 010;// Octal form-->8
//		int j = 07;// Octal form-->7
//		System.out.println(i);
//		System.out.println(j);

		byte b = 6;
		b += 8;// this is correct
		System.out.println(b);
//		b=b+7;//wrong
		b = (byte) (b + 7);// Right
		System.out.println(b);

//		add();
	
		b=127;
		b++;
		b++;
		System.out.println(b);

	}

	@SuppressWarnings("unused")
	private static void add() {
//		int k = i+j;//instance variable cannot use 
//		System.out.println(k);
	}

}

package day04;

public class OperatorsAndFinalVariable {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b = 100;
		short a = 100;
//		b = a + b;// Max(short,byte,int)
//		b = b + 1;
		// ++b// b++;
		final int x = 10;
//		int y;
//		x = 12;
//		y = ++x;// Unresolved compilation problem:
//		The final local variable x cannot be assigned. 
		// It must be blank and not using a compound assignment
		// y = ++10;//Unresolved compilation problem:
//		Invalid argument to operation ++/--
		System.out.println(b);
	}

}

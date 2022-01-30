package day14;

public class String3 {

	public static void main(String[] args) {
//		String s1 = new String("Avantika");// Immutable
//		String s2 = new String("Avantika");// Immutable
		StringBuffer s1 = new StringBuffer("Avantika");// Mutable
		StringBuffer s2 = new StringBuffer("Avantika");// Mutable
//		System.out.println(s1.compareTo(s2));
		System.out.println(s1 == s2);// Reference Comparison
		System.out.println(s1.equals(s2));// Content comparison

	}

}

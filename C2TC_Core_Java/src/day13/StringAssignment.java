package day13;

public class StringAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("Akash");
		String b = "Bhujbal";
		String c = "";
		String d = " ";
		String name = a.concat(" " + b);
		System.out.println(name);
		System.out.println(name.charAt(0));
		System.out.println(name.codePointAt(0));
		System.out.println(name.codePointBefore(1));
		System.out.println(name.length());
		System.out.println(name.codePointCount(6, 13));
		System.out.println(name.substring(6, 13));
		System.out.println(name.contains(a));
		System.out.println(name.hashCode());
		System.out.println(name.indexOf(b));
		System.out.println(name.intern());
		System.out.println(name.isEmpty());
		System.out.println(c.isBlank());
		System.out.println(" is blank"+d.isBlank());
		System.out.println(d.isBlank());
		System.out.println();

	}

}

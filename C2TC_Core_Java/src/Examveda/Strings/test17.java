package Examveda.Strings;

public class test17 {
	public static void main(String[] args) {
		String s = "what";
		StringBuffer sb = new StringBuffer("what");
		System.out.println(sb.equals(s) + "," + s.equals(sb));
	}
}

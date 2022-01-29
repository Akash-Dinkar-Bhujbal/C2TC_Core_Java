package Examveda.Strings;

public class test7 {
	public static void main(String[] args) {
		/*
		 * s1 == s2-->0 
		 * s1 > s2 -->+ve 
		 * s1 < s2 -->-ve
		 */
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "meklo";
		String s4 = "hemlo";
		String s5 = "flag";

		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//h----m//-5
		System.out.println(s1.compareTo(s4));//lm//-1
		System.out.println(s1.compareTo(s5));//f-h//+2
	}
}

package Examveda.Strings;

public class test13 {
	public static void main(String[] args) {
		String s = "a1b2c3";
		String[] tokens = s.split("\\d");
		for (String i : tokens) {
			System.out.print(i);
		}
	}
}

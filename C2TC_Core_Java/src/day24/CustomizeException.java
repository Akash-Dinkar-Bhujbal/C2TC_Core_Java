package day24;

import java.util.Scanner;

public class CustomizeException {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws CantVote {
		int age;
		System.out.println("Enter Your Age");
		age = s.nextInt();
		if (age < 18) {
			throw new CantVote("You cannot cast your vote.....");
		} else {
			System.out.println("You can happily vote....");
		}
	}

}

@SuppressWarnings("serial")
//class CantVote extends RuntimeException {
//	public CantVote(String msg) {
//		super(msg);
//	}
//}
class CantVote extends Exception {
	public CantVote(String msg) {
		super(msg);
	}
}
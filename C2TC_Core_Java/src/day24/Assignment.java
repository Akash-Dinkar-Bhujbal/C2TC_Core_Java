package day24;

import java.util.*;

@SuppressWarnings("serial")
class cantGoOutsideHome extends RuntimeException {
	public cantGoOutsideHome() {
		System.out.println("You not wearing Mask, You can't Go outside Home.");
	}
}

@SuppressWarnings("serial")
class vaccineAlert extends Exception {
	public vaccineAlert(String msg) {
		super(msg);
	}
}

public class Assignment {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws vaccineAlert {
		System.out.println("Wear mask or Not ?");
		String ans1 = sc.next();
		switch (ans1) {
		case "Yes":
			System.out.println("Your both dose are completed?");
			String ans2 = sc.next();
			switch (ans2) {
			case "Yes":
				System.out.println("You can go anywhere, You are God...");
				break;
			case "No":
				throw new vaccineAlert(// <-----------
						"This is Alert Message: \nPlease complete your 2 Does as early as possible.......");
			default:
				System.out.println("Invalid Input");
				break;

			}
			break;
		case "No":
			throw new cantGoOutsideHome();// <--------
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

}

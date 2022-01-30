package day05;

// Ref: https://www.mathsisfun.com/numbers/even-odd.html
import java.util.*;

/*
 * Flow control : Selection statement
 * if-else
 * */
public class EvenOdd {

	static Scanner sc = new Scanner(System.in);// Reading from keyword

	public static void main(String[] args) {
		System.out.println("Enter No: ");
		int n = sc.nextInt();// nextInt()
		if (n % 2 == 0) {
			System.out.println(n + " is Even");
		} else {
			System.out.println(n + " is Odd");
		}
	}

}

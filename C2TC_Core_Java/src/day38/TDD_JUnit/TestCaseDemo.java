package day38.TDD_JUnit;

import org.junit.jupiter.api.*;

public class TestCaseDemo {
	@RepeatedTest(10)
	void sum() {
		int a = 10;
		int b = 23;
		System.out.println(a + b);
	}

//	@Disabled
	@Test
	void display() {
		System.out.println("Executing TDD");
	}
}

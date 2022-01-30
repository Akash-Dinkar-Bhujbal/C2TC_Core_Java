package day17;

public class Student {
	int roll;
	String name;
	static String college = "Mumbai University";

	public Student(int r, String n) {
		roll = r;
		name = n;
	}

	void display() {
		System.out.println(roll + " " + name + " " + college);
	}

	public static void main(String[] args) {
		Student s1 = new Student(1, "Alisha");
		Student s2 = new Student(2, "Anusha");
		s1.display();
		s2.display();
	}

}

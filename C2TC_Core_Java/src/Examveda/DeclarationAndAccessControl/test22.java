package Examveda.DeclarationAndAccessControl;

//static public class test22 {
//Compile error - 
//Illegal modifier for the class Test; 
//only public, abstract & final are permitted.
public class test22 {

	public static void main(String[] args) {
		char c = 'a';
		switch (c) {
		case 65:
			System.out.println("one");
			break;
		case 'a':
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
		}
	}

}

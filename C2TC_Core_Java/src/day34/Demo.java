package day34;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = new String[1000];
		a[0] = "Avantika";
		a[1] = "Arayan";
//		a[3] = 10;//Compile time error
//		ArrayList l - new ArrayList();//
//		String name1 = (String)l.get(0;)
		ArrayList<String> l = new ArrayList<String>();
		l.add("Akash");
		String name = (String) l.get(0);
		System.out.println(name);
	}

}

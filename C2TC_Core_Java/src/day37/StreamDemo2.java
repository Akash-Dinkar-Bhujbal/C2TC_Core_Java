package day37;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(0);
		marks.add(29);
		marks.add(12);
		marks.add(44);
		marks.add(67);
		marks.add(12);
		marks.add(78);

		System.out.println(marks);

		List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());
		System.out.println(updatedMarks);

		long failed = marks.stream().filter(i -> i < 33).count();
		System.out.println(failed);
		
//		map : apply to all
//		count : for counting elements
	}

}

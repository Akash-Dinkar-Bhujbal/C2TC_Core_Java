package day37;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> orignal = List.of(13, 45, 63, 24, 78, 96, 54, 33, 21, 27, 89);
		System.out.println(orignal);

		List<Integer> evenlist = new ArrayList<>();

		for (Integer i : orignal) {
			if (i % 2 == 0) {
				evenlist.add(i);
			}
		}
		System.out.println(evenlist);

		Stream<Integer> stream = orignal.stream();
//		List<Integer> l2 = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> l2 = stream.filter(i -> i > 20).collect(Collectors.toList());
		System.out.println(l2);
		
//		filter : condition
	}

}

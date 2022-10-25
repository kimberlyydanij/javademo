package java018_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Java204_RemoveIf {

	public static void main(String[] args) {
		Integer[] it = new Integer[] {3,5,2,4,7};
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList.toString());
		
		Consumer<Integer> con = x -> System.out.println(x);
		aList.forEach(con);

		
		} // end main

	} // end class



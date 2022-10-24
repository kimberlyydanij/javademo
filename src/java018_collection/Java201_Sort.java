package java018_collection;

import java.util.ArrayList;

public class Java201_Sort {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,3,5,2,4,1};
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		//void java.util.ArrayList.sort(Comparator<? super Integer> c)
		aList.sort(new Ascending());

	}

}

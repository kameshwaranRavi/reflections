package intern;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("one");
		al.add(1.3);
		System.out.println("list will have duplicates and it not sorted");
		System.out.println(al);

		ArrayList<String> stringal = new ArrayList<String>();
		stringal.add("one");
		stringal.add("two");
		stringal.add("three");
		stringal.add("abc");
		Iterator<String> itr = stringal.iterator();
		while (itr.hasNext()) {
			System.out.println("the String arraylist" + " " + itr.next());
		}
		al.clear();
		while (al.isEmpty()) {
			System.out.println("ArrayList is empty");
			break;
		}

	}
}

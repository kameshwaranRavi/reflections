package intern;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("one");
		hs.add("two");
		hs.add(1);
		hs.add(2);

		HashSet<String> stringhs = new HashSet<String>();
		stringhs.add("friends");
		stringhs.add("lost");
		stringhs.add("flash");
		System.out.println("set wont have duplicates ");
		System.out.println(stringhs);
		Iterator itr = stringhs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

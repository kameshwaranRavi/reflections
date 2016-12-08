package intern;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapAndHashTable {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(null, "three");
		hm.put(3, "three");
		hm.put(4, "four");
		System.out.println(hm);
		
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "three");
		ht.put(4, "two");

		System.out.println(ht);

	}

}

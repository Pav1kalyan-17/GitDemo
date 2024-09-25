package Collections;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		// Declaration
		HashMap map = new HashMap();
		Map mymap = new HashMap();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Adding Pairs
		hm.put(101, "Pavan");
		hm.put(102, "kalyan");
		hm.put(103, "hanmala");
		hm.put(103, "kalyan"); // it will replace with new value
		hm.put(104, "king");
		hm.put(105, "north");

		System.out.println(hm);
		System.out.println("size---->" + hm.size());

		// Remove pair
		hm.remove(105);
		System.out.println("after rmoving " + hm);

		// access value of the key
		System.out.println(hm.get(103));

		// Get All the Keys From the HashMap
		System.out.println(hm.keySet());

		// Get All the Values From HashMap
		System.out.println(hm.values());

		// Get Keys and Values From HashMap
		System.out.println(hm.entrySet());

		// Replacing the value
		hm.put(104, "Turmaric");
		System.out.println(hm);

		// Reading data from HashMap
		// Using For Each Loop
		for (int k : hm.keySet()) {
			System.out.println(k + "-" + hm.get(k));
		}

		// Using Iterator
		System.out.println("Using Iterator");
		Iterator<Entry<Integer, String>> it = hm.entrySet().iterator();
		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		// Clear everything
		hm.clear();
		System.out.println(hm.isEmpty());

	}

}

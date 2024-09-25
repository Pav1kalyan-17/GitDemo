package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet myset = new HashSet();
		// Set myset = new HashSet();
		// to add only particular type of elements
		// HashSet <String>set=new HashSet<String>();

		// adding elements in to hashset
		myset.add(100);
		myset.add(12.5);
		myset.add("welcome");
		myset.add('A');
		myset.add(true);
		myset.add(null);
		myset.add(100);
		myset.add(true);
		myset.add(true);
		myset.add('P');

		System.out.println(myset);

		// Size
		System.out.println(myset.size());// 7

		// Removing an element
		myset.remove('P'); // we need to pass the value directly not index
		System.out.println(myset);

		// Inserting an Element --> Insertion is not possible in HashSet

		// Accessing the Specific element ---> It is also not possible

		// ***Is it Possible to access specific value from HashSet ? -----> NO ***
		// We cannot access a specific value directly from HashSet
		// To access specific value we need to convert HashSet to ArrayList then only
		// indexing is possible
		ArrayList al = new ArrayList(myset);
		System.out.println(al);
		System.out.println(al.get(4));

		// Read all the elements using enhanced for loop not using normal for loop
		// normal for loop is not possible because index is not there in HashSet
		for (Object x : myset) {
			System.out.println(x);
		}

		// Using Iterator
		Iterator it = myset.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		// We cannot remove multiple values same time only one at a time
		// Clear all the values
		// we can clear all the values
		myset.clear();
		System.out.println(myset.isEmpty());

	}

}

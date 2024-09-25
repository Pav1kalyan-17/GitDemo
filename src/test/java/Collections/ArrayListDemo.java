package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Declaration
		ArrayList mylist = new ArrayList();
		// List mylist = new ArrayList();
		// To store only Particular type of data Ex:Interger type of data
		// ArrayList <Integer>mylist = new ArrayList<Integer>(); //<Wrapperclass>

		// Adding data into the ArrayList
		mylist.add(100);
		mylist.add(12.45);
		mylist.add(1.3456);
		mylist.add("Welcome");
		mylist.add('A');
		mylist.add(true);
		mylist.add(null);
		mylist.add(null);
		mylist.add(300);

		// Display the elements
		System.out.println(mylist);

		// size of ArrayList
		System.out.println("size---> " + mylist.size());

		// Removing the element
		mylist.remove(3); // by index only we can remove the element
		System.out.println(mylist);

		// Inserting an element
		mylist.add(3, "Kalyan");// inserting at the 3rd index
		System.out.println("After Inserion-->" + mylist);

		// Modification of an element
		mylist.set(3, "pavan");// replacing the element at 3rd index
		System.out.println("after replacing-->" + mylist);

		// Access specific element from an arrayList
		System.out.println(mylist.get(2));

		// Reading all the data from ArrayList
		// using normal for loop-------------
		for (int i = 0; i < mylist.size(); i++) {
			System.out.print(mylist.get(i) + " ");
		}
		System.out.println();

		// using for each loop----------------
		for (Object x : mylist) // x should be object type so it can hold all kinds of data
		{
			System.out.print(x + " ");
		}
		System.out.println();

		// Using Iterator
		Iterator<Object> it = mylist.iterator();
		while (it.hasNext())// it will check the element is present or not
		{
			System.out.print(it.next() + " ");// it will get the particular element
		}
		System.out.println();

		// Checking empty or not
		System.out.println(mylist.isEmpty());// false

		// Removing Multiple elements from arraylist randomly
		ArrayList mylist2 = new ArrayList();
		mylist2.add(100);
		mylist2.add('A');
		mylist.removeAll(mylist2);
		System.out.println(mylist);

		// remove all the elements
		mylist.clear();
		System.out.println(mylist.isEmpty());

	}

}

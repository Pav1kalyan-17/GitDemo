package Coding;

public class SecondHighest {

	public static void main(String[] args) {

		int first = Integer.MIN_VALUE; // To track the largest number
		int second = Integer.MIN_VALUE; // To track the largest 2nd number
		int[] a = { 2, 11, 6, 5, 4, 10, 8, 7, 9, 2, 6 };
		int length = a.length;

		for (int i = 0; i < length; i++) {
			if (a[i] > first) {
				second = first;// 
				first = a[i];//
			} else if (a[i] > second && a[i] != first) {
				second = a[i];

			}
		}
		System.out.println(second);

	}

}

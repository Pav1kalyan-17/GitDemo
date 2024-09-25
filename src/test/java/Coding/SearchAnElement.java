package Coding;

public class SearchAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,30,4,57,68};
		int SearchElement =57;
		for(int i=0;i<a.length;i++)
		{
			if(SearchElement==a[i])
			{
				System.out.println("Search Eleemt found "+a[i]+" at index "+i);
			}
		}

	}

}

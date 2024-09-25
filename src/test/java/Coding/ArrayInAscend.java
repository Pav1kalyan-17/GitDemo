package Coding;

import java.util.Arrays;

public class ArrayInAscend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,1,34,65,7},c[];
		int b=0;
		int length=a.length;
		System.out.println("The length of an Array is-->"+length);
		Arrays.toString(a);
		System.out.println(a);
		//System.out.println(a);
		
		System.out.println("%%%%%%%%%%%%%");
		for(int i=0;i<=length-1;i++)
		{
			for(int j=i;j<=length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}			
		}		
		for(int y=0;y<length;y++)
		{
			System.out.println(a[y]);
		}

	}

}

package Coding;

public class NumberOfRepetations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,30,20,20,50};
		//int b[]= {};
		int count1=0;
		for(int i=0;i<=a.length-1;i++)
		{ 
			int count=0;
		if(a[i]!=count1)
		{
			for(int j=i;j<=a.length-1;j++)
			{
				if(a[i]==a[j])
				{
					count ++;
				}
			}
			count1=a[i];
			System.out.println(a[i]+" Repeats "+count+" times");
		}
			
		}

	}

}

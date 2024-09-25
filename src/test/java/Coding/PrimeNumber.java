package Coding;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prime=23;
		int count=0;
		for(int i=1;i<=prime;i++)
		{
			if(prime%i==0)
			{
				count++;
			}
		}
		if(count==2) {
		System.out.println(prime+" prime");
		}else {
			System.out.println(prime+" not a prime");
		}

	}

}

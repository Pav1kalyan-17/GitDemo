package Coding;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=121;
		int palin=number;
		int rev=0;
		
		while(number!=0)
		{
			int num = number%10;
			rev=rev*10+num;
			number=number/10;
		}
		System.out.println(rev);
		if(rev==palin)
		{
			System.out.println("Given "+palin+" is a palindrome");
		}else {
			System.out.println(palin+" is not a palindrome");
		}
	}

}

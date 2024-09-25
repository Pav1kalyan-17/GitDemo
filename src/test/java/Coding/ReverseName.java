package Coding;

public class ReverseName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub----------------------------
		String s="madam";
		String bal=s;
		int leng=s.length();
		System.out.println(s+"-->Length of the string is "+leng);
		System.out.println(s.charAt(0));
		for(int i=leng-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		System.out.println(s.trim());
		
		//After converting into Array------------------------------
		char[] arr=s.toCharArray();
		String rev="";
		for(int i=leng-1;i>=0;i--)
		{
			rev=rev+arr[i];
			//System.out.println(arr[i]);
		}
		System.out.println(rev);
		if(rev.equals(bal))
		{
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
		//Using string Builder or String Buffer-------------------------
		StringBuilder sb=new StringBuilder("Bharath");  
	    System.out.println(sb.reverse()); 
	    System.out.println(sb);

	}

}

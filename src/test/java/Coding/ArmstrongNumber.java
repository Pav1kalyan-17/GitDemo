package Coding;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb=153;
		int p=numb;
		int rev=0;
		while(numb!=0)
		{
			int k=numb%10;
		    rev=rev+(k*k*k);
		    numb=numb/10;			
		}	
		if(p==rev) {
		System.out.println(rev+" Armstromg number");
		}else {
			System.out.println("not a Armstrong number");
		}
		System.out.println("Fisrt");
	}

}

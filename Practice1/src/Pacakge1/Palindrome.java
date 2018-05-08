package Pacakge1;

public class Palindrome {
	
	public static void main (String [] args)
	{
		int n = 121;
		int temp, r=0;
		int sum=0;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=r+(sum*10);
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}

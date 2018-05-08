package Pacakge1;

public class ArmstrongNumber {
	public static void main(String [] args) 
	{
		//Armstrong Number : sum of cube of digits is same as the number eg: 153
		int n=153;
		int temp, r=0, sum=0;
	 temp=n;
		while (n>0) 
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		}
		if(temp==sum) {
			System.out.println("Armstrong no.");
		}
		else {
			System.out.println("Fail");
		}
	}

}

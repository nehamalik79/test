package Pacakge1;
// Prime number or not
public class PrimeNumber {
	public static void main (String [] args) 
	{
		int n=3, r=0;
		int flag=0;
		if(n==0||n==1) 
		{
			System.out.println("NotPrime");
		}
		else {
			for(int i=2; i<=n/2;i++) 
			{
				r=n%i;
				if(r==0) {
					System.out.println("Even");
				}
				flag=1;
				break;
			}
				if(flag==0) {
					System.out.println("prime");
				}
				
				
				
			
		}
	}

}

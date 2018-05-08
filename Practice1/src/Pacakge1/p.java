package Pacakge1;

public class p {
	public static void main (String [] args) 
	{
		int n=3;
		int flag=0;
		
		if(n==0||n==1) {
			System.out.println("not prime");
		
		}
		else {
			for(int i=2;i<=n/2;i++) 
			{
				//r=n%i;
				if(n%i==0) 
				{
					System.out.println("even");
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

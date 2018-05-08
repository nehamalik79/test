package Pacakge1;

public class Reverse_A_Number {
public static void main(String[] args)
{
	int n=123;
	int r=0, rem=0;
	while(n>0)
	{
		rem=n%10;
		r=rem+(r*10);
		n=n/10;
	}
	
	System.out.println(r);
}
}

package Pacakge1;

public class LargestValueArray {
	public static void main (String []args)
	{
		int [] ar1 = {28,3,15,9,17,4,23,2};
		int val = ar1[0];
		for(int i=0;i<ar1.length;i++) 
		{
			if(ar1[i]>val) {
				System.out.println(val);
			}
		}
		
	}

}

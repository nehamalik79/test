package Pacakge1;

public class String_Reversal_Iterations 
{
	public static void main(String [] args) 
	{
		String St = "Neha";
		char[] strArr = St.toCharArray();
		for(int i =St.length()-1; i>=0;i--) {
			System.out.print(strArr[i]);
		}
		
	}

}

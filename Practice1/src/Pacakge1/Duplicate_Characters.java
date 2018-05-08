package Pacakge1;

//Program to print duplicate characters

public class Duplicate_Characters {
	public static void main(String[] args)
	{
		String Str ="W3schools";
		char[] StrArr = Str.toCharArray();
		for(int i =0; i<Str.length();i++) 
		{
			for(int j=i+1; j<Str.length();j++)
			{
				if(StrArr[i]==StrArr[j])
				{
					System.out.println(StrArr[i]);
				}
			}
		}
	}
		
}

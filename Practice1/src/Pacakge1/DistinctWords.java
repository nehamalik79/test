package Pacakge1;

public class DistinctWords 
{
public static void main (String [] args) 
{
  String Str = "w3schools";
  char[] strArr = Str.toCharArray();
  for(int i=0; i<Str.length(); i++) 
  {
	  for(int j=i+1; j<Str.length();j++) {
		  if(strArr[i]!=strArr[j]) {
			  System.out.println(strArr[i]);
		  }
	  }
  }
}

}

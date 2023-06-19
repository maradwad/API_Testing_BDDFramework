package Practice;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="baaa";
		StringBuilder s1=new StringBuilder(s);
		
		//System.out.println(s.substring(-1));
		for(int i=0;i<s1.length()-1;i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				StringBuilder s2 = new StringBuilder(s1.substring(i,j));
				StringBuilder s3= new StringBuilder(s2.reverse());
				
				
			}
		}
		

	}
	
	


}


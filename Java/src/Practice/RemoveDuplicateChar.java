package Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geeksforgeeks";
		Set<Character> ch=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			if(ch.contains(str.charAt(i)))
			{
				
				System.out.println(str.charAt(i));
			}
			else {
			ch.add(str.charAt(i));
			}
		}
		System.out.println(ch);
		
	}

}

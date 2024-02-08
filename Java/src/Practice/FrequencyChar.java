package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nstr="Greekforgreeks";
		String str=nstr.toLowerCase();
		HashMap<Character,Integer> freq=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++)
		{
			if(freq.containsKey(str.charAt(i)))
			{
				freq.replace(str.charAt(i), freq.get(str.charAt(i))+1 );
			}
			else
			{
				freq.put(str.charAt(i), 1);
			}
			
		}
		System.out.println(freq);
		for(Map.Entry m: freq.entrySet())
		{
			if(freq.get(m.getKey())>1)
			{
				System.out.println(m.getKey()+" "+m.getValue());
			}
		}
		
	}

}

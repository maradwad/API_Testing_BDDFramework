package Practice;

import java.util.HashMap;
import java.util.Map;

public class practiceJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="madhuri";
			duplicate(str);
	}
	public  static void duplicate(String str)
	{
		char[] character = str.toCharArray();
		Map<Character, Integer> charfreq = new HashMap<Character, Integer>();
		for(int i=0;i<character.length;i++)
		{
			if(charfreq.containsKey(character[i]))
			{
				charfreq.put(character[i], charfreq.get(character[i])+1);
			}
			else
			{
				charfreq.put(character[i], 1);

			}
		}
		
//		for(Map.Entry<Character, Integer> entry: map.en)
			int[] arr=new int[3];
			int s=arr.length;
	}

}

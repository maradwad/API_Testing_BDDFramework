package Practice;

import java.util.HashMap;
import java.util.Map;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="Helllo! My Name is Madhuri";
		String arr[]=sentence.split(" ");
		System.out.println(arr.length);
		String str="";
		for(int i=0;i<arr.length;i++)
			
		{
			str=arr[i]+" "+str;
		}
		System.out.println(str);
		Map<Character,Integer> map=new HashMap<>();
		sentence=sentence.replaceAll(" ","").toLowerCase();
		char Char[]=sentence.toCharArray();
		for(char ch:Char)
		{
			if(map.containsKey(ch))
			{
				map.replace(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}

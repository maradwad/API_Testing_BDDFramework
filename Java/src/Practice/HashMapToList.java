package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashMapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<>();
		map.put(101, "Madhuri");
		map.put(102, null);
		
		Set<Character> set=new HashSet<Character>();
		set.add('s');
		set.add('s');
		if(set.contains('s')) {
			System.out.println("yes");
		}
		System.out.println(set.size());
	}
}
